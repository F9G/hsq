package com.f9g.sonar.packaged;

import com.f9g.sonar.packagea.ClassA;

public class ClassD 
{
  private ClassA classA = new ClassA();
  public void doSomethingBasedOneClassA(){
    System.out.println (classA.toString());
  }

  public String toString(){
    return "classD";
  }
}
