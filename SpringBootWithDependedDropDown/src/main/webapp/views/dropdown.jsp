<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DropDown Page</title>
<style type="text/css">
body {
	background-color: lightyellow;
	font-weight: bold;
}

select {
	width: 300px;
	height: 40px;
	font-size: larger;
	color: blue;
	font-family: sans-serif;
}

.labels {
	width: 163px;
	display: inline-block;
}
</style>
<script type="text/javascript"
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/1.11.1/jquery.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$.ajax({
			url : "getCountry",
			cache : false,
			dataType : 'json',
			success : function(result) {
				console.log(result);
				$.each(result, function(key, value) {
					console.log(key + "...." + value);
					$("<option>").val(key).text(value).appendTo("#country");

				});
			}
		});
	});
	$(document).on("change", "#country", function() {
		$("#state").find('option').remove();
		$('<option>').val("").text("--Select State name--").appendTo("#state");
		$("#city").find('option').remove();
		$('<option>').val("").text("--Select City name--").appendTo("#city");
		var selectedCountryId = $("#country").val();
		$.ajax({
			url : 'getState',
			data : {
				countryId : selectedCountryId
			},
			dataType : 'json',
			success : function(result) {
				$.each(result, function(key, value) {
					$('<option>').val(key).text(value).appendTo("#state");
				});
			}
		});
	});
$(document).on("change","#state",function(){
	$("#city").find('option').remove();
	$('<option>').val("").text("--Select City name--").appendTo("#city");
	var selectStateId=$("#state").val();
	$.ajax({
		url:"getCity",
		data :{
			stateId :selectStateId
			},
		dataType:'json',
		success :function(result){
			$.each(result,function(key,value){
				$('<option>').val(key).text(value).appendTo("#city");
				});
			}	
		});
});
</script>
</head>
<body>
	<font color='red'size="5">${msg}</font>
	<h1>Select Drop Down List For Different Option</h1>
	<div class="labels">Select Country Name:</div>
	<select id="country">
		<option value="-1">--Select Country name--</option>
	</select>
	<br>
	<br>
	<div class="labels">Select State Name:</div>
	<select id="state">
		<option value="-1">--Select State name--</option>
	</select>
	<br>
	<br>
	<div class="labels">Select City Name:</div>
	<select id="city">
		<option value="-1">--Select City name--</option>
	</select>
</body>
</html>