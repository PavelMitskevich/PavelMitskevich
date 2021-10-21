import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private String sex;
    private String country;
    private String town;

    public Person(String name, int age, String sex, String country, String town) {
        this.name = name;
        this.age = Math.abs(age);
        this.sex = sex;
        this.country = country;
        this.town = town;
    }

    public String getName() {
        return name;
    }

    public String getTown() {
        return town;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", country='" + country + '\'' +
                ", town='" + town + '\'' +
                '}';
    }
}
