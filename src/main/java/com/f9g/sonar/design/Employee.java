package com.f9g.sonar.design;

public class Employee {

  private double salary;
  private double bonus;
  private int yearsInManagement;
  private int yearsInSales;

  public double getTotalEarnings() {
    return salary + bonus;
  }

  public int getTotalYearsOfService() {
    return yearsInManagement + yearsInSales;
  }

  public boolean isAdult(int age) {
    if (age < 18) {
      System.out.println("You are still too young for that.");
      return false;
    } else {
      System.out.println("Well done. Are you ready to change the world?");
      return true;
    }
  }
}