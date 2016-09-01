package com.github.jasoma.npetest

import org.junit.Test

class Tests {

    @Test
    def void testDynamicAccess() {
        assert new TargetClass().dynamicAccess("foo") == "bar"
    }

    @Test
    def void testDyamicInvoke() {
        assert new TargetClass().dynamicInvoke("bar") == "baz"
    }

}
