

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado IMC</title>
    </head>
    <body>
        <table>
            <tr><td>Indice de Masa Corporal:</td><td><input type="text" name="imc" value="<%=(double)request.getAttribute("imc") %>"/></td></tr>
            <tr><td>Clasificación del IMC:</td><td><input type="text" name="clasificacion" value="<%=request.getAttribute("clasificacion") %>"/></td></tr>
            <tr><td><a href="index.html"/>Volver</td></tr>
        </table>
    </body>
</html>
