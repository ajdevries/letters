// This is a manifest file that'll be compiled into application.js.
//
// Any JavaScript file within this directory can be referenced here using a relative path.
//
// You're free to add application-wide JavaScript to this file, but it's generally better
// to create separate JavaScript files as needed.
//
//= require jquery-2.1.3.js
//= require_tree .
//= require_self

if (typeof jQuery !== 'undefined') {
    (function ($) {
        $('#spinner').ajaxStart(function () {
            $(this).fadeIn();
        }).ajaxStop(function () {
            $(this).fadeOut();
        });
    })(jQuery);
}

$(function () {

    var size = $('.square').length

    if (size > 0) {
        var top = 75;
        var divider = parseInt(Math.sqrt(size));
        var width = $(window).width() / (size / divider);
        var height = ($(window).height() - top) / (size / divider);
        for (var i = 0; i < size; i++) {
            $($('.square')[i])
                .css({'position': 'absolute'})
                .css({'top': ((parseInt(i % parseInt(size / divider)) * height) +top) + 'px'})
                .css({'left': (parseInt(i / parseInt(size / divider)) * width) + 'px'})
                .css({'width': width-30 + 'px'})
                .css({'height': height-30 + 'px'})
                .css({'line-height': height-30 + 'px'})
                .css({'font-size': height-80 + 'px'});
        }
    }

    $('.score').css('width', (parseInt(($(window).width())/10)-2) + 'px');

    $('.square').click(function(event) {
        var url = $(this).data('url');
        window.location = url;
        event.preventDefault();
    });

    var audio = document.getElementById('letter');
    if (audio) { audio.play();}

});
