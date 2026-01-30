public class Cat {
    private String name;
    private String color;
    private String breed;

    public Cat(String name, String color, String breed){
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    public Cat(){
    }

    public String aboutCat(){
        return "NAME : " + name +
                "COLOR : " + color +
               "BREED : " + breed ;
    }
}
