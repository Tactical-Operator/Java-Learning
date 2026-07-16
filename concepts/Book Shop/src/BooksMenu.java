// import java.util.Scanner;

// public class BooksMenu {
//     private static Book getExpensiveBook(Book book1, Book book2) {
//         if (book1.getPrice()<book2.getPrice()) {
//             return book2;
//         } else {
//             return book1;
//         }
//     }
// 	public static void main(String s[]) {
// 		Scanner scanner = new Scanner(System.in);
// 		Book[] books = new Book[10];
// 		int bkIdx = 0;
// 		while(true) {
// 			System.out.println(	"Press 1 to view books, 2 to add books, "+
// 								"3 to compare prices of books, any other key to exit");
// 			String userAction = scanner.nextLine();
// 			if (userAction.equals("1")) {
// 				for(int i=0;i<books.length;i++) {
// 					if(books[i] != null) {
// 						System.out.println(books[i]);
// 					}
// 				}
// 			} else if (userAction.equals("2")) {
// 				if(bkIdx == 10) {
// 					System.out.println("10 books added already. Cannot add any more books!");
// 					continue;
// 				}
// 				System.out.println("Which constructor do you want to use? Press 1 for default,"+
// 									"any other key for overloaded constructor");
// 				String constructor = scanner.nextLine();
// 				System.out.println("Enter book title");
// 				String tmpTitle = scanner.nextLine();
// 				System.out.println("Enter book author");
// 				String tmpAuthor = scanner.nextLine();
// 				System.out.println("Enter book price");
// 				float tmpPrice = Float.parseFloat(scanner.nextLine());
// 				if (constructor.equals("1")) {
// 					Book bkTmp = new Book();
// 					bkTmp.setTitle(tmpTitle);
// 					bkTmp.setAuthor(tmpAuthor);
// 					bkTmp.setPrice(tmpPrice);
// 					books[bkIdx++] = bkTmp;
// 				} else {
// 					books[bkIdx++] = new Book(tmpTitle, tmpAuthor, tmpPrice);
// 				}
// 			} else if (userAction.equals("3")) {
// 				System.out.println("Enter index of first book to compare");
// 				int book1Idx = Integer.parseInt(scanner.nextLine());
// 				System.out.println("Enter index of second book to compare");
// 				int book2Idx = Integer.parseInt(scanner.nextLine());

// 				if (books[book1Idx] != null && books[book2Idx] != null ) {
// 					System.out.println("The details of expensive book is \n"+getExpensiveBook(books[book1Idx],books[book2Idx]));
// 				} else {
// 					System.out.println("One of the books is null");
// 				}
// 			} else {
// 				break;
// 			}
// 		}
// 	}
// }

import java.util.*;

class BooksMenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String books_name[] = new String[5];
		String author_of_books[] = new String[5];
		float price_of_books[] = new float[5];

		books_name[0] = "Time Machine";
		author_of_books[0] = "HG Wells";
		price_of_books[0] = 450.0f;
		books_name[1] = "Adventures of Tintin";
		author_of_books[1] = "Herge";
		price_of_books[1] = 399;
		books_name[2] = "Avengers";
		author_of_books[2] = "Stan Lee";
		price_of_books[2] = 1500.55f;
		books_name[3] = "Tinkle";
		author_of_books[3] = "Amar";
		price_of_books[3] = 100.55f;
		books_name[4] = "Mein Kampf";
		author_of_books[4] = "Adolf Hitler";
		price_of_books[4] = 500.55f;

		String cart[] = new String[4];
		int cart_counter = -1;

		String book_author_for_cart[] = new String[4];
		float price_of_book_in_cart[] = new float[4];
		int total_books = 0;

		float total_price = 0.0f;

		while (true) {
			System.out.println("Enter 1 to view available BOOKS from the store");
			System.out.println("Enter 2 to add Books in cart");
			System.out.println("Enter 3 to view cart");
			System.out.println("Enter 4 delete books from cart");
			System.out.println("Enter 5 to checkout and exit");

			System.out.println();

			int userAction = sc.nextInt();

			if (userAction == 1) // View Books in the store ;
			{

				System.out.println("Available Books in store:-");
				for (int i = 0; i < books_name.length; i++) {
					System.out.println("\n Book Name =" + books_name[i] + "\n Author Name =" + author_of_books[i]
							+ "\n Price =" + price_of_books[i]);
					System.out.println();
				}
			}

			else if (userAction == 2) // Add Books to cart
			{
				if (total_books == 4) {
					System.out.println("Cant add more than 4 books, please remove 1 book to add another book ");
					continue; // skip the remaining code and jump to next iteration (continueonly effects the
								// current if/loop)

				}

				System.out.println("Enter the name of the book of your choice");

				sc.nextLine();
				String user_choice_book = sc.nextLine();
				System.out.println();

				for (int i = 0; i < books_name.length; i++) {

					if (user_choice_book.equalsIgnoreCase(books_name[i])) {
						total_price = total_price + price_of_books[i];
						cart_counter++;
						cart[cart_counter] = books_name[i];

						book_author_for_cart[cart_counter] = author_of_books[i];

						price_of_book_in_cart[cart_counter] = price_of_books[i];

						total_books++;

					}
				}

			}

			else if (userAction == 3) // View Cart
			{

				System.out.println("Your Cart");
				for (int i = 0; i < 4; i++) {
					if (i <= cart_counter) {

						System.out.println("\nBook Name =" + cart[i] + "\nAuthor Name =" + book_author_for_cart[i]
								+ "\nPrice =" + price_of_book_in_cart[i]);
					}
				}
				System.out.println();
				System.out.println("Total Books = " + total_books);
				System.out.println("Your Total Bill = " + total_price);
				System.out.println();
			}

			else if (userAction == 4) // deletes book from cart
			{

				if (cart_counter == -1) {
					System.out.println("Cart is Empty");
					continue;
				}

				sc.nextLine();

				System.out.println("Enter the book to be deleted");
				String delete_book = sc.nextLine();

				boolean found = false;

				for (int i = 0; i <= cart_counter; i++) {
					if (delete_book.equalsIgnoreCase(cart[i])) {
						found = true;

						total_price = total_price - price_of_book_in_cart[i];
						total_books--;

						// shifting left

						for (int j = i; j < cart_counter; j++) {
							cart[j] = cart[j + 1];
							book_author_for_cart[j] = book_author_for_cart[j + 1];
							price_of_book_in_cart[j] = price_of_book_in_cart[j + 1];
						}

						// empty last positions
						cart[cart_counter] = null;
						book_author_for_cart[cart_counter] = null;
						price_of_book_in_cart[cart_counter] = 0;

						cart_counter--;
						System.out.println("Book is deleted successfully");

						break;
					}
				}
				if (found == false) {
					System.out.println("Book not found in cart");
				}

			}

			if (userAction == 5) // exiting console and printing the final cart
			{
				System.out.println("Your final cart and bill");
				for (int i = 0; i < 4; i++) {
					if (i <= cart_counter) {

						System.out.println("\nBook Name =" + cart[i] + "\nAuthor Name =" + book_author_for_cart[i]
								+ "\nPrice =" + price_of_book_in_cart[i]);
					}
				}
				System.out.println();
				System.out.println("Total Books = " + total_books);
				System.out.print("Total Bill : ");

				for (int i = 0; i < 4; i++) {
					if (price_of_book_in_cart[i] > 0.0) {
					
					System.out.print(price_of_book_in_cart[i]);
					if (i<cart_counter) {
						System.out.print(" + ");
					}
				 }
				}
				System.out.print("= " + total_price);
				System.out.println();
				System.out.println("Exiting console");
				break;
			}

		}
		sc.close();
	}
}
