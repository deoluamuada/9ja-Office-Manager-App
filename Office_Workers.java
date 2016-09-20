package officemanager;
import java.io.*;
import java.util.*;
public class CustomerVariables 
{
    public String fullName, accountNumber;
    public int age;
    public double accountBalance, productPrice;;;;;;;;;;;;;;;;;;;;;;;;;;;
    public int toQuit = 1;
    // Instance variable for the class Package
    public Formatter create;
    public TextForCustomer text = new TextForCustomer();
}
	package java4nigeria;
	import java.io.*;
	import java.util.*;
	import java.math.*;
	public class Election implements Serializable
	{
    		private String fullName;
    		private int age, numberOfVotes, noOfContenstant, lowVotes;
    		private final int ONE = 1;
    		private Scanner myReader = new Scanner (System.in);
    	public void findWinner()
    	{
        	System.out.printf("How many contenstant ? ");
        	int howManyC = myReader.nextInt();
        	this.noOfContenstant = howManyC;
        	for (int contenstant = ONE; contenstant <= this.noOfContenstant; contenstant++)
        	{
        	 	System.out.printf("%n%n%10s%15s%10s%n%n", "Contenstant Name"," Contenstant Age ","Number of Votes");
        	 	String name = myReader.next();
            	 	int age = myReader.nextInt();
            		int votes = myReader.nextInt();
            		this.age = age;
            		this.numberOfVotes = votes;
            		this.fullName = name;
        	}   
            	System.out.printf("%n %s", contenstantNameValidator(this.fullName)? "Valid Contenstant NAME" : "Invliad Contenstant Name");
        	System.out.printf("%n%n%s%15s%5s","FULL-NAME","AGE"," NO. OF VOTE");
            	for (int countAllContenstant = ONE; countAllContenstant <= this.noOfContenstant; countAllContenstant++)
            	{
                	System.out.printf("%n%n(%d).%15s%10d%5d", countAllContenstant, this.fullName, this.age, this.numberOfVotes);
        	}
                	System.out.printf("%n The winner is %s : with %d%n%n",this.fullName.toUpperCase(), Math.max(this.numberOfVotes, this.numberOfVotes));
        
    }
    
    public void displayAllContenstant()
    {
        System.out.printf("%n%n%s%15s%5s","FULL-NAME","AGE"," NO. OF VOTE");
        for (int countAllContenstant = ONE; countAllContenstant <= this.noOfContenstant; countAllContenstant++)
        {
            System.out.printf("%n%n(%d).%15s%10d%5d", countAllContenstant, this.fullName, this.age, this.numberOfVotes);
        }
       System.out.printf("%n The winner is %s : with %d%n%n",this.fullName.toUpperCase(), Math.max(this.numberOfVotes, this.numberOfVotes));
    }
    
    public boolean contenstantNameValidator( String contenstantName)
    {
        return contenstantName.matches("[a-zA-Z-]+");
    }
    
}

// This method willl serialize and deserialed data
import java.io.*;
import java.util.*;
public class Main
{
    private static Scanner myReader = new Scanner(System.in);
    public static void main(String [] args)
    {
        try
        {
            File data1 = new File ("WorkersFile.txt");
           
            PrintWriter toWorkers = new PrintWriter(data1);
            FileOutputStream workersFO = new FilesOutPutStream(data1);
            ObjectOutputStream workersOO = new ObjectOutputStream(workesFO);
            workersOO.writeObject(workersData);
            System.out.println("Enter Full Name : ");
            String fullName = myReader.nextLine();
            System.out.println("Enter Age : ");
            String age = myReader.nextLine();
            toWorkers.printf("%s %n%n", isFullNameCorrect(fullName) ? "Correct Full Name***" : "Incorrect Full Name");
            toWorkers.println(fullName);
            toWorkers.printf("%s %n%n", isAgeCorrect(age) ? "Correct Age***" : "Incorrect age///");
            toWorkers.println(age);
            toWorkers.close();
            workersOO.close();
            workersFO.close();
            try 
            {
                Scanner readFromText = new Scanner(data1);
                System.out.println(readFromText.nextLine() + readFromText.nextLine());
            }
            catch (Exception newError)
            {
                System.out.println("Hmmm" + newError.getClass());
            }
             
        }
        catch(Exception error)
        {
            System.out.println("Ooops" +error.getClass());
        }
    }
    
    public static boolean isFullNameCorrect( String correctFullName)
    {
       return correctFullName.matches("[A-Za-z]+");
    }
    public static boolean isAgeCorrect (String correctAge)
    {
        return correctAge.matches("[0-9]{1,2}");
    }
    
}
// ANOTHER CLASS WITH ANOTHER FUNCTION 
package pkg9jaoffice;
import java.io.*;
import java.net.URL;
import pkg9jaoffice.Text;
public class Main implements Serializable
{
    private CompanysAttributes ca = new CompanysAttributes();
    public static void main ( String [] args )
    {
        try
        {
            File path = new File ("Ooops.text");
            System.out.println("hmmm" +path.getAbsolutePath());
            System.out.println("oopss" +path.exists());
            
            URL newUrl =  new URL ("http://localhost:8084/check.php");
            InputStream readFrom = newUrl.openStream();
            BufferedReader newBI = new BufferedReader (new InputStreamReader(readFrom));
            String msg = newBI.readLine();
            String msg2 = newBI.lines().toString();
            
            while (msg != null)
            {
                System.out.println("" +msg);
                msg = newBI.readLine();
                System.out.println("" +msg2);
                msg2 = newBI.readLine().toString();
            }
            System.out.println("EEEH!!!I m done");
            
        }
        catch (Exception fileCallingError)
        {
            System.err.printf("%n%s %s",Text.fileCallingStringError, fileCallingError.getClass());
        }
    }
    
