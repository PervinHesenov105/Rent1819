<%-- 
    Document   : cardetail
    Created on : Oct 20, 2023, 7:27:58 PM
    Author     : Parvin
--%>

<%@page import="az.rent.main.entity.Car"%>
<%@page import="az.rent.main.config.Context"%>
<%@page import="az.rent.main.dao.inter.CarDaoInter"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Car Detail</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/css/style.css">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
    </head>
    <body>

        <%
            CarDaoInter cdao = Context.instanceCarDao();
            Car c = cdao.getCarById(1);
            if (request.getParameter("update") != null) {
                String marka = request.getParameter("marka");
                String model = request.getParameter("model");
                int price = 0;
                String priceStr = request.getParameter("price");
                if (priceStr != null) {
                    price = Integer.valueOf(priceStr);
                }

                c.setBrand(marka);
                c.setModel(model);
                c.setPrice(price);
                cdao.update(c);
            }

        %>
        
        
        <div class="detail_container">
            <form action="cardetail.jsp" method="POST">
                <div class="mb-3">
                    <label  class="form-label">Marka</label>
                    <input type="text" class="form-control"  name="marka" value="<%=c.getBrand()%>">
                </div>
                <div class="mb-3">
                    <label  class="form-label">Model</label>
                    <input type="text" class="form-control"  name="model" value="<%=c.getModel()%>">
                </div>
                <div class="mb-3">
                    <label  class="form-label">Qiymet</label>
                    <input type="text" class="form-control"  name="price" value="<%=c.getPrice()%>">
                </div>
                <input type="submit" name="update" value="Yenilə" class="btn btn-success"/>
            </form>
        </div>
    </body>
</html>
