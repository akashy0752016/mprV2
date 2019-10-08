<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/tag-libs.jsp" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<meta name="description" content="Admin, Dashboard, Bootstrap" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta name="_csrf" content="${_csrf.token}"/>
<meta name="_csrf_header" content="${_csrf.headerName}"/>
<meta name="_timeout" content="${pageContext.session.maxInactiveInterval}"/>
<meta name="_context" content="${pageContext.request.contextPath}"/>
<title><tiles:getAsString name="title" /></title>
<script src="<c:url value="/resources/js/md5.js" />"></script>
<script src="<c:url value="/resources/js/custom.js" />"></script>
</head>
 
<body>
    <table width="100%">
        <tr>
            <td colspan="2">
                <tiles:insertAttribute name="header" />
            </td>
        </tr>
        <tr>
            <td width="20%" nowrap="nowrap">
                 <tiles:insertAttribute name="menu" />
             </td>
            <td width="80%">
                 <tiles:insertAttribute name="body" />
             </td>
        </tr>
        <tr>
            <td colspan="2">
                 <tiles:insertAttribute name="footer" />
            </td>
        </tr>
    </table>
</body>
</html>