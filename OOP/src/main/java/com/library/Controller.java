package com.library;

import com.library.model.Book;
import com.library.model.DVD;
import com.library.model.Magazine;
import com.library.service.BookService;
import com.library.service.DVDService;
import com.library.service.MagazinesService;

import java.util.Scanner;

public class Controller {
    public static BookService bookService = new BookService();
    public static DVDService dvdService = new DVDService();
    public static MagazinesService magazinesService = new MagazinesService();

    public static void main(String[] args) {
        startup();
        while (true)
        {
            display();
        }
    }

    private static void startup() {
        Book book1 = new Book(0,"The first head of java ","pop" , 2000, "43245524","el shourok");
        Book book2 = new Book(0,"introduction to algo ","alice" , 1999, "43245524","cairo");
        Book book3 = new Book(0,"cracking the coding interview ","mark" , 1986, "43245524","el fajr");
        Book book4 = new Book(0,"it's end with us ","lol forget" , 2001, "43245524","sohag");
        DVD dvd1 = new DVD(0,"sorry","mohran",2000,"lol");
        DVD dvd2 = new DVD(0,"idk","mohamed",2000,"lol");
        DVD dvd3 = new DVD(0,"forget","ahmed",2000,"lol");
        Magazine meg1 = new Magazine(0,"mickky","mo",2022 ,"forget .inf");
        Magazine meg2 = new Magazine(0,"dummy","mohamed",2022 ,"globle .com");
        Magazine meg3 = new Magazine(0,"linux fan","mo",2000 ,"linux .net");
        Magazine meg4 = new Magazine(0,"disordering","mohran",2024 ,"orders .net");


        bookService.add(book1);
        bookService.add(book2);
        bookService.add(book3);
        bookService.add(book4);
        dvdService.add(dvd1);
        dvdService.add(dvd2);
        dvdService.add(dvd3);
        magazinesService.add(meg1);
        magazinesService.add(meg2);
        magazinesService.add(meg3);
        magazinesService.add(meg4);


    }

    private static void display() {
        Scanner sc = new Scanner(System.in);
        System.out.println("List the books:                                              1");
        System.out.println("List the dvds:                                               2");
        System.out.println("List the magazines:                                          3");
        System.out.println("add book:                                                    4");
        System.out.println("add dvd:                                                     5");
        System.out.println("add magazines:                                               6");
        System.out.println("update book:                                                 7");
        System.out.println("update dvd:                                                  8");
        System.out.println("update magazines:                                            9");
        System.out.println("delete book:                                                 10");
        System.out.println("delete dvd:                                                  11");
        System.out.println("delete magazines:                                            12");
        System.out.println("search for the book it is available or not by title :        13");
        System.out.println("search for the book it is available or not by title :        14");
        System.out.println("search for the book it is available or not by title :        15");

        System.out.println("Enter the number :");
        Integer dis = sc.nextInt();
        String wait;
        switch (dis)
        {
            case 1:
                System.out.println("Books : ");
                for(Book tmp  : bookService.books)
                {
                    System.out.println("        "+tmp.toString());
                }
                System.out.println("=========================================");
                wait = sc.next();
                break;
            case 2:
                System.out.println("DVDs : ");
                for(DVD tmp  : dvdService.dvds)
                {
                    System.out.println("        "+tmp.toString());
                }
                System.out.println("=========================================");
                wait = sc.next();
                break;
            case 3:
                System.out.println("DVDs : ");
                for(Magazine tmp  : magazinesService.magazines)
                {
                    System.out.println("        "+tmp.toString());
                }
                System.out.println("=========================================");
                wait = sc.next();
                break;
            case 4:

                Book book = enterTheBook();
                bookService.add(book);
                System.out.println("the mission is done ");
                wait = sc.next();
                break;
            case 5:
                DVD dvd = enterTheDVD();
                dvdService.add(dvd);
                System.out.println("the mission is done ");
                wait = sc.next();
                break;
            case 6:
                Magazine magazine = enterTheMagazine();
                magazinesService.add(magazine);
                System.out.println("the mission is done ");
                wait = sc.next();
                break;
            case 7:
                Book book1 = enterTheUpdateBook();
                System.out.println("the mission is done ");
                wait = sc.next();
                break;
            case 8:
                DVD dvd1 = enterTheUpdateDvD();
                System.out.println("the mission is done ");
                wait = sc.next();
                break;
            case 9:
                Magazine mag = enterTheUpdateMagazine();
                System.out.println("the mission is done ");
                wait = sc.next();

                break;
            case 10:
                System.out.println("enter the id : ");
                int theId = sc.nextInt();
                Book book2 = bookService.readById(theId );
                bookService.delete(book2);

                break;
            case 11:

                System.out.println("enter the id : ");
                int thId = sc.nextInt();
                DVD dvd2 = dvdService.readById(thId );
                dvdService.delete(dvd2);
                break;
            case 12:
                System.out.println("enter the id : ");
                int id = sc.nextInt();
                Magazine meg = magazinesService.readById(id);
                magazinesService.delete(meg);
                break;
            case 13:
                System.out.println("enter the name of the book you want to check if available or not : ");
                String nameOfTheBook = sc.next();
                Boolean bookaAvailable = bookService.isAvailable(nameOfTheBook);
                if(bookaAvailable)
                {
                    System.out.println("the Book is available in the library");
                }
                else
                {
                    System.out.println("sorry, next time we will try to catch you needs");
                }
                break;
            case 14:
                System.out.println("enter the name of the book you want to check if available or not : ");
                String nameOfTheDvD = sc.next();
                Boolean dvdAvailable = dvdService.isAvailable(nameOfTheDvD);
                if(dvdAvailable)
                {
                    System.out.println("the DVD is available in the library");
                }
                else
                {
                    System.out.println("sorry, next time we will try to catch you needs");
                }
                break;
            case 15:
                System.out.println("enter the name of the magazine you want to check if available or not : ");
                String nameOfTheMagazine = sc.next();
                Boolean magazineAvailable = magazinesService.isAvailable(nameOfTheMagazine);
                if(magazineAvailable)
                {
                    System.out.println("the Magazine is available in the library");
                }
                else
                {
                    System.out.println("sorry, next time we will try to catch you needs");
                }
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }

    }

