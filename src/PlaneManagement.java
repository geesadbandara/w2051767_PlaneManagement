import java.util.*;
public class PlaneManagement {
    protected static String[][] seatReservation = {{"X","O","O","O","O","O","O","O","O","O","O","O","O","O"},{"O","O","O","X","X","X","X","X","X","X","X","O"},{"X","X","X","X","X","X","X","X","X","X","X","X"},{"X","X","X","X","X","X","X","X","X","X","X","X","X","X"}};
    protected static Ticket[] ticketArrayA = new Ticket[14];
    protected static Ticket[] ticketArrayB = new Ticket[12];
    protected static Ticket[] ticketArrayC = new Ticket[12];
    protected static Ticket[] ticketArrayD = new Ticket[14];

    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        boolean status = true;


        int userSelection;
        while(status){ //status=true

        System.out.println("Welcome to Plane Management System");
        System.out.println("*****************************************************");
        System.out.println("*                 MENU OPTION                       *");
        System.out.println("*****************************************************");
        String[] menuOptions = {"1)Buy Seat","2)Cancel a Seat","3)Find first available seat","4)Show meeting seat","5)Print ticket information and total sales","6)Search ticket","0)Buy Seat"};
        for(String menu:menuOptions){
            System.out.println("        " +menu);
        }
        System.out.println("*****************************************************");

        System.out.println("Please select an option:");

        userSelection = userInput.nextInt();
         switch (userSelection) {
             case 1:
                 System.out.println("Buy a seat");
                 buy_seat();
                 break;
             case 2:
                 System.out.println("Cancel Seat");
                 cancel_seat();
                 break;
             case 3:
                 find_first_available();
                 break;
             case 4:
                 show_seating_plan();
                 break;
             case 5:
                 print_ticket_info();
                 break;

             case 0:
                 System.out.println("Quit");
                 status=false;
                 break;
         }
         }



    }
    public static void buy_seat(){
        try{
            Scanner buySeatIn = new Scanner(System.in);
            double price=0;

            System.out.println("Enter the row letter :");
            String rowLetter = buySeatIn.nextLine().toUpperCase();

            System.out.println("Enter the seat number :");

            int seatNumber = buySeatIn.nextInt();

            if(seatNumber<6){
                price=200;
            } else if (seatNumber<10) {
                price=150;
            }
            else if(seatNumber<15){
                price=180;
            }

            int arrayNum1;
            if(rowLetter.equals("A") || rowLetter.equals("B") || rowLetter.equals("C") || rowLetter.equals("D")){
                switch (rowLetter){
                    case "A":
                        arrayNum1 = 0;
                        checkSeatBuy(arrayNum1,seatNumber,price,rowLetter);
                        break;

                    case "B":
                        arrayNum1 = 1;
                        checkSeatBuy(arrayNum1,seatNumber,price,rowLetter);
                        break;
                    case "C":
                        arrayNum1 = 2;
                        checkSeatBuy(arrayNum1,seatNumber,price,rowLetter);
                        break;
                    case "D":
                        arrayNum1 = 3;
                        checkSeatBuy(arrayNum1,seatNumber,price,rowLetter);
                        break;

                }
            }
            else{
                System.out.println("Enter a valid row letter!  (A/B/C/D)");
            }


        }
        catch (InputMismatchException e){
            System.out.println("First Input the Row Letter,It should be a character (A/B/C/D)");
            System.out.println("Then Input the Seat Number,It should be a integer");
        }



    }
    public static void cancel_seat(){
        try{
            Scanner cancelSeatIn = new Scanner(System.in);

            System.out.println("Enter the row letter :");
            String rowLetter = cancelSeatIn.nextLine().toUpperCase();

            System.out.println("Enter the seat number :");

            int seatNumber = cancelSeatIn.nextInt();
            int arrayNum1;
            if(rowLetter.equals("A") || rowLetter.equals("B") || rowLetter.equals("C") || rowLetter.equals("D")){
                switch (rowLetter){
                    case "A":
                        arrayNum1 = 0;
                        checkSeatCancel(arrayNum1,seatNumber,rowLetter);
                        break;

                    case "B":
                        arrayNum1 = 1;
                        checkSeatCancel(arrayNum1,seatNumber,rowLetter);
                        break;
                    case "C":
                        arrayNum1 = 2;
                        checkSeatCancel(arrayNum1,seatNumber,rowLetter);
                        break;
                    case "D":
                        arrayNum1 = 3;
                        checkSeatCancel(arrayNum1,seatNumber,rowLetter);
                        break;

                }
            }
            else{
                System.out.println("Enter a valid row letter!  (A/B/C/D)");
            }


        }
        catch (InputMismatchException e){
            System.out.println("First Input the Row Letter,It should be a character (A/B/C/D)");
            System.out.println("Then Input the Seat Number,It should be a integer");
        }



    }
    
    public static void find_first_available(){
        int[] rowChange = {0,1,2,3,4};
        boolean notFound = true;
        for(int row: rowChange){
            if(((row==0)||(row==3)) && (notFound)){
                for(int seatNo=0;seatNo<14;seatNo++){
                    if(!(seatReservation[row][seatNo].equals("X"))){
                        int printSeatNo = seatNo+1;
                        switch(row){
                            case 0:
                                System.out.println("First Available Seat: A" + printSeatNo);
                                break;
                            case 3:
                                System.out.println("First Available Seat: D" + printSeatNo);
                                break;
                        }
                        notFound = false;

                        break;
                    }

                }
            }
            else if (((row==1)||(row==2)) && (notFound)) {
                for(int seatNo=0;seatNo<12;seatNo++) {
                    if (!(seatReservation[row][seatNo].equals("X"))) {
                        int printSeatNo = seatNo+1;
                        switch(row){
                            case 1:
                                System.out.println("First Available Seat: B" + printSeatNo);
                                break;
                            case 2:

                                System.out.println("First Available Seat: C" + printSeatNo);
                                break;
                        }
                        notFound = false;

                        break;
                    }

                }

            }
            else if((notFound)){
                System.out.println("No seats available");
            }


        }
    }
    public static void show_seating_plan(){
        int[] rowChange = {0,1,2,3};
        for(int row: rowChange) {
            if (((row == 0) || (row == 3))) {
                for (int seatNo = 0; seatNo < 14; seatNo++) {
                    System.out.print(seatReservation[row][seatNo]);
                }
                System.out.println("");
            } else if (((row == 1) || (row == 2))) {
                for (int seatNo = 0; seatNo < 12; seatNo++) {
                    System.out.print(seatReservation[row][seatNo]);
                }
                System.out.println("");

            }
        }

    }
    public static void setTicketDetails(double setPrice,String setRow, int setSeatNo){
        String nameIn,surnameIn,emailIn;
        Scanner userIn = new Scanner(System.in);
        while(true){
            try{
                System.out.println("Enter the name: ");
                nameIn  = userIn.next();
                //String name = new String(nameIn);
                if(nameIn.matches("[a-zA-Z]+")){
                    System.out.println("Valid");
                    break;
                }
                else{
                    System.out.println("Invalid name !");
                    continue;
                }
            }
            catch(InputMismatchException e){
                System.out.println("Invalid Name ! ");
                continue;
            }

        }
        while(true){
            try{
                System.out.println("Enter the surname: ");
                surnameIn  = userIn.next();
                //String name = new String(nameIn);
                if(surnameIn.matches("[a-zA-Z]+")){
                    System.out.println("Valid");
                    break;
                }
                else{
                    System.out.println("Invalid surname !");
                    continue;
                }
            }
            catch(InputMismatchException e){
                System.out.println("Invalid surname ! ");
                continue;
            }

        }
        while(true){
            try{
                System.out.println("Enter the email address: ");
                emailIn  = userIn.next();
                //String name = new String(nameIn);
                if((emailIn.contains("@")) && (emailIn.contains(".")) || ((emailIn.matches("[a-zA-Z]+")) || (emailIn.matches("[0-9]+")))){
                    System.out.println("Valid");
                    break;
                }
                else{
                    System.out.println("Invalid email !");
                    continue;
                }
            }
            catch(InputMismatchException e){
                System.out.println("Invalid surname ! ");
                continue;
            }

        }
        //System.out.println(price);
        Person ticketOwner = new Person(nameIn,surnameIn,emailIn);
        Ticket buyTicket = new Ticket(setRow,setSeatNo,setPrice,ticketOwner);

        int arrayValue = setSeatNo - 1;
        switch (setRow){
            case "A":
                ticketArrayA[arrayValue] = buyTicket;
                break;
            case "B":
                ticketArrayB[arrayValue] = buyTicket;
                break;
            case "C":
                ticketArrayC[arrayValue] = buyTicket;
                break;
            case "D":
                ticketArrayD[arrayValue] = buyTicket;
                break;
        }
        //System.out.println(ticketArrayA[arrayValue].getTicketOwner().getEmail());


    }
    public static void checkSeatBuy(int arrayNum1,int seatNumber,double price,String rowLetter){
        try {

            if (seatReservation[arrayNum1][seatNumber - 1].equals("O")) {
                //String nameIn,surnameIn,emailIn;
                System.out.println("Available");
                seatReservation[arrayNum1][seatNumber - 1] = "X";
                setTicketDetails(price,rowLetter,seatNumber);


                //System.out.println(seatReservation[arrayNum1][seatNumber - 1]);

            } else if (seatReservation[arrayNum1][seatNumber - 1].equals("X")) {
                System.out.println("Not Available");
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Seat Number");
        }

    }
    public static void checkSeatCancel(int arrayNum1,int seatNumber,String rowLetter){
        try {

            if (seatReservation[arrayNum1][seatNumber - 1].equals("O")) {
                System.out.println("Available");

            } else if (seatReservation[arrayNum1][seatNumber - 1].equals("X")) {
                System.out.println("Not Available");
                seatReservation[arrayNum1][seatNumber - 1] = "O";
                int arrayValue = seatNumber - 1;
                Ticket cancelTicket=new Ticket(null,0,0,null);
                switch (rowLetter){
                    case "A":
                        ticketArrayA[arrayValue] = cancelTicket;
                        break;
                    case "B":
                        ticketArrayB[arrayValue] = cancelTicket;
                        break;
                    case "C":
                        ticketArrayC[arrayValue] = cancelTicket;
                        break;
                    case "D":
                        ticketArrayD[arrayValue] = cancelTicket;
                        break;
                }
                //System.out.println(ticketArrayD[arrayValue].getPrice());


            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Seat Number");
        }

    }
    public static void print_ticket_info(){
        int[] rowChange = {0,1,2,3};
        double totalPrice = 0;
        for(int rowVal:rowChange){
            if(rowVal==0){
                printTicketSearch(13,ticketArrayA,totalPrice);

            } else if (rowVal==1) {
                printTicketSearch(11,ticketArrayB,totalPrice);

            }else if (rowVal==2) {
                printTicketSearch(11,ticketArrayC,totalPrice);

            }else{
                printTicketSearch(13,ticketArrayD,totalPrice);
            }
        }
        System.out.println("Total Price:" +totalPrice);

    }
    public static void printTicketSearch(int count,Ticket[] ticketArray,double totalPrice){
        int arrayValue=-1;
        while(arrayValue<count){
            arrayValue++;
            try{
                System.out.println("Seat: "+ticketArray[arrayValue].getRow() + ticketArray[arrayValue].getSeatNo());
                ticketArray[arrayValue].getTicketOwner().showPersonDetails();
                System.out.println("Price: Є."+ticketArray[arrayValue].getPrice());
                System.out.println("*****************************************");
                totalPrice = totalPrice + ticketArray[arrayValue].getPrice();

            }
            catch (Exception e){
                continue;
            }
        }

    }

}
