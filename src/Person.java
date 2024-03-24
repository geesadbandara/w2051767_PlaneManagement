//Name:Geesad Bandara
//UOW: W20517670
//IIT : 20230782
//References : https://www.geeksforgeeks.org/java/ , https://www.javatpoint.com/ and https://www.w3schools.com/java/
public class Person {
    private String name, surname,email;

    public Person(){

    }

    public Person(String name, String surname,String email){
        this.name = name;
        this.surname = surname;
        this.email = email;
    }
    //getters and setter
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    //this method prints the ticketinfo
    public void showPersonDetails(){
        System.out.println("Name:"+getName());
        System.out.println("Surname:"+getSurname());
        System.out.println("Email:"+getEmail());
    }
}
