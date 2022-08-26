/**
 *
 * @author coleb
 */
public class Pet {
    
    private String name;
    private int age;
    private String location;
    private String type;
    
    Pet() {
        this.name = null;
        this.age=0;
        this.type=null;
        this.location=null;
    }
    
    Pet (String name, int age, String Location, String type) {
        this.name = name;
        this.age = age;
        this.type=type;
        this.location=Location;
    }
    
    public String getName(){
        return this.name;
    } 
    
    public int getAge() {
        return this.age;
    }
    
    public String getLocation() {
        return this.location;
    }
    
    public String getType() {
        return this.type;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    
}
