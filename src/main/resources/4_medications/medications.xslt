<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <!-- Идентифицируем корень дерева XML -->
    <xsl:template match="/Medicine">
        <html>
            <head>
                <title>Medications</title>
            </head>
            <body>
                <h1>Medications</h1>
                <table>
                    <tr>
                        <th>Name</th>
                        <th>Consistency</th>
                        <th>Price</th>
                    </tr>
                    <!-- Применяем шаблон к каждому элементу Medication и их Version -->
                    <xsl:apply-templates select="Medication/Versions/Version">
                        <xsl:sort select="Producers/Producer/Package/Price" data-type="number"/>
                    </xsl:apply-templates>
                </table>
            </body>
        </html>
    </xsl:template>

    <!-- Применяем шаблон к каждому элементу Version -->
    <xsl:template match="Version">
        <tr>
            <td><xsl:value-of select="../../Name"/></td>
            <td><xsl:value-of select="Consistency"/></td>
            <td><xsl:value-of select="Producers/Producer/Package/Price"/></td>
        </tr>
    </xsl:template>

</xsl:stylesheet>