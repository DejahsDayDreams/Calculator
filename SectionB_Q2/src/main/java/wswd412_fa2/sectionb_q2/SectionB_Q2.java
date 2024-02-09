
package wswd412_fa2.sectionb_q2;

//imports
import java.awt.*; // imports a the predefined library of UI elemets
import java.awt.event.*; // omports methods to trace user input
import javax.swing.*;  // imports extra GUI elements and functionality

public class SectionB_Q2 extends JFrame implements ActionListener//Extends to inherit the frame functionality
{
  //Creating the elements - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
    static JFrame MainWindow; // this assignes a famr to a window
    static JPanel MainPanel;
    static JTextField Display; // be used to display the numbers
    
    String Input1; //grabs the first set of user input
    String Input2; //grabs the second set of user input
    String Operator; //Used to define the user calculation
    
    // how its gonna run
              // Input1 Operator Input2 = Result
              // 5 + 5 = Result
    
    //Setting up the button variables
    JButton B0, B1, B2, B3, B4, B5, B6, B7, B8, B9;  
    JButton BPlus, BMinus,BMultiply, BDivide;
    JButton BEquals, BDot, BClear;

    public SectionB_Q2(JFrame MainWindow, JTextField Display, String Input1, String Input2, 
            String Operator, JButton B0, JButton B1, JButton B2, JButton B3, JButton B4, JButton B5, 
            JButton B6, JButton B7, JButton B8, JButton B9, JButton BPlus) {
        this.MainWindow = MainWindow;
        this.Display = Display;
        this.Input1 = Input1;
        this.Input2 = Input2;
        this.Operator = Operator;
        this.B0 = B0;
        this.B1 = B1;
        this.B2 = B2;
        this.B3 = B3;
        this.B4 = B4;
        this.B5 = B5;
        this.B6 = B6;
        this.B7 = B7;
        this.B8 = B8;
        this.B9 = B9;
        this.BPlus = BPlus;
    }
    
    //Creating the elemets - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
    SectionB_Q2()
    {
        //Setting the variables as empty
        Input1 = "";
        Input2 = "";
        Operator = "";
        
        //creating the elements for the GUI  - - - - - - - - - - - - - - - - - - -
        
        
        //Crerating UI Elements - - - - - - - - - - - - - - - - - - - - - - - - - - - -
        
        //creating the Jframe  - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
        MainWindow = new JFrame("Calculator");
        MainWindow.setVisible(true);
        MainWindow.setSize(310,330);
        
        
        //adding a layout method to the frame 
        try
        {
            //setting the layout method
            // used the UI manager to grap a defined layout
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); 
        }
        catch(Exception e) // needs an empty variable to store the empty code
        {
            System.err.println(e.getMessage()); // prints the error if it happens
        }
              //Text field
              Display = new JTextField(25);
              Display.setEditable(false);
              
              
              //settting text and buttons
              //numbers
              B0 = new JButton("0");
              B1 = new JButton("1");
              B2 = new JButton("2");
              B3 = new JButton("3");
              B4 = new JButton("4");
              B5 = new JButton("5");
              B6 = new JButton("6");  
              B7 = new JButton("7");
              B8 = new JButton("8");
              B9 = new JButton("9");
              
              //Operators
              BPlus = new JButton("+");
              BMinus = new JButton("-");
              BMultiply = new JButton("x");
              BDivide = new JButton("÷");
              
              //Other
              BEquals = new JButton("=");
              BDot = new JButton(".");
              BClear = new JButton("C");
              
              
              //Panel
              MainPanel = new JPanel ();
              MainPanel.setBackground(Color.pink);
              MainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
              
              
              //adding the actionlistener - allows us to captiure/trace user input
              B0.addActionListener(this);
              B1.addActionListener(this);
              B2.addActionListener(this);
              B3.addActionListener(this);
              B4.addActionListener(this);
              B5.addActionListener(this);
              B6.addActionListener(this);
              B7.addActionListener(this);
              B8.addActionListener(this);
              B9.addActionListener(this);
              
              //Operators
              BPlus.addActionListener(this);
              BMinus.addActionListener(this);
              BMultiply.addActionListener(this);
              BDivide.addActionListener(this);
              
              //Other
              BEquals.addActionListener(this);
              BDot.addActionListener(this);
              BClear.addActionListener(this);
              
              // adding elements
              MainPanel.add(Display);
              Display.setBorder(BorderFactory.createEmptyBorder(20, 35, 20, 35));
              B1.setBackground(Color.WHITE);
              
