import java.util.Arrays;

public class MyClass {
    private String name;
    private String surname;
    private int age;
    private String[] lessons;
    private String favoriteFood;

    public MyClass(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public MyClass(String name, String surname, int age, String[] lessons, String food) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.lessons = lessons;
        this.favoriteFood = food;

    }

    public String result(){
        return "NAME: " + name + '\n' +
                "SURNAME: " + surname + '\n' +
                "AGE: " + age + '\n' +
                Arrays.toString(lessons) + '\n' +
                "FOOD: " +favoriteFood +
                " \n -------------------------";
    }
}
