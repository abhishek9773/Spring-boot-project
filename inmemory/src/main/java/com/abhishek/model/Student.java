package com.abhishek.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {

  @Id
  @Column
  private int id;

  @Column
  private int name;

  @Column
  private int age;

  @Column
  private String Email;

  public void setId(int id) {
    this.id = id;
  }

  public void setName(int name) {
    this.name = name;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setEmail(String email) {
    Email = email;
  }

  public int getId() {
    return id;
  }

  public int getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getEmail() {
    return Email;
  }

}
