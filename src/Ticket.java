public class Ticket {
    private String row,name,surname,email;
    private int seatNo;
    private double price;
    private Person ticketOwner = new Person(name,surname,email);

    public Ticket(){

    }
    public Ticket(String row,int seatNo,double price,Person ticketOwner){
        this.row = row;
        this.seatNo = seatNo;
        this.price = price;
        this.ticketOwner = ticketOwner;
    }

    public void setTicketOwner(Person ticketOwner) {
        this.ticketOwner = ticketOwner;
    }
    public Person getTicketOwner() {
        return ticketOwner;
    }

    public void setRow(String row) {
        this.row = row;
    }
    public String getRow() {
        return row;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }
    public int getSeatNo() {
        return seatNo;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
}
