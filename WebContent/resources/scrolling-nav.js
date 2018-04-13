//jQuery to collapse the navbar on scroll
$(window).scroll(function() {
    if ($(".navbar").offset().top > 50) {
        $(".navbar-fixed-top").addClass("top-nav-collapse");
    } else {
        $(".navbar-fixed-top").removeClass("top-nav-collapse");
    }
});

//jQuery for page scrolling feature - requires jQuery Easing plugin
$(function() {
    $('a.page-scroll').bind('click', function(event) {
        var $anchor = $(this);
        $('html, body').stop().animate({
            scrollLeft: $($anchor.attr('href')).offset().left - leftoffset;
        }, 1500, 'easeInOutExpo');
        event.preventDefault();
    });
});



setInterval(

$(function() {
	
	document.getElementById("abc").contentDocument.location.reload(true);
	var iframe = document.getElementById("abc");
iframe.src = iframe.src;
}), 2
);
document.getElementById("myDIV").addEventListener("wheel", myFunction);

function myFunction() {
     if ($(".navbar").offset().left > 50) {
        $(".navbar-fixed-top").addClass("top-nav-collapse");
		
    } else {
        $(".navbar-fixed-top").removeClass("top-nav-collapse");
    }
}