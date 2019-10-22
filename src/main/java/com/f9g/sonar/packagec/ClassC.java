package com.f9g.sonar.packagec;

import com.f9g.sonar.packaged.ClassD;

public class ClassC 
{
  private ClassD classD = new ClassD();
  public void doSomethingBasedOneClassD(){
    System.out.println (classD.toString());
  }

  public String toString(){
    return "classC";
  }
}
