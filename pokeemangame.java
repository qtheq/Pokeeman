import javax.swing.*;   
import java.awt.event.*; 
import java.util.*;  

public class pokeemangame 
{  
   public static void main(String[] args) 
   {  
      Random generator = new Random();
      
// lists
      ArrayList<String> catchthembois = new ArrayList <String>();
      String prettypinkpokeeman[] = {"pikaACHOO", "SNORElacks", "Allmighty", "Wemwop", "Clarrise", "Namjooner", "Beelieve", "Kaminari", "Bananafish", "ashketchum", "Kookie", "Tatah", "Koyaa", "Veevee", "chimmychimchim", "butter"};  
      ArrayList<String> prettybluepokeeman = new ArrayList <String>();
      prettybluepokeeman.add("pikaCHOO");
      prettybluepokeeman.add("SNORElacks");
      prettybluepokeeman.add("Allmighty");
      prettybluepokeeman.add("Wemwop");
      prettybluepokeeman.add("Clarisse");
      prettybluepokeeman.add("Namjooner");
      prettybluepokeeman.add("Beelieve");
      prettybluepokeeman.add("Kaminari");
      prettybluepokeeman.add("Bananafish");
      prettybluepokeeman.add("ashketchum");
      prettybluepokeeman.add("Kookie");
      prettybluepokeeman.add("Tatah");
      prettybluepokeeman.add("Koyaa");
      prettybluepokeeman.add("Veevee");
      prettybluepokeeman.add("chimmychimchim");
      prettybluepokeeman.add("butter");
      ArrayList<Integer> youch = new ArrayList <Integer>();
      youch.add(90);    //pikaCHOO
      youch.add(90);    //SNORElacks
      youch.add(90);    //Allmighty
      youch.add(52);    //Wemwop
      youch.add(50);    //Clarisse
      youch.add(51);    //Namjooner
      youch.add(69);    //Beelieve
      youch.add(42);    //Kaminari
      youch.add(61);    //Bananafish
      youch.add(1);     //ashketchum
      youch.add(16);    //Kookie
      youch.add(21);    //Tatah
      youch.add(54);    //Koyaa
      youch.add(32);    //Veevee
      youch.add(55);    //chimmychimchim
      youch.add(66);    //butter
      
// interface       
      JFrame mainf = new JFrame("Pokeeman");  
      JButton pokeemanb = new JButton("Pokeeman"); 
      JButton searchb = new JButton("Search"); 
      JButton endb = new JButton("Leave");
      JLabel main1 = new JLabel("Welcome to the world of Pokeeman!");
      JLabel main2 = new JLabel("In this game you will be able to CATCH, BATTLE,");
      JLabel main3 = new JLabel("and TRAIN your Pokeeman to become"); 
      JLabel main4 = new JLabel("the best Pokeeman guardian!");
      JLabel main5 = new JLabel("Good Luck!!");
      
      JFrame pokeemanf = new JFrame("Pokeeman List");
      JButton selectb = new JButton("Select");
      JButton backb = new JButton("Back");
      JLabel pokeeman1 = new JLabel("Select a pokeeman");
      JLabel pokeeman2 = new JLabel("from the list to use");
      JLabel pokeeman3 = new JLabel("for battle and see");
      JLabel pokeeman4 = new JLabel("its bio and health!");
      JComboBox pokeemanselect = new JComboBox(prettypinkpokeeman); 
      
//layout
      mainf.setSize(620, 310);
      mainf.setLayout(null);  
      mainf.setVisible(true); 
      
      main1.setBounds(300, 0, 300, 20);
      main2.setBounds(300, 20, 300, 20);
      main3.setBounds(300, 40, 300, 20);
      main4.setBounds(300, 60, 300, 20);
      main5.setBounds(300, 130, 300, 20);
      searchb.setBounds(0, 0, 290, 90);
      pokeemanb.setBounds(0, 90, 290, 90);  
      endb.setBounds(0, 180, 290, 90);
        
      mainf.add(searchb); 
      mainf.add(pokeemanb);
      mainf.add(endb);
      mainf.add(main1);
      mainf.add(main2);
      mainf.add(main3);
      mainf.add(main4);
      mainf.add(main5);
      
      pokeemanf.setSize(420, 290);
      pokeemanf.setLayout(null);  
      pokeemanf.setVisible(false);
      
      selectb.setBounds(0, 200, 200, 50);
      backb.setBounds(200, 200, 200, 50);
      pokeemanselect.setBounds(0, 0, 250, 50);
      pokeeman1.setBounds(260, 0, 150, 20);
      pokeeman2.setBounds(260, 20, 150, 20);
      pokeeman3.setBounds(260, 40, 150, 20);
      pokeeman4.setBounds(260, 60, 150, 20);
      
      pokeemanf.add(selectb);
      pokeemanf.add(backb);
      pokeemanf.add(pokeemanselect);
      pokeemanf.add(pokeeman1);
      pokeemanf.add(pokeeman2);
      pokeemanf.add(pokeeman3);
      pokeemanf.add(pokeeman4);

// buttons 
      pokeemanb.addActionListener(new ActionListener(){  
   public void actionPerformed(ActionEvent e)
   {  
      mainf.setVisible(false);
      pokeemanf.setVisible(true); 
   }  
      }); 
      
      backb.addActionListener(new ActionListener(){  
   public void actionPerformed(ActionEvent e)
   {  
      pokeemanf.setVisible(false);
      mainf.setVisible(true);   
   }  
      }); 
      
      selectb.addActionListener(new ActionListener(){  
   public void actionPerformed(ActionEvent e)
   {  
      int indnum = pokeemanselect.getSelectedIndex();
      String selected = (String)pokeemanselect.getItemAt(indnum);

      String output1 = "You selected " + selected;
      JOptionPane.showMessageDialog(null, output1, "Selected", JOptionPane.PLAIN_MESSAGE);
      
      ArrayList<String> bios = new ArrayList<String>();
      bios.add("Pikachoo eats lollipops" + "\nHealth: " + youch.get(indnum));
      bios.add("Snorelacks likes to sleep" + "\nHealth: " + youch.get(indnum));
      bios.add("Allimighty is sad" + "\nHealth: " + youch.get(indnum));
      bios.add("Wemwop is a weeb" + "\nHealth: " + youch.get(indnum));
      bios.add("Clarrise is so basic" + "\nHealth: " + youch.get(indnum));
      bios.add("Namjooner likes destruction" + "\nHealth: " + youch.get(indnum));
      bios.add("Beelieve has the motivation to do anything" + "\nHealth: " + youch.get(indnum));
      bios.add("Kaminari likes to eat lightning" + "\nHealth: " + youch.get(indnum));
      bios.add("Bananafish likes to read plays" + "\nHealth: " + youch.get(indnum));
      bios.add("Ashketchum has had the turns tabled" + "\nHealth: " + youch.get(indnum));      
      bios.add("Kookies likes cookies" + "\nHealth: " + youch.get(indnum)); 
      bios.add("Tatah plays the maracas" + "\nHealth: " + youch.get(indnum)); 
      bios.add("Koyaa believes in equality" + "\nHealth: " + youch.get(indnum)); 
      bios.add("Veevee isn't the brightest but it's okay" + "\nHealth: " + youch.get(indnum)); 
      bios.add("Chimmychimchim likes to pet dogs" + "\nHealth: " + youch.get(indnum)); 
      bios.add("Butter likes to eat it's own kind" + "\nHealth: " + youch.get(indnum)); 
      
      String selectedbio = bios.get(indnum);
      JOptionPane.showMessageDialog(null, selectedbio, selected, JOptionPane.PLAIN_MESSAGE);
   }  
      });  

      searchb.addActionListener(new ActionListener(){  
   public void actionPerformed(ActionEvent e)
   {  
      mainf.setVisible(false);
      
      int opppick = generator.nextInt(16);
      String victim = opponent(prettybluepokeeman, opppick);
      int opphealth = youch.get(opppick);
      
      JFrame searchf = new JFrame("Gotta snatch 'em all >:)");
      JLabel catch1 = new JLabel("A wild " + victim + " has manifested!!");
      JLabel catch2 = new JLabel("HP: " + opphealth);
      JLabel catch3 = new JLabel("Will you try to catch it or are you too scared?");
      JButton catchb = new JButton("CATCH");
      JButton runb = new JButton("RUN");
      
      catchb.setBounds(0, 100, 200, 100);
      runb.setBounds(200, 100, 200, 100);
      catch1.setBounds(0, 0, 250, 20);
      catch2.setBounds(0, 20, 200, 20);
      catch3.setBounds(0, 40, 300, 20);
      
      searchf.setSize(420, 240);
      searchf.setLayout(null);  
       
      searchf.add(catchb);
      searchf.add(runb);
      searchf.add(catch1); 
      searchf.add(catch2);
      searchf.add(catch3);
      searchf.setVisible(true);
      
      runb.addActionListener(new ActionListener(){  
   public void actionPerformed(ActionEvent e)
   {  
      String output2 = "You ran away in fear!";
      JOptionPane.showMessageDialog(null, output2, "Escape!!", JOptionPane.PLAIN_MESSAGE);
      
      searchf.setVisible(false);
      mainf.setVisible(true);
   }  
      });
      
      catchb.addActionListener(new ActionListener(){
   public void actionPerformed(ActionEvent e)
   {
      searchf.setVisible(false);
      
      int indnum = index(pokeemanselect);
      int health = livingpoints(youch, indnum);  
          
      attack(opphealth, victim, catchthembois, health);
      
      mainf.setVisible(true);        
   }  
      });

   }  
      }); 
      
      endb.addActionListener(new ActionListener(){  
   public void actionPerformed(ActionEvent e)
   {  
      String output3 = "You're leaving?? \nWell, while you were here you caught:\n" + catchthembois;
      JOptionPane.showMessageDialog(null, output3, "Bye-bye :(", JOptionPane.PLAIN_MESSAGE);
      
      mainf.setVisible(false);
   }  
      }); 
       
   }
   
// methods
   public static String opponent (ArrayList<String> prettybluepokeeman, int opppick)
   {
      String victim;
      
      victim = prettybluepokeeman.get(opppick);
      return victim;
   }
   
