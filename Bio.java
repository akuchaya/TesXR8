package BUKUH;
public class Bio extends TextBook{
    String about;

    public void setAbout(String about){
        this.about = about;
    }

    
    public String getAbout(){
        return this.about;
    }


    public Bio(){
        super();
        about = "Kosong";
    }

    public Bio(String about, String subject, String title, int year, double price){
        super(subject, title, year,price);
        this.about = about;
    }

    public void uraikan(){
        System.out.println(about);
    }
    
}