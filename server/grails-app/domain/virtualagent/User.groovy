package virtualagent

import grails.rest.*

@Resource(uri='/user')
class User {

    String username

    static constraints = {
        username blank:false
    }

    String toString() {
        username
    }
}
