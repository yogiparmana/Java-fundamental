public class Operator{

     public static void main(String []args){
System.out.print( "Operator\n");
System.out.print( "-----------\n");
    
    //-----------operator---------------
    //simbol untuk melakukan operasi
    
    //----------------Operator Aritmatika
    /*
Penjumlahan +
Pengurangan -
Perkalian   *
Pembagian   /
Sisa Bagi   %
    
    */
    System.out.print("----------------------aritmatika\n");
    int angka1,angka2;
    int hasil;
    
    angka1 = 10;
    angka2 = 20;
    
    //tambah
    hasil = angka1+angka2;
    System.out.println( "Hasil dari "+angka1+" + "+angka2+" = "+hasil);
    //kurang
    hasil = angka1-angka2;
    System.out.println( "Hasil dari "+angka1+" - "+angka2+" = "+hasil);
    //kali
    hasil = angka1 * angka2;
    System.out.println( "Hasil dari "+angka1+" x "+angka2+" = "+hasil);
    //bagi
    hasil = angka2 / angka1;
    System.out.println( "Hasil dari "+angka1+" : "+angka2+" = "+hasil);
    //modulus atau sisa bagi
    hasil = angka1 % angka2;
    System.out.println( "Hasil dari "+angka1+" mod "+angka2+" = "+hasil);
    
    
     System.out.print( "----------------------penugasan\n");
    
    //----------------Operator penugasan (Assignment Operator) 
    // fungsinya untuk mengisi nilai
    
    /*
Pengisian Nilai             =
Pengisian dan Penambahan    +=
Pengisian dan Pengurangan   -=
Pengisian dan Perkalian     *=
Pengisian dan Pembagian     /=
Pengisian dan Sisa bagi     %=
    */
    
    int a,b,cc;
    
    //=
    a = 1;
    b = 2;
    
    //+=
    a+=b; // artinya a = a + b; 3
     System.out.println( "a+=b : "+a);
    a-=b; // artinya a = a - b; -1
     System.out.println( "a-=b : "+a);
    a*=b; // artinya a = a x b; 2
     System.out.println( "a*=b : "+a);
    a/=b; // artinya a = a / b; 0,5 / 1 karena int
     System.out.println( "a/=b : "+a);
    a%=b; // artinya a = a % b;  1
     System.out.println( "a%=b : "+a);
     
     //-----------operator bitwise dengan style penugasan
     //operasi berdasarkan biner
     /*
    AND             &
    OR              |
    XOR             ^
    NOT/komplemen   ~
    Left Shift      <<
    Right Shift     >>
    */
    System.out.println("a : "+a+", b : "+b);
    a<<=b; // artinya a = a << b; menggunakan rumus biner | 0101010
     System.out.println( "a<<=b : "+a);
    a>>=b; // artinya a = a >> b; menggunakan rumus biner | 0101010
     System.out.println( "a>>=b : "+a);
    a&=b; // artinya a = a & b; menggunakan rumus biner | 0101010
     System.out.println( "a&=b : "+a);
    a|=b; // artinya a = a | b; menggunakan rumus biner | 0101010
     System.out.println( "a|=b : "+a);
    a^=b; // artinya a = a ^ b; menggunakan rumus biner | 0101010
     System.out.println( "a^=b : "+a);
     cc = ~a;
     System.out.println( "~a : "+cc);
     cc = ~b;
     System.out.println( "~b : "+cc);
    
    
    
    System.out.print( "----------------------perbandingan\n");
    
    //----------------perbandingan
    //untuk membandingkan 2 buah nilai
    // menghasilkan true 1, dan false 0
    
    /*
Lebih Besar             >
Lebih Kecil             <
Sama Dengan             ==
Tidak Sama dengan       !=
Lebih Besar Sama dengan >=
Lebih Kecil Sama dengan <=
  */
  System.out.println("a : "+a+", b : "+b);
  boolean c;
  c = a > b;
  System.out.println( "a>b : "+c);
  c = a < b;
  System.out.println( "a<b : "+c);
  c = a == b;
  System.out.println( "a==b : "+ c);
  c = a != b;
  System.out.println( "a!=b : "+ c);
  c = a >= b;
  System.out.println( "a>=b : "+ c);
  c = a <= b;
  System.out.println( "a<=b : "+ c);
  
 
 //---------------operator logika
 
 System.out.print( "-------------------logika\n");
 
 /*
Logika AND        true  && true = true, sisanya false
Logika OR         false  || false = false, sisanya true
Negasi/kebalikan    !true = false, !false = true
*/
// a=1, b=2
//dalam java logika harus membandingkan true dan false, tidak seperti c c++ yang bisa membandingkan 2 buah angka
// System.out.print("a && b : "+ a&&b);
// System.out.print("a || b : "+ a||b);
// System.out.print( "!a : "+ !a);
// System.out.print( "!b : "+ !b);
System.out.println("a : "+a+", b : "+b);
System.out.println("a && b : "+ (a==3&&b==2)); //false
System.out.println("a || b : "+ (a==3||b==2)); //true
System.out.println( "!a : "+ !(a==3||b==2)); //false
System.out.println( "!b : "+ !(a==3&&b==2));//true


//---------------operator lain-lain

System.out.print( "---------------------- operator lain-lain\n");

/*
Alamat memori   &   untuk mengambil alamat memori
Pointer         *   untuk membuat pointer
Ternary         ? : untuk membuat kondisi
Increment       ++  untuk menambah 1
Decrement       --  untuk mengurangi 1

*/
//java tidak ada pointer
//int *d;
//System.out.println("ambil tempat memori variable d : "+ &d);
System.out.println("apakah 1 = 2 ? : "+ ((1 == 2) ? "iya" : "tidak"));
int var = 7;
//karna di yang di proses pertama adalah operasi/variable lalu baru string jadi saya akali dengan menanmbahkan -1 dan +1
System.out.println(var+" ditambahkan satu kali : " + (++var)); 
System.out.println(var+" dikurangkan satu kali : " + (--var));
System.out.println(var+" ditambahkan satu kali : " + (var++)); //ditampilkan dlu baru di tambah jadinya akan tetap 
System.out.println("setelah di ditambah satu kali : "+var); //hasil sebenarnya
System.out.println(var+" dikurangkan satu kali : " + (var--)); //ditampilkan dlu baru di tambah jadinya akan tetap 
System.out.println("setelah di kurangi satu kali : "+var); //hasil sebenarnya

    


   
   
        
     }
}
