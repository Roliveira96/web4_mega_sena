<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%--<%@page contentType="text/html" pageEncoding="UTF-8" %>--%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>


<t:template title="Jogo">

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
        <h1 class="">Olá ${name} </h1>
        <div class="row">
            <div class="col s12 m8">
                <div class="card white darken-1">
                    <div class="card-content ">
                        <div class="row">
                            <div id="mega">
                            </div>
                        </div>

                        <form action="aposta" method="POST">

                            <div class="row">
                                <div class="input-field col s12">
                                    <input name="number" id="number" type="text" class="validate" value="1">
                                    <label for="number">Número</label>

                                </div>
                            </div>

                            <div class="row hide">
                                <div class="input-field col s12">
                                    <input  name="bet" id="bet" type="text" class="validate" value="">
                                    <label for="bet">Ocultar depois</label>
                                </div>
                            </div>
                            <div class="row hide">
                                <div class="input-field col s12">
                                    <input  name="valorInp" id="valorInp" type="text" class="validate" value="">
                                    <label for="valorInp">Ocultar depois</label>
                                </div>
                            </div>
                            <div class="row ">
                                <div class="input-field col s12">
                                    <input  name="probabilityInp" id="probabilityInp" type="text" class="validate" value="">
                                    <label for="probabilityInp">Ocultar depois</label>
                                </div>
                            </div>

                            <div class="row ">
                                <p class="input-field col s12">Valor: <b id="valor"></b>
                                </p> <p class="input-field col s12">Probabilidade de acerto (1 em): <b id="probability"></b></p>

                            </div>

                            <div class="row center">
                                <a id="addBT" class="waves-effect green btn " onclick="addNumberBet()">Adicionar número</a>
                            </div>

                            <div class="row center">
                                <button id="subimitBT"  disabled class="btn waves-effect green waves-light" type="submit"
                                        name="action">Submit
                                    betr
                                </button>
                            </div>

                            <div class="row center">
                                <a onclick="clearBet()" class="waves-effect red btn">Limpar</a>
                            </div>

                        </form>


                    </div>
                </div>
            </div>
        </div>

        <script>
            var bet = [];
            var quant = 0;


            function addNumberBet(compareFn) {
                let number = document.getElementById('number').value
                let html = "";
                if (number > 0 && number < 61) {
                    if (bet.indexOf(number) < 0) {
                        bet.push(number)
                        bet.sort()
                    }
                    if (bet.length > 0) {

                        for (let i = 0; i < bet.length; i++) {
                            html += '<div class="ball"><span>' + bet[i] + '</span></div>';
                        }
                        if (bet.length > 5) {
                            let valueBet = betAmoun(bet.length)
                            let probability = probabilityBet(bet.length)
                            document.getElementById('subimitBT').disabled = false;
                            document.getElementById('valor').innerHTML = valueBet
                            document.getElementById('probability').innerHTML = probability
                            document.getElementById('valorInp').value = valueBet
                            document.getElementById('probabilityInp').value = probability
                            quant++
                            if (bet.length === 15) {

                                let e = document.getElementById('addBT')
                                e.classList.add("hide")
                                document.getElementById('addBT').disabled = true;

                            }
                        }
                    }
                    document.getElementById('mega').innerHTML = html
                }
                document.getElementById('number').value = Math.floor(60 * Math.random() + 1)
                document.getElementById('bet').value = bet
            }


            function betAmoun(lengthVetor) {
                if (lengthVetor > 5) {
                    let valueBet = ['4.50', '31.50', '126.00', '378.00', '945.00', '2079.00', '4158.00', '7722.00', '13513.50', '22522.50']
                    return valueBet[lengthVetor - 6]
                } else
                    return 0
            }
            function probabilityBet(lengthVetor) {
                console.log(lengthVetor)
                if (lengthVetor > 5) {
                    let probability = ['50.063.860','7.151.980','1.787.995','595.998','238.399','108.363','54.182','29.175','16.671','10.003']
                    return probability[lengthVetor - 6]
                } else
                    return 0
            }

            function clearBet(){
                console.log("aqi")
                bet = []
                document.getElementById('mega').innerHTML = ""
                document.getElementById('valor').innerHTML = "0"
                document.getElementById('probability').innerHTML = ""
                document.getElementById('bet').value = ""
            }

        </script>

    </jsp:body>
</t:template>

