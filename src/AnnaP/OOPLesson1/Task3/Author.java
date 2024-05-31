package AnnaP.OOPLesson1.Task3;

public class Author {

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    void show(){
        System.out.println("Author: " + this.firstName + " " + this.lastName);
    }

}
