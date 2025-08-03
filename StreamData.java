import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.http.HttpRequest;

public class StreamData {
    
    static String fetchData() throws MalformedURLException, IOException {
        var url = new URI("http://www.google.com");
        var request = HttpRequest.newBuilder(url).me;
    
    
        return "";
    }

    public static void main(){

    }
}