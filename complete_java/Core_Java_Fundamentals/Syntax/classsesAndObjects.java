package Core_Java_Fundamentals.Syntax;

public class classsesAndObjects {
    String model;
    int year;
     
    public classsesAndObjects(String model, int year){
        this.model = model;
        this.year = year;
        
    }

    public void displayDetails(){
        System.out.println("Model: "+model+ "  year :"+ year);
    }
    public static void main(String[] args) {
        classsesAndObjects car = new classsesAndObjects("Porsche", 2025);
        car.displayDetails();
    }
}
