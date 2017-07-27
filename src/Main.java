
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Main
{
    public static void main(String[] args)
            throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fstr = "";
        for (int i = 0; i < args.length; i++) {
            fstr = args[i];
        }
        String str;
        while ((str = br.readLine()) != null)
        {
            int l = str.length();
            if (containsIgnoreCase(str, fstr) == true) {
                System.out.println(str);
            }
        }
    }

    public static boolean containsIgnoreCase(String str, String searchStr)
    {
        if ((str == null) || (searchStr == null)) {
            return false;
        }
        int length = searchStr.length();
        if (length == 0) {
            return true;
        }
        for (int i = str.length() - length; i >= 0; i--) {
            if (str.regionMatches(true, i, searchStr, 0, length)) {
                return true;
            }
        }
        return false;
    }
}
