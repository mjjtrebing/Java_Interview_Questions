import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
public class Display extends JPanel
{
	String texts;
	private int HI=300;
	private int WID =300;
	//JFrame frame;
	JButton button;
	JTextArea txt;
	JTextArea reply;
	public Display()
	{
		reply = new JTextArea("");
		button = new JButton("THE MAGICICAL CONVERTER");
		txt = new JTextArea("do geese see god");
		button.addActionListener(new ClickMasta());
		reply.setEditable(false);

	}
		
	public void setFrame()
	{
		JFrame frame = new JFrame("GUI");
		this.setSize(HI,WID);
		frame.setSize(HI,WID);
		frame.setVisible(true);
		frame.setContentPane(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());//makes buttons and feilds fit the frame/panel exactly
		add(txt,BorderLayout.NORTH);//NORTH sets the position
		add(button,BorderLayout.CENTER);
		add(reply,BorderLayout.SOUTH);
	}
	
	private class ClickMasta implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Stack<Character> front = new Stack<Character>();
			Queue<Character> qu = new LinkedList<Character>();
			char space = ' ';
			String temp="";
			//Scanner scano = new Scanner(System.in);
			//String palo = scano.nextLine();
			String palo = txt.getText();
			for(int i=0;i<palo.length();i++)
			{
				if(palo.charAt(i)!=space)
				{
					temp += "" + palo.charAt(i);
				}
			}
			for(int i=0;i<temp.length();i++)
			{
				front.push(temp.charAt(i));
				qu.add(temp.charAt(i));
			}
			
			char var1=' ';
			char var2=' ';
			boolean bool= true;
			
			for(int i=0;i<temp.length();i++)
			{
				var1 = front.pop();
				var2 = qu.remove();
				if(var1!=var2)
				{
					
					reply.setText("not a palimdrone");
					bool=false;
					i=temp.length();	
				}
			}
			if(bool)
			{
				reply.setText("This IS a palimdrone: " + palo);
			}
		}
	}
}
