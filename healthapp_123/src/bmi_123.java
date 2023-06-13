
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.basic.BasicArrowButton;
//import com.formdev.flatlaf.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.List;
//===========================PROGRAM STARTS HERE===================================//

public class bmi_123 implements ActionListener
{   
    static JFrame f;
    static JPanel p1;   //WELCOME PANEL
    static JLabel l1;   //EXISITNG USER LABEL
    static JButton b1;  //EXISITING USER BUTTON
    static JLabel l2;   //NEW USER LABEL
    static JButton b2;  //NEW USER BUTTON
    static JLabel l3;   //OR LABEL
    static JButton b3; //OR BUTTON

    static JPanel welcomePanelFunction()
    {
        p1 = new JPanel();
        p1.setLayout(null);

        l1= new JLabel("Existing User?");
        l1.setBounds(250,50,100,30);
        p1.add(l1);
        b1 = new JButton("Login");
        b1.setBounds(200,100,170,30);        
        b1.addActionListener(new bmi_123());
        p1.add(b1);

        l2= new JLabel("New User?");
        l2.setBounds(260,150,100,30);
        p1.add(l2);

        b2 = new JButton("Signup");
        b2.setBounds(200,200,170,30);
        b2.addActionListener(new bmi_123());
        p1.add(b2);

        l3= new JLabel("OR");
        l3.setBounds(280,250,100,30);
        p1.add(l3);
        b3 = new JButton("Continue as Guest");
        b3.setBounds(200,300,170,30);
        b3.addActionListener(new bmi_123());
        p1.add(b3);

        
        return p1;
    }

    static JPanel p2;
    static JLabel l4;//USERNAME LABEL
    static JTextField t1;//USERNAME
    static JLabel l5;//PASSWORD
    static JPasswordField t2;//PASSWORD
    static JButton b4; //LOGIN BUTTON
    static JLabel l6;//ForGOT PASSWORD LABEL
    static JLabel l7; //NEW REGISTRATION LABEL
    static JButton b5; //BACK BUTTON
    
    static JPanel loginPanelFunction()
    {
    p2 = new JPanel();
    p2.setLayout(null);

    l4= new JLabel("Username:");
    l4.setBounds(200,50,100,30);
    p2.add(l4);
    t1 = new JTextField();
    t1.setBounds(200,100,200,30);
    p2.add(t1);

    l5= new JLabel("Password:");
    l5.setBounds(200,150,100,30);
    p2.add(l5);
    t2 = new JPasswordField();
    t2.setBounds(200,200,200,30);
    p2.add(t2);

    l6 = new JLabel();
    l6.setBounds(240,350,150,30);
    //l3.addMouseListener(new HealthApp());
    p2.add(l6);


    b4 = new JButton("Login");
    b4.setBounds(200,300,200,30);
    b4.addActionListener(new bmi_123());
    p2.add(b4);

    b5 = new JButton("Back");
    b5.setBounds(10,10,70,30);
    b5.addActionListener(new bmi_123());
    p2.add(b5);    

          
        return p2;
    }

    static JPanel p3;   //GUEST PANEL
    static JLabel p3l1;//Enter Height
    static JTextField p3t1;//HEIGHT INPUT
    static JLabel p3l2;//Enter Weight
    static JTextField p3t2;//WEIGHT INPUT
    static JButton p3b1;//Calculate
	static JButton p3b2;//Reset
    static JLabel p3d1;//Display BMI
    static JLabel p3bmi; // 
    static JLabel p3d2;//Display RDI stuffs
    static BasicArrowButton p3west;//back arrow button
    static JButton p3b3;//Display Datof guest


