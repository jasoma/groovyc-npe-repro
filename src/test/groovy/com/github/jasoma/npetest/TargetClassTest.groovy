package com.github.jasoma.npetest

/**
 * Created by jason on 9/1/16.
 */
class TargetClassTest {

    def instance = new TargetClass()

    def void testDynamicAccess() {
        assert instance.dynamicAccess("foo") == "bar"
    }

    def void testDyamicInvoke() {
        assert instance.dynamicInvoke("bar", []) == "baz"
    }

    def void testDynamicSuperInvoke(String name, def args) {
        instance.dynamicSuperAccess("dontmatter")
    }

    def void testDynamicSuperAccess(String name) {
        instance.dynamicSuperInvoke("dontmatter")
    }
}
