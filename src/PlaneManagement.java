import java.util.*;
public class PlaneManagement {
    static String[][] seatReservation = {{"X","O","O","O","O","O","O","O","O","O","O","O","O","O"},{"O","O","O","O","O","O","O","O","O","O","O","O"},{"O","O","O","O","O","O","O","O","O","O","O","O"},{"O","O","O","O","O","O","O","O","O","O","O","O","O","O"}};


    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        boolean status = true;


        int userSelection;
        while(status==true){

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

            System.out.println("Enter the row letter :");
            String rowLetter = buySeatIn.nextLine().toUpperCase();

            System.out.println("Enter the seat number :");

            int seatNumber = buySeatIn.nextInt();
            int arrayNum1;
            if(rowLetter.equals("A") || rowLetter.equals("B") || rowLetter.equals("C") || rowLetter.equals("D")){
                switch (rowLetter){
                    case "A":
                        try {
                            arrayNum1 = 0;
                            if (seatReservation[arrayNum1][seatNumber - 1].equals("O")) {
                                System.out.println("Available");
                                seatReservation[arrayNum1][seatNumber - 1] = "X";
                                //System.out.println(seatReservation[arrayNum1][seatNumber - 1]);

                            } else if (seatReservation[arrayNum1][seatNumber - 1].equals("X")) {
                                System.out.println("Not Available");
                            }
                        }
                        catch (ArrayIndexOutOfBoundsException e){
                            System.out.println("Invalid Seat Number");
                        }
                        break;

                    case "B":
                        try {
                            arrayNum1 = 1;
                            if (seatReservation[arrayNum1][seatNumber - 1].equals("O")) {
                                System.out.println("Available");
                                seatReservation[arrayNum1][seatNumber - 1] = "X";

                            } else if (seatReservation[arrayNum1][seatNumber - 1].equals("X")) {
                                System.out.println("Not Available");
                            }
                        }
                        catch (ArrayIndexOutOfBoundsException e){
                            System.out.println("Invalid Seat Number");
                        }
                        break;
                    case "C":
                        try {
                            arrayNum1 = 2;
                            if (seatReservation[arrayNum1][seatNumber - 1].equals("O")) {
                                System.out.println("Available");
                                seatReservation[arrayNum1][seatNumber - 1] = "X";
                            } else if (seatReservation[arrayNum1][seatNumber - 1].equals("X")) {
                                System.out.println("Not Available");
                            }
                        }
                        catch (ArrayIndexOutOfBoundsException e){
                            System.out.println("Invalid Seat Number");
                        }
                        break;
                    case "D":
                        try {
                            arrayNum1 = 3;
                            if (seatReservation[arrayNum1][seatNumber - 1].equals("O")) {
                                System.out.println("Available");
                                seatReservation[arrayNum1][seatNumber - 1] = "X";

                            } else if (seatReservation[arrayNum1][seatNumber - 1].equals("X")) {
                                System.out.println("Not Available");
                            }
                        }
                        catch (ArrayIndexOutOfBoundsException e){
                            System.out.println("Invalid Seat Number");
                        }
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
                        try {
                            arrayNum1 = 0;
                            if (seatReservation[arrayNum1][seatNumber - 1].equals("O")) {
                                System.out.println("Available");

                            } else if (seatReservation[arrayNum1][seatNumber - 1].equals("X")) {
                                System.out.println("Not Available");
                                seatReservation[arrayNum1][seatNumber - 1] = "O";
                            }
                        }
                        catch (ArrayIndexOutOfBoundsException e){
                            System.out.println("Invalid Seat Number");
                        }
                        break;

                    case "B":
                        try {
                            arrayNum1 = 1;
                            if (seatReservation[arrayNum1][seatNumber - 1].equals("O")) {
                                System.out.println("Available");
                            } else if (seatReservation[arrayNum1][seatNumber - 1].equals("X")) {
                                System.out.println("Not Available");
                                seatReservation[arrayNum1][seatNumber - 1] = "O";
                            }
                        }
                        catch (ArrayIndexOutOfBoundsException e){
                            System.out.println("Invalid Seat Number");
                        }
                        break;
                    case "C":
                        try {
                            arrayNum1 = 2;
                            if (seatReservation[arrayNum1][seatNumber - 1].equals("O")) {
                                System.out.println("Available");
                            } else if (seatReservation[arrayNum1][seatNumber - 1].equals("X")) {
                                System.out.println("Not Available");
                                seatReservation[arrayNum1][seatNumber - 1] = "O";
                            }
                        }
                        catch (ArrayIndexOutOfBoundsException e){
                            System.out.println("Invalid Seat Number");
                        }
                        break;
                    case "D":
                        try {
                            arrayNum1 = 3;
                            if (seatReservation[arrayNum1][seatNumber - 1].equals("O")) {
                                System.out.println("Available");
                            } else if (seatReservation[arrayNum1][seatNumber - 1].equals("X")) {
                                System.out.println("Not Available");
                                seatReservation[arrayNum1][seatNumber - 1] = "O";
                            }
                        }
                        catch (ArrayIndexOutOfBoundsException e){
                            System.out.println("Invalid Seat Number");
                        }
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
                for(int seatNo=0;seatNo<14;seatNo++) {
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

}
