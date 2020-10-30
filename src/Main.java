import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        File games = new File("Games");

        if(games.mkdir())
            System.out.println("Catalog created");

        File src = new File("Games", "src");

        if(src.mkdir())
            System.out.println("Catalog created");


        File res = new File("Games", "res");

        if(res.mkdir())
            System.out.println("Catalog created");

        File savegames = new File("Games", "savegames");

        if(savegames.mkdir())
            System.out.println("Catalog created");

        File temp = new File("Games", "temp");

        if(temp.mkdir())
            System.out.println("Catalog created");

        File srcMain = new File("Games/src", "main");

        if(srcMain.mkdir())
            System.out.println("Catalog created");

        File srcTest = new File("Games/src", "test");

        if(srcTest.mkdir())
            System.out.println("Catalog created");

        File resDrawables = new File("Games/res", "drawables");

        if(resDrawables.mkdir())
            System.out.println("Catalog created");

        File resVectors = new File("Games/res", "vectors");

        if(resVectors.mkdir())
            System.out.println("Catalog created");

        File resIcons = new File("Games/res", "icons");

        if(resIcons.mkdir())
            System.out.println("Catalog created");

        File main = new File("Games", "main");

        if(main.mkdir())
            System.out.println("Catalog created");

        File mainMain = new File("Games/main", "Main.java");
        try
        {
            boolean created = mainMain.createNewFile();
            if(created)
                System.out.println("File has been created");
        }
        catch(IOException ex) {

            System.out.println(ex.getMessage());
        }

        File mainUtils = new File("Games/main", "Utils.java");
        try
        {
            boolean created = mainUtils.createNewFile();
            if(created)
                System.out.println("File has been created");
        }
        catch(IOException ex) {

            System.out.println(ex.getMessage());
        }

        File tempTemp = new File("Games/temp", "temp.txt");
        try
        {
            boolean created = tempTemp.createNewFile();
            if(created)
                System.out.println("File has been created");
        }
        catch(IOException ex) {

            System.out.println(ex.getMessage());
        }

        StringBuilder builder = new StringBuilder();

        builder.append("Catalog created \n");
        builder.append("Catalog created \n");
        builder.append("Catalog created \n");
        builder.append("Catalog created \n");
        builder.append("Catalog created \n");
        builder.append("Catalog created \n");
        builder.append("Catalog created \n");
        builder.append("Catalog created \n");
        builder.append("Catalog created \n");
        builder.append("Catalog created \n");
        builder.append("Catalog created \n");
        builder.append("File has been created \n");
        builder.append("File has been created \n");
        builder.append("File has been created \n");

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
            // читаем посимвольно
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
