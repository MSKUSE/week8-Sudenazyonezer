public class Shape {
    private String color="white";

    public Shape(String color) {
        this.color = color;
    }
    public Shape(){

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /*public void describe(int sideA,int sideB){
        System.out.println("Side A is "+sideA+" Side b is "+sideB);
    }

    public void describe(int sideA){
        System.out.println("Side A is "+sideA);
    }

    public void describe(double sideA){
        System.out.println("Radius is "+sideA);
    }*/

    public void describe(){
        System.out.println("This is a shape and its color is "+this.color);
    }


}
