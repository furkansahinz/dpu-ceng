import java.text.DecimalFormat;
import java.util.Scanner;

public class pizza{
public static void main(String[] args){
DecimalFormat df = new DecimalFormat("#.##");
Scanner keyboard = new Scanner(System.in);


int cesit; // pizza ceşidi
double cost= 0.0; // pizza maliyeti
final double taxRate = 0.08; 
double tax; // tax amount
double total; 
double lastTotal; 
int numberOfToppings = 0;
int numberOfToppings2 =0;
int numberOfToppings3;
String toppings = "Peynirli";
int en;
int boy;
double fiyat;
double yaricap;
int pi = 3;
// Pizza boyutu
System.out.print("PizzaDünyasına hoşgeldiniz. Pizzanız Daire(1) mi Dikdörgen(2) mi olsun ? " );
cesit = keyboard.nextInt();
if (cesit == 1 ){
    yaricap = 2.5 ;
    fiyat = 4.99;
    cost = yaricap * yaricap * pi * fiyat;
}
    
else if (cesit == 2){
     en = 4;
     boy = 6;
     fiyat =4.99;
     int alan = en * boy ;
     
     cost = alan * fiyat; 
    }
else if (cesit != 1 && cesit != 2){
System.out.println("Girdiğiniz numara geçersiz, pizzanız daire olarak ayarlanacak. " );
cost = 4.99;}
keyboard.nextLine();

System.out.println("Tüm pizzalarımız peynirle gelir" );
System.out.println("Ek soslar her biri 1,25 TL, Pepperoni veya Sosis arasından seçim yapın." );

// Biber 
System.out.println("Pepperoni ister misiniz? (E/H)" );
numberOfToppings = keyboard.nextLine().charAt(0);
if (numberOfToppings == 'E' || numberOfToppings == 'e' ){
numberOfToppings = 1;
toppings = toppings + " ve pepperonili";}
else{
numberOfToppings = 0;
}

//Sucuk
System.out.println("Sucuk ister misiniz? (E/H)" );
numberOfToppings2 = keyboard.nextLine().charAt(0);
if (numberOfToppings2 == 'E' || numberOfToppings2 == 'e' ){
numberOfToppings2 = 1;
toppings = toppings + " ve sucuklu";}
else{
numberOfToppings2 = 0;} 


numberOfToppings3 = (numberOfToppings) + (numberOfToppings2);

// Hesaplama
total = (cost) + (numberOfToppings3 * 1.25);

lastTotal = total;

// Ödeme Onaylama

System.out.println(cesit + " tane daire pizzaniz hazir ");
System.out.println(toppings);
System.out.println("Ödemeniz gereken:" + df.format(total) + "TL");

    }
   }