    public void callWorkers()
    {
        System.out.printf("%s %10s",ca.workersFullName,ca.workersMobileNumber );
    }
}
// TESTER CLASS TO FIND  WORKERS STRING
package tester;
public class Tester {

  static char[]  str=null;

    public static void main(String s[]) {
      if(s.length==0)
        System.exit(-1);

       str=s[0].toCharArray();

       int begin=0;
       int end=str.length-1;

       System.out.print("Original string=");
       for(int i=0; i<str.length; i++){
         System.out.print(str[i]);
       }

       while(begin<end){
          str[begin]= (char) (str[begin]^str[end]);
          str[end]= (char)   (str[begin]^str[end]);
          str[begin]= (char) (str[end]^str[begin]);

          begin++;
          end--;       
       }

       System.out.print("\n" + "Reversed string=");
       for(int i=0; i<str.length; i++){
         System.out.print(str[i]);
       }

    }
}
// wORKERS CREATOR CLASS ( CREATE , READ AND UPDATE DATA FOR WORKES ON TABLE)
package pkg9jaoffice;
import java.io.*;
import java.math.BigDecimal;
import java.util.Calendar;
public class WorkersCreator
{
   
    private String fullName, mobileNumber, department;
    private int age, jobType, countWorkers;
    private int ID = 1;
    private double salary;
    // Instance variables of my used API
    private Scanner register = new Scanner(System.in);
    private Formatter workersRegistrationFile;
    private final MenuForWorkers[] youSelect = MenuForWorkers.values();
    private MenuForWorkers whoIsThatWorker;
    private ObjectOutputStream writeThisOn;

    public void openRegistrationFileForWorkers() 
    {
        try 
        {
            this.writeThisOn = new ObjectOutputStream (Files.newOutputStream(Paths.get("Registered Workers.fromBadmus")));
        } catch (Exception fileNotFound) {
            System.err.println("Ooop !!! File not find " + fileNotFound.getClass());
        }
        createNewWorkers();
        openAndModifyWorkersFile();
        closeWorkersFile();

    }

    public void openAndModifyWorkersFile() 
    {
        try 
        {
            this.register = new Scanner(Paths.get("Registered Workers.txt"));
        } catch (Exception iCantOpenThis) {
            System.err.println("Ooops" + iCantOpenThis.getClass());
        }
    }

    public void createNewWorkers() 
    {
        String pageHeader = String.format("%s", "All Workers List");
        String totalNumberOfWorkers = String.valueOf(ID);
        this.workersRegistrationFile.format("%s%n%n", pageHeader);
        try 
        {
            System.out.printf("How many workers do you want to add ? ");
            int numbersOfWorkers = this.register.nextInt();
            for (countWorkers = 0; countWorkers < numbersOfWorkers; countWorkers++) 
            {
                System.out.printf("Full-Name %15s%n", "Age");
                this.fullName = this.register.next();
                this.mobileNumber = this.register.next();
                WorkersAttribute oops = new WorkersAttribute("%n%n. %s - %20d%n%n", verifyFullName(this.fullName) ? "Valid Name" : "Invalid Name",
                        verifyMobileNumber(this.mobileNumber) ? "Valid Mobile" : "Invalid Mobile");
                this.writeThisOn.writeObject(reg);
                String regData = String.format("%n%s %20s", this.fullName.toUpperCase(), this.mobileNumber);
                this.writeThisOn.writeObject(regData);

            }
            this.workersRegistrationFile.format("%n%nTotal number of workers is ( %s ).", countWorkers);
        } catch (Exception registrationError) 
        {
            System.err.println("Check your input data very well " + registrationError.getClass());
        }
    }

    public void closeWorkersFile() 
    {
        if (this.workersRegistrationFile != null) 
        {
            this.workersRegistrationFile.close();
        }
    }

    // I am validating here using boolean return type
    public boolean verifyFullName(String correctFullName) 
    {
        return correctFullName.matches("[a-zA-Z-]+");
    }

    public boolean verifyMobileNumber(String correctMobileNumber) 
    {
        return correctMobileNumber.matches("[0-9]{10,13}");
    }
    // Validation methods ends here

    enum MenuForWorkers 
    {
        AGELESSTHAN30(1),
        AGEGREATERTHAN30(2),
        FROMNIGERIA(3),
        OUTSIDENIGERIA(4),
        CLOSE(5);

        MenuForWorkers(int howManyMenu) 
        {
            int menuNotMoreThan = howManyMenu;
        }
    }

    public MenuForWorkers processTheSelectedMenu() 
    {
        String menuHeader1 = String.format("%n%s%n", "1 - Age of workers less than 30".toUpperCase());
        String menuHeader2 = String.format("%s%n", "2 - Age of workers greater than 30".toUpperCase());
        String menuHeader3 = String.format("%s%n", "3 - Workers from Nigeria".toUpperCase());
        String menuHeader4 = String.format("%s%n", "4 - Workers from Ouside Nigeria".toUpperCase());
        String menuHeader5 = String.format("%s%n", "5 - Close this Menu".toUpperCase());
        String allMenuHeaderForWorkers = String.format(" %s%s%s%s%s", menuHeader1, menuHeader2, menuHeader3, menuHeader4, menuHeader5);

        System.out.printf("%s", allMenuHeaderForWorkers);
        int MENU_IS_NOT_MORE_THAN = 5, MENUONE = 1, LASTMENU = 5;
        try 
        {
            do 
            {
                System.out.printf("%n Enter the above menu : ");
                MENU_IS_NOT_MORE_THAN = this.register.nextInt();
            }while ((MENU_IS_NOT_MORE_THAN < MENUONE) || (MENU_IS_NOT_MORE_THAN < LASTMENU));

        }
        catch (Exception menuError) 
        {
            System.err.println("Ooops !!!Out of the normal menu selection" + menuError);
        }

        return youSelect[MENU_IS_NOT_MORE_THAN - MENUONE];
    }

