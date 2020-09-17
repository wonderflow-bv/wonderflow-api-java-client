package main;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class HttpPostGetToken {
	public static void main(String[] args) throws ClientProtocolException, IOException {
		String apiKey=args[0];
		String secret=args[1];

		System.out.println("apiKey: "+apiKey);
		System.out.println("secret: "+secret);

		String       postUrl       = "https://api.wonderflow.co/token";// put in your url
		Gson         gson          = new Gson();
		HttpClient   httpClient    = HttpClientBuilder.create().build();
		HttpPost     post          = new HttpPost(postUrl);
		Credentials credentials=new Credentials();
		credentials.setApiKey(apiKey);
		credentials.setSecret(secret);
		StringEntity postingString = new StringEntity(gson.toJson(credentials));//gson.tojson() converts your pojo to json
		post.setEntity(postingString);
		post.setHeader("Content-type", "application/json");
		HttpResponse  response = httpClient.execute(post);

		if (response != null) {
			InputStream in = response.getEntity().getContent(); //Get the data in the entity
			Scanner s = new Scanner(in).useDelimiter("\\A");
			String result = s.hasNext() ? s.next() : "";
			JsonObject jsonResponse=new Gson().fromJson(result, JsonObject.class);
			JsonElement token=jsonResponse.get("token");
			System.out.println("Token is: "+token);

			s.close();
		}
	}
}
