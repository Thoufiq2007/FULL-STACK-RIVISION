
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Library library = new Library();

    public static void main(String[] args) {

        int choice;

        while (true) {

            System.out.println("\n========================================");
            System.out.println("          LIBRARY MANAGEMENT SYSTEM");
            System.out.println("========================================");

            System.out.println("1. Add Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Register Student");
            System.out.println("5. Register Faculty");
            System.out.println("6. Display All Members");
            System.out.println("7. Search Member");
            System.out.println("8. Issue Book");
            System.out.println("9. Return Book");
            System.out.println("10. Display Issued Books");
            System.out.println("11. Generate Library Report");
            System.out.println("12. Exit");

            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addBook();
                    break;

                case 2:
                    library.displayBooks();
                    break;

                case 3:
                    System.out.print("Enter Book ID: ");
                    int bookId = sc.nextInt();
                    library.searchBook(bookId);
                    break;

                case 4:
                    registerStudent();
                    break;

                case 5:
                    registerFaculty();
                    break;

                case 6:
                    library.displayMembers();
                    break;

                case 7:
                    System.out.print("Enter Member ID: ");
                    int memberId = sc.nextInt();
                    library.searchMember(memberId);
                    break;

                case 8:
                    System.out.print("Enter Member ID: ");
                    int issueMemberId = sc.nextInt();

                    System.out.print("Enter Book ID: ");
                    int issueBookId = sc.nextInt();

                    library.issueBook(issueBookId, issueMemberId);
                    break;

                case 9:
                    System.out.print("Enter Member ID: ");
                    int returnMemberId = sc.nextInt();

                    System.out.print("Enter Book ID: ");
                    int returnBookId = sc.nextInt();

                    library.returnBook(returnBookId, returnMemberId);
                    break;

                case 10:
                    System.out.println("1. Display All Issue Records");
                    System.out.println("2. Display Active Issue Records");

                    System.out.print("Enter Your Choice: ");
                    int issueChoice = sc.nextInt();

                    if (issueChoice == 1) {
                        library.displayIssuedBooks(false);
                    } else if (issueChoice == 2) {
                        library.displayIssuedBooks(true);
                    } else {
                        System.out.println("Invalid Choice!");
                    }
                    break;

                case 11:
                    library.generateLibraryReport();
                    break;

                case 12:
                    System.out.println("Thank You for Using Library Management System!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice! Please Try Again.");
            }
        }
    }

    public static void addBook() {

        System.out.println("========== ADD BOOK ==========");

        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Book Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        System.out.print("Enter Category: ");
        String category = sc.nextLine();

        System.out.print("Enter Available Copies: ");
        int copies = sc.nextInt();

        if (copies < 0) {
            System.out.println("Copies cannot be negative!");
            return;
        }

        Book book = new Book(id, name, author, category, copies);

        library.addBook(book);
    }

    public static void registerStudent() {

        System.out.println("========== REGISTER STUDENT ==========");

        int id = library.generateMemberId();

        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Contact Number: ");
        String contact = sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Year: ");
        int year = sc.nextInt();

        Student student = new Student(
            id, name, contact, department, year
        );

        library.registerMember(student);
    }

    public static void registerFaculty() {

        System.out.println("========== REGISTER FACULTY ==========");

        int id = library.generateMemberId();

        sc.nextLine();

        System.out.print("Enter Faculty Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Contact Number: ");
        String contact = sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Designation: ");
        String designation = sc.nextLine();

        Faculty faculty = new Faculty(
            id, name, contact, department, designation
        );

        library.registerMember(faculty);
    }
}

class Book {

    private int bookId;
    private String bookName;
    private String author;
    private String category;
    private int availableCopies;

    public Book(int bookId, String bookName, String author,
                String category, int availableCopies) {

        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.category = category;

        setAvailableCopies(availableCopies);
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setAvailableCopies(int availableCopies) {

        if (availableCopies >= 0) {
            this.availableCopies = availableCopies;
        } else {
            throw new IllegalArgumentException(
                "Available copies cannot be negative!"
            );
        }
    }

    public void displayBookDetails() {

        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Category: " + category);
        System.out.println("Available Copies: " + availableCopies);
        System.out.println("--------------------------------");
    }
}

class LibraryMember {

    private int memberId;
    private String memberName;
    private String contactNumber;

