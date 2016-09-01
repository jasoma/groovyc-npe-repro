package com.github.jasoma.npetest

/**
 * Created by jason on 9/1/16.
 */
class TargetClass {

    def foo = "bar"

    def bar() { "baz" }

    def dynamicInvoke(String name, def args) {
        this."$name"(args)
    }

    def dynamicAccess(String name) {
        this."$name"
    }

    def dynamicSuperInvoke(String name, def args) {
        // comment out for compilation to succeed.
        super."$name"(args)
    }

    def dynamicSuperAccess(String name) {
        // comment out for compilation to succeed.
        super."$name"
    }

}
