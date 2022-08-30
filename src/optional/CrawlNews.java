package optional;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlNews {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://dantri.com.vn/the-gioi.htm");
            Scanner input = new Scanner(new InputStreamReader(url.openStream()));
            input.useDelimiter("\\Z");
            String content = input.next();
            input.close();

            content = content.replaceAll("\\n+", "");

            Pattern p = Pattern.compile("title=\"(.*?)\">");
            Matcher m = p.matcher(content);
            while (m.find()) {
                System.out.println(m.group(1));
            }
        } catch (MalformedURLException me) {
            System.err.println(me.getMessage());
        } catch (UnsupportedEncodingException ue) {
            System.err.println(ue.getMessage());
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
    }
}
