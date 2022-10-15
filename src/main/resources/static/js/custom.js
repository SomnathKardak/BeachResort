jQuery(document).ready(function() {
	
//	"use strict";
	// Your custom js code goes here.
             $(".btnSubmit").click(function() {
                     var fname = document.getElementById("fname").value;
                     var lname = document.getElementById("lname").value;
                     var email = document.getElementById("email").value;
                     var phone = document.getElementById("phone").value;
                     var subject = document.getElementById("subject").value;
                     var message = document.getElementById("message").value;

                     var url = "https://wa.me/+918857846803?text="
                     + "Name: " + fname + "%20" + lname + "%0a"
                     + "Email: " + email  + "%0a"
                     + "Phone: " + phone  + "%0a"
                     + "Subject: " + subject  + "%0a"
                     + "Message: " + message;
                     window.open(url, '_blank').focus();
             });
 });