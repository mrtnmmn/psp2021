package ejemplos;

import java.util.ArrayList;
import java.util.List;

public class ejemplo01 {

    public static void main(String[] args) {

        List<String>list = new ArrayList<String>();

        list.add("gedit");  //para windows "notepad.exe"

        ProcessBuilder build = new ProcessBuilder(list);
        System.out.println("command: " + build.command());
    }
}
