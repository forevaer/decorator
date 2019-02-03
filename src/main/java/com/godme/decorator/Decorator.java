package com.godme.decorator;

 public abstract class Decorator implements Component {
     Component component = null;
     public Decorator(Component component){
         this.component = component;
     }
 }
