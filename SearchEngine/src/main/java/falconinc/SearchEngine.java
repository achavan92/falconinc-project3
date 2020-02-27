package falconinc;
import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;


/**
 *
 * @author Robert (Alex) Spangler
 */
public class SearchEngine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
        SearchEngine srchUI = new SearchEngine();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    // create object for UI
    public SearchEngine() {
        homePage();
    }

    // method to create UI homepage
    private void homePage(){
         // create frame
        JFrame frame = new JFrame("Falcon Search");
	frame.setLayout(new FlowLayout()); 
	frame.setSize(600,600);
        
        // add search button
	JButton srchBtn = new JButton("Search");
        srchBtn.setBounds(340, 150, 100, 40);
        
        // add search textbox
	JTextField txtbx = new JTextField();
        txtbx.setBounds(75, 150, 260, 40);
        
       /* 
        * TODO: figure out how to disable and enable search button
        * based on whether or not the textbox is filled.
        */
       
                
        // radio button for all searched terms
	JRadioButton allSrch = new JRadioButton("All Searched terms");       
	allSrch.setBounds(40, 190, 140, 40);
        
        // radio button for any of the searched terms
	JRadioButton anySrch = new JRadioButton("Any Searched terms");
	anySrch.setBounds(190, 190, 170, 40);
        
        // radio button for exact phrases
	JRadioButton exctPhrse = new JRadioButton("Exact Phrase");
	exctPhrse.setBounds(360, 190, 325, 40);
        
        // allows only one radio button to be sellected at a time
        ButtonGroup bg = new ButtonGroup();
        bg.add(allSrch);
        bg.add(anySrch);
        bg.add(exctPhrse);
        
        /* action listener added to check which
         * radio buttons were select and displaying 
         * the text in the textbox.
         */
        srchBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(allSrch.isSelected()){
                    JOptionPane.showMessageDialog(null,
                            "All Searched Terms for " + txtbx.getText() +" was selected.");
                }
                else if(anySrch.isSelected()) {
                    JOptionPane.showMessageDialog(null, 
                            "Any Searched Terms for " + txtbx.getText() +" was selected.");
                }
                else if(exctPhrse.isSelected()) {
                    JOptionPane.showMessageDialog(null, 
                            "Exact Phrase of " + txtbx.getText() +" selected.");
                }
                else {
                    JOptionPane.showMessageDialog(null, 
                            "No buttons were selected for " + txtbx.getText() + ".");
                }
            }
        });

        // font for title
	Font font = new Font("Monospace", Font.ITALIC, 36); 

	// title
	JLabel title = new JLabel();		
	title.setText("Falcon Search");
	title.setBounds(120, 80, 320, 40);	    
	title.setHorizontalAlignment(JLabel.CENTER);
	title.setVerticalAlignment(JLabel.CENTER);
	title.setFont(font);
        
        // button to connect to the Admin window
        JButton adminbtn = new JButton("Manage Files");
        adminbtn.setBounds(10, 500, 150, 40);
        
        // action listener added to admin button
        adminbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                createAdminPage();
            }
        });
        
        // about button to display info about app
        JButton abtbtn = new JButton("About");
        abtbtn.setBounds(490, 500, 80, 40);
        
        /* add pop up window displaying info on app
         * when about button is clicked.
         */ 
        abtbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Project 3 Search Engine UI" +
                        "\nWritten by: Robert (Alex) Spangler \nPlant City, FL");
            }
        });

		
        // adding text, textbox, buttons, exc to frame
        frame.add(title);
	frame.add(txtbx);
	frame.add(srchBtn);
        frame.add(allSrch);
        frame.add(anySrch);
        frame.add(exctPhrse);
        frame.add(adminbtn);
        frame.add(abtbtn);

		
	frame.setLayout(null);
	frame.setVisible(true);

        // Closes window
	frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    
    // method for admin page.
    private void createAdminPage(){

        // create frame to create frame for admin page
        JFrame frame = new JFrame("Falcon Search - Admin");
	frame.setLayout(new FlowLayout()); 
	frame.setSize(600,600);
        
        // font for title
	Font font = new Font("Monospace", Font.ITALIC, 30); 

	// title
	JLabel title = new JLabel();		
	title.setText("Admin page");// change name when finished
	title.setBounds(120, 100, 320, 40);	    
	title.setHorizontalAlignment(JLabel.CENTER);
	title.setVerticalAlignment(JLabel.CENTER);
	title.setFont(font);
        
       
        
         // about button to display info about app
        JButton homeBtn = new JButton("Home");
        homeBtn.setBounds(490, 20, 80, 40);
        
       // button to return to homepage
        homeBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                homePage(); 
            }
        });
        
        
        // Code for table below     
        String column[]={"File","Status"}; 
        String data[][]={ {"hello.txt","available"},    
                          {"foo.txt","available"},    
                          {"bar.txt","available"}};    
                 
        JTable fileTbl=new JTable(data,column); 
        fileTbl.setBounds(1,160,600,300);

        JScrollPane sP = new JScrollPane(fileTbl, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);


        frame.add(title);
        frame.add(homeBtn);
        frame.add(sP, BorderLayout.CENTER);
               
	frame.setVisible(true);
        
        // Closes window
	frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
    }

}
