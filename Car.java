public class Car {
    
    private String make; 
    private String model;
    private int year;

    // Default Constructor
    public Car(){
        make = "Unknown";
        model = "Unknown";
        year = 0;
    }

    public Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString(){
        return "Car{make = '" + make + "', model = " + model + ", year = '" + year + "'}";
    }
    
    public String getMake(){
        return make;
    }

    public void setMake(String make){
        this.make = make;
    }

    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public int getYear(){
        return year;
    }
    public void setYear(int year){
        // simple guard because years can't be a negative number
        if (year >= 0){
            this.year = year;
        }

    }
    

}
