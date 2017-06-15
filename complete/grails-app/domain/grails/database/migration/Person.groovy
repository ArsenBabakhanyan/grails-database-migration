package grails.database.migration

import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
class Person {
    String name
    int age

    String toString() {
        name
    }

    static constraints = {
    }
}