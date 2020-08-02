import java.io.BufferedReader;
import java.io.InputStreamReader;

public class countspaces{
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the line of text mate");
        String readerr = reader.readLine();
        String readerrr = readerr.trim();
        reader.close();
        if (readerrr.isEmpty()) {
            System.out.println(0);
        } else {
            String[] arr = readerrr.split("\\s+");
            System.out.println(arr.length);
        }

    }
}
