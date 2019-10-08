var dev_settings = '<div class="dev-settings-button">'
        +'<span class="fa fa-tint"></span>'
    +'</div>'
    +'<div class="dev-settings-body">'
        +'<a href="#" data-theme="/resources/css/default.css"><img src="/resources/img/themes/default.jpg"></a>'
        +'<a href="#" data-theme="/resources/css/dark.css"><img src="/resources/img/themes/dark.jpg"></a>'
        +'<a href="#" data-theme="/resources/css/blue.css"><img src="/resources/img/themes/blue.jpg"></a>'                        
        +'<a href="#" data-theme="/resources/css/lightblue.css"><img src="/resources/img/themes/lightblue.jpg"></a>'            
        +'<a href="#" data-theme="/resources/css/light.css"><img src="/resources/img/themes/light.jpg"></a>'
        +'<a href="#" data-theme="/resources/css/green.css"><img src="/resources/img/themes/green.jpg"></a>'

        +'<a href="#" data-theme="/resources/css/default-white.css"><img src="/resources/img/themes/default-white.jpg"></a>'
        +'<a href="#" data-theme="/resources/css/dark-white.css"><img src="/resources/img/themes/dark-white.jpg"></a>'
        +'<a href="#" class="active" data-theme="/resources/css/blue-white.css"><img src="/resources/img/themes/blue-white.jpg"></a>'                        
        +'<a href="#" data-theme="/resources/css/lightblue-white.css"><img src="/resources/img/themes/lightblue-white.jpg"></a>'            
        +'<a href="#" data-theme="/resources/css/light-white.css"><img src="/resources/img/themes/light-white.jpg"></a>'
        +'<a href="#" data-theme="/resources/css/green-white.css"><img src="/resources/img/themes/green-white.jpg"></a>'
    +'</div>';

var settings_block = document.createElement('div');
    settings_block.className = "dev-settings";
    settings_block.innerHTML = dev_settings;
    document.body.appendChild(settings_block);

$(document).ready(function(){
    
    /* Change Theme */
    $(".dev-settings-body a[data-theme]").click(function(){
        $(".dev-settings-body a[data-theme]").removeClass("active");
        $(this).addClass("active");
        $("#dev-css").attr("href",$(this).data("theme"));
        
        return false;
    });
    /* END Change Theme */
    
    /* Open/Hide Settings */
    $(".dev-settings-button").on("click",function(){
        $(".dev-settings").toggleClass("active");
    });
    /* End open/hide settings */
    
});