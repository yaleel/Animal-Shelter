package project;

public class Stray {

    String name;
    String type;
    int age;
    String sex;
    String owner;

    public Stray(String name, String type, int age, String sex) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.sex = sex;
        this.owner = null;
    }

    public Stray(String name, String type, int age, String sex, String owner) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.sex = sex;
        this.owner = owner;
    }

    public Stray() {
        this.name = null;
        this.type = null;
        this.age = 0;
        this.sex = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String toString() {

        if (owner == null) {
            return "Stray name: " + name + "\nType: " + type + "\nAge: " + age + "\nSex: " + sex;
        } else {
            return "Stray name: " + name + "\nType: " + type + "\nAge: " + age + "\nSex: " + sex + "\nOwner's name: " + owner;
        }
    }

}
