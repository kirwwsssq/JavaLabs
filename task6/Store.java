package org.example.task6;

public class Store {
    public String name;
    protected String address;
    private int employeeCount;
    int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Store(String name, String address, int employeeCount, int count) {
        this(name,address,employeeCount);
        this.count=count;


    }


    public Store(String name, String address, int employeeCount) {
        this.name = name;
        this.address = address;
        this.employeeCount = employeeCount;
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

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(int employeeCount) {
        this.employeeCount = employeeCount;
    }

    public boolean isLarge() {
        return this.employeeCount > 50;
    }
}
