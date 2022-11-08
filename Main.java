import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    
    static void admin()
    {
    System.out.println("\t1.AddBooks\n\t2.EditBooks\n\t3.ViewBooks\n\t4.Exit()");
                    System.out.print("Choose one of the above options : ");
                    temp = new Scanner(System.in);
                    int opt = temp.nextInt();
                    if (opt > 4 && opt < 0) {
                        System.out.println("Choose a VALID Option");
                        exit(0);
                    }
                    switch(opt){
                        case 1 :
                            System.out.print("Name of the book   : ");
                            temp = new Scanner(System.in);
                            String bookName = temp.next();
                            System.out.print("Writer of the book : ");
                            temp = new Scanner(System.in);
                            String writerName = temp.next();
                            AddBooks book = new AddBooks(bookName,writerName);
                            book.BookData();
                            if(book.count == 0) {
                                book.view();
                            }
                            break;
                        case 2 :
                            System.out.print("Name of the book   : ");
                            temp = new Scanner(System.in);
                            bookName = temp.next();
                            System.out.print("New Name of the book   : ");
                            temp = new Scanner(System.in);
                            String newBookName = temp.next();
                            System.out.print(" New writer of the book : ");
                            temp = new Scanner(System.in);
                            String newWriterName = temp.next();
                            EditBooks edit = new EditBooks(bookName,newBookName,newWriterName);
                            edit.EditData();
                            edit.view();
                            break;
                        case 3 :
                            System.out.println("***** This is the List of Books *****");
                        case 4 :
                            System.out.println("Thanks for Using our softWare ! :-)");
                            exit(0);
                            break;
                    }
                    break;
                case 2 :
                    System.out.print(" Welcome Admin Enter your Username: ");
                    temp = new Scanner(System.in);
                    name = temp.next();
                    
                    System.out.print(" Enter your Password: ");
                    System.out.println("\n\t1.AddLibrarian\n\t2.EditLibrarian\n\t3.ViewLibrarian\n\t4.Exit");
                    System.out.println("Choose one of the option from above : ");
                    temp = new Scanner(System.in);
                    int choice = temp.nextInt();
                    if (choice > 4 && choice < 0) {
                        System.out.println("Choose a VALID Option");
                        exit(0);
                    }
                    switch(choice) {
                        case 1 :
                            System.out.print("Name of the Librarian        : ");
                            temp = new Scanner(System.in);
                            String LibName = temp.next();
                            System.out.print("Department of the Librarian  : ");
                            temp = new Scanner(System.in);
                            String LibDepart = temp.next();
                            AddLibrarian librarian = new AddLibrarian(LibName,LibDepart);
                            librarian.LibrarianData();
                            if(librarian.count == 0) {
                                librarian.View();
                            }
                            break;
                        case 2 :
                            System.out.print("Name of the Librarian                     : ");
                            temp = new Scanner(System.in);
                            LibName = temp.next();
                            System.out.print("Name of the Librarian to be change        : ");
                            temp = new Scanner(System.in);
                            String newLibName = temp.next();
                            System.out.print("Department of the Librarian               : ");
                            temp = new Scanner(System.in);
                            LibDepart = temp.next();
                            System.out.print("Department of the Librarian to be change  : ");
                            temp = new Scanner(System.in);
                            String newLibDepart = temp.next();
                            EditLibrarian librarianNew = new EditLibrarian(LibName,newLibName,newLibDepart);
                            librarianNew.EditData();
                            librarianNew.View();
                            break;
                        case 3 :
                            System.out.println("**** This is the Librarian data ******");
                        case 4 :
                            System.out.println("Thanks for Using our softWare ! :-)");
                            exit(0);
                            break;

                    }}
    public static void main(String[] args) {
        System.out.println("************* Welcome *************");
        System.out.println("*** Choose one of the options ***");
        System.out.println("\t1.Librarian\n\t2.Admin");
        System.out.print(" Enter your option : ");
        Scanner temp = new Scanner(System.in);
        int option = temp.nextInt();
        if (option > 2 && option < 0) {
            System.out.println("Choose a VALID Option");
            exit(0);
        }
        else{
            switch(option){
                case 1 :
                    Scanner input = new Scanner(System.in);
                    
                    String username, password;
                    
                    System.out.print("Enter the username:");
                    username=input.nextLine();
                    
                    System.out.print("Enter the Password:");
                    password=input.nextLine();
                    
                    if((username.equals("Rohith")) && (password.equals("623626")))
                    {System.out.print("Welcome Admin");
                     admin();
                    }else {
                    System.out.print("You have entered the wrong username or password ");
                    }
                    
            }
        }
    }
}
class AddBooks extends abstractAddBooks{

    public int count = 0;
    public AddBooks(String bookName, String writerName) {
        super(bookName, writerName);
    }

