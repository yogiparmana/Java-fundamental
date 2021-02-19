public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        System.out.println("-----------");
   
   // deklarasi Variable
   byte tinggi; //type data yang lebih kecil memory di bandingkan int dan short
   long berat; // type data dengan ukuran yang lebih besar dari int
   short panjang; //type data yang lebih kecil memory di bandingkan int
   
   int umur; //type data integer untuk angka tanpa koma, jika koma akan di bulatkan (variable = number)
   String nama;//String untuk kata / huruf
   float PI;// float untuk angka dengan koma (pecahan) jika bulat maka akan di conversi (contoh 1 == 1.00)
   double PI2;// doube mirip dengan float namun angka di belakang koma lebih banyak
   //note(koma dalam bahasa pemrograman menggunakan titik (.))
   boolean udahmakan; // boolean adalah type data yang menghasilkan true (benar) / false (salah)
   char indexprestasi; // char adalah type data untuk 1 huruf 
   
   //pemberian nilai pada variable / inisialisasi
   umur = 21;
   nama  = "Yogi";
   PI = 3.4f; // float harus menggunakan tanda f di belakang angka
   PI2 = 3.33;
   udahmakan = true;
   indexprestasi = 'A'; // char menggunakan petik 1 sedangkan string menggunakan petik 2
   
   //output 
   //output di java menggunakan System.out.print
   System.out.println("Nama : " + nama);//tanda + menggunakan untuk menyambung variable
   System.out.println("umur : " + umur);
   System.out.println("Sudah Makan? : " + udahmakan);
   System.out.println("Index Prestasi : " + indexprestasi);
   System.out.println("PI = " + PI + " dan PI 2 = " + PI2); //jangan lupa titik koma di akhir setiap baris
   // System.out.print digunakan untuk menghasilkan output / System.out.println digunakan untuk menambah line (enter)
        
     }
}
