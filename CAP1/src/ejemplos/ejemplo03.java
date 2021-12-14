package ejemplos;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ejemplo03 {

    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<String>();

        list.add("gedit");
        list.add("abc.txt");

        ProcessBuilder build = new ProcessBuilder(list);

        build.directory(new File("src"));

        System.out.println("directory: " + build.command());
    }
}
