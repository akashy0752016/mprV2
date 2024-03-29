<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/tag-libs.jsp" %> 
<!-- page footer -->    
<div class="dev-page-footer dev-page-footer-fixed"> <!-- dev-page-footer-closed dev-page-footer-fixed -->
    <ul class="dev-page-footer-controls">
        <li><a class="tip" title="Settings"><i class="fa fa-cogs"></i></a></li>
        <li><a class="tip" title="Support"><i class="fa fa-life-ring"></i></a></li>
        <li><a class="tip" title="Logoff" href="#" onclick='$("#logout-form").submit()'><i class="fa fa-power-off"></i></a></li>
       
        <li class="pull-right">
            <a class="dev-page-sidebar-minimize tip" title="Toggle navigation"><i class="fa fa-outdent"></i></a>
        </li>
    </ul>
    <form id="logout-form" action="<c:url value="/logoutProcessUrl"/>" method="post">
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
	</form>
    <!-- page footer buttons -->
    <ul class="dev-page-footer-buttons">                    
        <li><a href="#footer_content_1" class="dev-page-footer-container-open"><i class="fa fa-database"></i></a></li>                    
        <li><a href="#footer_content_2" class="dev-page-footer-container-open"><i class="fa fa-bar-chart"></i></a></li>
        <li><a href="#footer_content_3" class="dev-page-footer-container-open"><i class="fa fa-server"></i></a></li>
    </ul>
    <!-- ./page footer buttons -->
    <!-- page footer container -->
    <div class="dev-page-footer-container">
        
        <!-- loader and close button -->
        <div class="dev-page-footer-container-layer">
            <a href="#" class="dev-page-footer-container-layer-button"></a>
        </div>
        <!-- ./loader and close button -->                    
        
        <!-- informers -->
        <div class="dev-page-footer-container-content" id="footer_content_1">                        
            <div class="dev-list-informers">                            
                <div class="dev-list-informers-item">
                    <div class="chart">
                        <input class="knob" data-width="100" data-max="100" data-fgColor="#E74E40" value="33" data-angleArc="250" data-angleOffset="-125" data-thickness=".1"/>
                    </div>
                    <div class="info">
                        <h5>Disk Usage</h5>
                        <p>Server #1 - <strong>235,4Gb / 500Gb</strong></p>
                        <p>Server #2 - <strong>114,2Gb / 500Gb</strong></p>
                        <p class="text-higlight">33% - Total disk usage</p>
                    </div>
                </div>
                
                <div class="dev-list-informers-item">
                    <div class="chart">
                        <input class="knob" data-width="100" data-max="100" data-fgColor="#85d6de" value="75" data-thickness=".1"/>
                    </div>
                    <div class="info">
                        <h5>Database Usage</h5>
                        <p>Disk Space - <strong>64,3Gb / 100Gb</strong></p>
                        <p>Accounts - <strong>12 / 30</strong></p>
                        <p class="text-higlight">75% - Features usage</p>
                    </div>
                </div>
                
                <div class="dev-list-informers-item">
                    <div class="chart">
                        <input class="knob" data-width="100" data-max="100" data-fgColor="#82b440" value="62" data-thickness=".1"/>
                    </div>
                    <div class="info">
                        <h5>Memory Usage</h5>
                        <p>Total - <strong>2048Mb</strong></p>
                        <p>Cached - <strong>1291Mb</strong></p>
                        <p>Available - <strong>757Mb</strong></p>
                    </div>
                </div>                            
            </div>                        
        </div>
        <!-- ./informers -->
        
        <!-- informers -->
        <div class="dev-page-footer-container-content" id="footer_content_2">                        
            <div class="dev-list-informers">                            
                <div class="dev-list-informers-item dev-list-informers-item-extended">
                    <div class="chart">
                        <span class="sparkline" sparkType="bar" sparkBarColor="#82b440" sparkWidth="150" sparkHeight="100" sparkBarWidth="15">5,4,3,2,4,5,6,7,8,6,4,5</span>
                    </div>
                    <div class="info">
                        <h5>Visitors</h5>
                        <p>New - <strong>722</strong></p>
                        <p>Returned - <strong>230</strong></p>
                        <p class="text-higlight">Total - <strong>952</strong></p>
                    </div>
                </div>                            
                
                <div class="dev-list-informers-item dev-list-informers-item-extended">
                    <div class="chart">
                        <span class="sparkline" sparkFillColor="#85d6de" sparkLineWidth="2" sparkLineColor="#85d6de" sparkWidth="200" sparkHeight="100" >5,4,3,2,4,5,6,7,8,6,4,5</span>
                    </div>
                    <div class="info">
                        <h5>Sales</h5>
                        <p>Total Sales - 35</p>
                        <p>Rate - 25</p>
                        <p class="text-higlight">Ratio - <strong>75%</strong></p>
                    </div>
                </div>
                
                <div class="dev-list-informers-item">
                    <div class="chart">
                        <span class="sparkline" sparkType="pie" sparkWidth="100" sparkHeight="100" >3,7</span>
                    </div>
                    <div class="info">
                        <h5>User Stats</h5>
                        <p>Registrated - 1,522</p>
                        <p>Not active - 316</p>
                        <p class="text-higlight">Total - <strong>1,838</strong></p>
                    </div>
                </div>                            
            </div>                        
        </div>
        <!-- ./informers -->
        
        <!-- projects -->
        <div class="dev-page-footer-container-content" id="footer_content_3">                        
            <ul class="dev-list-projects">
                <li><a href="#" class="active">Intuitive</a></li>
                <li><a href="#">Atlant</a></li>
                <li><a href="#">Gemini</a></li>
                <li><a href="#">Taurus</a></li>
                <li><a href="#">Leo</a></li>
                <li><a href="#">Aries</a></li>
                <li><a href="#">Virgo</a></li>
                <li><a href="#">Aquarius</a></li>
                <li><a href="#" class="dev-list-projects-add"><i class="fa fa-plus"></i></a></li>
            </ul>                        
        </div>
        <!-- ./projects -->
    </div>
    <!-- ./page footer container -->
    
    <ul class="dev-page-footer-controls dev-page-footer-controls-auto pull-right">
        <li><a class="dev-page-footer-fix tip" title="Fixed footer"><i class="fa fa-thumb-tack"></i></a></li>
        <li><a class="dev-page-footer-collapse dev-page-footer-control-stuck"><i class="fa fa-dot-circle-o"></i></a></li>
    </ul>
</div>
<!-- ./page footer -->