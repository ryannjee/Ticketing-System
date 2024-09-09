/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cw1;

import java.util.*;
import java.text.DecimalFormat;
/**
 *
 * @author Ryan
 */
public class CW1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00##");
        double price1=0, price2=0, price3=0, price4=0, price5=0, price6=0, price7=0, price8=0, price9=0;
        double price11=0, price22=0, price33=0, price44=0, price55=0, price66=0, price77=0, price88=0, price99=0;
        double tprice1=0, tprice2=0, tprice3=0, finalprice=0, overallprice=0;
        int askP1=0, askP2=0, askP3=0, askP4=0, askP5=0, askP6=0, askP7=0, askP8=0, askP9=0;
        int askP11=0, askP22=0, askP33=0, askP44=0, askP55=0, askP66=0, askP77=0, askP88=0, askP99=0;
        int askP111=0, askP222=0, askP333=0, askP444=0, askP555=0, askP666=0, askP777=0, askP888=0, askP999=0, finalqty=0, overallqty=0;
        int askC,ask,type;
        double taxprice,tax;
        double card=0,bank=0,cash=0;
        boolean a=false,b=false,c=false;
        Price p = new Price();

        do{
            System.out.println("  ------------------------------------");
            System.out.println("  ======== Choose Your Option ========");
            System.out.println("  ------------------------------------");
            System.out.println("  | 1. |      Show Ticket Rate       |"); //Press 1 to display the output of the ticket rate,
            System.out.println("  | 2. |      Calculate Ticket Fee   |"); //Press 2 to enable the user to calculate purchase the ticket.
            System.out.println("  | 3. |      Show Daily Sales       |"); //Press 3 to view the output of the daily sales
            System.out.println("  | 4. |      <--Exit--              |"); //Press 4 to exit the program
            System.out.println("  ------------------------------------");
            System.out.println("  Choose An Option:");
            ask= s.nextInt();
        
        switch(ask){
            case 1:{ //If the user press 1 it will display the ticket rate 
                System.out.println("  ________________________________________________________________________________");
                System.out.println("  |   Category   |      Age Range       |             Price (per Ticket)         |");
                System.out.println("  |--------------|----------------------|----------------------------------------|");
                System.out.println("  |  Theme Park  |    60 And Above      |      RM50 for the first 3 tickets      |");
                System.out.println("  |              |                      |      RM45 for the subsequent tickets   |");
                System.out.println("  |              |----------------------|----------------------------------------|");
                System.out.println("  |              |    17-59             |      RM80 for the first 3 tickests     |");
                System.out.println("  |              |                      |      RM75 for the subsequent tickets   |");
                System.out.println("  |              |----------------------|----------------------------------------|");
                System.out.println("  |              |    Below 17          |      RM30 for the first 3 tickests     |");
                System.out.println("  |              |                      |      RM25 for the subsequent tickets   |");
                System.out.println("  |--------------|----------------------|----------------------------------------|");
                System.out.println("  |  Water Park  |    60 And Above      |      RM60 for the first 3 tickets      |");
                System.out.println("  |              |                      |      RM55 for the subsequent tickets   |");
                System.out.println("  |              |----------------------|----------------------------------------|");
                System.out.println("  |              |    17-59             |      RM90 for the first 3 tickests     |");
                System.out.println("  |              |                      |      RM85 for the subsequent tickets   |");
                System.out.println("  |              |----------------------|----------------------------------------|");
                System.out.println("  |              |    Below 17          |      RM50 for the first 3 tickests     |");
                System.out.println("  |              |                      |      RM45 for the subsequent tickets   |");
                System.out.println("  |--------------|----------------------|----------------------------------------|");
                System.out.println("  |   All Park   |    60 And Above      |      RM120 for the first 3 tickets     |");
                System.out.println("  |              |                      |      RM110 for the subsequent tickets  |");
                System.out.println("  |              |----------------------|----------------------------------------|");
                System.out.println("  |              |    17-59             |      RM160 for the first 3 tickests    |");
                System.out.println("  |              |                      |      RM150 for the subsequent tickets  |");
                System.out.println("  |              |----------------------|----------------------------------------|");
                System.out.println("  |              |    Below 17          |      RM70 for the first 3 tickests     |");
                System.out.println("  |              |                      |      RM60 for the subsequent tickets   |");
                System.out.println("  |______________|______________________|________________________________________|");
                System.out.println("                                              **ALL PRICES IS SUBJECTED TO 6% SST");
                a=false;
            }
            break;
            
            case 2:{
                do{ //If the user press 2 it will display choice for the user to choose which park they want
                    System.out.println("  -------------------------------");
                    System.out.println("  |====== Choose Category ======|");
                    System.out.println("  -------------------------------");
                    System.out.println("  | 1. |       Theme Park       |"); //Enter 1 to select the theme park
                    System.out.println("  | 2. |       Water Park       |"); //Enter 2 to select the water park
                    System.out.println("  | 3. |       All Park         |"); //Enter 3 to select the all park
                    System.out.println("  | 4. |       <--Back--        |"); //Exit page and purchase the ticket.
                    System.out.println("  -------------------------------");
                    System.out.println("  Choose An Option:");
                    askC= s.nextInt();
     
                    switch (askC){
                        case 1:{ 
                            System.out.println("  ------ AGE 60 AND ABOVE ------  ");
                            System.out.println("  Enter Ticket Quantity:"); //Key in ticket quantity for 60 and above
                            askP111 = s.nextInt();
                            if(askP1>=1 && askP1<=3)
                            {
                                askP1 += askP111; 
                            }
                            else
                            {
                                askP1 += askP111;
                            }
                            System.out.println("  ------ AGE 17-59 ------  ");
                            System.out.println("  Enter Ticket Quantity:"); //Key in ticket quantity for 17-59
                            askP222 = s.nextInt();                           
                            if(askP2>=1 &&askP2<=3)
                            {
                                askP2 += askP222;
                            }
                            else
                            {
                                askP2 += askP222;
                            }
                            System.out.println("  ------ AGE BELOW 17 ------  ");
                            System.out.println("  Enter Ticket Quantity: "); //Key in ticket quantity for below 17
                            askP333 = s.nextInt();                           
                            if(askP3>=1&&askP3<=3)
                            {
                                askP3 += askP333;
                            }
                            else
                            {
                                askP3 += askP333;
                            }                          
                            
                            price1 = p.ticket1(askP1 ,askP2, askP3);
                            price2 = p.ticket2(askP1 ,askP2, askP3);
                            price3 = p.ticket3(askP1 ,askP2, askP3);
                            
                            tprice1 = price1 + price2 + price3; //Total price of 3 categories
                            Total(tprice1);  
                            b=false;
                        }
                        break;
                        
                        case 2:{ 
                            System.out.println("  ------ AGE 60 AND ABOVE ------  ");
                            System.out.println("  Enter Ticket Quantity:"); //Key in ticket quantity for 60 and above
                            askP444 = s.nextInt();                       
                            if(askP4<=3)
                            {
                               askP4 += askP444;
                            }
                            else
                            {
                                askP4 += askP444;
                            }
                            System.out.println("  ------ AGE 17-59 ------  ");
                            System.out.println("  Enter Ticket Quantity:"); //Key in ticket quantity for 17-59
                            askP555 = s.nextInt();                        
                            if(askP5<=3)
                            {
                                askP5 += askP555;
                            }
                            else
                            {
                            
                                askP5 += askP555;
                            }
                            System.out.println("  ------ AGE BELOW 17 ------  ");
                            System.out.println("  Enter Ticket Quantity: "); //Key in ticket quantity for below 17
                            askP666 = s.nextInt();                          
                            if(askP6<=3)
                            {
                            
                                askP6 += askP666;
                            }
                            else
                            {
                            
                                askP6 += askP666;
                            }

                            price4 = p.ticket4(askP4, askP5, askP6); 
                            price5 = p.ticket5(askP4, askP5, askP6);
                            price6 = p.ticket6(askP4, askP5, askP6); 
                            
                            tprice2 = price4 + price5 + price6; //Total price of 3 categories
                            Total(tprice2);                            
                            b=false;
                        }
                        break;
                        
                        case 3:{ 
                            System.out.println("  ------ AGE 60 AND ABOVE ------  ");
                            System.out.println("  Enter Ticket Quantity:"); //Key in ticket quantity for 60 and above
                            askP777 = s.nextInt();
                            if(askP7<=3)
                            {
                                askP7 += askP777;
                            }
                            else
                            {
                                askP7 += askP777;
                            }
                            System.out.println("  ------ AGE 17-59 ------  ");
                            System.out.println("  Enter Ticket Quantity:"); //Key in ticket quantity for 17-59
                            askP888 = s.nextInt();
                            if(askP8<=3)
                            {
                                askP8 += askP888;
                            }
                            else
                            {
                                askP8 += askP888;
                            }
                            System.out.println("  ------ AGE BELOW 17 ------  ");
                            System.out.println("  Enter Ticket Quantity: "); //Key in ticket quantity for below 17
                            askP999 = s.nextInt();
                            if(askP9<=3)
                            {
                                askP9 += askP999;
                            }
                            else
                            {
                                askP9 += askP999;
                            }
                            price7 = p.ticket7(askP7, askP8, askP9);
                            price8 = p.ticket8(askP7, askP8, askP9);
                            price9 = p.ticket9(askP7, askP8, askP9);
                            
                            tprice3 = price7 + price8 + price9; //Total price of 3 categories
                            Total(tprice3);
                            b=false;
                        }
                        break;
                    
                        case 4:{ 
                            System.out.println("");
                            b=true;
                        }
                        break;
                    
                        default:{   //Output will display if user types wrongly
                            System.out.println("  ---------------------");
                            System.out.println("  !!! Invalid Input !!!");
                            System.out.println("  ---------------------");
                            b=true;
                        }
                    }
                }while(b!=true);
                finalqty = askP1 + askP2 + askP3 + askP4 + askP5 + askP6 + askP7 + askP8 + askP9; //Sum of all quantity
                finalprice = price1 + price2 + price3 + price4 + price5 + price6 + price7 + price8 + price9;  //Sum of all price
                tax = 0.06 * finalprice; //calculate tax
                taxprice = p.taxrate(finalprice); //calculate total price with tax
                System.out.println("Please select your paymet type: \n 1. Debit/Credit Card" + "\n 2. Bank Transfer" + "\n 3. Cash"); //Select payment method
                type = s.nextInt();
                if(type==1)
                {
                    System.out.printf("\nAmout To Pay With Debit/Credit Card: " +df.format(taxprice)); //Show price of current ticket choice by card
                    card += taxprice;
                    System.out.println("\nThis Is Your Receipt. \n");
                }
                
                if(type==2)
                {
                    System.out.printf("Bank Transfer: " +df.format(taxprice)); //Show price of current ticket choice by bank
                    bank += taxprice;
                    System.out.println("\nThis Is Your Receipt. \n");
                }
                
                if(type==3)
                {
                    System.out.printf("Cash: " +df.format(taxprice)); //Show price of current ticket choice by cash
                    cash += taxprice;
                    System.out.println("\nThis Is Your Receipt. \n");
                }
                overallqty += finalqty;
                //This is the user's receipt after making one full purchase including total ticket purchase with total quantity and price
                System.out.println("\n  --------------------------------------------------------------- ");
                System.out.println("                              Receipt                             ");
                System.out.println("  --------------------------------------------------------------- ");
                System.out.println("     Category         Age Range       Quantity       Price(RM)    ");
                System.out.println("  --------------------------------------------------------------- ");
                if(price1>0)
                {
                    System.out.println("     Theme Park       60 And Above       "+askP1+"           "+df.format(price1));
                }
                if(price2>0)
                {
                    System.out.println("     Theme Park       17-59              "+askP2+"           "+df.format(price2));
                }
                if(price3>0)
                {
                    System.out.println("     Theme Park       Below 17           "+askP3+"           "+df.format(price3));
                }
                if(price4>0)
                {
                    System.out.println("     Water Park       60 And Above       "+askP4+"           "+df.format(price4));
                }
                if(price5>0)
                {
                    System.out.println("     Water Park       17-59              "+askP5+"           "+df.format(price5));
                }
                if(price6>0)
                {
                    System.out.println("     Water Park       Below 17           "+askP6+"           "+df.format(price6));
                }
                if(price7>0)
                {
                    System.out.println("     All Park         60 And Above       "+askP7+"           "+df.format(price7));
                }
                if(price8>0)
                {
                    System.out.println("     All Park         17-59              "+askP8+"           "+df.format(price8));
                }
                if(price9>0)
                {
                    System.out.println("     All Park         Below 17           "+askP9+"           "+df.format(price9));
                }
                    System.out.println("  --------------------------------------------------------------- ");
                    System.out.println("           Total Quantity:                  "+finalqty);
                    System.out.printf("           Subtotal Price(RM):              %.2f ",finalprice);
                    System.out.println("\n  --------------------------------------------------------------- ");
                if(type==1)
                {
                    System.out.printf("           Paying With Debit/Credit Card    ");
                }
                if(type==2)
                {
                    System.out.printf("           Paying With Bank Transfer  ");
                }
                if(type==3)
                {
                    System.out.printf("           Paying With Cash  ");
                }
                System.out.println("\n  --------------------------------------------------------------- ");
                System.out.printf("           Tax:                             %.2f ",tax);
                System.out.printf("\n           Total Price(RM):                 %.2f ",taxprice);
                System.out.println("\n  --------------------------------------------------------------- ");

                price11 += price1;
                price22 += price2;
                price33 += price3;
                price44 += price4;
                price55 += price5;
                price66 += price6;
                price77 += price7;
                price88 += price8;
                price99 += price9; //This is to stack data
                
                askP11 += askP1;
                askP22 += askP2;
                askP33 += askP3;
                askP44 += askP4;
                askP55 += askP5;
                askP66 += askP6;
                askP77 += askP7;
                askP88 += askP8;
                askP99 += askP9; //This is to stack data
                
                price1=0;
                price2=0;
                price3=0;
                price4=0;
                price5=0;
                price6=0;
                price7=0;
                price8=0;
                price9=0; //This is to refresh data for new entry
                
                askP1=0;
                askP2=0;
                askP3=0;
                askP4=0;
                askP5=0;
                askP6=0;
                askP7=0;
                askP8=0;
                askP9=0; //This is to refresh data for new entry
                
                
                
                overallprice = card + bank + cash; //Overall money collected from 3 methods
                a=false;
            }
            break;
            
            case 3:{ //If the user press 3 it will display daily sale information and combine quantity and price of the program.
                System.out.println("  =================================================================");
                System.out.println("                       << Daily Sale Info >>                       ");
                System.out.println("  =================================================================");
                System.out.println("   Category           Age Range         Quantity         Price(RM) ");
                System.out.println("  =================================================================");
                System.out.println("   Theme Park      60 and above           "+askP11+"              "+df.format(price11));
                System.out.println("                   17-59                  "+askP22+"              "+df.format(price22));
                System.out.println("                   Below 17               "+askP33+"              "+df.format(price33));
                System.out.println("  =================================================================");
                System.out.println("    Water Park      60 and above          "+askP44+"              "+df.format(price44));
                System.out.println("                    17-59                 "+askP55+"              "+df.format(price55));
                System.out.println("                    below 17              "+askP66+"              "+df.format(price66));
                System.out.println("  =================================================================");
                System.out.println("     All Park       60 and above          "+askP77+"              "+df.format(price77));
                System.out.println("                    17-59                 "+askP88+"              "+df.format(price88));
                System.out.println("                    below 17              "+askP99+"              "+df.format(price99));          
                System.out.println("  =================================================================");
                System.out.println("                        *** Total Quantity ***                      ");
                System.out.println("  Overall Quantity                                     | "+overallqty);
                System.out.println("  =================================================================");
                System.out.println("                       *** Payment Received ***                    ");  
                System.out.printf("  Debit/Credit Card                                    | %.2f",card);
                System.out.printf("\n  Bank Transfer                                        | %.2f",bank);
                System.out.printf("\n  Cash                                                 | %.2f",cash);
                System.out.println("\n  =================================================================");
                System.out.println("                         *** Total Price ***                       ");
                System.out.printf("  Overall Price                                        | %.2f",overallprice);
                System.out.println("\n  =================================================================");
                c=true;
            }
            break;
            
            case 4:{ //If the user press 4 it will display this output
                System.out.println("\n  ------------------------------------");
                System.out.println("  === Thank You, Please Come Again ===");
                System.out.println("  ------------------------------------");
                a=true;
            }
            break;
            
            default:{   //Output will display if user types wrongly
                System.out.println("\n  ---------------------");
                System.out.println("  !!! Invalid Input !!!");
                System.out.println("  ---------------------");
            a=false;
            }
        }
        }while(a!=true);
    }
    
    public static double Total(double tpt1){ //Output of the total price of one purchase before tax
        double nprice=tpt1;
        System.out.println("  -----------------------------");
        System.out.printf("  === Total price: RM%.2f ===",nprice);
        System.out.println("\n  -----------------------------");
        System.out.println("               **Excluding 6% SST\n");
        return nprice;
    }
}


