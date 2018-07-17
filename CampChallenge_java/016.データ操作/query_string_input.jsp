
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="query_string_output.jsp" method="post">
            <p>
                合計<input type="text" name="total">
            </p>
            数量<input type="text" name="count">
            <p>
                <select name="cmbList">
                    <option value="雑貨">雑貨</option>
                    <option value="生鮮食品">生鮮食品</option>
                    <option value="その他">その他</option>


                </select>
            </p>

            <p>
                <input type="submit" value="送信する">
            </p>
        </form>
    </body>
</html>
