<%-- 
    Document   : Java基礎Java課題3
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

</head>
<body>
       <% 
        //　----------ここから下へソースコードを書く------------
        
        
        final int BASE = 100;
        
        int num = 5;
        out.print(BASE / num);//500×5=2500を表示
        
        out.print(num++);
        out.print(num);//56を表示
        
        
       //　-------------------------ここまで------------------------------
        %>
</body>
</html>
