package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import Entities.Comment;
import Entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		//Criando um objeto do tipo commet 
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Won that's awesome!");
		//Criando uma vareavel do tipo post, onde converte um date pra String 
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),
			"Traveling to New Zealand", 
			"I'm going to visit this wonder ful country!", 
			12);

		p1.addComment(c1);
		p1.addComment(c2);

		Comment c3 = new Comment("Good night");
		Comment c4 = new Comment("May the Force be with you");
		Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"),
			"Good night guys", 
			"See you tomorrow", 
			5);

		p2.addComment(c3);
		p2.addComment(c4);

		System.out.println(p1);
		System.out.println(p2);
	}
}