    static JPanel guestPanelFunction()
    {
        p3 = new JPanel();
        p3.setLayout(null);

        p3l1= new JLabel("Enter the height (in m):");
        p3l1.setBounds(200,70,200,30);
        p3.add(p3l1);
        p3t1 = new JTextField();
        p3t1.setBounds(200,100,200,30);
        p3.add(p3t1);

        p3l2= new JLabel("Enter Weight (in Kgs):");
        p3l2.setBounds(200,170,200,30);
        p3.add(p3l2);
        p3t2 = new JTextField();
        p3t2.setBounds(200,200,200,30);
        p3.add(p3t2);

        p3bmi = new JLabel();
        p3bmi.setBounds(250,310,180,40);
        p3.add(p3bmi);


        p3b1 = new JButton("Calculate");
        p3b1.setBounds(175,250,100,40);
        p3b1.addActionListener(new bmi_123());
        p3.add(p3b1); 
    
        p3b2 = new JButton("Reset");
        p3b2.setBounds(330,250,100,40);
        p3b2.addActionListener(new bmi_123());
        p3.add(p3b2);

        

        p3b3 = new JButton("Display Guest Usage Data");
        p3b3.setBounds(200,350,200,40);
        p3b3.addActionListener(new bmi_123());
        p3.add(p3b3);

        p3d1 = new JLabel();
        p3d1.setBounds(250,300,150,30);
        p3.add(p3d1);

        p3d2 = new JLabel();
        p3d2.setBounds(220,330,150,30);
        p3.add(p3d2);

        p3west = new BasicArrowButton(BasicArrowButton.WEST);
        p3west.setBounds(10, 10, 50, 25);
        p3west.addActionListener(new bmi_123());
        p3.add(p3west);


        return p3;
    }
    
    static JPanel p4;
    static JLabel signupname;                   //name
    static JTextField signupnametxtfield;
    static JLabel realname;
    static JTextField realnametxtfield;
    static JLabel signupage;                    //age
    static JTextField signupagetxtfield;
    static JLabel signupPass;                   //password
    static JPasswordField signuppassfield;
    static JLabel csignupPass;                   //confirm password
    static JPasswordField csignuppassfield;
    static JButton backtowelcome;
    static JButton register;
    static JButton resetRegister;
    static JLabel signupStatus;
    static JComboBox gender;
    static int age2;

    public static JPanel signuppanelfunction(){
        p4=new JPanel();
        p4.setLayout(null);

        signupname=new JLabel("Username:");
        signupname.setBounds(50,50,200,30);
        p4.add(signupname);
        signupnametxtfield=new JTextField();
        signupnametxtfield.setBounds(250,50,70,30);
        p4.add(signupnametxtfield);

        realname=new JLabel("Enter your name:");
        realname.setBounds(50,120,200,30);
        p4.add(realname);
        realnametxtfield=new JTextField();
        realnametxtfield.setBounds(250,120,70,30);
        p4.add(realnametxtfield);

        signupage=new JLabel("Enter your age:");
        signupage.setBounds(50,190,200,30);
        p4.add(signupage);
        signupagetxtfield=new JTextField();
        signupagetxtfield.setBounds(250,190,70,30);
        p4.add(signupagetxtfield);
        String g[] = {"Male","Female","Prefer not to say"};
        gender = new JComboBox<>(g);
        gender.setBounds(350, 190, 100, 30);
        p4.add(gender);

        signupPass=new JLabel("Password:");
        signupPass.setBounds(50,260,200,30);
        p4.add(signupPass);
        signuppassfield=new JPasswordField();
        signuppassfield.setBounds(250,260,70,30);
        p4.add(signuppassfield);

        csignupPass=new JLabel("Confirm Password:");
        csignupPass.setBounds(50,330,200,30);
        p4.add(csignupPass);
        csignuppassfield=new JPasswordField();
        csignuppassfield.setBounds(250,330,70,30);
        p4.add(csignuppassfield);

        backtowelcome = new JButton("Back");
        backtowelcome.setBounds(10, 10, 70, 25);
        backtowelcome.addActionListener(new bmi_123());
        p4.add(backtowelcome);

        register =new JButton("Register");
        register.setBounds(50,390,90,25);
        register.addActionListener(new bmi_123());
        p4.add(register);

        resetRegister = new JButton("Reset");
        resetRegister.setBounds(250,390,90,25);
        resetRegister.addActionListener(new bmi_123());
        p4.add(resetRegister);

        signupStatus = new JLabel();
        signupStatus.setBounds(50,450,300,30);
        p4.add(signupStatus);

        return p4;
    }

