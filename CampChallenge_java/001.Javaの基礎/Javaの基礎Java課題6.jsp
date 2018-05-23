<%-- 
    Document   : Javakisp課題6
    Created on : 2018/05/23, 15:23:21
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
        int type = 3;
        switch(type) {
            case 1:
                out.print("one");
                break;
            case 2:
                out.print("two");
                break;
            default:
                out.print("想定外");
                break;
       }
        
       //　-------------------------ここまで------------------------------
        %>
</body>
</html>
