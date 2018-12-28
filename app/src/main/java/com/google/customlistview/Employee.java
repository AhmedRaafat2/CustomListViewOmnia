package com.google.customlistview;

public class Employee {

    private int id;
    private String name;
    private String address;
    private double salary;
    private String job;
    private int image;

    public Employee(int id, String name, String address, double salary, String job, int image) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.job = job;
        this.image = image;
    }

    public Employee(String name, String job,int image) {
        this.name = name;
        this.job = job;
        this.image = image;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
