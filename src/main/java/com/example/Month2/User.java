package com.example.Month2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //So that hibernate can identity whose attribute to pick for table creation
@Table(name = "user_info")  //This is just for the giving table name ,bydefault:tablename==classname
public class User {

    @Id
    @Column(unique = true)
    private int id;

    @Column(unique = true)
    private String email;
    private String name;

    private String age;

    private String mobNo;

    @Column (name="country_name")
    private String country;

    //Always create default construntor
  public   User(){

    }

    //Good preatice is to create all args constructor

    public User(int id, String name, String age, String mobNo) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mobNo = mobNo;
    }

    public String getMobNo() {
        return mobNo;
    }

    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }
//Creating the getters and setters
    //Shortcut key is use to Alt+Insert


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
