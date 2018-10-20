package com.company;

public class Person {
  protected String title;
  protected String givenName;
  protected String middleName;
  protected String familyName;
  protected String FullName;
  protected String birthDate;
  protected String gender;
  protected String homeAddress;
  protected String phone;

  public Person(String title, String givenName, String middleName, String familyName, String FullName, String birthDate, String gender, String homeAddress, String phone) {
    this.title = title;
    this.givenName = givenName;
    this.middleName = middleName;
    this.familyName = familyName;
    this.FullName = FullName;
    this.birthDate = birthDate;
    this.gender = gender;
    this.homeAddress = homeAddress;
    this.phone = phone;
  }

  public Person(String FullName,String gender,String birthDate) {
    this.FullName = FullName;
    this.birthDate = birthDate;
    this.gender = gender;
  }

}




