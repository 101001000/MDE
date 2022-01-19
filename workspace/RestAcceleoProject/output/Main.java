
import static spark.Spark.*;
import java.util.*;
import spark.Request;
import spark.Response;
import spark.Route;

public class Main {

	public static void main(String[] args) {
	
		private static Map<String, Book> books = new HashMap<String, Book>();
		
		post(new Route("/testRoute") ){
		
			@Override
			public Object handle(Request request, Response response){
				String author = request.queryParams("author");
				String title = request.queryParams("title");
				Book book = new Book(author, title);
				
				response.status(201);
				return id;
			}
		});
		get(new Route("/books") ){
		
			@Override
			public Object handle(Request request, Response response){
				
				String ids = "";
				for(String id : books.keySet())
					ids += id + " ";
				response.status(200);
				return id;
				
			}
		});
		get(new Route("/books/:id") ){
		
			@Override
			public Object handle(Request request, Response response){
				
				Book book = books.get(request.params(":id"));
				if (book != null) {
					response.status(200);
					return id;
				} else {
					response.status(404);
					return error;
				}
				
			}
		});

	}
}

