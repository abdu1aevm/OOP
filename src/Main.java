import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] grades = {5,4,5,4,4,4,4,3,5,5,4,4};
        Students students = new Students("Adyl",grades);
        students.printStudentInfo();

        int[] grades2 = {5,5,5,5,5,4,5,5,5,5,5,};
        Students students2 = new Students("Jasmina",grades2);
        students2.printStudentInfo();
    }
}






//        MyClass myclass = new MyClass("Mirbek","Imanbekov",16);
//        System.out.println(myclass.result());
//
//
//
//        String[] lessons = {"Java","English"};
//        MyClass myClass1 = new MyClass("Mirbek", "Imanbekov", 16, lessons, "Plov");
//        System.out.println(myClass1.result());
//    }
//}



//        Scanner scanner = new Scanner(System.in);
//        Friends friends = new Friends();
//        System.out.println("----------1 `FRIEND----------");
//        System.out.print("Аты: ");
//        String friendName = scanner.next();
//        System.out.print("Жашы: ");
//        int friendAge = scanner.nextInt();
//        System.out.print("Бою: ");
//        int friendHeight = scanner.nextInt();
//        System.out.print("Профессиясы: ");
//        String friendProfession = scanner.next();
//        System.out.print("Хоббиси: ");
//        String friendHobby = scanner.next();
//        friends.result();
//
//
//        System.out.println("----------2 `FRIEND----------");
//        System.out.print("Аты: ");
//        String friendName1 = scanner.next();
//        System.out.print("Жашы: ");
//        int friendAge1 = scanner.nextInt();
//        System.out.print("Бою: ");
//        int friendHeight1 = scanner.nextInt();
//        Friends friends1 = new Friends(friendName1,friendAge1,friendHeight1);
//        friends1.result();
//
//
//        System.out.println("----------3 `FRIEND----------");
//        System.out.print("Аты: ");
//        String friendName2 = scanner.next();
//        System.out.print("Жашы: ");
//        int friendAge2 = scanner.nextInt();
//        System.out.print("Бою: ");
//        int friendHeight2 = scanner.nextInt();
//        System.out.print("Профессиясы: ");
//        String friendProfession2 = scanner.next();
//        Friends friends2 = new Friends(friendName2,friendAge2,friendHeight2,friendProfession2);
//        friends2.result();
//
//
//        System.out.println("----------4 `FRIEND----------");
//        System.out.print("Аты: ");
//        String friendName3 = scanner.next();
//        System.out.print("Жашы: ");
//        int friendAge3 = scanner.nextInt();
//        System.out.print("Бою: ");
//        int friendHeight3 = scanner.nextInt();
//        System.out.print("Профессиясы: ");
//        String friendProfession3 = scanner.next();
//        System.out.print("Хоббиси: ");
//        String friendHobby3 = scanner.next();
//        Friends friends3 = new Friends(friendName3,friendAge3,friendHeight3,friendProfession3,friendHobby3);
//        friends3.result();
//
//    }
//}






//        Dog dog = new Dog(" Leo "," Black and brown "," German Shepherd");
//        System.out.println(dog.aboutDog());
//
//        Cat cat = new Cat("Max "," White "," Persian");
//        System.out.println(cat.aboutCat());
//    }
//}






//        BankAccount account = new BankAccount("Imanbekov Mirbek",1000);
//
//        System.out.println(account.depoSit(500));
//        System.out.println(account.withDraw(300));
//        System.out.println(account.printBalance());
//    }
//}
//











//        User user = new User("Mirbek",16,"imanbekov58@gmail.com");
//        System.out.println(user.printInfo());
//    }
//}








//        Triangle triangle = new Triangle();
//        triangle.a = 15;
//        triangle.b = 16;
//        triangle.c = 25;
//        triangle.area();
//    }
//}







//        Programmer programmer = new Programmer();
//        Scanner sc = new Scanner(System.in);
//        System.out.print("NAME: ");
//        programmer.name = sc.nextLine();
//        System.out.print("SURNAME: ");
//        programmer.surname = sc.nextLine();
//        System.out.print("AGE: ");
//        programmer.age = sc.nextInt();
//
//        System.out.println(programmer.name);
//        System.out.println(programmer.surname);
//        System.out.println(programmer.age);
//        System.out.print("Жылы: ");
//        System.out.println(programmer.getBirthDate());
//
//
//
//        Programmer programmer1 = new Programmer();
//        System.out.print("NAME: ");
//        programmer1.name = sc.next();
//        System.out.print("SURNAME: ");
//        programmer1.surname = sc.next();
//        System.out.print("AGE: ");
//        programmer1.age = sc.nextInt();
//
//        System.out.println(programmer1.name);
//        System.out.println(programmer1.surname);
//        System.out.println(programmer1.age);
//        System.out.print("Жылы: ");
//        System.out.println(programmer1.getBirthDate());
//    }
//}
//






//        Car car = new Car();
//        car.model = "Sedan";
//        car.color = "Black";
//        car.style = "Sporty";
//        car.dislacement = 2.5;
//
//        System.out.println(car.model);
//        System.out.println(car.color);
//        System.out.println(car.style);
//        System.out.println(car.dislacement);
//
//
//
//        Car car1 = new Car();
//        car1.model = "Crossover";
//        car1.color = "Silver";
//        car1.style = "Urban";
//        car1.dislacement = 2.2;
//
//        System.out.println(car1.model);
//        System.out.println(car1.color);
//        System.out.println(car1.style);
//        System.out.println(car1.dislacement);
//
//
//
//        Car car2 = new Car();
//        car2.model = "Hatchback";
//        car2.color = "Blue Metallic";
//        car2.style = "Sport / City";
//        car2.dislacement = 1.6;
//
//        System.out.println(car2.model);
//        System.out.println(car2.color);
//        System.out.println(car2.style);
//        System.out.println(car2.dislacement);
//    }
//}
//
//





//        Person person = new Person();
//        person.fio = "Иманбеков Мирбек";
//        person.age = 16;
//        person.gender = "Male";
//        person.nation = "Kyrgyz";
//        person.profession = "Java developer";
//        person.holostoi = true;
//
//        System.out.println(person.fio);
//        System.out.println(person.age);
//        System.out.println(person.gender);
//        System.out.println(person.nation);
//        System.out.println(person.profession);
//        System.out.println(person.holostoi);
//
//        System.out.println(person.run());
//        System.out.println(person.speak());
//        System.out.println(person.getBirthDate());
//    }
//
//    }
