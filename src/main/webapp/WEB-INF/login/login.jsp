<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/tag-libs.jsp" %> 
<a class="dev-page-login-block__logo">Intuitive</a>
<div class="dev-page-login-block__form">
    <div class="title"><strong>Welcome</strong>, please login</div>
    <springForm:form id="loginForm" name="submitForm" method="POST" action="/processLogin">
        <div class="form-group">
            <div class="input-group">
                <span class="input-group-addon"><i class="fa fa-user"></i></span>
                <input type="text" class="form-control" placeholder="Login" id="userName" name="username">
            </div>
        </div>                        
        <div class="form-group">
            <div class="input-group">
                <span class="input-group-addon"><i class="fa fa-lock"></i></span>
                <input type="password" class="form-control" id="password" name="password" placeholder="Password">
            </div>
        </div>
        <c:if test="${not empty msg}">
                <div class="response">
                    <div class="msg">${msg}</div>
                </div>
        </c:if>
        <c:if test="${not empty SPRING_SECURITY_LAST_EXCEPTION}">
            <div class="error">
                Your login attempt was not successful due to <c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message}"/>.
            </div>
        </c:if>
        <c:if test="${not empty error}">
            <div class="error">
                <div class="error">${error}</div>
            </div>
        </c:if>
        <div class="form-group no-border margin-top-20">
            <button class="btn btn-success btn-block" type="submit" id="submit">Login</button>
        </div>
        <p><a href="#">Forgot Password?</a></p>                        
    </springForm:form>
</div>