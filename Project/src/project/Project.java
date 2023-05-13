package project;

import java.util.*;

public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner userinput = new Scanner(System.in);

        //////objects creation
        LinkedList<Dog> dogs = new LinkedList<Dog>();
        LinkedList<Cat> cats = new LinkedList<Cat>();
        LinkedList<Bird> birds = new LinkedList<Bird>();
        LinkedList<Doctor> doctors = new LinkedList<Doctor>();
        LinkedList<Date> appointments = new LinkedList<Date>();
        LinkedList<Stray> stray = new LinkedList<Stray>();
        LinkedList<Stray> Adopted = new LinkedList<Stray>();

        dogs.add(new Dog("APOLLO", "Bernese Mountain", new Date(8, 6, 2018), "Elizabeth Holloway", "Male"));
        dogs.add(new Dog("MAX", "Chinook", new Date(5, 8, 2015), "Elba May", "Male"));
        dogs.add(new Dog("KOBE", "Hovawart", new Date(21, 9, 2016), "Ned Knight", "Female"));
        dogs.add(new Dog("COCO", "Pitbull Terrier", new Date(10, 2, 2015), "Malcolm Avery", "Female"));
        dogs.add(new Dog("OTIS", "Samoyed", new Date(18, 7, 2020), "Cody Buck", "Male"));

        cats.add(new Cat("EREN", "Shirazi", new Date(23, 11, 2020), "Bayan", "Female"));
        cats.add(new Cat("HENRY", "Abyssinian", new Date(20, 12, 2019), "Raphael Rush", "Male"));
        cats.add(new Cat("MURPHY", "Chartreux", new Date(30, 5, 2015), "Shanna Green", "Female"));
        cats.add(new Cat("SIMBA", "Devon Rex", new Date(14, 10, 2018), "Rodrigo Taylor", "Male"));

        birds.add(new Bird("EAGLE", "Hyacinth Macaw", new Date(14, 6, 2017), "Lynette Dominguez", "Male"));
        birds.add(new Bird("ANGEL", "Budgerigar", new Date(23, 01, 2017), "Yong Shannon", "Female"));
        birds.add(new Bird("KIWI", "Cockatoo", new Date(19, 6, 2021), "Annmarie Marshall", "Male"));

        appointments.add(new Date(10, 1, 2023));
        appointments.add(new Date(11, 1, 2023));
        appointments.add(new Date(12, 1, 2023));
        appointments.add(new Date(13, 1, 2023));
        appointments.add(new Date(14, 1, 2023));

        doctors.add(new Doctor("Kirsten Jennings", "Dentistry"));
        doctors.add(new Doctor("Federico Fisher", "Surgery"));
        doctors.add(new Doctor("Debra Huang", "Emergency Care"));
        doctors.add(new Doctor("Gerard King", "Radiology"));

        stray.add(new Stray("CHARLIE", "Belgian Tervuren", 11, "Male"));
        stray.add(new Stray("SUNNY", "Hahn's Macaw", 4, "Male"));
        Adopted.add(new Stray("DAISY", "Himalayan", 9, "Female", "George Adkins"));

        //a loop to print the tasks menu
        for (int i = 0; i > -1; i++) {//3 for loop 
          System.out.println("\n▴ What do you want to do?\n\n1 - Print information\n2 - Register new information\n3 - Adopt a stray animal\n4 - Register an appointment\n5 - Calculate the amount of food\n6 - Print animal diet\n7 - Exit the program\n");
             int input = userinput.nextInt();
            if (input == 7)   
               break;
            try {  //try 1
                switch (input) { //1st sw
                    case 1: // 1st sw case 1
                        System.out.println("\n• What information do you want to print?\n\n1 - Dogs information\n2 - Cats information\n3 - Birds information\n4 - Doctors information\n5 - Adopted animals\n6 - Stray animals\n");

                        try {//try 2
                            switch (userinput.nextInt()) { //2nd sw
                                case 1:
                                    for (Dog dog : dogs) {
                                        System.out.println(dog + "\n");
                                    }
                                    break;

                                case 2:
                                    for (Cat cat : cats) {
                                        System.out.println(cat + "\n");
                                    }
                                    break;

                                case 3:
                                    for (Bird bird : birds) {
                                        System.out.println(bird + "\n");
                                    }
                                    break;

                                case 4:
                                    for (Doctor doctor : doctors) {
                                        System.out.println(doctor + "\n");
                                    }
                                    break;

                                case 5:
                                    for (Stray strays : Adopted) {
                                        System.out.println(strays + "\n");
                                    }
                                    break;

                                case 6:
                                    for (Stray strays : stray) {
                                        System.out.println(strays + "\n");
                                    }
                                    break;

                                default:
                                    System.out.println("\n✗ The number you entered is not on the list, plaese try again\n");
                                    break;
                            }//2nd sw
                            break;
                        }//try 2
                        catch (InputMismatchException e) {
                            System.out.println("\n✗ Invalid character, please try again\n");
                            userinput.next();
                            break;
                        }

                    case 2: //1st sw second case

                        System.out.println("\n• What information do you want to register?\n\n1 - New dog\n2 - New cat\n3 - New bird\n4 - New doctor\n5 - New appointment date\n6 - New stray");
                        try {//try 999
                            switch (userinput.nextInt()) {//a switch2
                                case 1:
                                    userinput.nextLine();
                                    System.out.println("Enter dog's name: ");
                                    String dn = userinput.nextLine();

                                    System.out.println("Enter dog's type: ");
                                    String dt = userinput.nextLine();

                                    System.out.print("Enter dog's birth date: ");
                                    Date d = new Date(userinput.nextInt(), userinput.nextInt(), userinput.nextInt());

                                    userinput.nextLine();

                                    System.out.println("Enter owner's name: ");
                                    String dd = userinput.nextLine();

                                    System.out.println("Enter dog's sex: ");
                                    String ds = userinput.nextLine();

                                    dogs.add(new Dog(dn, dt, d, dd, ds));
                                    System.out.println("\nInformation were added ✓\n");

                                    break;

                                case 2:
                                    userinput.nextLine();
                                    System.out.println("Enter cat's name: ");
                                    String cn = userinput.nextLine();

                                    System.out.println("Enter cat's type: ");
                                    String ct = userinput.nextLine();

                                    System.out.print("Enter cat's birth date: ");
                                    Date d2 = new Date(userinput.nextInt(), userinput.nextInt(), userinput.nextInt());

                                    userinput.nextLine();

                                    System.out.println("Enter owner's name: ");
                                    String cc = userinput.nextLine();

                                    System.out.println("Enter cat's sex: ");
                                    String cs = userinput.nextLine();

                                    cats.add(new Cat(cn, ct, d2, cc, cs));
                                    System.out.println("\nInformation were added ✓\n");

                                    break;

                                case 3:
                                    userinput.nextLine();
                                    System.out.println("Enter bird's name: ");
                                    String bn = userinput.nextLine();

                                    System.out.println("Enter bird's type: ");
                                    String bt = userinput.nextLine();

                                    System.out.print("Enter bird's birth date: ");
                                    Date d3 = new Date(userinput.nextInt(), userinput.nextInt(), userinput.nextInt());

                                    userinput.nextLine();

                                    System.out.println("Enter owner's name: ");
                                    String bb = userinput.nextLine();

                                    System.out.println("Enter bird's sex: ");
                                    String bs = userinput.nextLine();

                                    birds.add(new Bird(bn, bt, d3, bb, bs));
                                    System.out.println("\nInformation were added ✓\n");

                                    break;

                                case 4:
                                    userinput.nextLine();
                                    System.out.println("Enter doctor's name: ");
                                    String docn = userinput.nextLine();

                                    System.out.println("Enter doctor's specialty: ");
                                    String docs = userinput.nextLine();

                                    doctors.add(new Doctor(docn, docs));
                                    System.out.println("\nInformation were added ✓\n");

                                    break;

                                case 5:
                                    userinput.nextLine();
                                    System.out.print("Enter appointment date: ");
                                    appointments.add(new Date(userinput.nextInt(), userinput.nextInt(), userinput.nextInt()));

                                    System.out.println("\nInformation were added ✓\n");

                                    break;

                                case 6:
                                    userinput.nextLine();
                                    System.out.println("Enter stray's name: ");
                                    String sn = userinput.nextLine();

                                    System.out.println("Enter stray's type: ");
                                    String st = userinput.nextLine();

                                    System.out.println("Enter stray's age: ");
                                    int sa = userinput.nextInt();
                                    userinput.nextLine();

                                    System.out.println("Enter stray's sex: ");
                                    String ss = userinput.nextLine();

                                    stray.add(new Stray(sn, st, sa, ss));
                                    System.out.println("\nInformation were added ✓\n");

                                    break;

                                default:
                                    System.out.println("\n✗ The number you entered is not on the list, plaese try again\n");
                                    break;
                            } // a switch2 
                            break;
                        }//try 999
                        catch (InputMismatchException e) {
                            System.out.println("\n✗ Invalid character, please try again\n");
                            userinput.next();
                            break;
                        }

                    case 3:

                        System.out.println("\n• Choose an animal to adopt\n");
                        int hg = 1;
                        //print customers names
                        for (int j = 0; j < stray.size(); j++, hg++) {
                            System.out.println(hg + " - " + stray.get(j).getName());
                        }
                        int tr = userinput.nextInt() - 1;
                        if (tr <= stray.size()) {
                            userinput.nextLine();
                            System.out.println("Enter new owner's name: ");

                            Adopted.add(new Stray(stray.get(tr).name, stray.get(tr).type, stray.get(tr).age, stray.get(tr).sex, userinput.nextLine()));
                            stray.remove(tr);
                            System.out.println("\nChanges were saved ✓\n");
                            break;
                        } else {
                            System.out.println("\n✗ The number you entered is not on the list, plaese try again\n");

                        }
                        break;

                    case 4:
                        System.out.println("\n• Choose a date\n");
                        int ub = 1;
                        for (Date appointment : appointments) {
                            System.out.println(ub + " - " + appointment + "\n");
                            ub++;
                        }

                        int ty = userinput.nextInt() - 1;
                        if (ty < appointments.size()) {
                            userinput.nextLine();
                            System.out.println("Enter pet's name: ");
                            userinput.nextLine();

                            appointments.remove(ty);
                            System.out.println("\nAappointment was registered✓\n");
                            break;
                        } else {
                            System.out.println("\n✗ The number you entered is not on the list, plaese try again\n");

                        }
                        break;

                      case 5: // 1st sw fifth case
                        System.out.println("\n• Choose the animal you want to Calculate the amount of his food\n1 - Cat\n2 - Dog\n3 - Bird\n");
                        int animal_type = userinput.nextInt();
                        System.out.println("\nHow much does the animal weigh? by Kg\n");
                        double animal_weigh = userinput.nextDouble();
                        
                        if (animal_type == 1 && animal_weigh >= 3)
                            System.out.println("\n350g of food\n");   
                        else if (animal_type == 1 && animal_weigh<3 && animal_weigh>2)
                             System.out.println("\n200g of food\n");  
                        else if (animal_type == 1 && animal_weigh <= 1)
                             System.out.println("\n100g of food\n");
                          
                        if (animal_type == 2 && animal_weigh >= 7)
                            System.out.println("\n500g of food\n");   
                        else if (animal_type == 2 && animal_weigh<7 && animal_weigh>4)
                             System.out.println("\n350g of food\n");  
                        else if (animal_type == 2 && animal_weigh <= 4)
                             System.out.println("\n200g of food\n"); 
                                 
                        if (animal_type == 3 && animal_weigh >= 1)
                            System.out.println("\n70g of food\n");   
                        else if (animal_type == 3 && animal_weigh<1 && animal_weigh>0.5)
                             System.out.println("\n50g of food\n");  
                        else if (animal_type == 3 && animal_weigh <= 0.5)
                             System.out.println("\n30g of food\n");  
                        break; 
                          
                          
                      case 6:
                    System.out.println("-------------  Dog Food  -------------");
                    for (int a = 0; a < Dog.foodList.length; a++) {
                        System.out.println(Dog.foodList[a]);
                    }
                    
                    
                    System.out.println("-------------  Cat Food  -------------");
                    for (int a = 0; a < Cat.foodList.length; a++) {
                        System.out.println(Cat.foodList[a]);
                    }
                    
                    
                    System.out.println("-------------  Bridg Food  -------------");
                    for (int a = 0; a < Bird.foodList.length; a++) {
                        System.out.println(Bird.foodList[a]);
                    }
                          break;
                    default:
                        System.out.println("\n✗ The number you entered is not on the list, plaese try again\n");
                        break; 
                }                               
            }//try 1
            catch (InputMismatchException e) { //catch 1
                System.out.println("\n✗ Invalid character, please try again\n");
                userinput.next();

            }//catch 1

        }//3 for loop
    }
}
