package blablacar.core.parser;

import blablacar.core.AutoMower;
import blablacar.core.Grid;

import java.io.*;
import java.util.List;

public class File {
    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public File(String path) {
        this.path = path;

    }

    private Grid readGridFromFile(){
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(this.path));
            Parser aParser = new Parser();
            String line = reader.readLine();
            //read the first line and create a Grid
            final List<Token> tokens = aParser.parseFromSpaces(line);
            int x = (int) tokens.get(0).asInt();
            int y = (int) tokens.get(1).asInt();
            Grid aGrid = new Grid(x, y);
            return aGrid;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Grid parseFile(){
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(this.path));
            String line = reader.readLine();
            Parser aParser = new Parser();
            Grid aGrid = readGridFromFile();

            // create an autoMowers each 2 line in the file and make it follows the instruction
            while((line = reader.readLine())!= null) {
                final List<Token> tokens1 = aParser.parseFromSpaces(line);
                AutoMower auto = new AutoMower(
                        (int) tokens1.get(0).asInt(),
                        (int) tokens1.get(1).asInt(),
                        aGrid.getCoordXMax(),aGrid.getCoordYMax(),
                        tokens1.get(2).getValue());
                aGrid.addAnAutoMowers(auto);
                auto.move(line = reader.readLine());
            }
            reader.close();
            return aGrid;
        }
        catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void writeFile(String str) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(this.path));
        writer.write(str);
        writer.close();
    }

}
