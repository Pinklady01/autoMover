package blablacar.cli;
import blablacar.core.Grid;
import blablacar.core.parser.File;

import java.io.IOException;

class Application {

    public static void main(final String[] args) throws IOException {
        if (args.length == 0) {
            System.out.println("no arguments were given.");
        } else {
            File input = new File(args[0]);
            Grid aGrid = input.parseFile();
            File output = new File("./cli/output.txt");
            output.writeFile("Results\n"+aGrid.toString());
        }
    }
}
