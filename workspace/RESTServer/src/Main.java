
import static spark.Spark.*;
import java.util.*;
import spark.Request;
import spark.Response;
import spark.Route;

public class Main {

	private static Map<String, Book> books = new HashMap<String, Book>();

	public static void main(String[] args) {
		
		post(new Route("/testRoute") {
		
			@Override
			public Object handle(Request request, Response response){
				
			}
		});
		get(new Route("/books") {
		
			@Override
			public Object handle(Request request, Response response){
				
			}
		});
		get(new Route("/books/:id") {
		
			@Override
			public Object handle(Request request, Response response){
				
			}
		});
		put(new Route("/books/:id") {
		
			@Override
			public Object handle(Request request, Response response){
				
			}
		});
		delete(new Route("/books/:id") {
		
			@Override
			public Object handle(Request request, Response response){
				
			}
		});
	}
}

