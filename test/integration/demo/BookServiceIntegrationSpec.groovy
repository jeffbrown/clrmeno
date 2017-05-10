package demo

import grails.test.spock.IntegrationSpec

class BookServiceIntegrationSpec extends IntegrationSpec {

    BookService bookService

    void 'test magic number'() {
        expect:
        bookService.magicNumber == 2112
    }
}
