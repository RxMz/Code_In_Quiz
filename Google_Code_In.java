
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.*;
class  Quiz_Code_In extends JFrame implements ActionListener{
            JPanel panel;
            JPanel panelresult;
            JRadioButton choice1;
            JRadioButton choice2;
            JRadioButton choice3;
            JRadioButton choice4;
            ButtonGroup bg;
            JLabel lblmess;
            JButton btnext;
            String[][] qpa;
            String[][] qca;
            int qaid;
            HashMap<Integer, String> map;

            Quiz_Code_In(){
                    initializedata();
                     setTitle("Quiz Code In");
                     setDefaultCloseOperation(EXIT_ON_CLOSE);
                      setSize(750,750);
                      setLocation(300,100);
                      setResizable(false);
                      Container cont=getContentPane();
                      cont.setLayout(null);          
                      cont.setBackground(Color.GRAY);
                    bg=new ButtonGroup();     
                    choice1=new JRadioButton("Choice1",true);
                    choice2=new JRadioButton("Choice2",false);
                    choice3=new JRadioButton("Choice3",false);
                   choice4=new JRadioButton("Choice4",false);
                    bg.add(choice1);
                    bg.add(choice2);
                    bg.add(choice3);
                    bg.add(choice4);
                    lblmess=new JLabel("Choose a correct anwswer");
                    lblmess.setForeground(Color.BLUE);
                    lblmess.setFont(new Font("Arial", Font.BOLD, 11));
                    btnext=new JButton("Next");
                    btnext.setForeground(Color.GREEN);                
                    btnext.addActionListener(this);
                    panel=new JPanel();
                    panel.setBackground(Color.LIGHT_GRAY);
                    panel.setLocation(10,10);
                    panel.setSize(750,750);
                    panel.setLayout(new GridLayout(6,2));
                    panel.add(lblmess);
                    panel.add(choice1);
                    panel.add(choice2);
                    panel.add(choice3);
                    panel.add(choice4);
                    panel.add(btnext);
                    cont.add(panel);
                    setVisible(true);
                    qaid=0;
                    readqa(qaid);
          
           }
          
        public void actionPerformed(ActionEvent e){
          
                       if(btnext.getText().equals("Next")){
                                    if(qaid<9){
                                               
                                                map.put(qaid,getSelection());
                                                qaid++;
                                                readqa(qaid);
                                                }
                                    else {
                                                map.put(qaid,getSelection());
                                                btnext.setText("Show answers");
                                               
                                             }
                                    }
                        else if(btnext.getText().equals("Show answers"))
                                    new Report();
                       
                       
            }
           

           
        public void initializedata(){
                        qpa=new String[10][5];

                        qpa[0][0]="In 2005 the Government of ________ voted to adopt open source across all its bodies.";
                        qpa[0][1]="Peru";
                        qpa[0][2]="India";
                        qpa[0][3]="Australia";
                        qpa[0][4]="Brazil";

                        qpa[1][0]="In February ____, the United States White House moved its website to Linux servers using Drupal for content management";
                        qpa[1][1]="2002";
                        qpa[1][2]="2009";
                        qpa[1][3]="2013";
                        qpa[1][4]="2015";
                       
                        qpa[2][0]="Whats the full form of FOSS";
                        qpa[2][1]="Free and open source software";
                        qpa[2][2]="Fully operational source software";
                        qpa[2][3]="Fully operating software source";
                        qpa[2][4]="Free open sidey software";

                        qpa[3][0]="What is FOSS?";
                        qpa[3][1]="Computer software that can be classified as both free software and open-source software.";
                        qpa[3][2]="Mobile software that can be classified as both free software and open-source software.";
                        qpa[3][3]="Wear software that can be classified as both free software and open-source software.";
                        qpa[3][4]="None of the above";

                        qpa[4][0]="FOSS is which of the following?";
                        qpa[4][1]="Only developers get to use it.";
                        qpa[4][2]="Paid and only a limited people can use it";
                        qpa[4][3]="Free and anyone can use it";
                        qpa[4][4]="Something nobody knows";

                        qpa[5][0]="The Linux kernel was started by who?";
                        qpa[5][1]="Eric Raymold";
                        qpa[5][2]="Richard Stalman";
                        qpa[5][3]="Rishabh Minocha";
                        qpa[5][4]="Linus Torvalds";

                        qpa[6][0]="Which was the first state to officially declare its support for FOSS?";
                        qpa[6][1]="New Delhi";
                        qpa[6][2]="Karnataka";
                        qpa[6][3]="Kerala";
                        qpa[6][4]="Goa";

                        qpa[7][0]="Who announced the GNU project?";
                        qpa[7][1]="Rishabh Minocha";
                        qpa[7][2]="Richard Stalman";
                        qpa[7][3]="Eric Raymold";
                        qpa[7][4]="Linus Torvalds";

                        qpa[8][0]="Who coined the term FLOSS?";
                        qpa[8][1]="Rishabh Minocha";
                        qpa[8][2]="Erica Ray";
                        qpa[8][3]="Rishab Aiyer Ghosh";
                        qpa[8][4]="Jamess Torvalds";

                        qpa[9][0]="When was the term FLOSS coined?";
                        qpa[9][1]="2001";
                        qpa[9][2]="2002";
                        qpa[9][3]="1998";
                        qpa[9][4]="1999";

                       
                        //qca stores pairs of question and its correct answer
                        qca=new String[10][2];
                       
                        qca[0][0]="In 2005 the Government of ________ voted to adopt open source across all its bodies.";
                        qca[0][1]="Peru";

                        qca[1][0]="In February ____, the United States White House moved its website to Linux servers using Drupal for content management";
                        qca[1][1]="2009";

                        qca[2][0]="Which was the first state to officially declare its support for FOSS?";
                        qca[2][1]="Free and open source software";

                        qca[3][0]="What is FOSS??";
                        qca[3][1]="Computer software that can be classified as both free software and open-source software.";


                        qca[4][0]="FOSS is which of the following?";
                        qca[4][1]="Free and anyone can use it";

                        qca[5][0]="The Linux kernel was started by who?";
                        qca[5][1]="Linus Torvalds";

                        qca[6][0]="Which was the first state to officially declare its support for FOSS?";
                        qca[6][1]="Kerala";
                       
                        qca[7][0]="Who announced the GNU project?";
                        qca[7][1]="Richard Stalman";
                       
                        qca[8][0]="Who coined the term FLOSS?";
                        qca[8][1]="Rishab Aiyer Ghosh";

                        qca[9][0]="When was the term FLOSS coined?";
                        qca[9][1]="2002";
                        map=new HashMap<Integer, String>();
                       
                        }
        public String getSelection(){
                        String selectedChoice=null;
                        Enumeration<AbstractButton> buttons=bg.getElements(); 
                        while(buttons.hasMoreElements()) 
                        { 
                        JRadioButton temp=(JRadioButton)buttons.nextElement(); 
                        if(temp.isSelected()) 
                                    { 
                                                selectedChoice=temp.getText();
                                    } 
                         }  
                        return(selectedChoice);
            }


