package virtualagent

import grails.rest.*

@Resource(uri='/user')
class User {

    String username
    String thing

    static constraints = {
        username blank:false
    }

    String toString() {
        username
    }
}
