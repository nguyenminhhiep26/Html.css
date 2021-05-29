<?xml version="1.0" encoding="UTF-8" ?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html"/>
    <xsl:template match="/tests">
        <h3 color="red"><xsl:apply-templates select="test"/></h3>
        <h3 color="blue"><xsl:apply-templates select="test1"/></h3>
        <h3 color="black"><xsl:apply-templates select="test2"/></h3>
        <h3 color="blue"><xsl:apply-templates select="test3"/></h3>
    </xsl:template>

    <xsl:template match="test">
        NAME:
        <xsl:value-of select="Name"/>
        AGE :
        <xsl:value-of select="Age"/>
        Your Commision is
        <xsl:value-of select="Price"/>
        <br/>
    </xsl:template>

    <xsl:template match="test1">
        NAME:
        <xsl:value-of select="Name"/>
        AGE :
        <xsl:value-of select="Age"/>
        Your Commision is
        <xsl:value-of select="Price"/>
        <br/>
    </xsl:template>

    <xsl:template match="test2">
        NAME:
        <xsl:value-of select="Name"/>
        AGE :
        <xsl:value-of select="Age"/>
        Your Commision is
        <xsl:value-of select="Price"/>
        <br/>
    </xsl:template>

    <xsl:template match="test3">
        NAME:
        <xsl:value-of select="Name"/>
        AGE :
        <xsl:value-of select="Age"/>
        Your Commision is
        <xsl:value-of select="Price"/>
    </xsl:template>

</xsl:stylesheet>
