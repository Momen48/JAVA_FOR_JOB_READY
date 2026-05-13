public class Library {
    private String title;
    private boolean issued;

    public Library(String title){
        this.title = title;
        this.issued = false;
    }
    void  issueBook(){
        if(!issued){
            issued = true;
            System.out.println("Book " + title + " is issued");
        }
    }
    void returnBook(){
        if(issued){
            issued = false;
            System.out.println("Book " + title + " is returned");
        }
    }

    void display(){
        System.out.println(title + " is " + (issued ? "issued" : "not issued"));
    }
}
