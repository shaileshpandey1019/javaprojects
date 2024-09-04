package JavaOops;

public class methodOverriding {
   public static void main(String[] args){
        Sbi s =new Sbi();
        Pnb p=new Pnb();
        Axis a= new Axis();
       System.out.println("SBI Rate of Interest: "+s.rateOfInterest());
       System.out.println("SBI Rate of Interest: "+p.rateOfInterest());
       System.out.println("SBI Rate of Interest: "+a.rateOfInterest());
   }
}

 class Bank {
     int rateOfInterest() {
         return 0;
     }
 }


 class Sbi extends Bank{
        int rateOfInterest(){
            return 9;
        }

    }
class Pnb extends Bank{

        int rateOfInterest() {
            return 7;
        }
    }
class Axis extends Bank{

        int rateOfInterest() {
            return 8;
        }
    }

