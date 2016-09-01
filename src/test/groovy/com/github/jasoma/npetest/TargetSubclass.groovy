package com.github.jasoma.npetest

class TargetSubclass extends TargetClass {

    @Override
    def dynamicInvoke(String name) {
//        return super."$name"()
    }

    @Override
    def dynamicAccess(String name) {
//        return super."$name"
    }
}