    public LibraryMember(int memberId, String memberName,
                         String contactNumber) {

        this.memberId = memberId;
        this.memberName = memberName;
        this.contactNumber = contactNumber;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void displayMemberDetails() {

        System.out.println("Member ID: " + memberId);
        System.out.println("Member Name: " + memberName);
        System.out.println("Contact Number: " + contactNumber);
    }
}

class Student extends LibraryMember {

    private String department;
    private int year;

    public Student(int memberId, String memberName,
                   String contactNumber, String department, int year) {

        super(memberId, memberName, contactNumber);

        this.department = department;
        this.year = year;
    }

    @Override
    public void displayMemberDetails() {

        super.displayMemberDetails();

        System.out.println("Member Type: Student");
        System.out.println("Department: " + department);
        System.out.println("Year: " + year);
        System.out.println("--------------------------------");
    }
}

class Faculty extends LibraryMember {

    private String department;
    private String designation;

    public Faculty(int memberId, String memberName,
                   String contactNumber, String department,
                   String designation) {

        super(memberId, memberName, contactNumber);

        this.department = department;
        this.designation = designation;
    }

    @Override
    public void displayMemberDetails() {

        super.displayMemberDetails();

        System.out.println("Member Type: Faculty");
        System.out.println("Department: " + department);
        System.out.println("Designation: " + designation);
        System.out.println("--------------------------------");
    }
}

class IssueRecord {

    private int issueId;
    private int bookId;
    private int memberId;
    private String bookName;
    private boolean active;

    public IssueRecord(int issueId, int bookId,
                       int memberId, String bookName) {

        this.issueId = issueId;
        this.bookId = bookId;
        this.memberId = memberId;
        this.bookName = bookName;
        this.active = true;
    }

    public int getIssueId() {
        return issueId;
    }

    public int getBookId() {
        return bookId;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getBookName() {
        return bookName;
    }

    public boolean isActive() {
        return active;
    }

    public void markReturned() {
        active = false;
    }
}

abstract class LibraryOperations {

    public abstract void addBook(Book book);

    public abstract void displayBooks();

    public abstract void issueBook(int bookId, int memberId);

    public abstract void returnBook(int bookId, int memberId);
}

class Library extends LibraryOperations {

    private ArrayList<Book> books = new ArrayList<>();

    private ArrayList<LibraryMember> members = new ArrayList<>();

    private HashMap<Integer, Book> bookMap = new HashMap<>();

    private LinkedHashMap<Integer, IssueRecord> issueRecords =
            new LinkedHashMap<>();

    private HashSet<Integer> issuedBookIds = new HashSet<>();

    private int nextMemberId = 1001;

    private int nextIssueId = 1;

    public int generateMemberId() {
        return nextMemberId++;
    }

    @Override
    public void addBook(Book book) {

        if (bookMap.containsKey(book.getBookId())) {
            System.out.println("Book ID already exists!");
            return;
        }

        books.add(book);
        bookMap.put(book.getBookId(), book);

        System.out.println("Book Added Successfully!");
    }

    @Override
    public void displayBooks() {

        System.out.println("========== ALL BOOKS ==========");

        if (books.isEmpty()) {
            System.out.println("No Books Available!");
            return;
        }

        int unavailable = 0;

        for (Book book : books) {

            book.displayBookDetails();

            if (book.getAvailableCopies() == 0) {
                unavailable++;
            }
        }

        System.out.println("Total Books: " + books.size());
        System.out.println("Books with Zero Copies: " + unavailable);
    }

    public void searchBook(int bookId) {

        Book book = bookMap.get(bookId);

        if (book == null) {
            System.out.println("Book Not Found!");
            return;
        }

        System.out.println("Book Found!");
        book.displayBookDetails();
    }

    public void registerMember(LibraryMember member) {

        for (LibraryMember existing : members) {

            if (existing.getMemberId() == member.getMemberId()) {
                System.out.println("Member ID Already Exists!");
                return;
            }
        }

        members.add(member);

        System.out.println("Member Registered Successfully!");
        System.out.println("Generated Member ID: " + member.getMemberId());
    }

    public void displayMembers() {

        System.out.println("========== REGISTERED MEMBERS ==========");

        if (members.isEmpty()) {
            System.out.println("No Members Registered!");
            return;
        }

        for (LibraryMember member : members) {
            member.displayMemberDetails();
        }

        System.out.println("Total Members: " + members.size());
    }

