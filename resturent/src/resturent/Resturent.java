package resturent;

import java.util.*;
public class Resturent extends inheritance{
     public static void main(String[] args){
        full();
     }
     public static void full(){
         System.out.println("\t\t\t\t\t\t***********************************");
         System.out.println("\t\t\t\t\t\t\t RM Food Corner");
         System.out.println("\t\t\t\t\t\t***********************************");
         product();
         System.out.println("\n\n\t\t\t1.As a New");
         System.out.println("\t\t\t2.Old Customer");
         char c;
         Scanner sc=new Scanner(System.in);
         System.out.print("\n\t\t\tPlease Enter (1/2) :");
         c=sc.nextLine().charAt(0);
         if(c=='1'){
            newc obj=new newc(); //for newcustomer;
            obj.cni();
         }
         else if(c=='2'){
            oldc obj2=new oldc(); //for oldcustomer;
            obj2.cid();
         }
         else
           full();
           Scanner bc=new Scanner(System.in);
           System.out.println("\n\n\t\tEnter F to return main menu or press any other key to exit");
           int b=bc.nextLine().charAt(0);
           if(b=='F'){
           full();
           }
          
     }
     
     }
    

class inheritance{
         public static void product(){
         //System.out.println("\t\t------------------------------");
         System.out.println("\t\t|Product Name(PN)|| Product Code(PC)|");
         System.out.println("\t\t------------------------------");
         System.out.println("\t\tPN: Daryabadi Biryani|| PC: RC11|");
         System.out.println("\t\t------------------------------");
           System.out.println("\t\tPN: Beef(1 plate)|| PC: BF11|");
         System.out.println("\t\t------------------------------");
          System.out.println("\t\tPN: Vegetable Biryani|| PC: VG11|");
         System.out.println("\t\t------------------------------");
          System.out.println("\t\tPN: Burger|| PC: SL11|");
         System.out.println("\t\t------------------------------");
          System.out.println("\t\tPN:Mutton (1 plate)|| PC: TP11|");
          System.out.println("\t\t------------------------------");
          System.out.println("\t\tPN: Beef Tikka|| PC: SM11|");
         System.out.println("\t\t------------------------------");
           System.out.println("\t\tPN: Mutton Fry|| PC: Mv11|");
         System.out.println("\t\t------------------------------");
           System.out.println("\t\tPN: Chicken Biryani|| PC: PR11|");
         System.out.println("\t\t------------------------------");
           System.out.println("\t\tPN: Cold Drinks|| PC:CD11|");
         System.out.println("\t\t------------------------------");
         }
}
class newc{
  static int i=974;
  static double t;//total;
  public static void cni(){
  String cname;
  Scanner sc=new Scanner(System.in);
   System.out.print("\n\t\t\tCustomer Name: ");
   cname=sc.nextLine();
   System.out.print("\t\t\tCustomer ID: "+(i++));
    prices();
    footer();
  }
  public static void  prices(){
     String pcode;
     double tp=0,tv=0;//tp=total price &tv=total vat;
     int j;
     for(j=0;j<20;j++){
         System.out.println("\n\t\t\t\t\t\t(Press t for calculate total :)\n");
          System.out.print("\n\t\t\tCode :");
          Scanner pr=new Scanner(System.in);
          pcode=pr.nextLine();
          int price;
          double vat;
          if("t".equals(pcode))
              break;
          switch(pcode){
              case "RC11":case"rc11":
                  price=200;
                  vat=0*price;
                  tp=tp+price;
                  tv=tv+vat;
                   System.out.println("\t\t\tProduct :Rice");
                   System.out.println("\t\t\tOld Price : "+price+"TK");
                   System.out.println("\t\t\tOld Vat : "+vat+"TK");
                  break;
                   case "BF11":case"bf11":
                  price=200;
                  vat=0*price;
                  tp=tp+price;
                  tv=tv+vat;
                   System.out.println("\t\t\tProduct :Beef");
                   System.out.println("\t\t\tOld Price : "+price+"TK");
                   System.out.println("\t\t\tOld Vat : "+vat+"TK");    
                       break;
                  case "VG11":case"vg11":
                  price=300;
                  vat=0*price;
                  tp=tp+price;
                  tv=tv+vat;
                   System.out.println("\t\t\tProduct :Vegetable Briyani");
                   System.out.println("\t\t\tOld Price : "+price+"TK");
                   System.out.println("\t\t\tOld Vat : "+vat+"TK");    
                       break;
                  case "SL11":case"sl11":
                  price=60;
                  vat=Math.ceil(0.1*price);//math.ceil() is used for round value;
                  tp=tp+price;
                  tv=tv+vat;
                   System.out.println("\t\t\tProduct :Burger");
                   System.out.println("\t\t\tOld Price : "+price+"TK");
                   System.out.println("\t\t\tOld Vat : "+vat+"TK");    
                       break;
                  case "TP11":case"tp11":
                  price=150;
                   vat=Math.ceil(0.1*price);//math.ceil() is used for round value;
                   tp=tp+price;
                   tv=tv+vat;
                   System.out.println("\t\t\tProduct :Mutton");
                   System.out.println("\t\t\tOld Price : "+price+"TK");
                   System.out.println("\t\t\tOld Vat : "+vat+"TK");    
                       break;
                  case "SM11":case"sm11":
                  price=55;
                   vat=Math.ceil(0.1*price);//math.ceil() is used for round value;
                   tp=tp+price;
                   tv=tv+vat;
                   System.out.println("\t\t\tProduct :Beef Tikka");
                   System.out.println("\t\t\tOld Price : "+price+"TK");
                   System.out.println("\t\t\tOld Vat : "+vat+"TK");    
                       break;
                 case "MV11":case"mv11":
                  price=200;
                   vat=Math.ceil(0.1*price);//math.ceil() is used for round value;
                   tp=tp+price;
                   tv=tv+vat;
                   System.out.println("\t\t\tProduct :Mutton Fry");
                   System.out.println("\t\t\tOld Price : "+price+"TK");
                   System.out.println("\t\t\tOld Vat : "+vat+"TK");    
                       break;
                  case "PR11":case"pr11":
                  price=220;
                   vat=Math.ceil(0.1*price);//math.ceil() is used for round value;
                   tp=tp+price;
                   tv=tv+vat;
                   System.out.println("\t\t\tProduct :Chicken Biryani");
                   System.out.println("\t\t\tOld Price : "+price+"TK");
                   System.out.println("\t\t\tOld Vat : "+vat+"TK");    
                       break;
                  case "CD11":case"cd11":
                  price=55;
                   vat=Math.ceil(0.1*price);//math.ceil() is used for round value;
                   tp=tp+price;
                   tv=tv+vat;
                   System.out.println("\t\t\tProduct :Cold Drinks");
                   System.out.println("\t\t\tOld Price : "+price+"TK");
                   System.out.println("\t\t\tOld Vat : "+vat+"TK");    
                       break;
                  default:
                        System.out.println("\t\t\tPlease enter correct code");
          }
     }
      System.out.println("\n\t\t\tTotal Price: "+tp+"TK");
      System.out.println("\n\t\t\tTotal Vat: "+tv+"TK");
      t=tp+tv;
       System.out.println("\n\t\t\tTotal : "+t+"TK");
  }
  public static void footer(){
   System.out.println("\n\t\t\t\t Thank you For With Us");
      System.out.println("\t\t\t\t\t\t\t\t\t Ahosan & Rakib");
       System.out.println("\t\t\t\t\t\t\t\t\t-----------");
      System.out.println("\t\t\t\t\t\t\t\t\t\tSignature");
  }
 
}
class oldc{
public static void cid(){
 newc obj3=new newc();
 Scanner pr=new Scanner(System.in);
  System.out.print("\n\t\t\tCustomer Id:");
  int id;
  id=pr.nextInt();
  if(id>=974 && id<=obj3.i){
  obj3.prices();
   System.out.println("\t\t\t You got 5% discount");
   obj3.t=(obj3.t)-(.05*(obj3.t));
    System.out.println("\t\t\t Total with Discount:"+(Math.ceil(obj3.t))+"TK");
    obj3.footer();
    
  }else{
  System.out.println("\t\t You are not our old Customer");
  obj3.cni();
  }
}
 }

