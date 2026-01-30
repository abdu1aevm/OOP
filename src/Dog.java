public class Dog {
    private String name;
    private String color;
    private String breed;

    public Dog(String name, String color, String breed){
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    public Dog(){
    }

    public String aboutDog (){
        return name +
                color +
                breed;
    }
}
