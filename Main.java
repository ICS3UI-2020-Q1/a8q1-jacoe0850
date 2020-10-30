import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements Runnable, ActionListener{

  // Class Variables  
  JLabel outputName;
  JTextField insertName;
  JButton sayHello;
  JPanel mainPanel;


  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Title");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(800,600);
    // shows the window
    frame.setVisible(true);
 //initialize the main JPanel
    mainPanel = new JPanel();
    //disable layout helpers
    mainPanel.setLayout(null);
    sayHello = new JButton("Say Hello");
    sayHello.setBounds(250,350,200,50);
    sayHello.addActionListener(this);
    sayHello.setActionCommand("Say Hello");
    outputName = new JLabel();
    outputName.setBounds(150,250,400,50);
    insertName = new JTextField();
    insertName.setBounds(150,150,400,50);
    mainPanel.add(sayHello);
    mainPanel.add(outputName);
    mainPanel.add(insertName);
    frame.add(mainPanel);
    
  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();
  if(command.equals("Say Hello")){
     String name = insertName.getText();
     outputName.setText("Hello " + name);
  }
  }

  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    Main gui = new Main();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}
