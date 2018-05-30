<%-- 
    Document   : テスト
    Created on : 2018/05/30, 13:12:13
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


int num = 1000;
int time = 0;
while(num>=100) {
    
    time++;
    num = num / 2;
}
    out.print(time);




       //　-------------------------ここまで------------------------------
        %>
</body>
</html>
