public class Triangle {
    double a;
    double b;
    double c;

    public void area (){
        double p = (a+b+c)/2;
        double s = Math.sqrt(p * (p-a)*(p-b)*(p-c));
        System.out.println("S = " + s);

    }
}
