import java.util.Scanner;
public class Test2
{
  public static void main(String [] args)
  {
  
  Scanner sc = new Scanner(System.in);
  String name,id,incomeType;
  double incomeAmount,totalTax ;
  
  System.out.println("*****************************************");    
  System.out.println("STAFF INCOME REPORT");    
  System.out.println("*****************************************"); 
  System.out.print("Enter Staff Name : ");
  name=sc.nextLine();
  System.out.print("Enter ID : ");
  id=sc.nextLine();
  System.out.print("Enter Income Type : ");
  incomeType=sc.nextLine();
  System.out.print("Enter Income Amount : ");
  double Amount=sc.nextDouble();
  System.out.print("Enter Income Tax : ");
  double Tax=sc.nextDouble();
  
   Income income = new Income(incomeType, Amount, Tax);
   Staff info = new Staff(name, id, income);
        
   info.displayStaffInfo();
   info.displayIncomeInfo();
   
   System.out.println("\nIs all the information filled correct? ");    
   char answer = sc.next().charAt(0);    

   
    }
  }
    
  class Income
  {
         String incomeType;
         double amount;
         double tax;
         double totalTax;
         
         Income(String incomeType, double amount, double tax)
         {
            this.incomeType = incomeType;
            this.amount = amount;
            this.tax = tax;
         }
         
         String getIncomeType()
          {
            return incomeType;
          }
         
         double getAmount()
          {
            return amount;
          }
         
         double getTax()
          {
            return tax;
          }
         
         double getTotalTax()
         {
            totalTax=(tax/100)*amount;
            return totalTax;  
         }
 } // end of class income
         
  class Staff
 {
    String name;
    String id;
    Income income;
    
    Staff(String name, String id, Income income)
    {
        this.name = name;
        this.id = id;
        this.income = income;        
    }
    
    String getName()
    {
        return name;
    }
    
    String getId()
    {
        return id;
    }
    
    double calculateNetIncome()
    {
        return income.getAmount() - income.getTotalTax();
    }
    
    void displayStaffInfo()
    {
        System.out.println("********************Staff Info*****************");
        System.out.println("Staff Name: " + name);
        System.out.println("Staff ID: " + id);
    }
 
   void displayIncomeInfo()
    {
     
       System.out.print("\n");
       System.out.println("************************************************");
       System.out.println("********** STAFF INCOME INFORMATION ************");
       System.out.println("************************************************");
       System.out.println("INCOME TYPE        : " + income.getIncomeType());       
       System.out.println("INCOME AMOUNT      : " + "RM" + income.getAmount());
       System.out.println("INCOME TAX         : " + income.getTax() + "%");
       System.out.println("Total Tax Paid     : " + "RM" + income.getTotalTax());
       System.out.println("Total Net Income   : " + "RM" + calculateNetIncome());
       System.out.println("********* Thank you for the information ********");

     } // end of display income info
   } // end of class staff



 