   public static void attack (int opphealth, String victim, ArrayList<String> catchthembois, int health)
   {
      Random generator = new Random();
      int win = 1;
      String output4;
      String check;
      int oppmove;
      boolean battle = true;
      boolean add = true;
      String[]moves = {"Scratch", "Bite", "Kick", "Spin"};
      
      while (battle)
      {
         String action1 = (String)JOptionPane.showInputDialog(null, "What will you do?" , "Attack", JOptionPane.QUESTION_MESSAGE, null, moves, moves[0]);
         
         if (action1 == "Scratch")
         {
            opphealth = opphealth - 14;
            output4 = "You used scratch! It did 14 damage!";
            JOptionPane.showMessageDialog(null, output4);
         }
      
         if (action1 == "Bite")
         {  
            opphealth = opphealth - 20;
            output4 = "You used bite! It did 20 damage!";
            JOptionPane.showMessageDialog(null, output4);
         }
         
         if (action1 == "Kick")
         {
            opphealth = opphealth - 10;
            output4 = "You used kick! It did 10 damage!";
            JOptionPane.showMessageDialog(null, output4);
         }
         
         if (action1 == "Spin")
         {
            opphealth = opphealth - 32;
            output4 = "You used spin! It did 32 damage!";
            JOptionPane.showMessageDialog(null, output4);
         }
         
         if (opphealth <= 0)
         {
            for (int i = 0; i < catchthembois.size(); i ++)
            {
               add = true;
               check = catchthembois.get(i);
            
               if (check == victim)
                  add = false;
            }
            
            if (add == true)
               catchthembois.add(victim);
               
            output4 = "You won!!";
            JOptionPane.showMessageDialog(null, output4);
            
            battle = false;
            break;
         }
         
         oppmove = generator.nextInt(4);
         battle = opponentmove(victim, health, battle, oppmove);
         
         if (battle == false)
            break;     
      }
               
   }
   
