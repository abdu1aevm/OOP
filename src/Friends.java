public class Friends {
    private String name;
    private int age;
    private int height;
    private String profession;
    private String hobby;


    public Friends(){
    }


    public Friends(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Friends(String name, int age, int height, String profession) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.profession = profession;
    }

    public Friends(String name, int age, int height, String profession, String hobby){
        this.name = name;
        this.age = age;
        this.height = height;
        this.profession = profession;
        this.hobby = hobby;
    }

    public void result(){
        System.out.println("NAME: " +name);
        System.out.println("AGE: " +age);
        System.out.println("HEIGHT: " +height);
        System.out.println("PROFESSION: " +profession);
        System.out.println("HOBBY: " +hobby);

        System.out.println("~~~~~~~~~~~~~~~~~~");
    }
}
