<!doctype html>
<html>
    <head>
        <meta name="layout" content="main"/>
        <title>Welcome</title>
    </head>
    <body>
    <g:each in="${0..9}" var="i">
        <div class="score" style="background-color: ${scores[i]?:'white'};">${i+1}</div>
    </g:each>
    <div class="container">
        <div class="square" data-url="${g.createLink(action: 'index')}">&raquo;</div>
    </body>
</html>
