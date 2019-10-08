package com.example.ranjeetkumarrana.studenterpmodel;

public class NewsItem
{
    String Name,BloodGroup,Gender,Age,PhoneNumber;
    int userImage;
    public NewsItem()
    {

    }

    //todo:- Constructor


    public NewsItem(String name, String bloodGroup, String gender, int userImage, String age, String phoneNumber)
    {
        Name = name;
        BloodGroup = bloodGroup;
        Gender = gender;
        this.userImage = userImage;
        Age = age;
        PhoneNumber = phoneNumber;
    }

    //todo:- Getter
    public String getName()
    {
        return Name;
    }

    public String getBloodGroup()
    {
        return BloodGroup;
    }

    public String getGender() {
        return Gender;
    }

    public int getUserImage() {
        return userImage;
    }

    public String getAge() {
        return Age;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    //todo;- Setter

    public void setName(String name) {
        Name = name;
    }

    public void setBloodGroup(String bloodGroup) {
        BloodGroup = bloodGroup;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public void setUserImage(int userImage) {
        this.userImage = userImage;
    }

    public void setAge(String age) {
        Age = age;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}
