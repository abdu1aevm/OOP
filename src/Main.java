//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.fio = "Иманбеков Мирбек";
        person.age = 16;
        person.gender = "Male";
        person.nation = "Kyrgyz";
        person.profession = "Java developer";
        person.holostoi = true;

        System.out.println(person.fio);
        System.out.println(person.age);
        System.out.println(person.gender);
        System.out.println(person.nation);
        System.out.println(person.profession);
        System.out.println(person.holostoi);

        System.out.println(person.run());
        System.out.println(person.speak());
        System.out.println(person.getBirthDate());
    }

    }
