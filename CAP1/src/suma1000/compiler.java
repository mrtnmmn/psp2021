package suma1000;

import java.io.*;

public class compiler {

    public static File f;
    public static FileReader fr;
    public static BufferedReader br;

    public static int splits = 6;

    public static void main(String[] args) {

        long result = 0;

        for (int i = 1; i <= splits; i++) {

            result += getDatos(i);

        }

        System.out.println(result);
    }

    public static long getDatos(int i) {
        long result = 0;

        try {
            f = new File("sol" + i + "-" + splits + ".txt");
            fr = new FileReader(f);
            br = new BufferedReader(fr);

            String line = br.readLine();

            System.out.println(line);

            result += Long.parseLong(line);

            fr.close();
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }
}
