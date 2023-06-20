<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:output method="html" indent="yes"/>
  <xsl:template match="/">
    <html>
      <head>
        <title>FlatWare</title>
      </head>
      <body>
        <h1>FlatWare</h1>
        <table>
          <tr>
            <th>Type</th>
            <th>Origin</th>
            <th>Length</th>
            <th>Width</th>
            <th>Material</th>
            <th>Handle Material</th>
            <th>Handle Wood Type</th>
            <th>Value</th>
          </tr>
          <xsl:for-each select="FlatWare/Cutlery">
            <xsl:sort select="Visual/TopPart/Length" data-type="number"/>
            <tr>
              <td><xsl:value-of select="Type"/></td>
              <td><xsl:value-of select="Origin"/></td>
              <td><xsl:value-of select="Visual/TopPart/Length"/></td>
              <td><xsl:value-of select="Visual/TopPart/Width"/></td>
              <td><xsl:value-of select="Visual/TopPart/Material"/></td>
              <td><xsl:value-of select="Visual/Handle/Material"/></td>
              <td><xsl:value-of select="Visual/Handle/Material/@type"/></td>
              <td><xsl:value-of select="Value"/></td>
            </tr>
          </xsl:for-each>
        </table>
      </body>
    </html>
  </xsl:template>
</xsl:stylesheet>