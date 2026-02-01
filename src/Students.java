public class Students {
    private String name;
    private int[] grades;


    public Students (String name, int[] grades){
        this.name = name;
        this.grades = grades;
    }

    public double calculateAverage (){
        if (grades == null || grades.length == 0){
            return 0;
        }
        int summ = 0;
        for (int grade : grades){
            summ += grade;
        }
        return (double) summ/ grades.length;
    }

    public void printStudentInfo (){
        System.out.println("Аты: " +name);
        System.out.println("Орточо балы: " +calculateAverage());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
