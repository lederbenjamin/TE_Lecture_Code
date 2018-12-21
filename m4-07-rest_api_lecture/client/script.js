$(document).ready(function () {
    
    $("#myButton").click(function(){
            var orderId = 1;
            var apiUrl = "http://localhost:8080/rest-api-lecture/order/getOrderById?id=" + orderId;
            
            $.ajax({
                url: apiUrl,
                type: "GET",
                dataType: "json"
            }).done(function (data) {
                $("#message").text(data);
            }).fail(function(xhr, status, error) {
                console.log(error);
            });
        });
    });