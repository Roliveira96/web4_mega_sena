<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%--<%@page contentType="text/html" pageEncoding="UTF-8" %>--%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>


<t:template title="Confirmação">

    <jsp:body>

        <style>.ball {
            float: left;
            margin-left: 10px;
            width: 30px;
            height: 30px;
            border-radius: 100%;
            background: #00804b;
            text-align: center;
            position: relative;
            color: #FFF;
            font-weight: bold;
            font-family: sans;
        }

        span {
            position: absolute;
            top: 5px;
            left: 4px;
        }
        </style>
        <h1 class="">Confirmação </h1>
        <div class="row">
            <div class="col s12 m8">
                <div class="card white darken-1">
                    <div class="card-content ">
                        <div class="row">
                            <div id="mega">
                            </div>
                        </div>

                        <form action="finalizacao" method="POST">

                            <div class="row hide">
                                <div class="input-field col s12">
                                    <input name="bet" id="betOBJ2" type="text" class="validate" value="${betString}">
                                    <label for="betOBJ2">Jogo</label>

                                </div>

                            </div>


                            <div class="row hide">
                                <div class="input-field col s12">
                                    <input name="valor" id="valueBet" type="text" class="validate"
                                           value="${betObj.value}">
                                    <label for="valueBet">Valor a ser pago</label>
                                </div>
                            </div>

                            <div class="row hide">
                                <div class="input-field col s12">
                                    <input name="probabilityInp" id="probabilityInp" type="text" class="validate"
                                           value="${betObj.probability}">
                                    <label for="probabilityInp">Probabilidade de acerto (1 em):</label>
                                </div>
                            </div>


                            <div class="row">

                                <p class="input-field col s12">Aposta: <b>${betString} </b></p>
                                <p class="input-field col s12">Valor: <b>${betObj.value} </b></p>
                                <p class="input-field col s12">Probabilidade de acerto (1 em):
                                    <b>${betObj.probability}</b>
                                </p>

                            </div>

                            <div class="row center">
                                <button id="subimitBT" class="btn waves-effect green waves-light" type="submit"
                                        name="action">Confirmar Aposta!
                                </button>
                            </div>

                            <div class="row center">
                                <a href="/aposta" class="waves-effect red btn">Fazer novo Jogo</a>
                            </div>

                        </form>

                    </div>
                </div>
            </div>
        </div>

    </jsp:body>
</t:template>

