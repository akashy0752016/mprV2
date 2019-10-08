<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/tag-libs.jsp" %> 
<!DOCTYPE html>
<html lang="en">
    <head>        
        <!-- meta section -->
        <title>Intuitive - shared on themelock.com</title>
        <meta http-equiv="x-ua-compatible" content="ie=edge">
		<meta name="description" content="DDUGKY MPR Portal" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" >
		<meta name="_csrf" content="${_csrf.token}"/>
		<meta name="_csrf_header" content="${_csrf.headerName}"/>
		<meta name="_timeout" content="${pageContext.session.maxInactiveInterval}"/>
		<meta name="_context" content="${pageContext.request.contextPath}"/>
        
        
        <link rel="icon" href="favicon.ico" type="image/x-icon" >
        <!-- /meta section -->        
        
        <!-- css styles -->
        <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/blue-white.css" />" id="dev-css">
        <!-- ./css styles -->                                    
                
        <!--[if lte IE 9]>
        <link rel="stylesheet" type="text/css" href="css/dev-other/dev-ie-fix.css">
        <![endif]-->
        
        <!-- javascripts -->
        <script type="text/javascript" src="<c:url value="js/plugins/modernizr/modernizr.js" />"></script>
        <!-- ./javascripts -->
        
        <script type="text/javascript" src="<c:url value="/resources/js/plugins/jquery/jquery.min.js" />"></script>  
        <script type="text/javascript" src="<c:url value="/resources/js/custom.js" />"></script>
        <script type="text/javascript" src="<c:url value="/resources/js/md5.js" />"></script>
        <style>.dev-page{visibility: hidden;}</style>
    </head>
    <body>
                
        <!-- page wrapper -->
        <div class="dev-page dev-page-login dev-page-login-v2">
                      
            <div class="dev-page-login-block">
            	<tiles:insertAttribute name="body" />
                
                <tiles:insertAttribute name="footer" />
            </div>
            
        </div>
        <!-- ./page wrapper -->                
        
        <!-- javascript -->
        <script type="text/javascript" src="<c:url value="/resources/js/plugins/bootstrap/bootstrap.min.js" />"></script>        
        <!-- ./javascript -->
    </body>
</html>