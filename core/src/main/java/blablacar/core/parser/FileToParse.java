package blablacar.core.parser;

import blablacar.core.AutoMower;
import blablacar.core.Grid;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class FileToParse {
    private String path;
    private Parser parser;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Parser getParser() {
        return parser;
    }

    public void setParser(Parser parser) {
        this.parser = parser;
    }

    public FileToParse(String path) {
        this.path = path;
        Parser aParser = new Parser();
    }

    private Grid readGridFromFile(){
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(this.path));
            String line = reader.readLine();
            //read the first line and create a Grid
            final List<Token> tokens = this.getParser().parse(line);
            int x = (int) tokens.get(0).asInt();
            int y = (int) tokens.get(1).asInt();
            Grid aGrid = new Grid(x, y);
            return aGrid;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void readFile(){
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(this.path));
            String line = reader.readLine();

            Grid aGrid = readGridFromFile();

            // create an autoMowers each 2 line in the file and make it follows the instruction
            while (line != null) {
                line = reader.readLine();
                final List<Token> tokens1 = this.getParser().parse(line);
                AutoMower auto = new AutoMower(
                        (int) tokens1.get(0).asInt(),
                        (int) tokens1.get(1).asInt(),
                        aGrid.getCoordXMax(),aGrid.getCoordYMax(),
                        tokens1.get(3).getValue());
                aGrid.addAnAutoMowers(auto);
                auto.move(line = reader.readLine());
            }
            reader.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeFile(){


    }

}