    public boolean iFind(MenuForWorkers iam, int age, String location) 
    {
        int AGE30 = 30, AGE30ABOVE = 31;
        if ((iam == MenuForWorkers.AGELESSTHAN30) && (age <= AGE30)) 
        {
            return true;
        } else if ((iam == MenuForWorkers.AGEGREATERTHAN30) && (age >= AGE30ABOVE)) 
        {
            return true;
        }
        return false;
    }

// New method that find stuff
    public void iAmLookingFor(MenuForWorkers workersType) 
    {
        try (Scanner iWantToGet = new Scanner(Paths.get("Registered Workersq.txt"))) 
        {
            if (iFind(workersType, this.age, this.mobileNumber)) 
            {
                System.out.printf("%s %10d %5s", this.fullName, this.age, this.mobileNumber);
            } 
            else 
            {
                openRegistrationFileForWorkers();
            }
        } catch (Exception iCantFind) 
        {
            System.err.println("Ooops . I can't find " + iCantFind.getClass());

        }

    }

    public void iNeedThisInfo() 
    {
        whoIsThatWorker = processTheSelectedMenu();
        while (whoIsThatWorker != MenuForWorkers.CLOSE) 
        {
            switch (whoIsThatWorker) 
            {
                case AGELESSTHAN30:
                    System.out.printf("%n The worker is less than age 30%n");
                    break;
                case AGEGREATERTHAN30:
                    System.out.printf("%n The worker is greater than age 30%nn");
                    break;
                case FROMNIGERIA:
                    System.out.printf("%n The worker is less than age 30%n");
                    break;
                case OUTSIDENIGERIA:
                    System.out.printf("%n The worker is greater than age 30%nn");
                    break;
            }
        }
        iAmLookingFor(whoIsThatWorker);
        whoIsThatWorker = processTheSelectedMenu();
    }
    
    class WorkersAttribute implements Serializable
    {
       // Instance variable for workers or the attributes of the worker
    private String fullName, mobileNumber, department;
    private int age, jobType, countWorkers;
    private int ID = 1;
    private double salary;
    // Instance variables of my used API
    private Scanner register = new Scanner(System.in);
    private Formatter workersRegistrationFile;
    private final MenuForWorkers[] youSelect = MenuForWorkers.values();
    private MenuForWorkers whoIsThatWorker;
    private ObjectOutputStream writeThisOn;
    
    WorkersAttribute(String newName ,String newMobile)
    {
        this.fullName = newName;
        this.mobileNumber = newMobile;
    }
    }
    
    
    class WorkerSalarryUnit {
  static final String dataFile = "invoicedata";

  static final BigDecimal[] prices = { new BigDecimal("19.99"),
      new BigDecimal("9.99"), new BigDecimal("15.99"), new BigDecimal("3.99"),
      new BigDecimal("4.99") };
  static final int[] units = { 12, 8, 13, 29, 50 };
  static final String[] descs = { "Java Developer", "Project manager",
      "Python Developer", "SOftware Manager", "Tester" };
}
out.writeObject(Calendar.getInstance());
      for (int i = 0; i < prices.length; i++) {
        out.writeObject(prices[i]);
        out.writeInt(units[i]);
        out.writeUTF(descs[i]);
      }
    } finally {
      out.close();
    }
ObjectInputStream in = null;
    try {
      in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(
          dataFile)));
Calendar date = null;
      BigDecimal price;
      int unit;
      String desc;
      BigDecimal total = new BigDecimal(0);

      date = (Calendar) in.readObject();
 System.out.format("On %tA, %<tB %<te, %<tY:%n", date);

      try {
        while (true) {
          price = (BigDecimal) in.readObject();
          unit = in.readInt();
          desc = in.readUTF();
          System.out.format("We paid %d units of %s at $%.2f%n", unit,
              desc, price);
          total = total.add(price.multiply(new BigDecimal(unit)));
        }
} catch (EOFException e) {
      }
      System.out.format("For a TOTAL of: $%.2f%n", total);
    } finally {
      in.close();
    }
  }
}




// Join - Join classes



package pkg9jaoffice;
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import pkg9jaoffice.Text;
public class Main implements Serializable
{
    private CompanysAttributes ca = new CompanysAttributes();
     public static void main ( String [] args )
    {
        try
        {
            CompanysAttributes details  = new CompanysAttributes();
            details.workersFullName = details.fullNameTesting;
            details.workersMobileNumber = details.workersMobileNumberTesting;
            FileOutputStream callWorkersThroughFile = new FileOutputStream(Text.callWorkersWithThisFile);
            ObjectOutputStream writeAndCallOn = new ObjectOutputStream (callWorkersThroughFile);
            writeAndCallOn.writeObject(details);
            System.err.println("" +Text.calling);
        }
        catch (Exception fileCallingError)
        {
            System.err.printf("%n%s %s",Text.fileCallingStringError, fileCallingError.getClass());
        }
    }
    
    public void callWorkers()
    {
        System.out.printf("%s %10s",ca.workersFullName,ca.workersMobileNumber );
    }
}

package pkg9jaoffice;
import pkg9jaoffice.CompanysAttributes;
public class Text 
{
    protected static String fileCallingStringError = String.format("Ooops !!! I can't call this because ");
    protected static String callWorkersWithThisFile = String.format("CallWorkersOn.ser");
    protected static String calling = String.format("I am Caling.... %s ON %s",CompanysAttributes.fullNameTesting, CompanysAttributes.workersMobileNumber );

}


package pkg9jaoffice;
import java.io.Serializable;

public class CompanysAttributes implements Serializable
{
   protected static String workersFullName;
   protected static String fullNameTesting = "AMUDA_ADEOLU_BADMUS";
   protected static String workersMobileNumber;
   protected static String workersMobileNumberTesting = "+2349037579666";
   protected static transient int age;
}

// Joing this class to create , update and delete workers



