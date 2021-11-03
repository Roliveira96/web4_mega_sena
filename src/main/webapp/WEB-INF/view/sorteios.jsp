<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%--<%@page contentType="text/html" pageEncoding="UTF-8" %>--%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<t:template title="Sorteios">

    <jsp:body>
        <h1>Sorteios </h1>

        <c:if test="${not empty drawings}">
            <c:forEach var="drawing" items="${drawings}">

                <div class="row">
                    <div class="col s12 m6">
                        <div class="card white darken-1">
                            <div class="card-content ">
                                <span class="card-title">Sorteios</span>

                                <input value="${drawing.lotterydrawing}">
                                <p>ID:  ${drawing.id}</p>

                            </div>

                        </div>
                    </div>
                </div>

            </c:forEach>


        </c:if>

        <c:if test="${empty drawings}">

            <div class="row">
                <div class="col s12 m6">
                    <div class="card white darken-1">
                        <div class="card-content ">
                            <span class="card-title">Sorteios</span>


                            <h1> Não tem sorteios!</h1>

                        </div>

                    </div>
                </div>
            </div>
        </c:if>
    </jsp:body>
</t:template>

