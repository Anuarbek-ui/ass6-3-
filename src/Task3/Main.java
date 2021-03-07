package Task3;


import com.sun.jdi.connect.Connector;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String choice = "";
        while (true) {
            System.out.println("PLEASE ENTER NUMBER [1] TO SHOW TRUCK");
            System.out.println("PLEASE ENTER NUMBER [2] TO SHOW SHIP");
            choice=in.next();
            if (choice.equals("0")) {
                return;
        }
            if (choice.equals("1")){
                Transport truck = TransportFactory.getTransport(Transports.Truck);
                truck.deliver();
            }
            if (choice.equals("2")){
                Transport ship = TransportFactory.getTransport(Transports.Ship);
                ship.deliver();
            }

            }

        }
    }