        public void readqa(int qid){
                        lblmess.setText("  "+qpa[qid][0]);
                        choice1.setText(qpa[qid][1]);
                        choice2.setText(qpa[qid][2]);
                        choice3.setText(qpa[qid][3]);
                        choice4.setText(qpa[qid][4]);
                        choice1.setSelected(true);
            }
        public void reset(){
                        qaid=0;
                        map.clear();
                        readqa(qaid);
                        btnext.setText("Next");
                        }
        public int calCorrectAnswer(){
                        int qnum=10;
                        int count=0;
                        for(int qid=0;qid<qnum;qid++)
                                    if(qca[qid][1].equals(map.get(qid))) count++;
                        return count;
            }

        public class Report extends JFrame{
                        Report(){
                                    setTitle("Answers");
                                    setSize(850,550);
                                    setBackground(Color.WHITE);
                                    addWindowListener(new WindowAdapter(){
                                                            public void windowClosing(WindowEvent e){
                                                                        dispose();
                                                                        reset();
                                                            }
                                                });
                                    Draw d=new Draw();                                  
                                    add(d);
                                    setVisible(true);
                                    }
                       
                       
                    class Draw extends Canvas{
                                    public void paint(Graphics g){
                                                int qnum=10;
                                                int x=10;
                                                int y=20;
                                                for(int i=0;i<qnum;i++){
                                                            //print the 1st column
                                                            g.setFont(new Font("Arial",Font.BOLD,12));                                         
                                                            g.drawString(i+1+". "+qca[i][0], x,y);
                                                            y+=30;           
                                                            g.setFont(new Font("Arial",Font.PLAIN,12));                             
                                                            g.drawString("      Correct answer:"+qca[i][1], x,y);
                                                            y+=30;
                                                            g.drawString("      Your answer:"+map.get(i), x,y);
                                                            y+=30;
                                                            //print the 2nd column
                                                            if(y>400)
                                                            {y=20;
                                                              x=450;
                                                            }
                                                           
                                                }
                                                //Show number of correct answers
                                                int numc=calCorrectAnswer();
                                                g.setColor(Color.BLUE);
                                                g.setFont(new Font("Arial",Font.BOLD,14));
                                                g.drawString("Number of correct answers:"+numc,300,500);
                       
                                               
                                    }
                        }
                                   
            }
           

           

}


 public class QuizProgram{
 
            public static void main(String args[]){
                         new Quiz();
  
            }


}
