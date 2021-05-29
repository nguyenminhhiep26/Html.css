<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template match="/">
        <HTML>
            <HEAD>
                <TITLE>Newest Articles</TITLE>
            </HEAD>
            <BODY>
                <Center>
                    <H1>Newest Articles</H1>
                </Center>
                <TABLE Border="1">
                    <TR align="center" bgcolor="silver">
                        <TD>
                            <b>ID</b>
                        </TD>
                        <TD>
                            <b>Author</b>
                        </TD>
                        <TD>
                            <b>Title</b>
                        </TD>
                        <TD>
                            <b>Published Date</b>
                        </TD>
                        <TD>
                            <b>Description</b>
                        </TD>
                    </TR>
                    <xsl:for-each select="//article">
                        <TR>
                            <xsl:if test="@id mod 2 = 0">
                                <xsl:attribute name="bgcolor">cyan</xsl:attribute>
                            </xsl:if>
                            <TD>
                                <xsl:value-of select="@id" />
                            </TD>
                            <TD>
                                <xsl:value-of select="author" />
                            </TD>
                            <TD>
                                <A>
                                    <xsl:attribute name="HREF">
                                        <xsl:value-of select="link" />
                                    </xsl:attribute>
                                    <xsl:value-of select="title" />
                                </A>
                            </TD>
                            <TD>
                                <xsl:value-of select="publish_date" />
                            </TD>
                            <TD>
                                <xsl:value-of select="description" />
                            </TD>
                        </TR>
                    </xsl:for-each>
                </TABLE>
            </BODY>
        </HTML>
    </xsl:template>
</xsl:stylesheet>