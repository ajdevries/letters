package letters

class GameController {

    def gameService
    def alfabet = 'abcdefghijklmnopqrstuvwxyz'

    def index() {}

    def game(Integer id) {
        if (params.pick) {
            if (alfabet.indexOf(params.pick) == session['letter']) {
                session['scores'] << 'green'
            } else {
                session['scores'] << 'red'
            }
            if (session['scores'].size() == 10) {
                def game = new Game(level:id, good: session['scores'].findAll({it == 'green'} ).size())
                gameService.save(game)
                redirect action: 'end'
            }
        } else {
            session['scores'] = []
        }

        def letters = []
        Random r = new Random()
        def pick = alfabet.collect()
        (1..id).each {
            letters << pick.remove(r.nextInt(pick.size() ))
        }
        def nextInt = r.nextInt(id)
        def letter = alfabet.indexOf(letters[nextInt])
        session['letter'] = letter
        [letters: letters, scores: session['scores']]
    }

    def end() {
        [scores: session['scores']]
    }

}
