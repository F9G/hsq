/*
 * @(#)EmployeeTest.java  
 * 
 */
package com.f9g.sonar.design;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

import com.f9g.sonar.design.Employee;

public class AgeValidationTestDummy {
  
  @Test
  public void validateIsAdult() {
    int age = 18;
    Employee instance = new Employee();
    instance.isAdult(age);
    age = 5;
    instance.isAdult(age);
  }
}