    public void searchMember(int memberId) {

        for (LibraryMember member : members) {

            if (member.getMemberId() == memberId) {

                System.out.println("Member Found!");
                member.displayMemberDetails();

                return;
            }
        }

        System.out.println("Member Not Found!");
    }

    private LibraryMember findMember(int memberId) {

        for (LibraryMember member : members) {

            if (member.getMemberId() == memberId) {
                return member;
            }
        }

        return null;
    }

    @Override
    public void issueBook(int bookId, int memberId) {

        LibraryMember member = findMember(memberId);

        if (member == null) {
            System.out.println("Member Not Found!");
            return;
        }

        Book book = bookMap.get(bookId);

        if (book == null) {
            System.out.println("Book Not Found!");
            return;
        }

        if (book.getAvailableCopies() <= 0) {
            System.out.println("No Copies Available!");
            return;
        }

        book.setAvailableCopies(book.getAvailableCopies() - 1);

        IssueRecord record = new IssueRecord(
            nextIssueId,
            bookId,
            memberId,
            book.getBookName()
        );

        issueRecords.put(nextIssueId, record);

        issuedBookIds.add(bookId);

        nextIssueId++;

        System.out.println("Book Issued Successfully!");
        System.out.println("Member: " + member.getMemberName());
        System.out.println("Book: " + book.getBookName());
        System.out.println("Available Copies: " + book.getAvailableCopies());
    }

    @Override
    public void returnBook(int bookId, int memberId) {

        Book book = bookMap.get(bookId);

        if (book == null) {
            System.out.println("Book Not Found!");
            return;
        }

        IssueRecord activeRecord = null;

        for (IssueRecord record : issueRecords.values()) {

            if (record.getBookId() == bookId &&
                record.getMemberId() == memberId &&
                record.isActive()) {

                activeRecord = record;
                break;
            }
        }

        if (activeRecord == null) {
            System.out.println("No Active Issue Record Found!");
            return;
        }

        activeRecord.markReturned();

        book.setAvailableCopies(book.getAvailableCopies() + 1);

        boolean anotherActiveIssue = false;

        for (IssueRecord record : issueRecords.values()) {

            if (record.getBookId() == bookId && record.isActive()) {
                anotherActiveIssue = true;
                break;
            }
        }

        if (!anotherActiveIssue) {
            issuedBookIds.remove(bookId);
        }

        System.out.println("Book Returned Successfully!");
        System.out.println("Book Name: " + book.getBookName());
        System.out.println("Available Copies: " + book.getAvailableCopies());
    }

    public void displayIssuedBooks(boolean activeOnly) {

        System.out.println("========== ISSUED BOOK RECORDS ==========");

        boolean found = false;

        for (Map.Entry<Integer, IssueRecord> entry : issueRecords.entrySet()) {

            IssueRecord record = entry.getValue();

            if (activeOnly && !record.isActive()) {
                continue;
            }

            found = true;

            LibraryMember member = findMember(record.getMemberId());

            System.out.println("Issue ID: " + record.getIssueId());
            System.out.println("Member ID: " + record.getMemberId());

            if (member != null) {
                System.out.println("Member Name: " + member.getMemberName());
            }

            System.out.println("Book ID: " + record.getBookId());
            System.out.println("Book Name: " + record.getBookName());

            if (record.isActive()) {
                System.out.println("Status: Issued");
            } else {
                System.out.println("Status: Returned");
            }

            System.out.println("--------------------------------");
        }

        if (!found) {
            System.out.println("No Matching Issue Records Found!");
        }
    }

    public void generateLibraryReport() {

        System.out.println("========== LIBRARY STATISTICS ==========");

        int totalCopies = 0;
        int unavailableBooks = 0;
        int activeIssues = 0;

        for (Book book : books) {

            totalCopies += book.getAvailableCopies();

            if (book.getAvailableCopies() == 0) {
                unavailableBooks++;
            }
        }

        for (IssueRecord record : issueRecords.values()) {

            if (record.isActive()) {
                activeIssues++;
            }
        }

        System.out.println("Total Books Registered: " + books.size());
        System.out.println("Total Registered Members: " + members.size());
        System.out.println("Total Active Issue Records: " + activeIssues);
        System.out.println("Total Available Book Copies: " + totalCopies);
        System.out.println("Books Currently Unavailable: " + unavailableBooks);
    }
}