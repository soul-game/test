import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientDemo{

	public static void main(String x[])
	{
		try{
		HttpClient client = HttpClient.newHttpClient();
		
		HttpRequest request = HttpRequest.newBuilder()
				      .uri(URI.create("https://jsonplaceholder.typicode.com/posts/1"))
				     // .GET()
				      .build();

		HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());
		
		System.out.println(response.body());
		}
		catch(Exception e)
		{
			System.out.println("Exception occcure");
		}	
	}
}

-------------------------
alternate
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientDemo {
    public static void main(String[] args) throws Exception {
        // 1. Create client and request in a chain
        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder(URI.create("https://jsonplaceholder.typicode.com/posts/1")).build();

        // 2. Send and print body directly
        var response = client.send(request, HttpResponse.BodyHandlers.ofString());
        
        System.out.println(response.body());
    }
}