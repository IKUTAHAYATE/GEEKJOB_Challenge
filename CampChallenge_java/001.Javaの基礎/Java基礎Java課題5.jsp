<%-- 
    Document   : Javaの基礎Java課題5
    Created on : 2018/05/23, 13:58:13
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
        int num = 3;
        if(num == 1){
            out.print("1です");
        } else if(num == 2){
            out.print("2です");
        } else{out.print("その他です");
        }
       //　-------------------------ここまで------------------------------
        %>
</body>
</html>
