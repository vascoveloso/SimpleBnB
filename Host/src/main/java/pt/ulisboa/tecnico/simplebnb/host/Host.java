package pt.ulisboa.tecnico.simplebnb.host;

import pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.*;

import java.util.Scanner;

public class Host {

    private static final String HOST_JOIN_CMD = "host_join";
    private static final String ADD_HOUSE_CMD = "add_house";
    private static final String REMOVE_HOUSE_CMD = "remove_house";
    private static final String EXIT_CMD = "";

    public static void main(String[] args){
        System.out.println(Host.class.getSimpleName());
        System.out.printf("Received %d Argument(s)%n", args.length);

        // receive and print arguments
        for (int i = 0; i < args.length; i++) {
            System.out.printf("args[%d] = %s%n", i, args[i]);
        }

        // Check arguments given; input expected: server + port + hostId and/or debug flag
        if (args.length < 2) {
            System.exit(1);
        }

        final String server = args[0];
        final int port = Integer.parseInt(args[1]);
        final int hostId = Integer.parseInt(args[2]);

        HostFrontend hostFrontend = new HostFrontend(server, port);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.printf("%n> ");
            String line = scanner.nextLine();
            String[] splitLine = line.split(" ");
            int argSize = splitLine.length;

            if(HOST_JOIN_CMD.equals(splitLine[0])) {
                StringBuilder hostNameBuild = null;

                //Process host input & tokenize
                if(argSize >= 2){
                    int i = 1;
                    hostNameBuild = new StringBuilder(splitLine[i]);
                    while(i < argSize - 1) {
                        i++;
                        hostNameBuild.append(" ").append(splitLine[i]);
                    }
                }
                assert hostNameBuild != null;
                String[] hostInfo = hostNameBuild.toString().split(",");

                // Check if hostId given is not doubled.
                // If response ID comes as -1, then operation got CANCELLED
                HostJoinResponse response = hostFrontend.hostJoin(hostInfo[0], Integer.parseInt(hostInfo[1]));
                if(response.getHostId() == -1) {
                    System.out.println("\nInvalid Command\nHostID given already exists.");
                }
                else{
                    System.out.println("Host " + response.getHostId() + " joined SimpleBnB");
                }
            }

            else if(ADD_HOUSE_CMD.equals(splitLine[0])) {

                // process input & tokenize
                StringBuilder houseBuild = null;
                if(argSize >= 2) {
                    int i = 1;
                    houseBuild = new StringBuilder(splitLine[1]);
                    while(i < argSize - 1) {
                        i++;
                        houseBuild.append(" ").append(splitLine[i]);
                    }
                }
                assert houseBuild != null;
                String[] houseInfo = houseBuild.toString().split(",");
                if(houseInfo.length != 8){
                    System.out.println("Add_house: invalid arguments");
                }
                else{
                    addHouseResponse response =
                            hostFrontend.addHouse(houseInfo[0], houseInfo[1],
                                    Integer.parseInt(houseInfo[2]), houseInfo[3],
                                    houseInfo[4], houseInfo[5], houseInfo[6], Integer.parseInt(houseInfo[7]));
                    System.out.println("House added to SimpleBnB. Unique ID: " + response.getHouseId());
                }
            }

            else if(REMOVE_HOUSE_CMD.equals(splitLine[0])) {
                removeHouseResponse response = hostFrontend.removeHouse(Integer.parseInt(splitLine[1]));
                if(response.getCheck() != 0) {
                    System.out.println("Remove_house: invalid houseId " + splitLine[1]);
                }
                else{
                    System.out.println("House with unique ID " + splitLine[1] + " removed from SimpleBnB");
                }
            }

            else if(EXIT_CMD.equals(splitLine[0])) {
                System.out.println("Shutting down connection to " + server + " at port " + port);
                System.exit(0);
            }

            else {
                System.out.println("\nInvalid Command.");
            }
        }
    }
}
