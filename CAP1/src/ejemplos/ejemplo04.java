package ejemplos;

import java.io.*;
import java.util.*;

class ejemplo04 {

    public static void main(String[] arg) throws IOException  {

        ArrayList<String> lista = new ArrayList<>();
        lista.add("gedit.exe");

        ProcessBuilder pb = new ProcessBuilder();

        Map<String, String> envMap = pb.environment();

        for(Map.Entry<String, String> entry : envMap.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

        pb.start();
    }
}