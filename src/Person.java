public class Person {
    private String name, surname,email;

    public Person(){

    }
    public Person(String name, String surname,String email){
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

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
    public void showPersonDetails(){
        System.out.println("Name:"+getName());
        System.out.println("Surname:"+getSurname());
        System.out.println("Email:"+getEmail());
    }
}
