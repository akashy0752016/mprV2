<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/tag-libs.jsp" %> 
<!DOCTYPE html>
<!-- page sidebar -->
<div class="dev-page-sidebar">
    
    <ul class="dev-page-navigation">
        <li class="title">Navigation</li>
        <li class="active">
            <a href="<c:url value='/dashboard'/>"><i class="fa fa-desktop"></i> <span>Dashboard</span></a>
        </li>                        
        <li>
            <a href="#"><i class="fa fa-file-o"></i> <span>Pages</span></a>
            <ul>
                <li>
                    <a href="#">Email</a>
                    <ul>
                        <li><a href="pages-email-inbox.html">Inbox</a></li>
                        <li><a href="pages-email-compose.html">Compose</a></li>
                    </ul>
                </li>
                <li>
                    <a href="#">Login Forms</a>
                    <ul>
                        <li><a href="pages-login.html" target="_blank">Login</a></li>
                        <li><a href="pages-login-lite.html" target="_blank">Login Lite</a></li>
                    </ul>
                </li>
                <li>
                    <a href="#">Registration Forms</a>
                    <ul>
                        <li><a href="pages-registration.html" target="_blank">Registration</a></li>
                        <li><a href="pages-registration-lite.html" target="_blank">Registration Lite</a></li>
                    </ul>
                </li>                                
                <li><a href="pages-lock-screen.html">Lock Screen</a></li>                                
                <li><a href="pages-session-timeout.html">Session Timeout</a></li>
                <li><a href="pages-edit-profile.html">Edit Profile</a></li>
                <li><a href="pages-profile.html">Profile</a></li>
                <li><a href="pages-faq.html">FAQ</a></li>
                <li><a href="pages-gallery.html">Gallery</a></li>
                <li><a href="pages-tocify.html">Tocify</a></li>
                <li><a href="pages-invoice.html">Invoice</a></li>
                <li><a href="pages-error-404.html">Error 404</a></li>                                
                <li><a href="pages-contacts.html">Contacts</a></li>
            </ul>
        </li>                        
        <li>
            <a href="#"><i class="fa fa-cube"></i> <span>Layouts</span></a>
            <ul>                                
                <li><a href="layout-boxed.html">Boxed</a></li>
                <li><a href="layout-no-footer.html">No Footer</a></li>
                <li><a href="layout-fixed-footer.html">Fixed Footer</a></li>
                <li><a href="layout-footer-collapsed.html">Footer Collapsed</a></li>
                <li><a href="layout-nav-minimized.html">Minimized Navigation</a></li>                                
                <li><a href="layout-nav-collapsed.html">Collapsed Navigation</a></li>
                <li><a href="layout-nav-right.html">Navigation Right</a></li>
            </ul>
        </li>       
        <li>
            <a href="features.html"><i class="fa fa-globe"></i> <span>Features List</span></a>
        </li>
        <li class="title">Components</li>
        <li>
            <a href="#"><i class="fa fa-cogs"></i> <span>UI Kits</span></a>
            <ul>                                
                <li><a href="ui-elements.html">UI Elements</a></li>
                <li><a href="ui-widgets.html">Widgets</a></li>
                <li><a href="ui-buttons.html">Buttons</a></li>
                <li><a href="ui-modals.html">Modals & Popups</a></li>
                <li><a href="ui-panels.html">Panels</a></li>
                <li><a href="ui-typography.html">Typography</a></li>
                <li><a href="ui-icons.html">Icons</a></li>
                <li><a href="ui-tour.html">Tour</a></li>
                <li><a href="ui-slide-menu.html">Sliding Menu</a></li>
                <li><a href="ui-sliders.html">Sliders</a></li>
                <li><a href="ui-nestable.html">Nestable List</a></li>
                <li><a href="ui-tree-view.html">Tree View</a></li>
                <li><a href="ui-language.html">Change Language</a></li>
                <li>
                    <a href="#">Timeline</a>
                    <ul>
                        <li><a href="ui-timeline-simple.html">Simple Timeline</a></li>
                        <li><a href="ui-timeline.html">Timeline</a></li>
                    </ul>
                </li>
            </ul>
        </li>
        <li>
            <a href="#"><i class="fa fa-pencil"></i> <span>Forms</span></a>
            <ul>
                <li><a href="form-elements.html">Form Elements</a></li>
                <li><a href="form-layouts.html">Form Layouts</a></li>
                <li><a href="form-wizard.html">Form Wizard</a></li>
                <li><a href="form-validation.html">Form Validation & Helpers</a></li>
                <li><a href="form-editors.html">WYSIWYG Editors</a></li>                                
            </ul>
        </li>
        <li>
            <a href="charts.html"><i class="fa fa-line-chart"></i> <span>Charts</span></a>
        </li>
        <li>
            <a href="maps.html"><i class="fa fa-map-marker"></i> <span>Maps</span></a>
        </li>
        <li>
            <a href="#"><i class="fa fa-table"></i> <span>Tables</span></a>
            <ul>
                <li><a href="tables-static.html">Static Tables</a></li>
                <li><a href="tables-sortable.html">Sortable Tables</a></li>
                <li><a href="tables-other.html">Other Features</a></li>
            </ul>
        </li>                        
        <li>
            <a href="#"><i class="fa fa-code-fork"></i> <span>Multi-Level Navigation</span></a>
            <ul>
                <li><a href="#">Second Level</a></li>
                <li>
                    <a href="#">Second Level</a>
                    <ul>
                        <li><a href="#">Third Level</a></li>
                        <li><a href="#">Third Level</a></li>
                        <li><a href="#">Third Level</a></li>
                    </ul>
                </li>
                <li><a href="#">Second Level</a></li>
            </ul>
        </li>
    </ul>
    
</div>
<!-- ./page sidebar -->