package scholar_land;

import javax.swing.table.DefaultTableModel;


public class ScholarInfo extends javax.swing.JFrame {
// Constructor
    public ScholarInfo() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
                        
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        scholarTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        locationHeader = new javax.swing.JLabel();
        scholarField = new javax.swing.JLabel();
        scholarName = new javax.swing.JTextField();
        location = new javax.swing.JTextField();
        specialization = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        scholarCategory = new javax.swing.JComboBox();
        scholarLabel = new javax.swing.JLabel();
        locationLabel = new javax.swing.JLabel();
        specializationLabel = new javax.swing.JLabel();
        createNewScholar = new javax.swing.JButton();
        updateScholar = new javax.swing.JButton();
        deleteScholar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Scholar's Information");
        setBackground(new java.awt.Color(153, 153, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setResizable(false);

        scholarTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 102, 0), new java.awt.Color(0, 153, 51), new java.awt.Color(255, 255, 102), new java.awt.Color(0, 51, 204)));
        scholarTable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        scholarTable.setForeground(new java.awt.Color(0, 153, 51));
        scholarTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Scholar Name", "Category", "Location", "Area Of Specialization"
            }
        ));
        jScrollPane1.setViewportView(scholarTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Scholar Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Category");

        locationHeader.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        locationHeader.setText("Location");

        scholarField.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        scholarField.setText("Specialization");

        scholarName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        specialization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                specializationActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scholar_land/AH Logo free download copy.png"))); // NOI18N
        jLabel5.setText("   CREATE NEW SCHOLAR'S INFORMATION");

        scholarCategory.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        scholarCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Past Scholar", "Present Scholar", "Student Of Knowledge" }));

        scholarLabel.setForeground(new java.awt.Color(255, 0, 0));

        locationLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        locationLabel.setForeground(new java.awt.Color(255, 0, 0));

        specializationLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        specializationLabel.setForeground(new java.awt.Color(255, 0, 51));

        createNewScholar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        createNewScholar.setForeground(new java.awt.Color(0, 51, 51));
        createNewScholar.setText("CREATE NEW SCHOLAR");
        createNewScholar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNewScholarActionPerformed(evt);
            }
        });

        updateScholar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updateScholar.setForeground(new java.awt.Color(0, 0, 204));
        updateScholar.setText("UPDATE");
        updateScholar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateScholarActionPerformed(evt);
            }
        });

        deleteScholar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deleteScholar.setForeground(new java.awt.Color(255, 0, 0));
        deleteScholar.setText("Delete");
        deleteScholar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteScholarMouseClicked(evt);
            }
        });
        deleteScholar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteScholarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scholarName, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addComponent(scholarCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(95, 95, 95)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(locationHeader)
                        .addGap(113, 113, 113)
                        .addComponent(scholarField)
                        .addGap(69, 69, 69))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(specializationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(specialization, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(createNewScholar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updateScholar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addComponent(deleteScholar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scholarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(locationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(212, 212, 212))))
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(locationHeader)
                    .addComponent(scholarField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(scholarName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(location, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scholarCategory, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(specialization, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scholarLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(locationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(specializationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateScholar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createNewScholar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteScholar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );

        getAccessibleContext().setAccessibleName("Scholar's Information");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void specializationActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

   // Create Button command
    private void createNewScholarActionPerformed(java.awt.event.ActionEvent evt) {                                                 
     this.scholarLabel.setText("New Scholar Information Added...".toUpperCase());
     
     DefaultTableModel createCommand = (DefaultTableModel) this.scholarTable.getModel();
     if(!this.scholarName.getText().trim().equals(""))
     {
              createCommand.addRow(new Object[]{this.scholarName.getText().toUpperCase(),
              this.scholarCategory.getSelectedItem().toString().toUpperCase(),this.location.getText().toUpperCase()
             ,this.specialization.getText().toUpperCase()});
              
     }
     else
     {
         this.scholarLabel.setText("Enter Scholar Full-Name".toUpperCase());
         
     }
     
    }                                                
    // Update button command
    private void updateScholarActionPerformed(java.awt.event.ActionEvent evt) {                                              
       
       this.scholarTable.setToolTipText("Update is successfull...".toUpperCase());
       DefaultTableModel update = (DefaultTableModel) this.scholarTable.getModel();
       if(this.scholarTable.getSelectedRow() == -1)
       {
           if(this.scholarTable.getRowCount() == 0)
           {
                this.specializationLabel.setText("Imput Something".toUpperCase());
           }
           else
           {
                this.locationLabel.setText("Slelect something");
           }
       }
       
       else
       {
           update.setValueAt(this.scholarName.getText().toUpperCase(), this.scholarTable.getSelectedRow(), 0);
           update.setValueAt(this.scholarCategory.getSelectedItem().toString().toUpperCase(), this.scholarTable.getSelectedRow(), 1);
           update.setValueAt(this.location.getText().toUpperCase(), this.scholarTable.getSelectedRow(), 2);
           update.setValueAt(this.specialization.getText(), this.scholarTable.getSelectedRow(), 3);
       }
       
    }                                             

// Delete button command
    private void deleteScholarMouseClicked(java.awt.event.MouseEvent evt) {                                           
       DefaultTableModel delete = (DefaultTableModel) this.scholarTable.getModel();
       this.scholarName.setText(delete.getValueAt(this.scholarTable.getSelectedRow(), 0).toString());
       this.scholarCategory.setSelectedItem(delete.getValueAt(this.scholarTable.getSelectedRow(), 1).toString());
       this.location.setText(delete.getValueAt(this.scholarTable.getSelectedRow(), 2).toString());
       this.specialization.setText(delete.getValueAt(this.scholarTable.getSelectedRow(), 3).toString());

    }                                          

    private void deleteScholarActionPerformed(java.awt.event.ActionEvent evt) {                                              
        this.scholarLabel.setText("Delete Succesfully");
        DefaultTableModel delete = (DefaultTableModel) this.scholarTable.getModel();
        if(this.scholarTable.getSelectedRow() == -1)
        {
           if(this.scholarTable.getRowCount() == 0)
           {
               this.locationLabel.setText("Dump: Enter Data before deletion");
           }
           else
           {
               this.scholarLabel.setText("Mr Dump : Select Something !!! ");
           }
        }
        else
        {
            delete.removeRow(this.scholarTable.getSelectedRow());
        }
    }                                             

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ScholarInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ScholarInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ScholarInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ScholarInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScholarInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify    or else ..........hmmmmm                 
    private javax.swing.JButton createNewScholar;
    private javax.swing.JButton deleteScholar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField location;
    private javax.swing.JLabel locationHeader;
    private javax.swing.JLabel locationLabel;
    private javax.swing.JComboBox scholarCategory;
    private javax.swing.JLabel scholarField;
    private javax.swing.JLabel scholarLabel;
    private javax.swing.JTextField scholarName;
    private javax.swing.JTable scholarTable;
    private javax.swing.JTextField specialization;
    private javax.swing.JLabel specializationLabel;
    private javax.swing.JButton updateScholar;
    // End of variables declaration                   
}










// Wokers finder



package pkg9jaoffice;

public class Main 
{
    public static void main(String[] args) 
    {
        WorkersDetails wd = new WorkersDetails();
        wd.mainWorkersProcessor();
    }
}

package pkg9jaoffice;

public enum AppMenu 
{
    UNDER_30_YEARS_WORKERS(1),
    ABOVE_30_YEARS_WORKERS(2),
    SALARY_FOR_SOFTWARE_ENGINEER(3),
    OTHERS_SALARY(4),
    CLOSE_THIS_APP(5);
    public  final int menuValue;
    private AppMenu(int menuOptions)
    {
        this.menuValue = menuOptions;
    }
}


package pkg9jaoffice;
import java.util.*;
import java.nio.file.*;

public class WorkersCreator 
{
     //Applicatiom menu options
    
    private final AppMenu [] selectedMenu = AppMenu.values();
    private final int FIRSTMENU = 1, LASTMENU = 5;
    private int TOTALMENU = 5;
    //Workers age and salary range 
    private final int WORKERS_UNDER_AGE30 = 29, WORKERS_ABOVE_AGE30 = 30;
    private final double SOFTWARE_ENGINEERS_SALARY = 10000 , OTHER_WORKERS_SALARY = 9999;
   // Workers attributes or workers String instance variable (You may add more to it)
    private String fullName, mobileNumber, department; 
    // Workers attributes or workers int instance variable (You may add more to it)
    private int age, jobType, countWorkers; private int ID = 1;
    // workers defined packages with in built function
    private double salary;     
    // to read from the user keyboard
    private Scanner register = new Scanner (System.in); 
    // for creating a new file for registered workers
    private Formatter workersRegistrationFile ; 
    
    public AppMenu getSelectedMenu()
    {
        System.out.printf("%n%s%n%s"," 1 - WORKERS UNDER THE AGE OF 30 "," 2 - WORKERS ABOVE THE AGE OF 30");
        System.out.printf("%n%s%n%s"," 3 - SALARY FOR SOFTWARE DEVELOPERS "," 4 - SALARY FOR OTHERS");
        System.out.printf("%n 5 - CLOSE THIS APP");
        try
        {
            do
            {
                Scanner workerInput = new Scanner(System.in);
                System.out.printf(" %nEnter your option ? ");
                this.TOTALMENU = workerInput.nextInt();
            }
            while( ( this.TOTALMENU < FIRSTMENU ) || ( this.TOTALMENU > LASTMENU ));
        }
        catch(NoSuchElementException abnormalMenuError)
        {
            System.out.printf ("Ooops %s", abnormalMenuError.getClass());
        }
        
        return selectedMenu[ this.TOTALMENU - FIRSTMENU ];

    }
    
    public boolean iWantToDisplay (AppMenu workersType, int workersAge, double workersSalary)
    {
        if ( (workersType == AppMenu.UNDER_30_YEARS_WORKERS ) && ( workersAge <= this.WORKERS_UNDER_AGE30 ))
            return true;
        else 
            if ((workersType == AppMenu.ABOVE_30_YEARS_WORKERS ) && ( workersAge >= this.WORKERS_ABOVE_AGE30))
            return true;
        else
            if((workersType == AppMenu.SALARY_FOR_SOFTWARE_ENGINEER) && (workersSalary >= this.SOFTWARE_ENGINEERS_SALARY ))
            return true;
        else
            if( ( workersType == AppMenu.OTHERS_SALARY ) && ( workersSalary <= this.OTHER_WORKERS_SALARY))
            return true;
        return false;
    }
    
    // This method will open  or create a text file using formatter classs
    public void openRegistrationFileForWorkers ()          
    {
      try
      {
          workersRegistrationFile = new Formatter ("Registered Workers.txt");
      }
      
      catch(Exception fileNotFound)
      {
          System.err.println("Ooop !!! File not find " + fileNotFound.getClass());
      }
      createNewWorkers();
      openAndModifyWorkersFile();
      closeWorkersFile();
    }
    public void openAndModifyWorkersFile()
    {
        try
        {
           this.register = new Scanner (Paths.get("Registered Workers.txt")); 
        }
        catch(Exception iCantOpenThis)
        {
            System.out.println("Ooops" + iCantOpenThis.getClass());
        }
    }
    public void createNewWorkers()
    {
        String pageHeader = String.format("%s", "All Workers List");
        String totalNumberOfWorkers = String.valueOf(ID);
         this.workersRegistrationFile.format("%s%n%n", pageHeader);
        try
        {
            // determine the number of times the code will loop or simply use EOF ( End of file indicator )
            System.out.printf("How many workers do you want to add ? ");
            int numbersOfWorkers = this.register.nextInt();
            for ( countWorkers = 0; countWorkers < numbersOfWorkers; countWorkers++)
               {
                    System.out.printf("Full-Name %15s%n","Mobile Number");
                    this.fullName = this.register.next();
                    this.mobileNumber = this.register.next();
                    // display this text on the page header
                    // show if what the user input is correct or not
                    workersRegistrationFile.format("%n%n%d. %s - %20s%n%n",this.countWorkers,verifyFullName(this.fullName) ? "Valid Name" :"Invalid Name",
                        verifyMobileNumber(this.mobileNumber) ? "Valid Mobile" :"Invalid Mobile");
                    this.workersRegistrationFile.format("%n%s %20s",this.fullName.toUpperCase() , this.mobileNumber );
                    // display the total number of workers
               }   
                    this.workersRegistrationFile.format("%n%nTotal number of workers is ( %s ).", countWorkers);
        }
        catch(Exception registrationError)
        {
            System.out.println("Check your input data very well "+ registrationError.getClass());
        }
    }
    
    public void readWorkersFile( AppMenu getSelectedOption)
    {
        try(Scanner readWorkers = new Scanner (Paths.get("workersDetails.txt")))
        {
            if (this.iWantToDisplay(getSelectedOption, this.age, this.salary))
                System.out.printf("%n%s %10d %5.0f%n ",this.fullName, this.age, this.salary);
            else
                readWorkers.next();
        }
        catch(Exception fileNotRead)
        {
            fileNotRead.getClass();
        }
    }
    public void mainWorkersProcessor()
    {
        try
        {
            openAndModifyWorkersFile();
            this.createNewWorkers();
            AppMenu iSelected = this.getSelectedMenu();
            while (iSelected != AppMenu.CLOSE_THIS_APP)
            {
                switch(iSelected)
                {
                    case UNDER_30_YEARS_WORKERS:
                        System.out.printf("%nWORKERS UNDER THE AGE OF 30%n");
                        break;
                    case ABOVE_30_YEARS_WORKERS:
                        System.out.printf("%nWORKERS ABOVE THE AGE OF 30%n");
                        break;
                    case SALARY_FOR_SOFTWARE_ENGINEER:
                        System.out.printf("%nSALARY FOR SOFTWARE ENGINEERS%n");
                        break;
                    case OTHERS_SALARY:
                        System.out.printf("%nSALARY FOR OTHERS%n");
                        break;    
                }
                    this.readWorkersFile(iSelected);
                    iSelected = this.getSelectedMenu();
            }
        }
        
        catch(Exception error )
        {
            error.getClass();
            System.exit(1);
        }
    }
    
    public void closeWorkersFile()
    {
        if (this.workersRegistrationFile != null )
            this.workersRegistrationFile.close();
    }
    
    public boolean verifyFullName(String correctFullName)
    {
        return correctFullName.matches("[a-zA-Z-]+");
    }
    public boolean verifyMobileNumber(String correctMobileNumber)
    {
        return correctMobileNumber.matches("[0-9]{10,11}");
    }
}

package searchnumber;

import javax.swing.JOptionPane;
public class SearchNumber
{
	private statci final DATA_SIZE = 20;  	
	// length of my number is 20 i.e my num variable can not take more than 20 elememnt ( Counting from 0 -19 )
	public static void main(String args[])
	{
		String number, ask="";
	        int num[]=new int[DATA_SIZE];
		int z,found,i;
		int counter = 1 ;
		found=1;	
		JOptionPane.showMessageDialog(null,"Enter 5 Numbers: [ %d ]" +counter);
		for(i=1; i<=5; i++)
		{
			n=JOptionPane.showInputDialog(+i);
			num[i]=Integer.parseInt(number);
			ask+=num[i];
			ask+=" ";
                        counter++;
		}
		
		number=JOptionPane.showInputDialog("Number to be Search: ");
		z=Integer.parseInt(number);
		
		for(i=1; i<=10; i++)
		{
			if(z==num[i])
			{
				if(found==1)
					JOptionPane.showMessageDialog(null,"Your Numbers are: "+a+"\n"+" "+z+"  Found!!");
			}
		}
		JOptionPane.showMessageDialog(null,"Your Numbers are: "+a+"\n"+"                "+z+"  Not Found!!");
	}
}

//

package binarysearch;
import java.util.Scanner;
 
class BinarySearch 
{
  public static void main(String args[])
  {
    int c, first, last, middle, n, search, array[];
 
    Scanner in = new Scanner(System.in);
    System.out.println("Enter number of elements");
    n = in.nextInt(); 
    array = new int[n];
 
    System.out.println("Enter " + n + " integers");
    
    for (c = 0; c < n; c++)
    array[c] = in.nextInt();
    System.out.println("Enter value to find");
    search = in.nextInt();
    first  = 0;
    last   = n - 1;
    middle = (first + last)/2;
 
    while( first <= last )
    {
      if ( array[middle] < search )
        first = middle + 1;    
      else if ( array[middle] == search ) 
      {
        System.out.println(search + " found at location " + (middle + 1) + ".");
        break;
      }
      else
         last = middle - 1;
 
      middle = (first + last)/2;
   }
   if ( first > last )
      System.out.println(search + " is not present in the list.\n");
  }
}

//




package mywindowsearch;

import java.awt.*;
import java.awt.event.*;
import javax.swing.* ;
import javax.swing.event.*;
import javax.swing.JOptionPane;
import javax.swing.text.*;
//Read line input.
import java.io.*; //to handle RandomAccessFile



public class MyWindowSearch extends JFrame
  implements ListSelectionListener, ActionListener{
	
	protected JButton bLookin, bText, bExit, bHelp, bAbout, bCopy;
	private JTextField tLookin, tText, tStatus;
	private JLabel lLookin, lText, lResults, lStatus;
	private Container c ;
	private JList list;
	private DefaultListModel model;
	private JPanel left, right, south;
	private JTextArea tContent;
	public long count;
	public static final byte BUFFER_SIZE=100;
	private JFileChooser chooser = new JFileChooser();
		
public MyWindowSearch(){
	
	super(" MySearch by E- Badmus - Junior Software Developer");
	int WIDTH = 600;
	int HEIGHT = 300;
	
	setup();
	
	Toolkit kit = Toolkit.getDefaultToolkit();
	Dimension screenSize = kit.getScreenSize();
 	int screenHeight = screenSize.height;
 	int screenWidth = screenSize.width;

 	// center frame in screen
	setSize(WIDTH, HEIGHT);
	setLocation((screenWidth-WIDTH) / 2, (screenHeight-HEIGHT) / 2);
	// set frame icon
	Image img = kit.getImage("icon.jpg");
	setIconImage(img);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	show();
	
	}
	
	/**
    * The setup() method is used to allocate the panel and
    * button objects using the new function.
    */
   public void setup()   {
      c = getContentPane() ;


      /** setup text field and panel */
      lLookin  = new JLabel("Look in: ", JLabel.RIGHT) ;
      lLookin.setDisplayedMnemonic('L');
      tLookin = new JTextField(15);
      tLookin.setToolTipText("Enter path to search.");
      bLookin = new JButton("Browse");
      bLookin.setMnemonic('B');
      bLookin.addActionListener(this);
      
      lText = new JLabel("Containing text: ", JLabel.RIGHT);
      lText.setDisplayedMnemonic('t');
      tText = new JTextField(13);
      tText.setToolTipText("Enter word to search.");
      bText = new JButton("Search Now");
      bText.setMnemonic('S');
      bText.addActionListener(this);
      
      lResults = new JLabel("Results:");
      lStatus = new JLabel("mySearch:");
      
      tStatus = new JTextField(22);
      tStatus.setEditable(false);
      tStatus.setText("Ready");
      
      
      model = new DefaultListModel();
      
      list = new JList(model);
      // Monitor all list selections
      list.addListSelectionListener(this);
      list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
      
      JScrollPane listpane = new JScrollPane(list);
            
      left = new JPanel() ;
      
      left.add(lLookin);
      left.add(tLookin);
      left.add(bLookin);
      
      left.add(lText);
      left.add(tText);
      left.add(bText);
      
      left.add(lResults);
      left.add(listpane);
      
      left.add(lStatus);
      left.add(tStatus);

      c.add(left , BorderLayout.CENTER) ;
      // right panel
      tContent = new JTextArea(12,20);
                
      //tContent.setLineWrap(true); //uncomment this line if u want to line wrap in ur file's content
	  
	  JScrollPane contentpane = new JScrollPane(tContent);
      
      right = new JPanel();
      right.add(contentpane);
      c.add(right, BorderLayout.EAST);
      //Exit panel
      bExit = new JButton("Exit");
      bExit.setMnemonic('x');
      bExit.addActionListener(this);
      
      bCopy = new JButton("Copy all to");
      bCopy.setMnemonic('C');
      bCopy.addActionListener(this);
      
      bHelp = new JButton("Help");
      bHelp.setMnemonic('H');
      bHelp.addActionListener(this);
      
      bAbout = new JButton("About");
      bAbout.setMnemonic('A');
      bAbout.addActionListener(this);
      
      south = new JPanel();
      south.add(bExit);
      south.add(bCopy);
      south.add(bHelp);
      south.add(bAbout);
      
           
      c.add(south, BorderLayout.SOUTH);
      
      // set up file chooser
	  chooser.setCurrentDirectory(new File("."));
      chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
           
}

//** actionPerformed() **/
public void actionPerformed( ActionEvent e ){
	if (e.getSource() == bLookin){
		// show file chooser dialog
		int result = chooser.showOpenDialog(MyWindowSearch.this);
 		if(result == JFileChooser.APPROVE_OPTION)
 		{
 			tLookin.setText(chooser.getSelectedFile().getPath());
		}
			
		
	}
	else if (e.getSource() == bText){
		if (tLookin.getText().length()<=0){
			JOptionPane.showMessageDialog(null,"Enter a correct path to search","mySearch",2);
			bLookin.requestFocus();
			return;
		}
		if (tText.getText().length()<=0){
			JOptionPane.showMessageDialog(null,"Enter a text to search","mySearch",2);
			tText.requestFocus();
			return;
		}
		
                
		File strPath = new File(tLookin.getText());
		if (strPath.isDirectory()==true)
		{
			// clear old list, old content
			count = 0;
			model.removeAllElements();
			tContent.setText("");
					
			String path = tLookin.getText();
			File dir = new File(path);
			itmanvn(dir);
			
			if (count==0) 
				tStatus.setText("Search complete. No results to display");
			else
				tStatus.setText(count+" file(s) found. Click on file to view content");

		}
		else
			{
				JOptionPane.showMessageDialog(null,"Wrong path","mySearch",2);
				tLookin.selectAll();
				tLookin.requestFocus();
			}
	}
	else if (e.getSource() == bExit){
		if (JOptionPane.showConfirmDialog(null,"Are you sure you want to Your DeepWindowSearchexit?","mySearch",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION)
		{	
			System.out.println();
			System.out.println("Thank You For Using myDeepWindowSearch Developed by E-Badmus.");
			System.out.println();
			System.exit(0);
		}
	}
	else if (e.getSource() == bHelp){
		JOptionPane.showMessageDialog(null,"MyWindowSearch v1.0 Developed by E- Badmus." + "\n" + "Easy to make A Deep Search Through Your Windows . For more developer@oysec.com"+ "\n" + "or Email me at - badmusamuda@gmail.com"+ "\n" + "My Homepage - www.9jadeveloper.com");	
	}
	else if (e.getSource() == bAbout){
		Runtime rt = Runtime.getRuntime();
            String[] callAndArgs = { "c:\\Program Files\\Internet Explorer\\IExplore.exe" ,
                           "http://9jadeveloper.com" };
            try {
               Process child = rt.exec(callAndArgs);
               child.waitFor();
            }
            catch(IOException e2) {
               System.out.println("Found error: "+e2);
            }
            catch(InterruptedException e3) {
               System.out.println("Found error: "+e3);
            }	
	}
	else if (e.getSource() == bCopy){
		if (count==0)
			JOptionPane.showMessageDialog(null,"Nothing to copy","mySearch",2);
		else
		{
			// show file chooser dialog
			int result = chooser.showOpenDialog(MyWindowSearch.this);
 			if(result == JFileChooser.APPROVE_OPTION)
 			{
 				try
	 			{
	 				String todir=chooser.getSelectedFile().getPath();
	 				for (int i=0;i<count;i++)//duyet file trong list
					{
							list.setSelectedIndex(i);
							File from = new File(list.getSelectedValue().toString()); // source file
							
							String newFile=todir+from.separator + from.getName();
							
							File temp = new File(newFile);
							if (temp.exists()==true)
							{
								if (JOptionPane.showConfirmDialog(null,"The file "+temp.getName()+" is already in existence.\nChoose Yes if you want overwrite,\nor No to auto rename it.","myWindnowSearch",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION)
								{
									File to = new File(newFile);// destination file
									copyFile(from,to);	
								}
								else
									{
										newFile=todir+from.separator+i+from.getName();//doi ten file neu exist
										File to = new File(newFile);// destination file
										copyFile(from,to);	
									}
							}
							else
							{
								File to = new File(newFile);// destination file
								copyFile(from,to);
							}
							
					}
				tStatus.setText(count+" file(s) copied");
 				}
 				catch (IOException err) {
               	System.out.println(err);}
 			}
				
		}
	}
}
/************ End of actionPerformed() **************/

//** itmanvn() **/
public void itmanvn(File dir){
	
	String where,what=tText.getText().trim();
	
	File[] list = dir.listFiles();
	
	for (int i=0; i<list.length; i++) {
			//long id = -1;
			if (list[i].isFile() && valid_text_file(list[i])){
				try
				{	
					RandomAccessFile in = new RandomAccessFile(list[i].getPath(),"r");
					long length = in.length();
					long Pointer = 0;
					
					while (Pointer<length)
					{
						where = in.readLine();
						if(where.trim().compareTo("")!=0 && where.length()>0 && where!=null)
							if (searchString(what,where)!=-1)
								{
									model.addElement(list[i].getPath());
									count +=1;
									in.close();
									break;
								}
						Pointer=in.getFilePointer();
					
					}
				in.close();
										
				}
				catch(Exception e1)
				{
					System.out.println("Error reading file: "+list[i].getPath().toString());
					System.out.println(e1);
					break;
				}
			}
			else if (list[i].isDirectory()){
				itmanvn(list[i]);
				}
	}
	
}
/************ End of itmanvn() **************/


//** searching in searchstring **/
public static int searchString(String what,String where)
	{
		what=what.toUpperCase();
		where=where.toUpperCase();
		
		int i=0;
		int j; 
		int l1=what.length();
		int l2=where.length();
		byte flag=0;
		
		do
		{
			if (what.charAt(0)==where.charAt(i))
			{
				flag=1;
				j=1;
				while (j<l1)
				{
					if (i+j>=l2)
						flag=0;
					else
						if (what.charAt(j)!=where.charAt(i+j))
							flag=0;
					j++;
				}
			}
			i++;
		}
		while (i<l2 && flag==0);
		if (flag==1)
			return (--i); //vi tri dau tien tim duoc

		return (-1);

	}
/************ end of searchString() **************/

//** copy file **/

public static void copyFile(File from, File to)
										throws IOException {
	
	BufferedInputStream in = new BufferedInputStream(new FileInputStream(from));
	BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(to));
	byte buffer[] = new byte[BUFFER_SIZE];
	int dem;
	
	while ((dem = in.read(buffer)) != -1) {
		out.write(buffer, 0, dem);
	}
	in.close();
	out.close();
}

/************ end of copyFile() **************/



//** list changed && showContent() **//
//******** this show content is the fastest in my class do NOT an cap ban quyen of Bui Duc Long CDTH3A

public void valueChanged(ListSelectionEvent e) {
		// If either of these are true, the event can be ignored.
		if ((e.getValueIsAdjusting() == false) || (e.getFirstIndex() == -1))
			return;
		tContent.setText("");
		File file = new File(list.getSelectedValue().toString());
		try
			{
				
				BufferedReader content = new BufferedReader(new FileReader(file));
				
				String line=""; 
                
                while ((line = content.readLine()) != null) 
                	tContent.append(line+"\n");
				
				content.close();
    		}
			catch(Exception e1)
			{
				System.out.println("Found error: "+e1);
			}	
}
/************ End of list changed() && show content **************/


//**  valid_text_file() **/

public boolean valid_text_file(File what){
	String file = what.toString();
	
	if (file.endsWith(".txt")  	||
	   	file.endsWith(".TXT"))	
	
		return true;
	else
		return false;
}


/************ End of valid_text_file() **************/

//**  main() **/
	public static void main( String args[] ) {
            
            JOptionPane.showMessageDialog(null, "Welcome To My First Window Search Application In GUI","Make A Deep Search In Your "
                    + "Windows\n Search Throught Windows Any Text isnde your filelocation  \n DevelopedBy E- Badmus ",JOptionPane.INFORMATION_MESSAGE);

      		final MyWindowSearch app = new MyWindowSearch () ; /** creates an instance of MySearch  */ 
      		app.setResizable(false);
   }
/************ End of main() **************/
}
