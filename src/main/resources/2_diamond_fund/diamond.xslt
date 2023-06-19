<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="xml" indent="yes"/>

    <xsl:template match="/">
        <Origin>
            <xsl:apply-templates select="//Stone"/>
        </Origin>
    </xsl:template>

    <xsl:template match="Stone">
        <Stone>
            <Name><xsl:value-of select="Name"/></Name>
            <Preciousness><xsl:value-of select="Preciousness"/></Preciousness>
            <!-- Применяем шаблон для Visual parameters элементов -->
            <xsl:apply-templates select="VisualParameters"/>
            <Value><xsl:value-of select="Value"/></Value>
        </Stone>
    </xsl:template>

    <xsl:template match="VisualParameters">
        <VisualParameters>
            <Color><xsl:value-of select="Color"/></Color>
            <Transparency><xsl:value-of select="Transparency"/></Transparency>
            <Facets><xsl:value-of select="Facets"/></Facets>
        </VisualParameters>
    </xsl:template>
</xsl:stylesheet>