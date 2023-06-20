<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="xml" indent="yes"/>

    <xsl:strip-space elements="*"/>

    <xsl:template match="/">
        <xsl:text>&#xA;</xsl:text> <!-- Добавление пустой строки -->
        <Critical xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
            <xsl:apply-templates select="//Component"/>
        </Critical>
    </xsl:template>

  <xsl:template match="node()">
               <xsl:copy>
                   <xsl:apply-templates select="node()[local-name() != 'Critical']" />
               </xsl:copy>
    </xsl:template>

</xsl:stylesheet>
