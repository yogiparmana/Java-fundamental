// mengimpor Scanner ke program
import java.util.Scanner;
public class input_output
{
  public static void main(String[]args)
  {
    System.out.println("Input Console");
    System.out.println("-----------------");

    //input menggunakan objeck Scanner 
    int number;			//inisialisasi variable int number
      System.out.print("Masukkan Number : ");	//keterangan input
    Scanner input = new Scanner(System.in);	// pembuatan object cukup buat satu object untuk banyak input
      number = input.nextInt();// proses input nextLine untuk integer
      System.out.println ("output number : " + number);	// proses output


    String kata;		// inisialisasi variable string kata (di java menggunakan s kapital)
      System.out.print("Masukkan Kata : ");	//keterangan input
      kata = input.nextLine();	// proses input nextLine untuk string
      kata = input.nextLine();	// proses input nextLine untuk string
      //karena terkadang inputan terskip maka kita akali dengan menambahkan input lagi
      System.out.println("output string : " + kata);	// output
      
          float floats;		// inisialisasi variable string kata (di java menggunakan s kapital)
      System.out.print("Masukkan float : ");	//keterangan input
      floats = input.nextFloat();	// proses input nextfloat untuk float
      System.out.println("output string : " + floats);	// output

  }
}
