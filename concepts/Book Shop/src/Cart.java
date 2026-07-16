
class Cart {

    // as of now only a cart can have 5 books
    Book cart[] = new Book[5];
    int quantity[] = new int[5];
    int CartCounter = 0;
    int total_books = 0;
    float totalPrice = 0;

    // add user books in cart
    void addBook(Book b) {

        // if cart becomes 5 then cart s full
        if (total_books == 5) {
            System.out.println("You Cart is full,you can only add 5 books");
            System.out.println("Please delete book(s) to create space");
            System.out.println();
            return;

        }

        // check if book aready exists
        for (int i = 0; i < CartCounter; i++) {
            if (cart[i].Book_name.equalsIgnoreCase(b.Book_name)) {
                quantity[i]++;
                total_books++;

                totalPrice = totalPrice + b.Price_of_the_book;

                b.stock_left--;

                System.out.println("Quantity of " + cart[i].Book_name + " Updated");
                System.out.println(cart[i].Book_name + " Quantity : " + quantity[i]);
                return;
            }

        }

        cart[CartCounter] = b;
        System.out.println("Added " + cart[CartCounter].Book_name + " to the cart");
        quantity[CartCounter] = 1;
        CartCounter++;
        total_books++;

        totalPrice = totalPrice + b.Price_of_the_book;
        b.stock_left--;

    }

    // user can view his cart
    void viewCart() {

        if (CartCounter == 0) {
            System.out.println("Cart is Empty");
            return;
        }

        System.out.println("Your Updated Cart :");

        System.out.printf(
                "%-20s %-15s %-15s\n",
                "Book Name",
                "Quantity",
                "Price");

        System.out.println("------------------------------------------------");

        for (int i = 0; i < CartCounter; i++) {
            float price = quantity[i] * cart[i].Price_of_the_book;

            System.out.printf(
                    "%-20s %-15d %-15.2f\n",
                    cart[i].Book_name,
                    quantity[i],
                    price);
        }
        System.out.println(
                "\nTotal Bill :" + totalPrice);

        System.out.println();
    }

    // delete books from cart according to user
    void deleteBook(String delete_book) {

        if (CartCounter == 0) {
            System.out.println("Cart is Empty");
            return;
        }

        boolean found = false;

        for (int i = 0; i < CartCounter; i++) {
            if (cart[i].Book_name.equalsIgnoreCase(delete_book)) {
                found = true;

                quantity[i]--;

                total_books--;

                totalPrice = totalPrice - cart[i].Price_of_the_book;

                cart[i].stock_left++;

                System.out.println(
                        "1 quantity of " +
                                cart[i].Book_name +
                                " removed");

                if (quantity[i] == 0) {

                    for (int j = 0; j < CartCounter - 1; j++) {
                        cart[j] = cart[j + 1];
                        quantity[j] = quantity[j + 1];
                    }

                    cart[CartCounter - 1] = null;
                    quantity[CartCounter - 1] = 0;

                    CartCounter--;
                }
                return;
            }
        }
        if (!found) {
            System.out.println("item nt found in cart");
        }

    }

    // checkout bill for user
    void checkout() {

        if (CartCounter == 0) {
            System.out.println("Cart is empty ,can't checkout");
            return;
        }

        System.out.println("Checkout Bill with update books added to cart:");
        System.out.println();
        System.out.printf(
                "%-20s %-15s %-15s %-13s\n",
                "BOOKS ADDED",
                "INDIVIDUAL PRICE(Rs)",
                "  QUANTITY",
                "  TOTAL QUANTITY PRICE");

        System.out.println("---------------------------------------------------------------------------------");

        for (int i = 0; i < CartCounter; i++) {

            System.out.printf(
                    "%-20s %-25.2f %-20d %-18.2f\n",
                    cart[i].Book_name,
                    cart[i].Price_of_the_book,
                    quantity[i],
                    (cart[i].Price_of_the_book * quantity[i]));

        }
        System.out.println();
        System.out.println();
        System.out.println("                                                       Total Bill : " + totalPrice);

    }

}
