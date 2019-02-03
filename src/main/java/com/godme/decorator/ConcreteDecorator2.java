package com.godme.decorator;

public class ConcreteDecorator2 extends Decorator {
    public ConcreteDecorator2(Component component) {
        super(component);
    }
    @Override
    public void doSomething() {
        component.doSomething();
        System.out.println("ConcreteDecorator2");
    }
}
