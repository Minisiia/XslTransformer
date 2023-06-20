<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="text" encoding="UTF-8" />

    <xsl:template match="/">
        <xsl:text>Model,Origin,Type,Price&#10;</xsl:text>
        <xsl:apply-templates select="Plane/Aircraft">
            <xsl:sort select="Price" data-type="number" order="ascending" />
        </xsl:apply-templates>
    </xsl:template>

    <xsl:template match="Aircraft">
        <xsl:value-of select="concat(Model, ',', Origin, ',', Chars/Type,',', Price)" />
        <xsl:text>&#10;</xsl:text>
    </xsl:template>
</xsl:stylesheet>