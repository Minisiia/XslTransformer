<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:output method="text" encoding="UTF-8" />

    <!-- Главный шаблон -->
    <xsl:template match="/">
        <xsl:text>[</xsl:text>
        <xsl:apply-templates select="Candy/CandyItem">
            <xsl:sort select="Production" />
        </xsl:apply-templates>
        <xsl:text>]</xsl:text>
    </xsl:template>

    <!-- Шаблон для каждого элемента CandyItem -->
    <xsl:template match="CandyItem">
        <xsl:if test="position() > 1">,</xsl:if>
        <xsl:text>{</xsl:text>
        <xsl:apply-templates select="*" />
        <xsl:text>}</xsl:text>
    </xsl:template>

    <!-- Шаблон для каждого элемента внутри CandyItem -->
    <xsl:template match="CandyItem/*">
        <xsl:if test="position() > 1">,</xsl:if>
        <xsl:text>"</xsl:text>
        <xsl:value-of select="local-name()" />
        <xsl:text>":</xsl:text>
        <xsl:choose>
            <xsl:when test="self::Ingredients">
                <xsl:text>[</xsl:text>
                <xsl:apply-templates select="Ingredient" />
                <xsl:text>]</xsl:text>
            </xsl:when>
            <xsl:when test="self::Value">
                <xsl:text>{"Protein": </xsl:text>
                <xsl:apply-templates select="Protein" />
                <xsl:text>, "Fat": </xsl:text>
                <xsl:apply-templates select="Fat" />
                <xsl:text>, "Carbohydrate": </xsl:text>
                <xsl:apply-templates select="Carbohydrate" />
                <xsl:text>}</xsl:text>
            </xsl:when>
            <xsl:otherwise>
                <xsl:call-template name="checkStringOrNumber">
                    <xsl:with-param name="value" select="." />
                </xsl:call-template>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:template>

    <!-- Шаблон для разделителя между ингредиентами -->
    <xsl:template match="Ingredients/Ingredient">
        <xsl:if test="position() > 1">,</xsl:if>
        <xsl:text>"</xsl:text>
        <xsl:value-of select="normalize-space(.)" />
        <xsl:text>"</xsl:text>
    </xsl:template>

    <!-- Шаблон для проверки строки или числа -->
    <xsl:template name="checkStringOrNumber">
        <xsl:param name="value" />
        <xsl:choose>
            <xsl:when test="translate($value, '0123456789', '') = ''">
                <xsl:value-of select="$value" />
            </xsl:when>
            <xsl:otherwise>
                <xsl:text>"</xsl:text>
                <xsl:value-of select="$value" />
                <xsl:text>"</xsl:text>
            </xsl:otherwise>
        </xsl:choose>
    </xsl:template>

</xsl:stylesheet>
