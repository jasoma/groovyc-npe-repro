package com.github.jasoma.npetest

class TargetClass {

    def foo = "bar"

    def bar() { "baz" }

    def dynamicInvoke(String name) {
        this."$name"()
    }

    def dynamicAccess(String name) {
        this."$name"
    }

    def dynamicSuperInvoke(String name) {
        // comment out for compilation to succeed.
//        super."$name"()
    }

    def dynamicSuperAccess(String name) {
        // comment out for compilation to succeed.
//        super."$name"
    }

}
