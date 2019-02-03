package com.godme.decorator;

public class ConcreteComponent implements Component {
    @Override
    public void doSomething() {
        System.out.println("todo");
    }
}