              MainPanel.add(B1);
              B1.setBorder(BorderFactory.createEmptyBorder(10, 25, 10,25));
              B1.setBackground(Color.DARK_GRAY);
              MainPanel.add(B2);
              B2.setBorder(BorderFactory.createEmptyBorder(10, 25, 10,25));
              B2.setBackground(Color.DARK_GRAY);
              MainPanel.add(B3);
              B3.setBorder(BorderFactory.createEmptyBorder(10, 25, 10,25));
              B3.setBackground(Color.DARK_GRAY);
              MainPanel.add(BPlus);
              BPlus.setBorder(BorderFactory.createEmptyBorder(10, 25, 10,25));
              BPlus.setBackground(Color.DARK_GRAY);
              MainPanel.add(B4);
              B4.setBorder(BorderFactory.createEmptyBorder(10, 25, 10,25));
              B4.setBackground(Color.DARK_GRAY);
              MainPanel.add(B5);
              B5.setBorder(BorderFactory.createEmptyBorder(10, 25, 10,25));
              B5.setBackground(Color.DARK_GRAY);
              MainPanel.add(B6);
              B6.setBorder(BorderFactory.createEmptyBorder(10, 25, 10,25));
              B6.setBackground(Color.DARK_GRAY);
              MainPanel.add(BMinus);
              BMinus.setBorder(BorderFactory.createEmptyBorder(10, 25, 10,25));
              BMinus.setBackground(Color.DARK_GRAY);
              MainPanel.add(B7);
              B7.setBorder(BorderFactory.createEmptyBorder(10, 25, 10,25));
              B7.setBackground(Color.DARK_GRAY);
              MainPanel.add(B8);
              B8.setBorder(BorderFactory.createEmptyBorder(10, 25, 10,25));
              B8.setBackground(Color.DARK_GRAY);
              MainPanel.add(B9);
              B9.setBorder(BorderFactory.createEmptyBorder(10, 25, 10,25));
              B9.setBackground(Color.DARK_GRAY);
              MainPanel.add(BMultiply);
              BMultiply.setBorder(BorderFactory.createEmptyBorder(10, 25, 10,25));
              BMultiply.setBackground(Color.DARK_GRAY);
              MainPanel.add(BDot);
              BDot.setBorder(BorderFactory.createEmptyBorder(10, 25, 10,25));
              BDot.setBackground(Color.DARK_GRAY);
              MainPanel.add(B0);
              B0.setBorder(BorderFactory.createEmptyBorder(10, 25, 10,25));
              B0.setBackground(Color.DARK_GRAY);
              MainPanel.add(BEquals);
              BEquals.setBorder(BorderFactory.createEmptyBorder(10, 25, 10,25));
              BEquals.setBackground(Color.DARK_GRAY);
              MainPanel.add(BDivide);
              BDivide.setBorder(BorderFactory.createEmptyBorder(10, 25, 10,25));
              BDivide.setBackground(Color.DARK_GRAY);
              
              MainPanel.add(BClear);
              BClear.setBorder(BorderFactory.createEmptyBorder(10, 45, 10,45));
              BClear.setBackground(Color.DARK_GRAY);
              
              MainPanel.setVisible(true);
              
              MainWindow.add(MainPanel);
              MainWindow.setVisible(true);
              
    }
    
    //Main method - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    public static void main(String[] args)
    {
        SectionB_Q2 Calculator = new SectionB_Q2(); // instance of the object

    }
    
    public void actionPerformed(ActionEvent e)
    {
        String Command = e.getActionCommand();
        
        // if the value is a number
        if(Command.charAt(0) >= '0' && Command.charAt(0) <='9' || Command.charAt(0) =='.')
        {
            //if our operator is present then add a second number
            if(!Operator.equals(""))
            {
                Input2 = Input2 + Command;  //adding value to the Second input
            }
            else
            {
                Input1 = Input1 + Command; //adding value to the First input
            }

            //updating the display
            Display.setText(Input1 + Operator + Input2);
        }
        //clear method
        else if(Command.charAt(0) == 'C')
        {
            Input1 = "";
            Input2 = "";
            Operator = "";
            
            
            //Updating the display
            Display.setText(Input1+ Operator + Input2);
        }
        
        //equals method
        else if(Command.charAt(0) == '=')
        {
            double Result;
                
            if(Operator.equals("+"))
            {
                Result= (Double.parseDouble(Input1) + Double.parseDouble(Input2));
            }
         
         else if(Operator.equals("-"))
         {
                Result = (Double.parseDouble(Input1) - Double.parseDouble(Input2));
          }
          else if(Operator.equals("/"))
          {
                Result  = (Double.parseDouble(Input1) / Double.parseDouble(Input2));
          }
          else
          {
              Result= (Double.parseDouble(Input1) * Double.parseDouble(Input2));
          }
            
            //Updating the display
            Display.setText(Input1 + Operator + Input2 + "=" + Result);
        
        
            //Convert to a string
            Input1 = Double.toString(Result);
            Operator =" ";
            Input2 = " ";
        
        }
      
        else
        {
                
            double Result;
            
            if(Input1.equals("") || Input2.equals(""))
            {
                Operator= Command;
            }
            else
            {
                    if(Operator.equals("+"))
                    {
                          Result  = (Double.parseDouble(Input1) + Double.parseDouble(Input2));
                    }
                   else if(Operator.equals("-"))
                   {
                          Result= (Double.parseDouble(Input1) - Double.parseDouble(Input2));
                    }
                    else if(Operator.equals("/"))
                    {
                          Result  = (Double.parseDouble(Input1) / Double.parseDouble(Input2));
                    }
                    else
                    {
                        Result = (Double.parseDouble(Input1) * Double.parseDouble(Input2));
                    }

                   //Convet result to a string value
                   Input1 = Double.toString(Result);
                   
                   Operator = Command;
                   Input2 = " ";
            }
            Display.setText(Input1+ Operator + Input2);
        }
    
    }
    
}    

