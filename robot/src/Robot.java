import java.util.Scanner;
public class Robot {

     String name;
    String color;
    int weight;
    

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void modifyAll() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter Robot\'s name: ");
        name = scan.nextLine();
        System.out.println("What color is " + name + "?");
        color = scan.nextLine();
        System.out.println("How much does " + name + " weight? ");
        weight = scan.nextInt();
    }

    public void displayAll() {
        System.out.println("Robot's name is " + getName());
        System.out.println(" Robot's color is " + getColor());
        System.out.println("Robot's  weight is " + getWeight());
    }
    public static void main(String[] args) {

        Robot r3 = new Robot();
        r3.modifyAll();
        r3.displayAll();
    }
}