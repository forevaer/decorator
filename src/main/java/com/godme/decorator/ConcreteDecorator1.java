package com.godme.decorator;

public class ConcreteDecorator1 extends Decorator {
    public ConcreteDecorator1(Component component) {
        super(component);
    }
    @Override
    public void doSomething() {
        System.out.println("ConcreteDecorator1");
        component.doSomething();
    }
}
