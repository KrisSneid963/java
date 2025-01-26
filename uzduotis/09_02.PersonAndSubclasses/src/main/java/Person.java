public class Person extends StudentCredits {
    private String name;
    private String address;


    public Person(String name, String address) {
        super(); // for credits
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return name + "\n  " + address + "\n  Study credits: " + credits();
    }
}
