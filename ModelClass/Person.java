package ModelClass;

public class Person {

    private String name;
    private int age;
    private String gender;

    /**
     * this is our person class costractor
     * 
     * @param name
     * @param age
     * @param gender
     */
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    /**
     * this is getter method of our name member veriabole
     * 
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * this is setter method of our name member veriable
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * this is getter method of age veriable
     * 
     * @return
     */
    public int getAge() {
        return age;
    }

    /**
     * this is setter method of age veriable
     * 
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * this is getter method of gender veriable
     * 
     * @return
     */
    public String getGender() {
        return gender;
    }

    /**
     * this is setter method of gender veriable
     * 
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

}
