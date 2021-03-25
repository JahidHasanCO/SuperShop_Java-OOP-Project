import ModelClass.Person;

public class Owner extends Person {

    private double share;

    /**
     * this is param constractor of Owner Class
     * 
     * @param name
     * @param age
     * @param gender
     * @param share
     */
    public Owner(String name, int age, String gender, double share) {
        super(name, age, gender);
        this.share = share;
    }

    /**
     * this is getter method of share
     * 
     * @return
     */
    public double getShare() {
        return share;
    }

    /**
     * this is setter method of share
     * 
     * @param share
     */
    public void setShare(double share) {
        this.share = share;
    }

    /**
     * this method will print all details of Owner
     */
    public void displayOwners() {
        System.out.println("Name: " + super.getName());
        System.out.println("Age: " + super.getAge());
        System.out.println("Gender: " + super.getGender());
        System.out.println("Share in Business: " + getShare() + "%");
    }

}
