/*
 * @(#)EmployeeTest.java  1.00  23/08/2012
 * 
 * Copyright 2012 OTS SA All rights reserved.
 * OTS SA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.f9g.sonar.design;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Ignore;
import org.junit.Test;

import com.f9g.sonar.design.Employee;

public class AgeValidationTest {
  
  @Test
  @Ignore
  public void validateAdult() {
    int age = 18;
    Employee instance = new Employee();
    assertTrue(instance.isAdult(age));
  }
  @Test
  @Ignore
  public void validateNotAdult() {
    int age = 5;
    Employee instance = new Employee();
    assertFalse(instance.isAdult(age));
  }
}
