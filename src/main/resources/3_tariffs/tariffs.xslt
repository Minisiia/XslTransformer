<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html" indent="yes"/>

    <xsl:template match="/">
        <html>
            <head>
                <title>Tariffs</title>
            </head>
            <body>
                <h1>Tariffs</h1>
                <table>
                    <tr>
                        <th>Name</th>
                        <th>Operator</th>
                        <th>Payroll</th>
                        <th>In-Network Call Price</th>
                        <th>Out-Network Call Price</th>
                        <th>Landline Call Price</th>
                        <th>SMS Price</th>
                        <th>Favorite Number</th>
                        <th>Billing</th>
                        <th>Connection Fee</th>
                    </tr>
                    <xsl:apply-templates select="Tariff/Rate">
                        <xsl:sort select="Payroll" data-type="number"/>
                    </xsl:apply-templates>
                </table>
            </body>
        </html>
    </xsl:template>

    <xsl:template match="Rate">
        <tr>
            <td><xsl:value-of select="Name"/></td>
            <td><xsl:value-of select="OperatorName"/></td>
            <td><xsl:value-of select="Payroll"/></td>
            <td><xsl:value-of select="CallPrices/InNetwork"/></td>
            <td><xsl:value-of select="CallPrices/OutNetwork"/></td>
            <td><xsl:value-of select="CallPrices/Landline"/></td>
            <td><xsl:value-of select="SMSPrice"/></td>
            <td><xsl:value-of select="Parameters/FavoriteNumber"/></td>
            <td><xsl:value-of select="Parameters/Billing"/></td>
            <td><xsl:value-of select="Parameters/ConnectionFee"/></td>
        </tr>
    </xsl:template>
</xsl:stylesheet>