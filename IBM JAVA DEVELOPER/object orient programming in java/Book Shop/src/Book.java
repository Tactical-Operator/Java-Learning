// public class Book {
//     private String title;
//     private String author;
//     private float price;

//     public void setTitle(String title) {
//         this.title = title;
//     }

// 	public void setAuthor(String author) {
//         this.author = author;
//     }

// 	public void setPrice(float price) {
//         this.price = price;
//     }

//     public String getTitle() {
//         return this.title;
//     }

//     public String getAuthor() {
//         return this.author;
//     }

//     public float getPrice() {
//         return this.price;
//     }

//     public String toString() {
//         return "Title - " + this.title + "\nAuthor - "
//             + this.author + "\nPrice - "+ String.format("%.2f", this.price);
//     }

//     	public Book() {
// 		this.title = null;
// 		this.author = null;
// 	}

// 	public Book(String title, String author, float price) {
// 		this.title = title;
// 		this.author = author;
// 		this.price = price;
// 	}

// }

// blueprint about a book
public class Book{ // book must have its own data ,like a book is a seperate real-world thing
    String Book_name;
    String Author;
    int stock_left;
    float  Price_of_the_book;


    public Book(String Book_name,String Author,float Price_of_the_book,int stock_left){
        //initialize object data automatically during object creation.
        // without it yiu have add values to variable manually like object.name,object.author etc
        this.Book_name=Book_name;
        this.Author=Author;
        this.stock_left=stock_left;
        this.Price_of_the_book=Price_of_the_book;
    }

    void display()//display the available books in the store 
    {
        
        System.out.println(
        "\nBook Name   : "+Book_name+
        "\nAuthor Name : "+Author+
        "\nStock left  : "+stock_left+
        "\nPrice       : "+Price_of_the_book);
    }

}