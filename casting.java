public class HelloWorld{

     public static void main(String []args){
        System.out.println("casting");
        System.out.println("-----------");
   
   
   //--------------------------Casting-----------------------
   //casting adalah mengubah type data agar bisa di operasikan
   
   int a = 10;
   float b = 10.5f; // jngan lupa tambah f untuk float
   //int hasil = a + b; //eroor karena hasil adalah int sedangkan jawabannya berupa float
   //maka
   
   int hasil = a + (int)b; // float b akan di convert ke int 
   
   //penulisan casting yaitu di depan variable di tambah kurung () diisi dengan pengubah type data
   
   
   System.out.println("hasil dari " + a + "+" + b + "=" + hasil );
   //hasilnya adalah 10+10.5=20 karena float sudah jadi int maka akan .5 akan hilang
   
   // ada 2 jenis casting yaitu explicit dan implicit
   
   //explicit adalah dari type data besar -> kecil
   /*
Dari tipe data short ke byte atau char
Dari tipe data double ke byte, short, char, int, long atau float
Dari tipe data char ke byte atau short
Dari tipe data long ke byte, short, char atau int
Dari tipe data int ke byte, short, atau char
Dari tipe data float ke byte, short, char, int atau long
Dari tipe data byte ke dalam tipe data char
*/

//contoh
 System.out.println("----------Explicit----------");
short datashort = 1;
byte short_ke_byte = (byte)datashort;
char short_ke_char = (char)datashort;

double datadouble = 223.5;
byte double_ke_byte = (byte)datadouble;
short double_ke_short = (short)datadouble;
char double_ke_char = (char)datadouble;
int double_ke_int = (int)datadouble;
long double_ke_long = (long)datadouble;
float double_ke_float = (float)datadouble;


char datachar ='a'; //ingat char petik 1
byte char_ke_byte = (byte)datachar;
short char_ke_short = (short)datachar;

long datalong = 12445;
byte long_ke_byte = (byte)datalong;
short long_ke_short = (short)datalong;
char long_ke_char = (char)datalong;
int long_ke_int = (int)datalong;

int dataint =12;
byte int_ke_byte = (byte)dataint;
short int_ke_short = (short)dataint;
char int_ke_char = (char)dataint;

float datafloat = 12.4f; //float pake f
byte float_ke_byte = (byte)datafloat;
short float_ke_short = (short)datafloat;
char float_ke_char = (char)datafloat;
int float_ke_int = (int)datafloat;
long float_ke_long = (long)datafloat;

byte databyte = 2;
char byte_ke_char = (char)databyte;
   
   
System.out.println("short_ke_byte: "+short_ke_byte);
System.out.println("short_ke_char: "+short_ke_char);
System.out.println("double_ke_byte: "+double_ke_byte);
System.out.println("double_ke_short: "+double_ke_short);
System.out.println("double_ke_char: "+double_ke_char);
System.out.println("double_ke_int: "+double_ke_int);
System.out.println("double_ke_long: "+double_ke_long);
System.out.println("double_ke_float: "+double_ke_float);
System.out.println("char_ke_byte: "+char_ke_byte);
System.out.println("char_ke_short: "+char_ke_short);
System.out.println("long_ke_byte: "+long_ke_byte);
System.out.println("long_ke_short: "+long_ke_short);
System.out.println("long_ke_char: "+long_ke_char);
System.out.println("long_ke_int: "+long_ke_int);
System.out.println("int_ke_byte: "+int_ke_byte);
System.out.println("int_ke_short: "+int_ke_short);
System.out.println("int_ke_char: "+int_ke_char);
System.out.println("float_ke_byte: "+float_ke_byte);
System.out.println("float_ke_short: "+float_ke_short);
System.out.println("float_ke_char: "+float_ke_char);
System.out.println("(float_ke_int: "+float_ke_int);
System.out.println("float_ke_long: "+float_ke_long);
System.out.println("byte_ke_char: "+byte_ke_char);


System.out.println("----------Implicit----------");
//implicit yaitu mengubah type data kecil -> besar
/*
Dari tipe data short ke tipe data int, long, float, atau double
Dari tipe data int ke dalam tipe data long, float, atau double
Dari tipe data char ke dalam tipe data int, long, float, atau double
Dari tipe data float ke dalam tipe data double
Dari tipe data long atau ke dalam tipe data float atau double
Dari tipe data byte ke tipe data short, int, long, float, atau double
*/

int short_ke_int = (int)datashort;
long short_ke_long = (long)datashort;
float short_ke_float = (float)datashort;
double short_ke_double = (double)datashort;

long int_ke_long = (long)dataint;
float int_ke_float = (float)dataint;
double int_ke_double = (double)dataint;

int char_ke_int = (int)datachar;
long char_ke_long =(long)datachar;
float char_ke_float = (float)datachar;
double char_ke_double = (double)datachar;

double float_ke_double = (double)datafloat;

float long_ke_float = (float)datalong;
double long_ke_double = (double)datalong;

short byte_ke_short = (short)databyte;
int byte_ke_int = (int)databyte;
long byte_ke_long = (long)databyte;
float byte_ke_float = (float)databyte;
double byte_ke_double = (double)databyte;

System.out.println("short_ke_int: "+short_ke_int);
System.out.println("short_ke_long: "+short_ke_long);
System.out.println("short_ke_float: "+short_ke_float);
System.out.println("short_ke_double: "+short_ke_double);
System.out.println("int_ke_long: "+int_ke_long);
System.out.println("int_ke_float: "+int_ke_float);
System.out.println("int_ke_double: "+int_ke_double);
System.out.println("char_ke_int: "+char_ke_int);
System.out.println("char_ke_long: "+char_ke_long);
System.out.println("char_ke_float: "+char_ke_float);
System.out.println("char_ke_double: "+char_ke_double);
System.out.println("float_ke_double: "+float_ke_double);
System.out.println("long_ke_float: "+long_ke_float);
System.out.println("long_ke_double: "+long_ke_double);
System.out.println("byte_ke_short: "+byte_ke_short);
System.out.println("byte_ke_int: "+byte_ke_int);
System.out.println("byte_ke_long: "+byte_ke_long);
System.out.println("byte_ke_float: "+byte_ke_float);
System.out.println("byte_ke_double: "+byte_ke_double);

   
   
        
     }
}
