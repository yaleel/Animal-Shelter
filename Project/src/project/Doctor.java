package project;

public class Doctor {

    String name;
    String specialty;

    public Doctor(String n, String s) {
        name = n;
        specialty = s;
    }

    public Doctor() {
        name = null;
        specialty = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String toString() {
        return "\nDoctor's name: " + name + "\nDoctor's secialty: " + specialty;
    }

}
