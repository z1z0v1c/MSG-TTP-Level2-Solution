import server.Server;

/**
 *
 * @author luciano
 */
public class Application {

    public static void main(String args[]) throws Exception {
        if (args.length != 3) {
            throw new Exception("Number of args must be 3!");
        }

        int portNumber = 0;
        try {
            portNumber = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            throw new Exception("Second argument must be number");
        }
        String pathToDatabase = args[1];
        String pathToOutputDir = args[2];

        Server server = new Server(pathToDatabase);
        server.start(portNumber, pathToOutputDir);
    }
}
