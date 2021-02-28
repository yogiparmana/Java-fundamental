import java.util.Scanner; // jangan lupa import kelas scanner
public class Switchcase{

    public static void main(String []args){
        
    System.out.println("switch case");
    System.out.print("-----------------\n");
    //switch case adalah percabangan kode program dimana kita membandingkan isi sebuah variabel dengan beberapa nilai
    //contoh
    //int number = 2; //langsung input atau
    int number;
    System.out.print("masukkan angka : ");
    Scanner input = new Scanner(System.in);
    number = input.nextInt();
    switch(number){ //variable yg akan di switch / di periksa
        case 0: // jika number == 0
            System.out.print("number == 0"); //jalankan ini
            break; //break di gunakan untuk menstop / case yang selanjutnya di hentikan  jika casenya benar
        case 1: // jika number == 1
            System.out.print("number == 1"); //jalankan ini
            break; //break
        case 3: //jika number == 3
            System.out.print("number == 3"); //jalankan ini
            break; //break
        default: // jika variable tidak sama dengan case 
            System.out.print("number != 0,1,3"); //jalankan ini
            break;//break
    }
     }
}
