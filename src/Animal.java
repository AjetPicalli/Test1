import java.time.Year;

public class Animal {
   public int vitiLindjes;
   public String tipi;
   public String ngjyra;


   public Animal(int vitiLindjes, String tipi, String ngjyra){
       this.vitiLindjes=vitiLindjes;
       this.tipi=tipi;
       this.ngjyra=ngjyra;
   }

    public int getMosha() {
       int currentYear=Year.now().getValue();

        return currentYear -vitiLindjes;
    }


    public static  void main(String[] args) {
        Animal qeni=new Animal(2019,"qeni","e kuqe");
        Animal macja= new Animal(2000,"mace", "e zeze");
        if (qeni.tipi.equals(macja.tipi)){
            System.out.println("jan te njejte");
        }else System.out.println("jane te ndryshme");

        if (qeni.getMosha()> macja.getMosha()){
            System.out.println("qeni eshte grande");
        }else System.out.println("macja eshte grande");

        if (qeni.ngjyra.equals(macja.ngjyra)){
            System.out.println("po");
        }else System.out.println("jo");


    }
}
