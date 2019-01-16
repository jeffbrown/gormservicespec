package gormservicespec.tests

import gormservicespec.domain.WidgetService
import io.micronaut.test.annotation.MicronautTest
import spock.lang.Specification

import javax.inject.Inject


// The following will NOT work
//@MicronautTest

// The following WILL work
@MicronautTest(packages='gormservicespec.domain')
class WidgetServiceSpec extends Specification {

    @Inject
    WidgetService widgetService

    void 'verify something'() {
        expect:
        widgetService != null
    }
}
