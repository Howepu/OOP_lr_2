import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String regex = "^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$";
        String macAddress1 = "aE:dC:cA:56:76:54";
        String macAddress2 = "01:23:45:67:89:Az";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher1 = pattern.matcher(macAddress1);
        System.out.println(macAddress1 + " is valid MAC address: " + matcher1.matches());

        Matcher matcher2 = pattern.matcher(macAddress2);
        System.out.println(macAddress2 + " is valid MAC address: " + matcher2.matches());
    }
}
