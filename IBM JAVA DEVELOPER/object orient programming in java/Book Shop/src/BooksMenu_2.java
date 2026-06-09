import java.util.*;

class Custom_exception_for_unavailable_books extends Exception {

}

class BooksMenu_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // array of object references that store book type references
        Book books[] = new Book[10]; // 10 spaces capable of storing book references

        // so java actually creates 10 empty reference slots
        // index 0 value null
        // index 1 value null

        // books[1]=new Book(book_add, book_add_author, book_add_price);
        books[0] = new Book("Time Machine", "HG Wells", 450, 4);
        books[1] = new Book("Avengers", "Stan lee", 499.5f, 4);
        books[2] = new Book("Death Note", "Tsugumi Ohba", 499.5f, 4);
        books[3] = new Book("Tintin", "Herge", 499.5f, 4);
        books[4] = new Book("Mein Kampf", "Adolf Hitler", 599.5f, 4);
        books[5] = new Book("Phantom", "Lee Talks", 499.5f, 4);
        books[6] = new Book("Chacha Chaudhary", "Pran", 499.5f, 4);
        books[7] = new Book("Billo", "Pran", 4199.5f, 4);
        books[8] = new Book("Tinkle", "Tinkle Organisation", 499.5f, 4);
        books[9] = new Book("Wings of Valour", "Swapnil Pandey", 499.5f, 4);

        System.out.println("Available Books in the store ");
        for (int i = 0; i < books.length; i++) {
            books[i].display();
        }

        Cart mycart = new Cart();

        while (true) {
            System.out.println();
            System.out.println("Enter 1 to add Books to cart");
            System.out.println("Enter 2 to view cart");
            System.out.println("Enter 3 to delete books from cart");
            System.out.println("Enter 4 for checkout ");
            System.out.println();

            int user_input = sc.nextInt();
            sc.nextLine();
            System.out.println();

            if (user_input == 1) // adding books according to user input
            {
                while (true) {
                    System.out.println("Enter the book(s) you want to add or type finish ");
                    String user_add_books = sc.nextLine(); // will also store "finish"
                    System.out.println();

                    if (user_add_books.equalsIgnoreCase("FINISH"))// close when user types finish
                    {
                        break;
                    }
                    boolean found = false;

                    for (int i = 0; i < books.length; i++) {
                        if (user_add_books.equalsIgnoreCase(books[i].Book_name)) {
                            found = true;

                            if (books[i].stock_left == 0) {
                                System.out.println(books[i].Book_name + " is Out of stock");
                                System.out.println();
                                break;
                            }

                            mycart.addBook(books[i]);// add user books
                            System.out.println();
                        }

                    }
                    if (!found) {
                        System.out.println(user_add_books + " is not available in the store");

                    }
                }

            }

            if (user_input == 2) // view update cart
            {
                mycart.viewCart();

            }

            if (user_input == 3) { // delete books from cart
                System.out.println("Enterbook name to delete");
                String deleteBooks = sc.nextLine();

                mycart.deleteBook(deleteBooks);

            }

            if (user_input == 4) { // checkout bill for user
                mycart.checkout();
                break;

            }

        }

    }

}
