package Class;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionExample {

	public static void collection() {
		
		List<String> fruits = Arrays.asList("Banana","Orange","Apple","Mango");
		System.out.println("Before Sort of fruits : " + fruits);
		
		//Comparator Anonymous class
		Collections.sort(fruits,new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				
				return a.compareTo(b);
			}
		});
		System.out.println("After Sort of fruits : " + fruits);
		
		//Lambda Expression
		List<String> names = Arrays.asList("Aoi","Kuroi","Shiroi","Pink");
		System.out.println("Before sort of names : " + names);
		Collections.sort(names, (String a, String b) -> { return a.compareTo(b); });
		System.out.println("Ascending sort of names : "  + names);
		
		Collections.sort(names,(a,b) -> b.compareTo(a));
		System.out.println("Descending sort of names :" + names);
		
		Book book1 = new Book("Java Begineer", "Maw" , "PaingThu" , 150);
		Book book2 = new Book("Hydroponic Begineer", "Paing" , "MawThu" , 100);
		Book book3 = new Book("Japanese N5", "Thu" , "MawPaing" , 100);
		
		List<Book> bookList = Arrays.asList(book1,book2,book3);
		//Method Reference
		int totalPrice = bookList.stream().collect(Collectors.summingInt(Book :: getPrice));
		System.out.println("Total Price : " +  totalPrice);
		
		//Method Reference
		List<String> bookNameList = bookList.stream().map(Book :: getTitle).sorted().collect(Collectors.toList());
		System.out.println("Book Name List : " + bookNameList);
		
		//Method Reference
		List<Book> dupBookList = Arrays.asList(book1,book1,book2,book3,book2,book1);
		System.out.print("Before removing duplicate ");
		dupBookList.stream().map(Book :: getTitle).forEach(System.out :: print);
		System.out.println();
		
		//Method Reference
		Collection<Book> noDups = new HashSet<Book>(dupBookList);
		System.out.print("After removing duplicate " );
		noDups.stream().map(Book :: getTitle).sorted().forEach(System.out :: print);
		
		
		
		
	}
	
}
