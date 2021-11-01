
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%--<%@page contentType="text/html" pageEncoding="UTF-8" %>--%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:template title="Calculadora de Idade" >

    <jsp:body>
        <form action="calculadora-idade" method="POST">
            Nome: <input type="text" name="name">
            Ano de nascimento: <input type="text" name="year">
            <button>Enviar</button>
        </form>


    </jsp:body>
</t:template>

