<%-- 
    Document   : Javaの基礎Java課題7
    Created on : 2018/05/23, 16:04:36
    Author     : triveransaruku
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

</head>
<body>
       <% 
        //　----------ここから下へソースコードを書く------------
        char type = 'k';
        switch(type){
            case'A':
                out.print("英語");
                break;
             case'あ':
                out.print("日本語");
                break;
                    
        }
        
       //　-------------------------ここまで------------------------------
        %>
</body>
</html>

