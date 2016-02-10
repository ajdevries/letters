<!doctype html>
<html>
    <head>
        <meta name="layout" content="main"/>
        <title>Welcome</title>
    </head>
    <body>
    <%-- <audio id="next_letter" src="/assets/audio/next_letter.mp3"></audio> --%>

    <g:each in="${0..9}" var="i">
        <div class="score" style="background-color: ${scores[i]?:'white'};">${i+1}</div>
    </g:each>
    <div class="audio">
        <audio id="letter" src="/assets/audio/${session['letter'] + 1}.mp3" controls></audio>
    </div>
    <div class="container">
    <g:each in="${letters}" var="i">
        <div class="square" data-url="${g.createLink(action: 'game', id: params.id, params: [pick: i])}">${i}</div>
    </g:each>
    </body>
</html>