    static JPanel p5;
    static JLabel p5l1;//Enter Height
    static JTextField p5t1;//HEIGHT INPUT
    static JLabel p5l2;//Enter Weight
    static JTextField p5t2;//WEIGHT INPUT
    static JButton p5b1;//Calculate
	static JButton p5b2;//Reset
    static JLabel p5d1;//Display BMI
    static JLabel p5bmi; // CHECK BMI 
    static JLabel p5d2;//Display RDI stuffs
    static JLabel p5d3;
    static JLabel p5d4;
    static JLabel p5d5;
    static BasicArrowButton p5west;//back arrow button
    static JButton p5b3;//Display Datof user. 
    static int g1;
    static JComboBox c2;
    static JLabel p5l4;
    static JPanel userPanelFunction()
    {

        p5 = new JPanel();
        p5.setLayout(null);

        p5l1= new JLabel("Enter the height (in m):");
        //p5l1.setBounds(50,50,200,30);
        p5l1.setBounds(150, 50, 200, 30);
        p5.add(p5l1);
        p5t1 = new JTextField();
        //p5t1.setBounds(250,50,70,30);
        p5t1.setBounds(350, 50, 70, 30);
        p5.add(p5t1);

        p5l2= new JLabel("Enter Weight (in Kgs):");
        p5l2.setBounds(150, 100, 200, 30);
        //p5l2.setBounds(50,120,200,30);
        p5.add(p5l2);
        p5t2 = new JTextField();
        p5t2.setBounds(350, 100, 70, 30);
        //p5t2.setBounds(250,120,70,30);
        p5.add(p5t2);

        p5l4=new JLabel("Enter your Activity profile:");
        p5l4.setBounds(150, 150, 200, 30);        
        //p5l4.setBounds(50,170,200,30);
        p5.add(p5l4);
        String activity[]={"Sedentery","low acitive","active","high active"};
        c2=new JComboBox<>(activity);
        c2.setBounds(350, 150, 100, 30);
        //c2.setBounds(250,170,100,30);
        p5.add(c2);

        p5b1 = new JButton("Calculate");
        p5b1.setBounds(150, 230, 100, 40);
        //p5b1.setBounds(50,230,100,40);
   	    p5b1.addActionListener(new bmi_123());
        p5.add(p5b1); 
	
	    p5b2 = new JButton("Reset");
        p5b2.setBounds(350, 230, 100, 40);
        //p5b2.setBounds(250,230,100,40);
	    p5b2.addActionListener(new bmi_123());
        p5.add(p5b2); 

        // YOUR BMI IS:
	    p5d1 = new JLabel();
        //p5d1.setBounds(170,300,120,30);
        p5d1.setBounds(240, 300, 120, 30);
        p5.add(p5d1);


        p5bmi = new JLabel();
        //bmi value ranges
        p5bmi.setBounds(230, 315, 160, 30);
        p5.add(p5bmi);

        //your RDI is:
        p5d2 = new JLabel();
        //p5d2.setForeground(new ColorUIResource(0,0,0));
        p5d2.setBounds(220, 355, 180, 30);
        //p5d2.setBounds(150,330,180,30);
        p5.add(p5d2);

        //this is your rec. DI:
        p5d3 = new JLabel();
        p5d3.setBounds(180, 373, 280, 20);
        //p5d3.setBounds(90, 350, 280, 30);
        p5.add(p5d3);


       


        // to lose weight
        p5d4 = new JLabel();
       // p5d4.setBounds(50,400,500,10);
       p5d4.setBounds(100, 390, 500, 10);
        p5d4.setForeground(new ColorUIResource(128,128,128));
        p5.add(p5d4);

        //to gain weight
        p5d5 = new JLabel();
        //p5d5.setBounds(51,413,500,10);
        p5d5.setBounds(102, 402, 500, 10);
        p5d5.setForeground(new ColorUIResource(128,128,128));
        p5.add(p5d5);

        p5b3 = new JButton("Display Usage Data");
        p5b3.setBounds(200, 430, 200, 40);
        //p5b3.setBounds(130,450,200,40);
   	    p5b3.addActionListener(new bmi_123());
        p5.add(p5b3);

	    p5west = new BasicArrowButton(BasicArrowButton.WEST);
	    p5west.setBounds(10, 10, 50, 25);
        p5west.addActionListener(new bmi_123());
	    p5.add(p5west);


        return p5;
    }

    static String systemTimeString;
    static String dateString;
    static String timeString;

    static JPanel p6;
    static JLabel p6l1; // USERNAME LABEL
    static JTable p6table; // Table to be displayed
    static JButton p6b1; // BACK BUTTON
    static String tableName;

