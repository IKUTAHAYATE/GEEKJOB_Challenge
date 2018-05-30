<%-- 
    Document   : Java〜ループ処理〜課題３
    Created on : 2018/05/30, 12:04:58
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
        int result = 0;
        for(int i=0;i<101;i++){
            result+= i;
        }
        out.print(result);
        
        
       //　-------------------------ここまで------------------------------
        %>
</body>
</html>
