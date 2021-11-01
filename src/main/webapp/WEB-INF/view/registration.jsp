<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%--<%@page contentType="text/html" pageEncoding="UTF-8" %>--%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
betPost

<t:template title="Cadastro">

    <jsp:body>
        <div class="row">
            <form action="cadastro" method="POST">

                <div class="row">
                    <div class="input-field col s12">
                        <input id="email" type="email" class="validate">
                        <label for="email">Email</label>
                    </div>
                </div>
                <div class="row">
                    <div class="input-field col s12">
                        <input id="password" type="password" class="validate">
                        <label for="password">Password</label>
                    </div>
                </div>
                <button>Enviar</button>
            </form>

            <a class="waves-effect waves-light btn"><i class="material-icons right">Cadastro</i>button</a>

        </div>
    </jsp:body>
</t:template>



