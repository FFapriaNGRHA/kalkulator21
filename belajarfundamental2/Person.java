package belajarfundamental2.java;

public class Person {
      public static void main(String[] abc){
       Data isi = new Data();
      
       isi.setNama("FaFa Apria Nugraha");
       isi.setCoba("11 - RPL (RevolutionSoftware)");
    
       byte x = 100;
       short y = 50;
       
       System.out.println("100 + 50 = "+(x+y));
       System.out.println("100 - 50 = "+(x-y));
       System.out.println("100 / 50 = "+(x/y));
       System.out.println("100 * 50 = "+(x*y));
       System.out.println("nama saya adalah ="+isi.getNama());
       System.out.println("Kelas ="+isi.getCoba());
        
      
     }
}
