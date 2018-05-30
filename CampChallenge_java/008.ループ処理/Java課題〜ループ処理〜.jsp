<%-- 
    Document   : Java課題〜ループ処理〜
    Created on : 2018/05/30, 10:35:19
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
        long result = 1;
for ( long i = 0; i < 20; i++ ) {
    result = result*8;
}
out.print(result);
        
        
        
       //　------------------；-------ここまで------------------------------
        %>
</body>
</html>
