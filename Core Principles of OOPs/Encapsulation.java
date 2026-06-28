/*
You are tasked to design a class Book to manage the book details in a library. The class should contain the following specifications :

Attributes :

title (list<string>) : The title of the book (public).
author (list<string>) : The author of the book (public)
isAvailable (list<Boolean>) : The availability status of the book (private).
Methods :

Parameterised constructor to initialize the title, author, isAvaialble list.
borrowBook(string bookName) : If the availability status for book 'bookName' is true then the book can be borrowed, Once borrowed mark its status as false. If availability status for book 'bookname' is false then the book is already borrowed by some user and cannot be borrowed until its returned, so print "Book is not available.".
returnBook (string bookName) : The book with bookName is returned and should be marked as available by setting its available flag to true.
getAvailability (string bookName) : Prints the availability status of the book with name 'bookName' (true for available , false for unavailable).
*/

class Book{
    public List<String> title;
    public List<String> author;
    private List<Boolean> isAvailable;

    public Book(List<String> title, List<String> author, List<Boolean> isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    public void borrowBook(String bookName){
        for(int i=0;i<title.size();i++){
            if(title.get(i).equals(bookName)){
                if(isAvailable.get(i)){
                    isAvailable.set(i, false);
                } else {
                    System.out.println("Book is not available.");
                }
            }
        }
    }
    public void returnBook(String bookName){
        for(int i=0;i<title.size();i++){
            if(title.get(i).equals(bookName)){
                isAvailable.set(i, true);
            }
        }
    }
    public void getAvailability(String bookName){
        for(int i=0;i<title.size();i++){
            if(title.get(i).equals(bookName)){
                System.out.println(isAvailable.get(i));
            }
        }
    
    }
}