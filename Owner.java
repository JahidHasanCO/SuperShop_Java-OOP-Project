public class Owner extends Person {

    private double share;

    public Owner(String name, int age, String gender, double share) {
        super(name, age, gender);
        this.share = share;
    }

    public double getShare() {
        return share;
    }

    public void setShare(double share) {
        this.share = share;
    }

    public void displayOwners() {
        System.out.println("Name: " + super.getName());
        System.out.println("Age: " + super.getAge());
        System.out.println("Gender: " + super.getGender());
        System.out.println("Share in Business: " + getShare() + "%");
    }

}
