//package virtualagent
//
//import grails.gorm.transactions.Rollback
//import grails.testing.mixin.integration.Integration
//import org.h2.engine.SessionFactory
//import spock.lang.Specification
//
//@Integration
//@Rollback
//class UserServiceSpec extends Specification {
//
//    UserService userService
//    SessionFactory sessionFactory
//
//    private Long setupData() {
//        // TODO: Populate valid domain instances and return a valid ID
//
//        new User('Jimmy').save(flush: true, failOnError: true)
//        new User('Barold').save(flush: true, failOnError: true)
//        new User('Timmy').save(flush: true, failOnError: true)
//        new User('Journee').save(flush: true, failOnError: true)
//        User user = new User('Baman').save(flush: true, failOnError: true)
//
//        //new virtualagent.User(...).save(flush: true, failOnError: true)
//        //virtualagent.User user = new virtualagent.User(...).save(flush: true, failOnError: true)
//        //new virtualagent.User(...).save(flush: true, failOnError: true)
//        //new virtualagent.User(...).save(flush: true, failOnError: true)
////        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
//        user.id
//    }
//
//    void "test get"() {
//        setupData()
//
//        expect:
//        userService.get(1) != null
//    }
//
//    void "test list"() {
//        setupData()
//
//        when:
//        List<User> userList = userService.list(max: 2, offset: 2)
//
//        then:
//        userList.size() == 2
//        assert userList.get(0).username.equals("Jimmy")
//
//    }
//
//    void "test count"() {
//        setupData()
//
//        expect:
//        userService.count() == 2
//    }
//
//    void "test delete"() {
//        Long userId = setupData()
//
//        expect:
//        userService.count() == 2
//
//        when:
//        userService.delete(userId)
//        sessionFactory.currentSession.flush()
//
//        then:
//        userService.count() == 1
//    }
//
//    void "test save"() {
//        when:
//        User user = new User('Jimmy')
//        userService.save(user)
//
//        then:
//        user.id != null
//    }
//}
