package letters

import grails.transaction.Transactional

@Transactional
class GameService {

    def save(game) {
        game.save()
    }
}
