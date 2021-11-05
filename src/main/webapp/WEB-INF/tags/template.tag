

<%@tag description="Template principal" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%-- The list of normal or fragment attributes can be specified here: --%>
<%@attribute name="title" %>

<!doctype html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="assets/resources/css/materialize.css">
    <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"></link>
    <link href='http://fonts.googleapis.com/css?family=Roboto:200,700' rel='stylesheet' type='text/css'/>
    <title>${title}</title>

    <style>

        body {
            display: flex;
            min-height: 100vh;
            flex-direction: column;
        }

        main {
            flex: 1 0 auto;
        }

    </style>
</head>
<body>

<header class=" blue">
    <nav class="blue container">
        <div class="nav-wrapper">
            <a href="#" class="brand-logo">Mega da UTFPR</a>
            <ul id="nav-mobile" class="right hide-on-med-and-down">
                <li><a href="/">Home</a></li>
                <li><a href="sorteios">Sorteios</a></li>
                <li class="green"><a href="login">Login</a></li>

            </ul>
        </div>
    </nav>
</header>





<main id="content" class="container">
    <jsp:doBody/>
</main>







<footer class="page-footer blue darken-5">
    <div class="container">
        <div class="row">
            <div class="col l6 s12">
                <h5 class="white-text">Footer Content</h5>
                <p class="grey-text text-lighten-4">You can use rows and columns here to organize your footer content.</p>
            </div>
            <div class="col l4 offset-l2 s12">
                <h5 class="white-text">Links</h5>
                <ul>

                </ul>
            </div>
        </div>
    </div>
    <div class="footer-copyright">
        <div class="container">
            © 2014 Copyright Text
            <a class="grey-text text-lighten-4 right" href="#!">More Links</a>
        </div>
    </div>
</footer>


<script src="https://code.jquery.com/jquery-2.2.4.js"></script>
<script src="assets/resources/js/materialize.js"></script>
<script

        document.addEventListener('DOMContentLoaded', function() {
var elems = document.querySelectorAll('.autocomplete');
var instances = M.Autocomplete.init(elems, options);
});

src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.8/js/materialize.min.js"></script>
<script src="assets/resources/js/common.js"></script>
</body>
</html>
