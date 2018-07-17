
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            request.setCharacterEncoding("UTF-8");

            int total = Integer.parseInt(request.getParameter("total"));

            int count = Integer.parseInt(request.getParameter("count"));

            out.print(request.getParameter("cmbList"));

            out.println("商品の合計は" + total);
            out.println("商品の個数は" + count);
            out.println("商品の単価は" + total / count);

            if (total < 3000) {
                out.println("ポイントは0");
            } else if (total <= 5000) {
                out.println("ポイントは" + total * 0.04);
            } else {
                out.println("ポイントは" + total * 0.05);
            }

        %>

    </body>
</html>
