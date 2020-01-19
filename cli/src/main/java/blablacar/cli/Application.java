package blablacar.cli;

import blablacar.core.Grid;
import blablacar.core.parser.Parser;
import blablacar.core.parser.Token;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

class Application {

    private static Grid selectGridSize(){
        int x = 0,y = 0;

        while(x == 0 && y == 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter the size of the grid (format: integer integer)\n");
            String str = sc.nextLine();
            System.out.print("You have entered: " + str + "\n");
            Parser aParser = new Parser();

            final List<Token> tokens = aParser.parse(str);
            if (tokens.size() > 2) {
                System.out.println("Too many numbers");
                continue;
            }

            for (Token tok : tokens) {
                if (!tok.isInt()) {
                    System.out.println("Please enter two positive Integers\n");
                    continue;
                }
            }
            x = (int) tokens.get(0).asInt();
            y = (int) tokens.get(1).asInt();
            if(x <= 0 || y <= 0){
                x = y = 0;
                System.out.printf("Please enter two positive Integers\n");
            }
        }

        return new Grid(x,y);
    }

    public static void main(final String[] args) {
        if(args.length == 0) {
            System.out.println("no arguments were given.");
        }else{
            File file = new File(args[0]);
            Grid aGrid = selectGridSize();

        }




        }


}
