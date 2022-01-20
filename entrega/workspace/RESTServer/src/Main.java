
import static spark.Spark.*;
import java.util.*;
import spark.Request;
import spark.Response;
import spark.Route;

public class Main {

	private static Map<String, Book> books = new HashMap<String, Book>();

	public static void main(String[] args) {
		
		post(new Route("/books") {
		
			@Override
			public Object handle(Request request, Response response){
				
				String author = request.queryParams("author");
				String title = request.queryParams("title");
				Random random = new Random();
				Book book = new Book(author, title);
				int id = random.nextInt(Integer.MAX_VALUE);
				books.put(String.valueOf(id), book);
				response.status(201);
				return id;
			}
		});
		get(new Route("/books/:id") {
		
			@Override
			public Object handle(Request request, Response response){
				
				String id = request.params(":id");
				Book book = books.get(id);
				if (book != null) {
					String author = book.getAuthor();
					String title = book.getTitle();
					response.status(200);
					return "Title: " + title + ", Author: " + author;
				} else {
					response.status(404);
					return "error";
				}
			}
		});
		delete(new Route("/books/:id") {
		
			@Override
			public Object handle(Request request, Response response){
				
				String id = request.params(":id");
				Book book = books.remove(id);
				if (book != null) {
					response.status(200);
					return "Book with id " + id + " deleted";
				} else {
					response.status(404);
					return "error";
				}
			}
		});
		put(new Route("/books/:id") {
		
			@Override
			public Object handle(Request request, Response response){
				
				String id = request.params(":id");
				String author = request.queryParams("author");
				String title = request.queryParams("title");
				Book book = books.get(id);
				if (book != null) {
					String newAuthor = author;
					if (newAuthor != null)
						book.setAuthor(newAuthor);
					String newTitle = title;
					if (newTitle != null)
						book.setTitle(newTitle);
					response.status(200);
					return "Book with id " + id + " updated";
				} else {
					response.status(404);
					return "error";
				}
			}
		});
	}
}

