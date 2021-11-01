<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%--<%@page contentType="text/html" pageEncoding="UTF-8" %>--%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>







<t:template title="Resultado" >

    <jsp:body>
        <h1>Olá ${name} sua idade é: ${age}</h1>
        <h3>Data: ${date}</h3>
    </jsp:body>
</t:template>

