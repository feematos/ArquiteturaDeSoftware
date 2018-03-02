/*
	Theory by TEMPLATED
	templated.co @templatedco
	Released for free under the Creative Commons Attribution 3.0 license (templated.co/license)
*/

(function($) {

	// Breakpoints.
		skel.breakpoints({
			xlarge:	'(max-width: 1680px)',
			large:	'(max-width: 1280px)',
			medium:	'(max-width: 980px)',
			small:	'(max-width: 736px)',
			xsmall:	'(max-width: 480px)'
		});

	$(function() {

		var	$window = $(window),
			$body = $('body');

		// Disable animations/transitions until the page has loaded.
			$body.addClass('is-loading');

			$window.on('load', function() {
				window.setTimeout(function() {
					$body.removeClass('is-loading');
				}, 100);
			});

		// Prioritize "important" elements on medium.
			skel.on('+medium -medium', function() {
				$.prioritize(
					'.important\\28 medium\\29',
					skel.breakpoint('medium').active
				);
			});

	// Off-Canvas Navigation.

		// Navigation Panel.
			$(
				'<div id="navPanel">' +
					$('#nav').html() +
					'<a href="#navPanel" class="close"></a>' +
				'</div>'
			)
				.appendTo($body)
				.panel({
					delay: 500,
					hideOnClick: true,
					hideOnSwipe: true,
					resetScroll: true,
					resetForms: true,
					side: 'left'
				});

		// Fix: Remove transitions on WP<10 (poor/buggy performance).
			if (skel.vars.os == 'wp' && skel.vars.osVersion < 10)
				$('#navPanel')
					.css('transition', 'none');

	});
	
	// SLIDER FOTOS
	
	$(document).ready(function(){
		jQuery(".slider_stripe").each(function(){
			var carousel = jQuery(this)
			var itemWidth = carousel.attr("rel");
			var numItems = carousel.find(".stripe ul li").length;
			var page=Math.ceil(parseInt(carousel.find(".stripe").width())/itemWidth);
			carousel.find(".items").css("width",numItems * itemWidth)
			carousel.data("index",0).data("total",numItems-1);
			carousel.find(".next").click(function(evt){
				var index=parseInt(carousel.data("index"));
				if(index < parseInt(carousel.data("total")/page)){
					carousel.data("index",index+1);
					var itemsOnPage = numItems - (carousel.data("index")*page);
					var scrollAmount = page;
					if(itemsOnPage<page) {
						scrollAmount = itemsOnPage;
					}
					carousel.find(".items").animate({left:"-="+itemWidth*scrollAmount},250);
				}
				evt.preventDefault();
			})
			
			carousel.find(".previous").click(function(evt){
				var index=parseInt(carousel.data("index"));
				if(index>0){
					var itemsOnPage = numItems - (carousel.data("index")*page);
					var scrollAmount = page;
					if(itemsOnPage<page) {
						scrollAmount = itemsOnPage;
					}
					carousel.data("index",index-1);
					carousel.find(".items").animate({left:"+="+itemWidth*scrollAmount},250);
				}
				evt.preventDefault();
			})
			var interval = setInterval(function(){
				var index=parseInt(carousel.data("index"));
				if(index < parseInt(carousel.data("total")/page)){
					carousel.find(".next").click();
				}else{
					carousel.data("index",0);
					carousel.find(".items").animate({left:0},250);
					//carousel.find(".previous").click();
				}
			},5000)
		});
	})

})(jQuery);


