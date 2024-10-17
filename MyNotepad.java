import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class MyNotepad extends JFrame implements ActionListener {
  
    JTextArea textArea;
    JMenuBar menuBar;
    JMenu fileMenu;
    JMenuItem openItem, saveItem, exitItem;
    JFileChooser fileChooser;

 
    public MyNotepad() {
       
        setTitle("MyNotepad");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       
        textArea = new JTextArea();
        add(new JScrollPane(textArea), BorderLayout.CENTER);

       
        menuBar = new JMenuBar();

    
        fileMenu = new JMenu("File");
        
        
        openItem = new JMenuItem("Open");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        
        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

     
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        
        menuBar.add(fileMenu);

        
        setJMenuBar(menuBar);

        
        fileChooser = new JFileChooser();
    }

    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == openItem) {
            
            int returnValue = fileChooser.showOpenDialog(this);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    textArea.read(reader, null);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        } else if (e.getSource() == saveItem) {
          
            int returnValue = fileChooser.showSaveDialog(this);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                    textArea.write(writer);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        } else if (e.getSource() == exitItem) {
            
            System.exit(0);
        }
    }

   
    public static void main(String[] args) {
        MyNotepad notepad = new MyNotepad();
        notepad.setVisible(true);
    }
}
