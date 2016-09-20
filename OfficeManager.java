// Customer class
package officemanager;
import officemanager.TextForCustomer;
import java.util.*;
import java.io.*;
public class Customer 
{
    // Instance variable for the class Package for CUSTOMER
    private Scanner readFrom = new Scanner(System.in);
    private CustomerVariables cusVar = new CustomerVariables();
    // This method will create a new FILE with extension
	public void createNewFile()
	{
            try
            {
		cusVar.create = new Formatter("Customers.txt");
                cusVar.create.format("%s%10s%10s%10s%10s",cusVar.text.nameHeader,cusVar.text.accountHeader,cusVar.text.ageHeader,cusVar.text.priceHeader,cusVar.text.paymentHeader);
            }
            catch(Exception createError)
            {
                System.err.println("%n%s"+cusVar.text.createError +"%s" +createError.getClass());
            }
	}
	// This method will write to the file 
	public void writeOn()
	{
            try
            {
                System.out.printf("%s%n",cusVar.text.Question1);
                int howMany = this.readFrom.nextInt();
                for (int dontExceed = this.cusVar.toQuit; dontExceed <= howMany; dontExceed++)
                {    
                    System.out.printf("%n%20s%10s%10s%10s%10s%n%n",cusVar.text.enterName,cusVar.text.enterAccount,cusVar.text.enterAge,cusVar.text.enterProductPrice,cusVar.text.enterPayment);
                    cusVar.create.format("%n%s",this.cusVar.fullName = this.readFrom.next());
                    cusVar.create.format("%n%s",this.cusVar.accountNumber = this.readFrom.nextLine());
                    cusVar.create.format("%n%d",this.cusVar.age = this.readFrom.nextInt());
                    cusVar.create.format("%n%.2f",cusVar.productPrice = this.readFrom.nextDouble());
                    cusVar.create.format("%n%.2f",this.cusVar.accountBalance = this.readFrom.nextDouble());
                }
            }
            catch (Exception dataError)
            {
                System.err.println("%s"+dataError.getClass());
            }
            System.err.println("Saved succesfullly");
	}
        // Whenver you are writing or creating or reading from a file or to a file , Dont forget to close 
        public void closeOpearion()
        {
            if (cusVar.create != null)
                cusVar.create.close();
        }
        public void command()
        {
            createNewFile();
            writeOn();
            closeOpearion();
        }
}


package officemanager;
import officemanager.TextForCustomer;
import java.util.*;
import java.io.*;
public class Customer 
{
    // Instance variable for the class Package for CUSTOMER
    private Scanner readFrom = new Scanner(System.in);
    private CustomerVariables cusVar = new CustomerVariables();
    // This method will create a new FILE with extension
	public void createNewFile()
	{
            try
            {
		cusVar.create = new Formatter("Customers.txt");
                cusVar.create.format("%s%10s%10s%10s%10s",cusVar.text.nameHeader,cusVar.text.accountHeader,cusVar.text.ageHeader,cusVar.text.priceHeader,cusVar.text.paymentHeader);
            }
            catch(Exception createError)
            {
                System.err.println("%n%s"+cusVar.text.createError +"%s" +createError.getClass());
            }
	}
	// This method will write to the file 
	public void writeOn()
	{
            try
            {
                System.out.printf("%s%n",cusVar.text.Question1);
                int howMany = this.readFrom.nextInt();
                for (int dontExceed = this.cusVar.toQuit; dontExceed <= howMany; dontExceed++)
                {    
                    System.out.printf("%n%20s%10s%10s%10s%10s%n%n",cusVar.text.enterName,cusVar.text.enterAccount,cusVar.text.enterAge,cusVar.text.enterProductPrice,cusVar.text.enterPayment);
                    cusVar.create.format("%n%s",this.cusVar.fullName = this.readFrom.next());
                    cusVar.create.format("%n%s",this.cusVar.accountNumber = this.readFrom.nextLine());
                    cusVar.create.format("%n%d",this.cusVar.age = this.readFrom.nextInt());
                    cusVar.create.format("%n%.2f",cusVar.productPrice = this.readFrom.nextDouble());
                    cusVar.create.format("%n%.2f",this.cusVar.accountBalance = this.readFrom.nextDouble());
                }
            }
            catch (Exception dataError)
            {
                System.err.println("%s"+dataError.getClass());
            }
            System.err.println("Saved succesfullly");
	}
        // Whenver you are writing or creating or reading from a file or to a file , Dont forget to close 
        public void closeOpearion()
        {
            if (cusVar.create != null)
                cusVar.create.close();
        }
        public void command()
        {
            createNewFile();
            writeOn();
            closeOpearion();
        }
}

// New class
package officemanager;
public class TextForCustomer 
{
	public String createError = "Ooops I can create this because";
	public String enterName = "Enter Full Name";
	public String enterAccount = "Enter Account Number";
	public String enterAge = "Enter Age";
	public String enterProductPrice = "Enter Product Price";
	public String enterPayment = "Enter the price the customer is paying";
        public String toQuitPress ="( To quit Enter 0 ) ";
}
