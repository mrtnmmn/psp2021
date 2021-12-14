package ejemplos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ejemplo02 {

    public static void main(String[] args) throws IOException {

        List<String> list = new ArrayList<String>();

        list.add("gedit");
        list.add("xyz.txt");

        ProcessBuilder build = new ProcessBuilder(list);
        System.out.println("command: " + build.command());

        build.start();
    }
}
