package virtualagent

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class DialogflowFulfillmentControllerSpec extends Specification implements ControllerUnitTest<DialogflowFulfillmentController> {

    def setup() {
    }

    def cleanup() {
    }

    void "initial test"() {

        when:
        controller.index()

        then:
        response.text == 'Wow! It worked!!!'
    }
}
