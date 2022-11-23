package pt.ulisboa.tecnico.simplebnb.bnbserver;

import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class BnBServer {

    private static final String DEBUG = "-debug";

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println(BnBServer.class.getSimpleName());
        System.out.printf("Received %d Argument(s)%n", args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.printf("args[%d] = %s%n", i, args[i]);
        }

        /*if (args.length < 3) {
            System.exit(1);
        }*/

        String host = args[0];
        int port = Integer.parseInt(args[1]);

        BnBDomain bnBDomain = new BnBDomain();

        final BindableService hostImpl = new Host_BnbServiceImpl(bnBDomain);
        final BindableService guestImpl = new Guest_BnbServiceImpl(bnBDomain);

        Server server =
                ServerBuilder.forPort(port)
                        .addService(hostImpl)
                        .addService(guestImpl)
                        .build();

        // Start the server
        server.start();

        // Server threads running in the background
        System.out.println("Server started");

        // Do not exit main thread. Wait until server is terminated
        server.awaitTermination();
    }
}
