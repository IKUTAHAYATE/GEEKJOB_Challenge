<%-- 
    Document   : 連想配列（Map）課題
    Created on : 2018/05/24, 13:52:27
    Author     : triveransaruku
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@ page import="java.util.HashMap" %>
        <% 
            HashMap<String,String>text1 =
                    new HashMap<String,String>();
            
            HashMap<String,String>text2 =
                    new HashMap<String,String>();
            
            HashMap<String,String>text3 =
                    new HashMap<String,String>();
            
            HashMap<String,String>text4 =
                    new HashMap<String,String>();
            
                    
            text1.put("1","AAA");
            out.print("1" + text1.get("1"));
            
            text2.put("hello","world");
            out.print("hello" +text2.get("hello"));
            
            text3.put("soeda","33");
            out.print("soeda" + text3.get("soeda"));
            
            text4.put("20","20");
            out.print("20" + text4.get("20"));
            
            
        %>
    </body>
</html>
