import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        File games = new File("Games");

        if(games.mkdir()){
            builder.append("Catalog Games created \n");
            System.out.println("Catalog Games created");
        }

        File src = new File("Games", "src");

        if(src.mkdir()) {
            System.out.println("Catalog src created");
            builder.append("Catalog Games created \n");
        }

        File res = new File("Games", "res");

        if(res.mkdir()) {
            System.out.println("Catalog res created");
            builder.append("Catalog res created \n");
        }

        File savegames = new File("Games", "savegames");

        if(savegames.mkdir()) {
            System.out.println("Catalog savegames created");
            builder.append("Catalog savegames created \n");
        }

        File temp = new File("Games", "temp");

        if(temp.mkdir()) {
            System.out.println("Catalog temp created");
            builder.append("Catalog temp created \n");
        }

        File srcMain = new File("Games/src", "main");

        if(srcMain.mkdir()) {
            System.out.println("Catalog main created");
            builder.append("Catalog main created \n");
        }

        File srcTest = new File("Games/src", "test");

        if(srcTest.mkdir()) {
            System.out.println("Catalog test created");
            builder.append("Catalog test created \n");
        }

        File resDrawables = new File("Games/res", "drawables");

        if(resDrawables.mkdir()) {
            System.out.println("Catalog drawables created");
            builder.append("Catalog Games created \n");
        }

        File resVectors = new File("Games/res", "vectors");

        if(resVectors.mkdir()) {
            System.out.println("Catalog vectors created");
            builder.append("Catalog vectors created \n");
        }

        File resIcons = new File("Games/res", "icons");

        if(resIcons.mkdir()) {
            System.out.println("Catalog icons created");
            builder.append("Catalog Games created \n");
        }

        File main = new File("Games", "main");

        if(main.mkdir()) {
            System.out.println("Catalog main created");
            builder.append("Catalog main created \n");
        }

        File mainMain = new File("Games/main", "Main.java");
        try
        {
            boolean created = mainMain.createNewFile();
            if(created) {
                System.out.println("File main.java has been created");
                builder.append("File main.java has been created \n");
            }
        }
        catch(IOException ex) {

            System.out.println(ex.getMessage());
        }

        File mainUtils = new File("Games/main", "Utils.java");
        try
        {
            boolean created = mainUtils.createNewFile();
            if(created) {
                System.out.println("File Utils.java has been created");
                builder.append("File Utils.java has been created \n");
            }
        }
        catch(IOException ex) {

            System.out.println(ex.getMessage());
        }

        File tempTemp = new File("Games/temp", "temp.txt");
        try
        {
            boolean created = tempTemp.createNewFile();
            if(created) {
                System.out.println("File temp.txt has been created");
                builder.append("File temp.txt has been created \n");
            }
        }
        catch(IOException ex) {

            System.out.println(ex.getMessage());
        }

        try(FileWriter writer = new FileWriter("Games/temp/temp.txt"))
        {
            writer.append(builder);
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        try(FileReader reader = new FileReader("Games/temp/temp.txt"))
        {
            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

    }

}
