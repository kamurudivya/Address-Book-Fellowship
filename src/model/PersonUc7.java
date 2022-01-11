package com.bridgelabz.fellowship.models;

public class PersonUc2
{
    private String fname, lname, address, city, state, phone,zip,email;

    public PersonUc2(String fname, String lname, String address, String city, String state, String phone, String zip,String email)
    {
        this.fname = fname;//Constructor (eliminate the confusion between class attributes and parameters with the same name)
        this.lname = lname;
        this.address = address;
        this.city = city;
        this.state = state;
        this.phone = phone;
        this.zip = zip;
        this.zip = email;
    }

    public String getFname()//getter setter method (The getter method returns the value of the attribute. The setter method takes a parameter and assigns it to the attribute)
    {
        return fname;
    }

    public void setFname(String fname)
    {
        this.fname = fname;
    }

    public String getLname()
    {
        return lname;
    }

    public void setLname(String lname)
    {
        this.lname = lname;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getState()
    {
        return state;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getZip()
    {
        return zip;
    }

    public void setZip(String zip)
    {
        this.zip = zip;
    }

    public String getemail()
    {
        return email;
    }

   public static Comparator<Person> firstNameSorting = new Comparator<Person>() {
        @Override
        public int compare(Person p1, Person p2)
        {
            String fname1 = p1.getFname();
            String fname2 = p2.getFname();
            // ascending order
            return fname1.compareTo(fname2);
        }
    };
        @Override//In any object-oriented programming language, Overriding is a feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes
    public String toString() {
        return "Person{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", phone='" + phone + '\'' +
                ", zip='" + zip + '\'' +
                ",email='" + email + '\''+
                '}';
    }
}
