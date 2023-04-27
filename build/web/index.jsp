<%-- 
    Document   : index
    Created on : 27 de abr. de 2023, 14:28:29
    Author     : QI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Eta Porra furacão</title>
        <link rel="stylesheet" href="css/style.css"/>
        <link rel="icon" href="img/carretafuracão.jpg"/>

    </head>
    <body>
        <form action="LoginController" method="post" id="form-login">
            <img src="img/furacão.jpg" alt="Logotipo" width="350"/> 
            <br>
            
            <input type="text" name="user" id="user" class="field" placeholder="Nome de usuário" required>
            <br><br>
            
            
            <input type="text" name="pass" id="pass" class="field" placeholder="Senha" required>
            <br><br>
            
            <input type="submit" value="Entrar">
            

        </form>
    </body>
</html>
