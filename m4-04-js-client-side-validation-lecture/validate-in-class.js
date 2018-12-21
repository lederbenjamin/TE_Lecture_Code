$(document).ready(function () {

    //validate takes an object NOT a function
    $("#applicationForm").validate({

        debug: true,
        rules:  {
            fName: {
                required: true
            },
            lName: {
                required: true,
                minlength: 2,
                lettersonly: true
            },
            emailAddr:  {
                email: true,
                techelevatoremail: true
            },
            password: {
                required: true,
                minlength: 8,
                strongpassword: true
            },
            verifyPassword: {
                equalTo: "#password"
            },
            favoriteCompanies: {
                minlength: 2
            }



        },  //end of rules
        messages:  {
            fName: {
                required: "You must provide a first name"
            },
            lName: {
                required: "You must provide a last name ",
                minlength: "Last name can't be less than 2 charcters"
            },
            favoriteCompanies: {
                minlength: "Pick 2 you big dummy"
            },
            errorClass: "error",
            validClass: "valid"





        }  //end of messages





    })  //end of validation

});    //end of document.ready()


$.validator.addMethod("techelevatoremail", function(value, index) {
   return value.toLowerCase().endsWith("@techelevator.com");
}, "Please enter a valid techelevator email address");

$.validator.addMethod("strongpassword", function (value, index) {
    return value.match(/[A-Z]/) && value.match(/[a-z]/) && value.match(/\d/);  //check for one capital letter, one lower case letter, one num
}, "Please enter a strong password (one capital, one lower case, and one number");