package virtualagent

import grails.test.mongodb.MongoSpec
import grails.testing.gorm.DomainUnitTest

class UserSpec extends MongoSpec implements DomainUnitTest<User> {

    void 'a virtualagent.User with blank username is not saved'() {
        given:
        domain.username = ''

        expect:
        !domain.validate(['username'])
    }

    void 'A valid domain is saved'() {
        given:
        domain.username = 'Jimmy'

        when:
        domain.save()

        then:
        User.count() == old(User.count()) + 1
    }
}
