package blablacar.cli;
import blablacar.core.parser.FileToParse;

class Application {

    public static void main(final String[] args) {
        if (args.length == 0) {
            System.out.println("no arguments were given.");
        } else {
            FileToParse file = new FileToParse(args[0]);
            file.readFile();
        }
    }
}
