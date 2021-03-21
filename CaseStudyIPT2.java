import java.util.Scanner;
public class Ordering {
    private int pizza1;
    private int pay1;
    private String name1;
    private String address1;
    private String order3;
   
    

    public void order() {
        Scanner cs = new Scanner(System.in);
        int pizza;
        
        System.out.println("");
        System.out.println("Welcome to pizza time!");
        System.out.println("Please pick the number of pizza you want");
        System.out.println("1. Pepperoni");
        System.out.println("2. Margherita");
        System.out.println("3. BBQ Chicken");
        System.out.println("4. Hawaiian");
        
        System.out.print("Please enter your order: ");
        pizza= cs.nextInt();
        
        pizza1=pizza;
        
    }
    
    
    
    public void info(){
        Scanner cs = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("Informations");
        System.out.print("Name: ");
        String name= cs.next();
        System.out.print("Address: ");
        String address=cs.next();
        
        name1=name;
        address1=address;
        
    }
    
    public String name(){
        return name1;
    }
    public String address(){
        return address1;
    }
    
    public void payment(){
         Scanner cs = new Scanner(System.in);
         
         System.out.println("\n");
         System.out.println("Way of payment");
         System.out.println("1. COD");
         System.out.println("2. Card");
         System.out.print("Enter your choice: ");
         int pay=cs.nextInt();
         
         pay1=pay;
    }
    
    
    
   
    public void order1(){
        
       
        switch(pizza1){
            case 1:
               System.out.println("");
                System.out.println("Order: Pepperoni pizza");
            break;
            case 2:
                System.out.println("");
                System.out.println("Order: Margherita pizza");
            break;
            case 3:
                System.out.println("");
                System.out.println("Order: BBQ Chicken pizza");
            break;
            case 4:
                System.out.println("");
                System.out.println("Order: Hawaiian pizza");
            break;
            
            
        }
        
        
        
    }

    public void payment2(){
        
        switch(pay1){
            case 1:
                System.out.println("Payment: COD");
            break;
            case 2:
                System.out.println("Payment: Card");
            break;
        }
    }
    
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        Ordering obj = new Ordering();
        
        obj.order();
        obj.info();
        obj.payment();
        System.out.println("");
        System.out.println("");
        System.out.println("ORDER INFORMATION");
        obj.order1();
        System.out.println("Name:" + obj.name());
        System.out.println("Address:" + obj.address());
        obj.payment2();
        
    }
    
}
