<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%--<%@page contentType="text/html" pageEncoding="UTF-8" %>--%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>


<t:template title="Jogo">

    <jsp:body>
        <h1>Olá ${name}  </h1>
        <div class="row">
            <div class="col s12 m6">
                <div class="card white darken-1">
                    <div class="card-content white-text">
                        <span class="card-title">Olá ${name}</span>

                        <div class="row center">
                            <a href="aposta" class="waves-effect green btn">Jogar</a>

                        </div>
                        <div class="row center">
                            <a class="waves-effect yellow btn">Resultado</a>

                        </div>
                        <div class="row center">
                            <a class="waves-effect red btn">Valor Gasto</a>

                        </div>

                    </div>

                </div>
            </div>
        </div>


    </jsp:body>
</t:template>

