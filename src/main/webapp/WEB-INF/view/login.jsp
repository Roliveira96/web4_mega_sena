<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%--<%@page contentType="text/html" pageEncoding="UTF-8" %>--%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>


<t:template title="Login">

    <jsp:body>
        <div class="row">
            <form action="login" method="POST">

                <div class="row">
                    <div class="input-field col s12">
                        <input name="name" id="email" type="text" class="validate" value="Ricardo">
                        <label for="email">Nome</label>
                    </div>
                </div>

                <button>Enviar</button>
            </form>

            <a class="waves-effect waves-light btn"><i class="material-icons right">Cadastro</i>button</a>

        </div>
    </jsp:body>
</t:template>



