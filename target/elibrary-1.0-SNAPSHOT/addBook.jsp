<%--
  Created by IntelliJ IDEA.
  User: kolenpat
  Date: 09.11.2021
  Time: 21:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<h1 class="display-4">Přidat knihu</h1>
<form action="add-book-servlet" method="post">
    <div class="form-group">
        <div class="row">
            <label class="col-4 col-form-label">
                ID knihy:
                <input type="number" name="id">
            </label>
        </div>
        <div class="row">
            <label class="col-4 col-form-label">
                Nazev knihy:
                <input type="text" name="name">
            </label>
        </div>
        <div class="row">
            <label class="col-4 col-form-label">
                Autor:
                <input type="text" name="author">
            </label>
        </div>
        <div class="row">
            <label class="col-4 col-form-label">
                Odkaz:
                <input type="text" name="downloadLink">
            </label>
        </div>
        <input class="btn btn-primary" type="submit" name="submit" value="Přidat">
    </div>
    <hr>
</form>