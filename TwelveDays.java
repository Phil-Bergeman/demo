// This program prints a line from that song you know
// Author: <Your name here>
// Date: <The date here>

import javax.swing.*;
public class TwelveDays
{
   public static void main (String args[]) 
   {
      int choice;
      String entry;
      double total = 0;
      double price;
	  String suffix;
	  String thing;
	  
	  // calls method to get user choice from static method below.  Nice!
      choice = getChoice();

	  // convert to switch
	  switch(choice){
		  case(12):
			thing = "Twelve drummers drumming";
		  case(11):
			thing = "Eleven pipers piping";
		  case(10):
			thing = "Ten lords a-leaping";
		  case(9):
			thing = "Nine ladies dancing";
		  case(8):
			thing = "Eight maids a-milking";
		  case(7):
			thing = "Seven swans a-swimming";
		  case(6):
			thing = "Six geese a-laying";
		  case(5):
			thing = "Five golden rings";
		  case(4):
			thing = "Four calling birds";
		  case(3):
			thing = "Three French hens";
		  case(2):
			thing = "Two turtle doves and";
		  case(1):
			thing = "A partridge in a pear tree";
		  default:
			thing = "Invalid choice";
	   
	  // This is ugly... let's also convert it to a switch... this is just a little trickier
      if(choice >= 4)
         suffix = "th";
      else
        if(choice == 3)
          suffix = "rd";
        else
          if(choice == 2)
            suffix = "nd";
          else
            suffix = "st";
		
	  System.out.println("\nOn the " + choice + suffix +
          " day of Christmas\n" +
          "My true love gave to me" + thing);
   }
   
   // custom method to get user input with GUI. Returns their day choice.
   public static int getChoice()
   {
      int choice;
      String entry;
      entry = JOptionPane.showInputDialog(null, 
         "From what day do you\n" +
         "want to start the song\n" +
         "The Twelve Days of Christmas?");
      choice = Integer.parseInt(entry);
      return choice;
   }
}


