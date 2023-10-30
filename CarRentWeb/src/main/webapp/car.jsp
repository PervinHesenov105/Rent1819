


<%@page import="java.util.List"%>
<%@page import="az.rent.main.entity.Car"%>
<%@page import="az.rent.main.dao.inter.CarDaoInter"%>
<%@page import="az.rent.main.config.Context"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/css/style.css">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
    </head>
    <body>
        <div class="search_container">
            <form >
                <div class="mb-3">
                    <label  class="form-label">Marka</label>
                    <input type="text" class="form-control"  name="marka">
                </div>
                <div class="mb-3">
                    <label  class="form-label">Model</label>
                    <input type="text" class="form-control"  name="model">
                </div>
                <button type="submit" class="btn btn-primary">Axtar</button>
            </form>
        </div>

        <table class="table table-dark table-striped mytb">
            <thead>
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Marka</th>
                    <th scope="col">Model</th>
                    <th scope="col">Category</th>
                </tr>
            </thead>
            <tbody>
                <% CarDaoInter cdao = Context.instanceCarDao();
                    List<Car> list = cdao.getAllCar();
                    for (Car c : list) {
                %>
                <tr>
                    <th scope="row"><%=c.getCarId()%></th>
                    <td><%=c.getBrand()%></td>
                    <td><%=c.getModel()%></td>
                    <td><%=c.getCategory().getCategoryName()%></td>
                </tr>
                <%}%>

            </tbody>
        </table>
    </body>
</html>
