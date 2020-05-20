package kediler;
/*Veteriner kliniğine gelen kedilerin ad, yaş, tür, renk
ve daha önce yaptırdığı aşıları alarak muayene etmek */
class kedi{
    public String ad;
    private int yas;
    int asi;
    public String renk;
    private String tur;

    void asiYap(int asi) {
        //kedi aşı yaptırdı
        this.asi += asi;
    }
      
public kedi() {
   this.yas = 0;
   this.asi = 0;
   this.tur = "Tür yazılmadı";
   this.ad = "Ad yazılmadı";
   this.renk = "Renk yazılmadı";
}
public kedi(String ad,String tur, String renk, int yas, int asi) {
        this.tur = tur;
        this.yas = yas;
        this.asi = asi;
        this.ad= ad;
        this.renk = renk;
    }
public kedi(String ad,String tur, boolean renk, int yas, int asi) {
        this.ad = ad;
        renk = renk;
        this.yas = yas;
        this.asi = asi;
        this.tur = tur;
}
    
public int getYas(){
        return yas; 
    }
public String getTur() {
        return this.tur;
    }
public String getAd() {
        return this.ad;
    }
    public int getAsi() {
        return this.asi;
    }
public  void newKedi(){
        System.out.println("Kedinin adı: " + this.getAd());
        System.out.println("Kedinin yaşı: " + this.getYas());
        System.out.println("Kedinin türü : "+ this.getTur());
        System.out.println("Kedinin yaptırdığı aşı: "+ this.getAsi());
        System.out.println("Kedinin rengi: " +this.renk);
        System.out.println("\n \n");

   }}

class Vankedisi extends kedi{
    private boolean renk;
    public Vankedisi(String ad, int yas, boolean renk, int asi) {
        super(ad,"Van kedisi", renk, yas, asi);
        this.renk = renk;
    }
   
   public boolean getRenk() {
        return this.renk;
    }
   public int getAsi() {
        return this.asi;
    }
     public void setRenk(boolean renk) {
        this.renk = renk;
    }
      public void newKedi() {
                
            System.out.println("Kedinin adı: " + this.getAd());
            System.out.println("Kedinin yaşı: " + this.getYas());
            System.out.println("Kedinin türü : " + this.getTur());

            if(this.getAsi() == 0){
               System.out.println("Kedi hiç aşı yaptırmadı");
            }else{
               System.out.println("Kedinin yaptırdığı aşı: "+ this.getAsi());
            }

        if(this.renk) {
            System.out.println("Kedinin rengi farklıdır ");

        }else {
            System.out.println("Kedinin rengi farklı değildir ");
        }
          System.out.println("\n \n");
      }}
public class kediTest {

    public static void main(String[] args) {
        // main method
        
        
        kedi kedi1 = new  kedi("Garip","Tekir","beyaz",2,3);
                kedi1.asiYap(3);                
        kedi kedi2 = new Vankedisi("Pamuk", 2,true, 0 );
        kedi  kedi3 = new Vankedisi("Angel",  4 ,true, 3);
        kedi1.newKedi();
        kedi2.newKedi();
        kedi3.newKedi();
    }

}
