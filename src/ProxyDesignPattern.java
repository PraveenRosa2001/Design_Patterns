abstract class Website{
    abstract void display();
}
class RealWebsite extends Website{
    private String filename;
    public RealWebsite(String filename){
        this.filename=filename;
        loadFromURL(filename);
    }
    @Override
    public void display() {
        System.out.println("Displaying the Website of Sabaragamuwa University of SriLanka: " + filename);
    }
    private void loadFromURL(String filename){
        System.out.println("Loading the Sabaragamuwa University Website from external server: " + filename);
    }
}
class ProxyWebsite extends Website{
    private RealWebsite realwebsite;
    private String filename;
    public  ProxyWebsite(String filename){
        this.filename=filename;
    }
    @Override
    public void display() {
    if (realwebsite == null){
        realwebsite=new RealWebsite(filename);
    }
    realwebsite.display();
    }
}
public class ProxyDesignPattern {
    public static void main(String[] args) {
        Website web1=new ProxyWebsite("https://www.sab.ac.lk/");
        web1.display();
        web1.display();
    }
}
