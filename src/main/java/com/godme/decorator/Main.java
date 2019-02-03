package com.godme.decorator;

import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Component component = new ConcreteComponent();
        component.doSomething();
        System.out.println("===================");
        component = new ConcreteDecorator1(component);
        component.doSomething();
        System.out.println("===================");
        component = new ConcreteDecorator2(component);
        component.doSomething();
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("data.txt")));
    }
}
