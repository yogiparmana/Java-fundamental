
public class Fungsi
{
    public static void main(String[] args) {
    System.out.println("function" );
    System.out.println("-------------" );
    //function / fungsi adalah suatu bagian dari program yang dipergunakan untuk mengerjakan suatu tugas tertentu yang menghasilkan 
    //suatu nilai untuk dikembalikan ke program pemanggil dan letaknya dipisahkan dari bagian program yang menggunakannya.
    //public static void main(String[] args) ini adalah fungsi utama dari java
    System.out.println("----------------- penulisan fungsi" );

    //cetak kata dengan membuat object 
    //karena kita tidak membuat fungsi static jadi kita harus memanggil object class ini dlu baru 
    Fungsi kata = new Fungsi();
    kata.cetak_kata("ini adalah kata yang akan di cetak");
    kata.tampil();

    System.out.println("ini adalah int yg di kembalian : " + kembalian_angka() );
    System.out.println("ini adalah bool yg di kembalian : " + kembalian_bool() );
    System.out.println("ini adalah float yg di kembalian : " + kembalian_float() );
    // ini 2 nilai yang mau di tambahkan
    int angka_1 = 10;
    int angka_2 = 20;
    System.out.println("----------------- fungsi dengan parameter" );
    // lalu masukkan ke 2 nilai ini ke fungsi
    //tambah(angka_1, angka_2); // cara memasukkan nilai ke parameter
    //ini tidak akan di cetak ke console karena belum di cout
    System.out.println(angka_1 + " + " + angka_2 + " = " + tambah(angka_1,angka_2) );
    // ini adalah fungsi yg sangat sederhana, mungkin akan lebih baik langsung membuatnya tanpa fungsi
    //namun bagaimana kalau kita akan menambahkan banyak penjumalahan?
    //kita tidak mungkin membuatnya satu per-satu,
    // maka dengan adanya fungsi kita dengan mudah mengganti parameternya saja;
    //contoh
    angka_1 = 5; // nilainya akan di timpa
    angka_2 = 5;// nilainya akan di timpa
    System.out.println(angka_1 + " + " + angka_2 + " = " + tambah(angka_1,angka_2) );
    //atau agar lebih mudah kita bisa menggunakan void untuk membuat coutnya
    angka_1 = 7;
    angka_2 = 9;
    cetak_perjumlahan(angka_1,angka_2); // mencetak dengan fungsi
    

    
   
    }

static void tampil_kata(){ // ini adalah fungsi static berfungsi agar bisa langsung memanggilnya tanpa membuat object
    System.out.println("hello" ); // ini adalah program yang dijalankan apabila kita memanggil fungsi tersebut
}
    
void tampil(){ //fungsi ini tanpa static, jadi saat pemanggilan kita memanggilnya dengan memnggil object baru fungsi
    System.out.println("hai" );
}
//ada 2 jenis fungsi yaitu fungsi dengan mengembalikan sebuah nilai / atau tanpa dikembalikan
//tanpa kembalian yaitu menggunakan awalan void
//kalau mengembalikan nilai walannya berupa nilai type data yang mau di dikembalikan
//contoh kalau kita mengeluarkan nilai angka maka menggunakan int
//jika menggunakan kembalian maka akan harus menggunakan return
static int kembalian_angka(){
    return 12;
}

static boolean kembalian_bool(){
    return true;
}

static float kembalian_float(){
    return 19.5;
}


// fungsi dengan parameter
// jika dalam fungsi memiliki masukkan yang tidak di ketahui / memiliki banyak 
// Parameter ini akan menyimpan nilai yang diinputkan ke fungsi 
//contoh fungsi untuk mencetak string namun string tidak di ketahui / mau di diinputkan
static void cetak_kata(String kata){
    System.out.println("kata yang di masukkan ke parameter : " + kata );
}


//contoh fungsi untuk mengembalikan 2 nilai yang di tambahkan namun 2 nilai ini tidak di ketahui angkanya

static int tambah(int nilai_1, int nilai_2){ //nilai_1 dan nilai_2 yang bertipe int itu Parameter
    int hasil = nilai_1 + nilai_2; // proses menghitung nilai
    return hasil; // mengembalikan nilai hasil
}
// membuat void cout untuk menampilkan keterangan cout perjumlahannya

static void cetak_perjumlahan(int angka_1, int angka_2){
    System.out.println(angka_1 + " + " + angka_2 + " = " + tambah(angka_1,angka_2) ); // mengambil fungsi di dalam fungsi
}


}
