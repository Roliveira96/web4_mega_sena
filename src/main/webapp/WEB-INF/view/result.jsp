<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<t:template title="Sorteios">

    <jsp:body>
        <h1>Resultado </h1>

        <c:if test="${not empty bet.bet}">


                <div class="row">
                    <div class="col s12 m6">
                        <div class="card white darken-1">
                            <div class="card-content ">
                                <span class="card-title">Resultado</span>

                                <p>Seu jogo: ${bet.bet} </p>
                                <p>Sorteio: ${drawing} </p>
                                <p>Acertos: ${acertos}</p>



                            </div>

                        </div>
                    </div>
                </div>



        </c:if>

        <c:if test="${empty bet.bet}">

            <div class="row">
                <div class="col s12 m6">
                    <div class="card white darken-1">
                        <div class="card-content ">
                            <span class="card-title">Sorteios</span>


                            <h1>Você tem que jogar para que tenha algo aqui!</h1>

                        </div>

                    </div>
                </div>
            </div>
        </c:if>
    </jsp:body>
</t:template>

