package cap1;

public class launcher {

    public void launch(Integer n1, Integer n2){
        String clase="cap1.sumador";
        ProcessBuilder pb;
        try {
            pb = new ProcessBuilder("java",clase,
                    n1.toString(), n2.toString());
            pb.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        launcher l = new launcher();
        l.launch(1, 51);
        l.launch(51, 100);
        System.out.println("Ok");
    }
}
