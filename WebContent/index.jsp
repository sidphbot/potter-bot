<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <script src="js/jquery-3.1.0.min.js"></script>
      <!-- Bootstrap Core CSS -->
    <link href="resources/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="resources/scrolling-nav.css" rel="stylesheet">
<title>Potter-Bot</title>


<script type="text/javascript">




$(function() {
    $("input:first").bind('click', function(event) {
    	$("p.display").append("<br>"+ $("textarea:first").val());
    	$.ajax({
            url: 'bot_serv',
            type: 'POST',
            data: {input_text : $("textarea:first").val()},
            success: function(response) {
            	$("p.display").append("<br>"+ response);
            	$("textarea:first").val('');
            }            
        });
    
        event.preventDefault();
    });
});

$(document).bind('keypress', function(e) {
    if(e.keyCode==13){
         $("input:first").trigger('click');
     }
});


</script>

</head>
<body >
<div class="panel-group fixed-top">
    <div class="panel panel-primary">
      <div class="panel-heading">Output text</div>
      <div class="panel-body output">
<p class="display" height="80%"></p>
</div></div></div>


<div class="panel-group input ">
    <div class="panel panel-primary">
    
      <div class="panel-body" >
      <div class="fixed-bottom">
      <form id="input_form" height="20%">
    
<textarea rows="1" cols="120" id="text"></textarea>

<input type=submit>
 </form>
 </div>
</div></div></div>

  




</body>
</html>