    static JPanel guestDisplayPanelFunction() //NEED TO WORK ON THE BACK INSTANCE HERE/// IMP IMP IMP IMP
    {
        p6 = new JPanel();
        p6.setLayout(null);
    
        //p6l1 = new JLabel("Guest Usage History");
        p6l1.setBounds(10, 10, 200, 25);
        p6.add(p6l1);
    
        Connection guestDisplayConnection = null;
        try {
            String url = "jdbc:mysql://127.0.0.1:3306/sample2";
            String username = "root";
            String password = "Jesus@123";
    
            guestDisplayConnection = DriverManager.getConnection(url, username, password);
            Statement statement = guestDisplayConnection.createStatement();
    
            // Specify the column names you want to retrieve
            String columns = "dateString, timeString, height, weight";
            
            ResultSet resultSet = statement.executeQuery("SELECT " + columns + " FROM "+tableName);
              System.out.println("reached here phew!");         
    
            int columnCount = 4;  // Specify the number of columns you want to display
            String[] columnNames = {"dateString", "timeString", "height", "weight"};
            
            
            String[][] data = new String[50][columnCount];
            int row = 0;
            while (resultSet.next()) {
                for (int i = 0; i < columnCount; i++) {
                    data[row][i] = resultSet.getString(columnNames[i]);
                }
                row++;
            }
            String[] newColumnNames = {"Date", "Time", "Height", "Weight"};
            p6table = new JTable(data, newColumnNames);
            p6table.setPreferredScrollableViewportSize(new Dimension(300, 100));
    
        JScrollPane scrollPane = new JScrollPane(p6table);
        scrollPane.setBounds(10, 40, 500, 400);
        p6.add(scrollPane);
        
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (guestDisplayConnection != null) {
                    guestDisplayConnection.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    
        p6b1 = new JButton("Back");
        p6b1.setBounds(10, 460, 100, 25);
        p6b1.addActionListener(new bmi_123());//add action listener for this button
        p6.add(p6b1);
    
        return p6;
    }

    static void getDateAndTime()
    {
    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    systemTimeString= String.valueOf(timestamp);
    
    StringTokenizer st = new StringTokenizer(systemTimeString," ");
    dateString = st.nextToken().trim();
    timeString = st.nextToken().trim();
    //System.out.println(dateString+" "+timeString);

    }
    
    static float activity()
    { 
        String act=(String)c2.getSelectedItem();
        act=act.trim();
        if(act.equals("Sedentery"))
        return 1.2f;
        else if(act.equals("low active"))
        return 1.375f;
        else if(act.equals("active"))
        return 1.55f;
        else 
        return 1.725f;
        
    }
    static JPanel p7;
    static JLabel p7l1; // USERNAME LABEL
    static JTable p7table; // Table to be displayed
    static JButton p7b1; // BACK BUTTON
    static String tableName2;

    /*static JPanel userDisplayPanelFunction() //NEED TO WORK ON THE BACK INSTANCE HERE/// IMP IMP IMP IMP
    {
        p7 = new JPanel();
        p7.setLayout(null);
    
        //p6l1 = new JLabel("Guest Usage History");
        p7l1.setBounds(10, 10, 200, 25);
        p7.add(p7l1);
    
        Connection userDisplayConnection = null;
        try {
            String url = "jdbc:mysql://127.0.0.1:3306/sample2";
            String username = "root";
            String password = "Jesus@123";
    
            userDisplayConnection = DriverManager.getConnection(url, username, password);
            Statement statement = userDisplayConnection.createStatement();
    
            // Specify the column names you want to retrieve
            //String columns = "dateString, timeString, height, weight";
            
            /*ResultSet resultSet = statement.executeQuery("SELECT " + columns + " FROM "+tableName);
              System.out.println("reached here phew!");         
          //String height=p5t1.getText().trim();
            //String weight=p5t2.getText().trim();
            //String values1="values ('"+dateString+"','"+timeString+"','"+height+"','"+weight+"'');";
            String username1 = t1.getText().trim();
            ResultSet resultSet = statement.executeQuery("SELECT dateString,timeString,height,weight FROM register WHERE username='"+username1+"'");
            int columnCount = 4;  // Specify the number of columns you want to display
            String[] columnNames = {"dateString", "timeString", "height", "weight"};
    
            //resultSet.last();
            //int rowCount = resultSet.getRow();
            //resultSet.beforeFirst();
            
            
            String[][] data = new String[50][columnCount];
            int row = 0;
            while (resultSet.next()) {
                for (int i = 0; i < columnCount; i++) {
                    data[row][i] = resultSet.getString(columnNames[i]);
                }
                row++;
            }
            String[] newColumnNames = {"Date", "Time", "Height", "Weight"};
            p7table = new JTable(data, newColumnNames);
            p7table.setPreferredScrollableViewportSize(new Dimension(300, 100));
    
        JScrollPane scrollPane = new JScrollPane(p7table);
        scrollPane.setBounds(10, 40, 500, 400);
        p7.add(scrollPane);
        
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (userDisplayConnection != null) {
                    userDisplayConnection.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    
        p7b1 = new JButton("Back");
        p7b1.setBounds(10, 460, 100, 25);
        p7b1.addActionListener(new bmi_123());//add action listener for this button
        p7.add(p7b1);
    
        return p7;
    }  */
    static JPanel userDisplayPanelFunction() {// this code is for displaying the table
        p7 = new JPanel();
        p7.setLayout(null);
        p7l1.setBounds(10, 10, 200, 25);
        p7.add(p7l1);
    
        Connection userDisplayConnection = null;
        try {
            String url = "jdbc:mysql://127.0.0.1:3306/sample2";
            String username = "root";
            String password = "Jesus@123";
    
            userDisplayConnection = DriverManager.getConnection(url, username, password);
            Statement statement = userDisplayConnection.createStatement();
    
            String username1 = t1.getText().trim();
            ResultSet resultSet = statement.executeQuery("SELECT dateString,timeString,height,weight FROM bmidetails WHERE username='"+username1+"' ORDER BY dateString, timeString");

            int columnCount = 4;
            String[] columnNames = {"dateString", "timeString", "height", "weight"};
            String[] newColumnNames = {"Date", "Time", "Height", "Weight"};
            List<String[]> dataList = new ArrayList<String[]>();
            while (resultSet.next()) {
                String[] rowData = new String[columnCount];
                for (int i = 0; i < columnCount; i++) {
                    rowData[i] = resultSet.getString(columnNames[i]);
                }
                dataList.add(rowData);
            }
    
            String[][] data = new String[dataList.size()][columnCount];
            System.out.println("The size of the datalist is "+dataList.size());
            for (int i = 0; i < dataList.size(); i++) {
                data[i] = dataList.get(i);
            }
            //data = Arrays.copyOf(data, dataList.size());
            p7table = new JTable(data, newColumnNames);
            p7table.setPreferredScrollableViewportSize(new Dimension(500, 400));
    
            JScrollPane scrollPane = new JScrollPane(p7table);
            scrollPane.setBounds(10, 40, 500, 400);
            p7.add(scrollPane);
    
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (userDisplayConnection != null) {
                    userDisplayConnection.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    
        p7b1 = new JButton("Back");
        p7b1.setBounds(10, 460, 100, 25);
        p7b1.addActionListener(new bmi_123());
        p7.add(p7b1);
    
        return p7;
    }
        
static String checkBMI(float q)
{
    if(q < 18.00 )
    {   
        //p3bmi.setForeground(new ColorUIResource(255, 0, 0));
        p5bmi.setForeground(new ColorUIResource(255, 0, 0));
        return ("You are Underweight!");
    }

    else if(q >= 18 && q <= 25)
    {   
        //p3bmi.setForeground(new ColorUIResource(0, 255, 0)); 
        p5bmi.setForeground(new ColorUIResource(0, 255, 0));
        
        return ("You are Healthy! :D");
    }

    else{
        //p3bmi.setForeground(new ColorUIResource(255, 0, 0)); 
        p5bmi.setForeground(new ColorUIResource(255, 0, 0));
        
        return ("You are Overweight!");
    }
}

static String checkBMI1(float w)
{
    if(w < 18.00 )
    {   
        p3bmi.setForeground(new ColorUIResource(255, 0, 0));
        //p5bmi.setForeground(new ColorUIResource(255, 0, 0));
        return ("You are Underweight!");
    }

    else if(w >= 18 && w <= 25)
    {   
        p3bmi.setForeground(new ColorUIResource(0, 255, 0)); 
        //p5bmi.setForeground(new ColorUIResource(0, 255, 0));
        
        return ("You are Healthy! :D");
    }

    else{
        p3bmi.setForeground(new ColorUIResource(255, 0, 0)); 
        //p5bmi.setForeground(new ColorUIResource(255, 0, 0));
        
        return ("You are Overweight!");
    }
}
   
public static void main (String[] args)
{   getDateAndTime();
    //FlatIntelliJLaf.setup();
    
    
    System.out.println(dateString+" "+timeString);
    f = new JFrame();
    f.setSize(600,600);
    f.setTitle("HealthApp");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setResizable(false);
    ImageIcon i = new ImageIcon("C:\\Users\\sampt\\Downloads\\HA.jpg");
    f.setIconImage(i.getImage());
    f.add(welcomePanelFunction());
    
    f.setVisible(true);
}

public void actionPerformed(ActionEvent a)
{   
    
    if(a.getSource() == b1)//this is the actionlistener for the login button
    {
       f.add(loginPanelFunction());
       f.getContentPane().remove(p1);
       f.setVisible(true);
    }
    if(a.getSource() == b2)//this is the actionlistener for signup button in p1 to go to p5
    {
       f.add(signuppanelfunction());
       f.getContentPane().remove(p1);
       f.setVisible(true);
    }
    if(a.getSource() == backtowelcome)//this is the back button to go to p1 from p4
    {
       f.add(welcomePanelFunction());
       f.getContentPane().remove(p4);
       f.setVisible(true);
    }
   if(a.getSource() == b5)//this is the back buttom in the loginPanel p2
    {
       
       //f.getContentPane().add(p1);   // 1. actionEvent is executed only once?
       f.add(welcomePanelFunction());
       f.getContentPane().remove(p2);
       f.setVisible(true);
    }
    if(a.getSource() == b3)//this is the continue as guest button in welcomePanel p1
    {  
       f.add(guestPanelFunction());
       f.getContentPane().remove(p1);
       f.setVisible(true);
    }
    if(a.getSource() == p3b1)//this is the calculate button in the guest panel p3
    {
        String s1 = p3t1.getText();
		String s2 = p3t2.getText();	   
        		
		try
		{
		Double a1 = Double.parseDouble(s1.trim());
		int a2 = Integer.parseInt(s2.trim());

		Float r = (float)(a2/(a1*a1));
        p3d1.setForeground(new ColorUIResource(0, 0, 0));
		p3d1.setText("BMI is: " + String.valueOf(r));
        p3bmi.setText(checkBMI1(r));

        
        

        String url = "jdbc:mysql://127.0.0.1:3306/sample2";
        String username = "root";
        String password = "Jesus@123";

        Connection guestConnection = DriverManager.getConnection(url, username, password);
        if(guestConnection!=null){
            System.out.println("Connected to MySQL database");
        }
        Statement guestStatement = guestConnection.createStatement();

        getDateAndTime();//Check this function up

        String valueStatement = " values ('"+dateString+"', '"+timeString+"', "+a1+", "+a2+")";
        System.out.println(valueStatement);

        String guestSQL = "insert into guest "+"(dateString, timeString, height, weight) "+valueStatement;
        System.out.println(guestSQL);

        guestStatement.executeUpdate(guestSQL);
        System.out.println("Insertion Complete");

        
        guestConnection.close();
        
		}
        catch(Exception e)
		{p3d1.setForeground(new ColorUIResource(255,0,0));
		p3d1.setText("Enter valid input!");
		System.out.println("ERROR:");
		e.printStackTrace();
		}

    }
    if(a.getSource() == p3west)//this is the back button in the guestPanel p3
    {   
        f.add(welcomePanelFunction());
       f.getContentPane().remove(p3);
       f.setVisible(true);

    }
   if(a.getSource() == p3b2)//this is the reset as guest button in welcomePanel p1
    {
        p3t1.setText("");
		p3t2.setText("");
        p3d1.setText("");
    }
    if(a.getSource() == p3b3)//this is the show guestDetailsPanel button in p3
    {   tableName = "guest";
        p6l1 = new JLabel("Guest Usage History");
        f.add(guestDisplayPanelFunction());
        f.getContentPane().remove(p3);
        f.setVisible(true);
    }
    if(a.getSource() == p6b1)//this is the back button in the display guest details panel p6
    {
        f.add(guestPanelFunction());
        f.getContentPane().remove(p6);
        f.setVisible(true);
    }
    if(a.getSource() == resetRegister)//this is the reest button in panel p4 which is sigunupPanel
    {
        signupnametxtfield.setText("");
        realnametxtfield.setText("");
        signuppassfield.setText("");
        csignuppassfield.setText("");
        signupagetxtfield.setText("");
    }
    if(a.getSource() == register)//this is the register button in sigunUpPanel p4
    {  
        boolean cnf;
        String username = signupnametxtfield.getText().trim();
        System.out.println(username);

        String name = realnametxtfield.getText().trim();
        System.out.println(name);

        String age1 = signupagetxtfield.getText();
        int age = 0;
        
        try {
        age = Integer.parseInt(age1.trim());
        System.out.println(age);
            
        } catch (Exception e) {
            signupStatus.setText("Enter Valid age");
            cnf = false;
        }
        
        char[] pwd1 = signuppassfield.getPassword();
        String pwd = new String(pwd1);
        System.out.println(pwd);

        String g = (String)gender.getSelectedItem();
        g = g.trim();
        System.out.println(g);

        char[] cpwd1 = csignuppassfield.getPassword();
        String cpwd = new String(cpwd1);
        System.out.println(cpwd);

        System.out.println(age);

        cnf = pwd.equals(cpwd);
        if(cnf == false)
        signupStatus.setText("Entered Passwords do not match");
        else{            
            Connection registerConnection = null;
        try {
            String url = "jdbc:mysql://127.0.0.1:3306/sample2";
            String u = "root";
            String p = "Jesus@123";
    
            registerConnection = DriverManager.getConnection(url, u, p);
            Statement statement = registerConnection.createStatement();
    
            // Specify the column names you want to retrieve
            String cname = "username";
            ResultSet resultSet = statement.executeQuery("SELECT " + cname + " FROM register");      
    
             boolean chk = true;    
            
            while (resultSet.next()) {
                String check = resultSet.getString("username").trim();
                
                    if (check != null && username.equals(check)) 
                    {
                    System.out.println("Username found!");
                    signupStatus.setText("Username already exists");
                    chk = false;
                    throw new SQLException("Username already exists");//try with this part
                    }                
            }
            
            if(chk == true)
            {
            try {
                statement = registerConnection.createStatement();                
                //String height=p5t1.getText().trim();
                //String weight=p5t2.getText().trim();
                getDateAndTime();
            String valueStatement1 = "values ('"+username+"', '"+name+"', '"+age+"', '"+pwd+"', '"+g+"')";
            System.out.println(valueStatement1);

            String registerSQL = "insert into register "+"(username, nameGuest, age, pwd, gender) "+valueStatement1;
            System.out.println(registerSQL);

            statement.executeUpdate(registerSQL);
            System.out.println("Insertion Complete");
           
            signupStatus.setText("Registration Complete! Go back and Login!!");
                
            } catch (Exception e) {
                e.printStackTrace();
                throw new SQLException();
            }

            }
        
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (registerConnection != null) {
                    registerConnection.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        }

    }
    if(a.getSource() == b4)//this is for the login button in p2
    {   
        l6.setText("");
        boolean cnf = true;
        String username = t1.getText().trim();
        System.out.println(username);

        char[] pwd1 = t2.getPassword();
        String pwd = new String(pwd1);
        System.out.println(pwd);

        if(username.equals("") && pwd.equals(""))
        {
            System.out.println("null");
            cnf = false;
            l6.setForeground(new ColorUIResource(255, 0, 0));
            l6.setText("Enter Valid Username!");

        }
        if(cnf==true)
        {
            Connection loginConnection = null;
            try {
                String url = "jdbc:mysql://127.0.0.1:3306/sample2";
                String u = "root";
                String p = "Jesus@123";
        
                loginConnection = DriverManager.getConnection(url, u, p);
                Statement statement =loginConnection.createStatement();
        
                // Specify the column names you want to retrieve
                String cname = "username";
                String cpwd = "pwd";
                String nGuest = "nameGuest";
                String g="gender";
                String age="age";
                ResultSet resultSet = statement.executeQuery("SELECT " + cname +","+ nGuest +","+ cpwd +","+ age+","+g+ " FROM register"); 
                System.out.println("SELECT " + cname +","+ nGuest +","+ cpwd +","+ age+","+g + " FROM register");     
        
                boolean chk = false;    
                
                while (resultSet.next())
                 {
                    cname = resultSet.getString("username");
                    
                    nGuest = resultSet.getString("nameGuest");
                    cpwd = resultSet.getString("pwd");                    
                    age=resultSet.getString("age");
                    g=resultSet.getString("gender");
                    if (cname.equals(username))
                     {

                        if (cpwd.equals(pwd)) 
                        {   chk = true;
                            break;
                        }
                    }
                    
                                   
                }
                if(chk == false)
                {
                    l6.setForeground(new ColorUIResource(255, 0, 0));
                    l6.setText("Enter Correct Password");
                }
                else
                {
                try {
                    System.out.println("REACHED HETE");                    
                    //p6l1.setText("Usage Details for "+nGuest);
                    p7l1 = new JLabel("Usage Details for "+nGuest);
                    //tableName = username;
                    System.out.println("REACHED HETE2");
                    
                    if(g.equalsIgnoreCase("Male"))
                    g1=0;
        
                    else
                    g1=1;
                    age2=Integer.parseInt(age.trim());
                    f.add(userPanelFunction());
                    f.getContentPane().remove(p2);
                    f.setVisible(true);     
                    System.out.println("login successful");          
    
                
                    
                } catch (Exception e) {
                    throw new SQLException();
                }
    
                }
            
            } catch (SQLException ex) {
                ex.printStackTrace();
            } finally {

                try {
                    if (loginConnection != null) {
                        loginConnection.close();
                        System.out.println("connection closed");
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
    
            }

    }
    if(a.getSource() == p5west)//this is the back button in p5 to go to login
    {
        f.add(loginPanelFunction());
        f.getContentPane().remove(p5);
        f.setVisible(true);

    }
    if(a.getSource() == p5b1)//this is the calculate buttom in the user panel p5
    {
        String s1 = p5t1.getText();
		String s2 = p5t2.getText();	   
        		
		try
		{
           

		Double a1 = Double.parseDouble(s1.trim());
		int a2 = Integer.parseInt(s2.trim());

		Float r = (float)(a2/(a1*a1));
        p5d1.setForeground(new ColorUIResource(0,0,0));
		p5d1.setText("BMI is: " + String.valueOf(r));
        p5bmi.setText(checkBMI(r));

        if (g1 == 0)
        {
            System.out.println("Invoked male");
            float bmr_m =(float)( (10 * a2) + (6.25 * a1 * 100) - (5 * age2)+5);
            //10 × weight (in kilograms) + 6.25 × height (in centimeters) – 5 × age (in years) + 5
            float calories_m = bmr_m*activity();
            p5d2.setText("Your RDI is : "+String.valueOf(calories_m) + " kCal/day ");
            p5d3.setText("This is your Daily Recomended Intake(DRI).");
            p5d4.setText("(To lose weight, consume ~500 calories lesser than you would normally do.");
            p5d5.setText("To Gain weight, consume ~500 calories more than what you normally do.)");
        }
        else if(g1==1)
        {   System.out.println("Invoked");
            float bmr_f = (float)( (10 * a2) + (6.25 * a1 * 100) - (5 * age2))-161;
            float calories_f = bmr_f*activity();
            p5d2.setText("Your RDI is :"+String.valueOf(calories_f)+"kCal/day");
            p5d3.setText("This is your Daily Recomended Intake(DRI).");
            p5d4.setText("(To lose weight, consume ~500 calories lesser than you would normally do.");
            p5d5.setText("To Gain weight, consume ~500 calories more than what you normally do.)");
        }


        String url = "jdbc:mysql://127.0.0.1:3306/sample2";
        String username = "root";
        String password = "Jesus@123";
        String username1 = t1.getText().trim();
        Connection userConnection = DriverManager.getConnection(url, username, password);
        System.out.println("Connected to MySQL database");
        Statement userStatement = userConnection.createStatement();
        
        String registerSQL="insert into bmidetails (username,dateString,timeString,height,weight) values ('"+username1+"','"+dateString+"','"+timeString+"','"+s1+"','"+s2+"')";
        
        userStatement.executeUpdate(registerSQL);
        System.out.println("Insertion Complete");
        userConnection.close();
		}
        catch(Exception e)
		{
        p5d1.setForeground(new ColorUIResource(255,0,0));
		p5d1.setText("Enter valid input!");
		System.out.println("ERROR:");
		e.printStackTrace();
		}

    }
    if(a.getSource() == p5b2)//reset button for the user panel p5
    {
        p5t1.setText("");
		p5t2.setText("");
        p5d1.setText("");
    }
    if(a.getSource() == p5b3)//show user table data
    {
        
       f.add(userDisplayPanelFunction());
       f.getContentPane().remove(p5);
       f.setVisible(true);

    }
    if(a.getSource()==p7b1){
        f.add(userPanelFunction());
        f.getContentPane().remove(p7);
        f.setVisible(true);
    }

}
    
}