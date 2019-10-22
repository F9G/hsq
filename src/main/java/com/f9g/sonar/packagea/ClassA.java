package com.f9g.sonar.packagea;

import com.f9g.sonar.packagec.ClassC;

public class ClassA 
{
  private ClassC classB = new ClassC();
  public void doSomething(){
    System.out.println ( "doSomething");
  }
  public void doSomethingBasedOnClassB(){
    System.out.println (classB.toString());
  }
}
