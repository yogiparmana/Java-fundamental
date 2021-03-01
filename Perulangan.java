public class Perulangan{

     public static void main(String []args){
  System.out.println("Pengulangan");
 System.out.println("-----------");
    
    
  System.out.println("----------- for");
   //pengulangan dalam bahasa pemrogramman umumnya ada 3 pengulangan
   //pengulangan menggunakan -------------------- for
   //contoh pengulangan 5x
   for(int i = 0; i < 5; ++i){
    System.out.println(i); //01234 karena int i dimulai dari o
       //kenapa 0 karena umumnya for digunakan untuk menampilkan isi array
       //karena index array di mulai dari 0
       // angka 5 adalah jumlah banyaknya pengulangan
   }
System.out.println("");
   
   //agar dimulai 1 langsung saja isikan int i = 1 dan juga < di kasih = atau 5 di ganti jadi 6agar mengulang 5x 
    for(int i = 0; i <= 5 /*i  < 6*/; ++i){
    System.out.println(i); //01234 karena int i dimulai dari o
       //kenapa 0 karena umumnya for digunakan untuk menampilkan isi array
       //karena index array di mulai dari 0
       // angka 5 adalah jumlah banyaknya pengulangan
   }
System.out.println("");
   //contoh pengulangan 5 tapi decrement
   for(int i = 5; i > 0 ; i--){
    System.out.println(i); // 54321 karena int i dimulai dari 5 
   }
   
   
  System.out.println("----------- do while");
     //pengulangan menggunakan -------------------- while do
     int i = 0;
     do{
         i++; //i + 1
      System.out.println(i); // cetak i 
         
     }while(i < 5); // sampai i lebih kecil dari 5
     // hasil 12345
     System.out.println();
     i = 5; //ubah i = 5
     //---------------while
     while(i > 0){ //cek apakah i lebih besar dari 0 jika true
      System.out.println(i); //cetak i
         i--; //i kurang 1
     }
        
     }
}
