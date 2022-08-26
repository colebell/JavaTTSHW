/**
 *
 * @author coleb
 */
public class Car {
    
    private String make;
    private String model;
    private int year;
    
    Car () {
        this.make = null;
        this.model = null;
        this.year = -1;
    }
    
    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    Car(String make, String model) {
        this.make = make;
        this.model = model;
        this.year = -1;
    }
    
    public String getMake() {
        return this.make;
    }
    
    public String getModel() {
        return this.model;
    }
    
    public int getYear() {
        return this.year;
    }
    
    public void setMake(String make) {
        this.make = make;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    } 
    
    public boolean isYearSet() {
        if(this.year < 0) {
            return false;
        }
        else {
            return true;
        }
    }
    
     public String fullCarTitle() {
        return this.make + " " + this.model;
    }
    
}
