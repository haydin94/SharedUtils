package de.haydin.model.entities;

import java.io.File;
import java.io.Serializable;
import java.util.Date;

public class DataUser implements Serializable {

    private static final long serialVersionUID = -3118924430852880273L;
    int user_id;
    String name;
    int age;
    String gender;
    String date;
    String description;
    String place;
    int favourite;
    int numFollower;
    boolean active;
    File img;

    public DataUser() {
    }
    
    public DataUser(int user_id, String name, int age, String gender, String date, String description, String place, int favourite, int numFollower, boolean active, File img) {
        this.user_id = user_id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.date = date;
        this.description = description;
        this.place = place;
        this.favourite = favourite;
        this.numFollower = numFollower;
        this.active = active;
        this.img = img;
    }


    // Constructor witch asserts an ImageFile in given list
    public DataUser(Object[] list) {
        this(list, true);
    }

    public DataUser(Object[] list, boolean withImg) {
//        printResult(list);
        this.user_id = Integer.parseInt((String) list[0]);
        this.name = (String) list[1];
        this.age = Integer.parseInt((String) list[2]);
        this.gender = (String) list[3];
        this.date = (String) list[4];
        this.description = (String) list[5];
        this.place = (String) list[6];
        this.favourite = Integer.parseInt((String) list[7]);
        this.active = !"0".equals(((String) list[10]));
        if (withImg) {
            this.img = (File) list[11];
            this.img = new File("/home/aydins/Bilder/Hintergrund.jpg");
        }
    }

    public static void printEntity(Object[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public void setDate(Date date) {
        this.date = date == null ? "" : date.toString();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getFavourite() {
        return favourite;
    }

    public void setFavourite(int favourite) {
        this.favourite = favourite;
    }

    public int getNumFollower() {
        return numFollower;
    }

    public void setNumFollower(int numFollower) {
        this.numFollower = numFollower;
    }
    

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public File getImg() {
        return img;
    }

    public void setImg(File img) {
        this.img = img;
    }
    
    

    @Override
    public String toString() {
        String imgString = "No Img";
        if (img != null) {
            imgString = img.getName();
        }
        return "DataUser [user_id=" + user_id + ", name=" + name + ", age=" + age + ", gender=" + gender + 
                ", date=" + date + ", description=" + description + ", place=" + place + 
                ", favourite=" + favourite + ", numFollower=" + numFollower + 
                ", active=" + active + ", img=" + imgString + "]";
    }
    

}
