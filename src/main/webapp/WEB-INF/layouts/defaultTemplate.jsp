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
        
        
        <!-- <link rel="icon" href="favicon.ico" type="image/x-icon" > -->
        <!-- /meta section -->        
        
        <!-- css styles -->
        <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/blue-white.css" />" id="dev-css">
        <!-- ./css styles -->                                    
                
        <!--[if lte IE 9]>
        <link rel="stylesheet" type="text/css" href="css/dev-other/dev-ie-fix.css">
        <![endif]-->
        
        <!-- javascripts -->
        <script type="text/javascript" src="<c:url value="/resources/js/plugins/modernizr/modernizr.js" />"></script>
        <!-- ./javascripts -->
        
        <script type="text/javascript" src="<c:url value="/resources/js/plugins/jquery/jquery.min.js" />"></script>  
        <script type="text/javascript" src="<c:url value="/resources/js/custom.js" />"></script>
        <script type="text/javascript" src="<c:url value="/resources/js/md5.js" />"></script>
        
        <style>
            .dev-page{visibility: hidden;}            
        </style>
    </head>
    <body>
        <!-- set loading layer -->
        <div class="dev-page-loading preloader"></div>
        <!-- ./set loading layer -->       
        
        <!-- page wrapper -->
        <div class="dev-page">
            
            <tiles:insertAttribute name="header" />
            
            <!-- page container -->
            <div class="dev-page-container">

                <tiles:insertAttribute name="sidebar" />
                
                <tiles:insertAttribute name="body" />                                               
            </div>  
            <!-- ./page container -->
            
            <tiles:insertAttribute name="rightbar" />
            
            <tiles:insertAttribute name="footer" />
            
            <!-- page search -->
            <div class="dev-search">
                <div class="dev-search-container">
                    <div class="dev-search-form">
                    <form action="index.html" method="post">
                        <div class="dev-search-field">
                            <input type="text" placeholder="Search..." value="Nature">
                        </div>                        
                    </form>
                    </div>
                    <div class="dev-search-results"></div>
                </div>
            </div>
            <!-- page search -->            
        </div>
        <!-- ./page wrapper -->

        <!-- javascript -->
              
        <script type="text/javascript" src="<c:url value="/resources/js/plugins/bootstrap/bootstrap.min.js" />"></script>
        
        <script type="text/javascript" src="<c:url value="/resources/js/plugins/mcustomscrollbar/jquery.mCustomScrollbar.min.js" />"></script>        
        <script type="text/javascript" src="<c:url value="/resources/js/plugins/moment/moment.js" />"></script>
        
        <script type="text/javascript" src="<c:url value="/resources/js/plugins/knob/jquery.knob.min.js" />"></script>
        <script type="text/javascript" src="<c:url value="/resources/js/plugins/sparkline/jquery.sparkline.min.js" />"></script>
        
        <script type="text/javascript" src="<c:url value="/resources/js/plugins/bootstrap-select/bootstrap-select.js" />"></script>
        
        <script type="text/javascript" src="<c:url value="/resources/js/plugins/nvd3/d3.min.js" />"></script>
        <script type="text/javascript" src="<c:url value="/resources/js/plugins/nvd3/nv.d3.min.js" />"></script>
        <script type="text/javascript" src="<c:url value="/resources/js/plugins/nvd3/lib/stream_layers.js" />"></script>
        
        <script type="text/javascript" src="<c:url value="/resources/js/plugins/waypoint/waypoints.min.js" />"></script>
        <script type="text/javascript" src="<c:url value="/resources/js/plugins/counter/jquery.counterup.min.js" />"></script>        
                
        <script type="text/javascript" src="<c:url value="/resources/js/dev-settings.js" />"></script>
        <script type="text/javascript" src="<c:url value="/resources/js/dev-loaders.js" />"></script>
        <script type="text/javascript" src="<c:url value="/resources/js/dev-layout-default.js" />"></script>
        <script type="text/javascript" src="<c:url value="/resources/js/demo.js" />"></script>
        <script type="text/javascript" src="<c:url value="/resources/js/dev-app.js" />"></script>
        <script type="text/javascript" src="<c:url value="/resources/js/demo-dashboard.js" />"></script>
        <!-- ./javascript -->
    </body>
</html>