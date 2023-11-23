package com.example.rest.model;

import javax.persistence.*;

@Entity
@Table(name = "contact_details")
public class RestModel {//contact_details
    //id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    //fname
    @Column(name = "first_name")
    private  String fname;
    //lname
    @Column(name = "Last_name")
    private  String lname;
    //age
    private  Integer age;

    public RestModel() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


}
