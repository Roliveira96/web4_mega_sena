<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%--<%@page contentType="text/html" pageEncoding="UTF-8" %>--%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>


<t:template title="Login">

    <jsp:body>

        <div class="row">
            <div class="col s12 m6">
                <div class="card white darken-1">
                    <div class="card-content ">
                        <span class="card-title">Login</span>
                        <form action="login" method="POST">

                            <div class="row">
                                <div class="input-field col s12">
                                    <input name="name" id="email" type="text" class="validate" value="Ricardo">
                                    <label for="email">Nome</label>
                                </div>
                            </div>


                            <button class="btn waves-effect waves-light" type="submit" name="action">Logar

                            </button>

                        </form>



                    </div>

                </div>
            </div>
        </div>



    </jsp:body>
</t:template>



