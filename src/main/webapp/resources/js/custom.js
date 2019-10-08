function getContextPath() {
    return window.location.pathname.substring(0, window.location.pathname.indexOf("/",2));
}

$(document).ready(function(){
	if($('#loginForm').length){
		$("#submit").click(function(){
			var password = sha256($("#password").val());
			password = sha256(password + $( "input[name='_csrf']" ).val().replace(/-/g, ""));
			$("#password").val(password+"@"+$( "input[name='_csrf']" ).val());
		});
	}
});