package project;

public class Bird {

    String name;
    String type;
    Date date;
    int age;
    String owner;
    String sex;

    public Bird(String name, String type, Date date, String owner, String sex) {
        this.name = name;
        this.type = type;
        this.date = date;
        this.age = 2022 - date.getYear();
        this.owner = owner;
        this.sex = sex;
    }

    public Bird() {
        this.name = null;
        this.date = null;
        this.age = 0;
        this.owner = null;
        this.sex = null;
        type = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    static String[] foodList = {"1. Meat", "2. Asparagus ", "3. Beans (cooked only)", "4. Celery ", "5. Peas"};
    
    public String toString() {
        return "Pet name: " + name + "\nDate of birth: " + date + "\nAge: " + age + "\nSex: " + sex + "\nOwner's name: " + owner;
    }

}
