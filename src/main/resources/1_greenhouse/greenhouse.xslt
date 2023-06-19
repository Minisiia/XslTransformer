<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<!--    <xsl:output method="html" indent="yes"/>-->

    <xsl:template match="/">
        <html>
            <head>
                <title>Plants by Preferred Temperature</title>
            </head>
            <body>
                <h1>Plants by Preferred Temperature</h1>
                <table>
                    <tr>
                        <th>Name</th>
                        <th>Preferred Temperature (°C)</th>
                    </tr>
                    <xsl:for-each select="Flower/Plant">
                        <xsl:sort select="GrowingTips/Temperature" data-type="number" order="ascending" />
                        <tr>
                            <td><xsl:value-of select="Name"/></td>
                            <td><xsl:value-of select="GrowingTips/Temperature"/></td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>