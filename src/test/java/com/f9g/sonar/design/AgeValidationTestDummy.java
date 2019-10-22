/*
 * @(#)EmployeeTest.java  1.00  23/08/2012
 * 
 * Copyright 2012 OTS SA All rights reserved.
 * OTS SA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
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
