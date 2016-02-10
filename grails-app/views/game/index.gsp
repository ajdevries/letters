<!doctype html>
<html>
    <head>
        <meta name="layout" content="main"/>
        <title>Welcome</title>
    </head>
    <body>
    <div class="container">
    <g:each in="${1..16}" var="i">
        <div class="square" data-url="${g.createLink(action: 'game', id: i)}">${i}</div>
    </g:each>
    </body>
</html>
