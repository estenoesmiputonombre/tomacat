<%@page language="java" contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
   <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   <title>This is a simple title</title>
</head>
   
<body>

    <%
        String message = "Here, we love languages so sit down and enjoy it!";
        String display = "";
        for(int i = 0; i < message.length(); i++) {
            if((message.charAt(i)+"").equalsIgnoreCase("e")) {
                display += "3";
            } else if((message.charAt(i)+"").equalsIgnoreCase("o")) {
                display += "0";
            } else if((message.charAt(i)+"").equalsIgnoreCase("u")) {
                display += "4";
            } else {
                display += message.charAt(i)+"";
            }
        }
    %>

    <h1><%= display %></h1>
   