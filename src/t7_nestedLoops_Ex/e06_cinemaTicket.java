package t7_nestedLoops_Ex;
import java.util.Scanner;
public class e06_cinemaTicket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int totalTickets = 0;
        int kids = 0;
        int standard = 0;
        int student = 0;

        while(!input.equals("Finish")){
            int places = Integer.parseInt(scan.nextLine());
            int currentTickets = 0;
            String ticket = scan.nextLine();
            while(!ticket.equals("End")){
                currentTickets++;
                totalTickets++;
                switch (ticket) {
                    case "student":
                        student++ ;
                        break;
                    case "standard":
                        standard++;
                        break;
                    case "kid":
                        kids++;
                        break;
                }
                if(currentTickets >= places){
                    break;
                }
                ticket = scan.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n",input, currentTickets * 1.0 / places * 100);
            input = scan.nextLine();

        }
        System.out.printf("Total tickets: %d%n",totalTickets);
        System.out.printf("%.2f%% student tickets.%n",student * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", standard * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.%n",kids * 1.0 / totalTickets * 100);

    }
}