    private static Magazine enterTheUpdateMagazine() {
        Scanner sc = new Scanner(System.in);

        String title;
        String author;
        int publicationYear;
        String organizations;
        System.out.println("enter the magazine details in row (int id, String title, String author, int publicationYear, String organizations )");

        int id = sc.nextInt();

        title=sc.next();
        author = sc.next();
        publicationYear = sc.nextInt();
        organizations = sc.next();
        Magazine meg =  new Magazine(0,title,author,publicationYear,organizations);
        boolean isDone =   magazinesService.update(meg);
        if(isDone)
            System.out.println("the mission is done"  );
        else
            System.out.println("u missed up ");


        return meg;

    }

    private static DVD enterTheUpdateDvD() {
        Scanner sc = new Scanner(System.in);



        String title;
        String author;
        int publicationYear;
        String pand;
        System.out.println("enter update dvd  details in row (int id, String title, String author, int publicationYear, String pand )");

        int id = sc.nextInt();

        title=sc.next();
        author = sc.next();
        publicationYear = sc.nextInt();
        pand=sc.next();
        DVD dvd= new DVD(id,title,author,publicationYear,pand);
        boolean isDone =   dvdService.update(dvd);
        if(isDone)
            System.out.println("the mission is done"  );
        else
            System.out.println("u missed up ");


        return dvd;
    }

    private static Book enterTheUpdateBook() {
        Scanner sc = new Scanner(System.in);

        int id;
        String title;
        String author;
        int publicationYear;
        String isbn;
        String publisher;
        System.out.println("enter update for book details in row ( int id, String title, String author, int publicationYear, String isbn, String publisher)");
        id = sc.nextInt();
        title=sc.next();
        author = sc.next();
        publicationYear = sc.nextInt();
        isbn = sc.next();
        publisher=sc.next();

        Book book =  new Book(id,title,author,publicationYear,isbn,publisher   );
        boolean isDone =   bookService.update(book);
        if(isDone)
            System.out.println("the mission is done"  );
        else
            System.out.println("u missed up ");


        return book;
    }

    private static Magazine enterTheMagazine() {

        Scanner sc = new Scanner(System.in);

        String title;
        String author;
        int publicationYear;
        String organizations;
        System.out.println("enter the magazine details in row ( String title, String author, int publicationYear, String organizations )");

        title=sc.next();
        author = sc.next();
        publicationYear = sc.nextInt();
        organizations = sc.next();
        return  new Magazine(0,title,author,publicationYear,organizations);

    }

    private static DVD enterTheDVD() {
        Scanner sc = new Scanner(System.in);



        String title;
        String author;
        int publicationYear;
        String pand;
        System.out.println("enter the dvd details in row ( String title, String author, int publicationYear, String pand )");

        title=sc.next();
        author = sc.next();
        publicationYear = sc.nextInt();
        pand=sc.next();
        return new DVD(0,title,author,publicationYear,pand);
    }

    private static Book enterTheBook() {
        Scanner sc = new Scanner(System.in);


        String title;
        String author;
        int publicationYear;
        String isbn;
        String publisher;
        System.out.println("enter the book details in row ( String title, String author, int publicationYear, String isbn, String publisher)");

        title=sc.next();
        author = sc.next();
        publicationYear = sc.nextInt();
        isbn = sc.next();
        publisher=sc.next();
        return new Book(0,title,author,publicationYear,isbn,publisher   );
    }
}