    public void BookData(){
        int i = 0;
        while (!this.data[i][0].equals("")) {
            if (this.data[i][0].equals(this.BookName)) {
                if (this.data[i][1].equals(this.WriterName)) {
                    this.count += 1;
                    System.out.println("The Book is Already available in the list oops ! :-)");
                    break;
                } else {
                    System.out.println("Are you Sure about the writer");
                }
            }
            if (this.data[i + 1][0].equals("")) {
                this.data[i + 1][0] = this.BookName;
                this.data[i + 1][1] = this.WriterName;
                System.out.println("The New Book is added");
                break;
            }
            i++;
        }
    }

    public void view() {
        int i = 0;
        System.out.println("\n*********** The List of the Books is below ***********\n");
        while (!this.data[i][0].equals("")) {
            System.out.print(this.data[i][0]);
            System.out.print(" - ");
            System.out.println(this.data[i][1]);
            i++;
        }
        System.out.println("\n");
    }
}

class EditBooks extends abstractEditBooks{

    public EditBooks(String bookName, String newBookName, String newWriterName) {
        super(bookName, newBookName, newWriterName);
    }

    @Override
    void EditData() {
        int count = 0, i = 0;
        while (!this.data[i][0].equals("")) {
            if (this.data[i][0].equals(this.BookName)) {
                this.data[i][0] = this.newBookName;
                this.data[i][1] = this.newWriterName;
                System.out.println("The data has been Edited Sucessfully");
                break;
            }
            i++;
        }
    }

    @Override
    void view() {
        int i = 0;
        System.out.println("\n*********** The List of the Books is below ***********\n");
        while (!this.data[i][0].equals("")) {
            System.out.print(this.data[i][0]);
            System.out.print(" - ");
            System.out.println(this.data[i][1]);
            i++;
        }
    }
}

abstract class abstractAddBooks extends Librarian_Add {

    public abstractAddBooks(String bookName, String writerName) {
        super(bookName, writerName);
    }

    abstract void BookData();

    abstract void view();
}

abstract class abstractEditBooks extends Librarian_Edit{

    public abstractEditBooks(String bookName, String newBookName, String newWriterName) {
        super(bookName, newBookName, newWriterName);
    }

    abstract void EditData();

    abstract void view();

}

class AddLibrarian extends abstractAddLibrarian{

    public int count = 0;

    public AddLibrarian(String name, String department) {
        super(name, department);
    }

    @Override
    void LibrarianData() {
        int i = 0;
        while (!this.Data[i][0].equals("")) {
            if (this.Data[i][0].equals(this.Name)) {
                if (this.Data[i][1].equals(this.department)) {
                    this.count += 1;
                    System.out.println("The Librarian is Already available in the list oops ! :-)");
                    break;
                } else {
                    System.out.println("Are you Sure about the writer");
                }
            }
            if (this.Data[i + 1][0].equals("")) {
                this.Data[i + 1][0] = this.Name;
                this.Data[i + 1][1] = this.department;
                System.out.println("The New Librarian is added");
                break;
            }
            i++;
        }
    }

    @Override
    void View() {
        int i = 0;
        System.out.println("\n*********** The List of the Librarians is below ***********\n");
        while (!this.Data[i][0].equals("")) {
            System.out.print(this.Data[i][0]);
            System.out.print(" - ");
            System.out.println(this.Data[i][1]);
            i++;
        }
    }
}

class EditLibrarian extends abstractEditLibrarian{

    public EditLibrarian(String libName, String newLibName, String newDepartment) {
        super(libName, newLibName, newDepartment);
    }

    @Override
    void EditData() {
        int count = 0, i = 0;
        while (!this.Data[i][0].equals("")) {
            if (this.Data[i][0].equals(this.LibName)) {
                this.Data[i][0] = this.newLibName;
                this.Data[i][1] = this.newDepartment;
                System.out.println("The data has been Edited");
                break;
            }
            i++;
        }
    }

    @Override
    void View() {
        int i = 0;
        System.out.println("\n*********** The List of the Librarians is below ***********\n");
        while (!this.Data[i][0].equals("")) {
            System.out.print(this.Data[i][0]);
            System.out.print(" - ");
            System.out.println(this.Data[i][1]);
            i++;
        }
    }
}

abstract class abstractEditLibrarian extends Admin_Edit{

    public abstractEditLibrarian(String libName, String newLibName, String newDepartment) {
        super(libName, newLibName, newDepartment);
    }

    abstract void EditData();

    abstract void View();
}

abstract class abstractAddLibrarian extends Admin_Add{

    public abstractAddLibrarian(String name, String department) {
        super(name, department);
    }

    abstract void LibrarianData();

    abstract void View();
}
