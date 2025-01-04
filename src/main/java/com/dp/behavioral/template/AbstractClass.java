package com.dp.behavioral.template;

public abstract class AbstractClass {

    /**
     * skeleton
     */
    public final void templateMethod() {
        step1();
        if ( executionConditionsForStep2() ) {
            step2();
        }
        step3();
    }


    protected void step1() {
        System.out.println("default step 1");
    }

    /**
     * The basic method is defined,
     * while the specific steps are implemented by subclasses.
     */
    protected abstract void step2();


    protected abstract void step3();

    /**
     * hook function
     * @return
     */
    protected abstract boolean executionConditionsForStep2 ();
}