   public static boolean opponentmove (String victim, int health, boolean battle, int oppmove)
   {
      String output5;
        
      if (oppmove == 0)
      {
         health = health - 14;
         output5 = victim + " used scratch! It did 14 damage!";
         JOptionPane.showMessageDialog(null, output5);
      }
         
      if (oppmove == 1)
      {
         health = health - 20;
         output5 = victim + " used bite! It did 20 damage!";
         JOptionPane.showMessageDialog(null, output5);
      }
         
      if (oppmove == 2)
      {
         health = health - 10;
         output5 = victim + " used kick! It did 10 damage!";
         JOptionPane.showMessageDialog(null, output5);
      }
         
      if (oppmove == 3)
      {
        health = health - 32;
        output5 = victim + " used spin! It did 32 damage!";
        JOptionPane.showMessageDialog(null, output5);
      }
         
      if (health <= 0)
      {
         output5 = "You lost like the loser you are.";
         JOptionPane.showMessageDialog(null, output5);
         battle = false;
      }  
      
      return battle;
   }
   
   public static int livingpoints (ArrayList<Integer> youch, int indnum)
   {
      int health;
      
      health = youch.get(indnum);
      return health;
   }
   
   public static int index (JComboBox pokeemanselect)
   {
      int indnum;
      
      indnum = pokeemanselect.getSelectedIndex();
      return indnum;
   }

}
