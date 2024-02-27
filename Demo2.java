/*class Demo2
{
	public static void main(String ar[])
	{
		String s1="abc";
		String s2="aDAef";
		String s3="abcfe";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
	}
}
 */
import java.awt.*;
import java.awt.event.*;

class FDemo extends Frame implements ActionListener 
{
	Button b[] = new Button[9];
	FDemo()
	{
		setTitle("Tic Tac Toe");
		
		Font f = new Font("Brush Script MT",Font.BOLD,25);
		setFont(f);
		setLayout(null); 
		
		int i,j,k=0;
		int x=100,y=100;
		
		for(i=1;i<=3;i++)
		{
			for(j=1;j<=3;j++)
			{
				b[k] = new Button();
		        b[k].setSize(100,100);
		        b[k].setLocation(x,y);
		        add(b[k]);
				b[k].addActionListener(this);
				x+=100;
				k++;
			}
			y+=100;
			x=100;
		}
	}
	int c=1;
	public void actionPerformed(ActionEvent e)
	{
		Button b = (Button)e.getSource();
		if(c%2==1)
		{
			b.setLabel("0");
			c++;
		}
		else
		{
			b.setLabel("X");
			c++;
		}
		b.removeActionListener(this);
	}

}
class Demo2
{
	public static void main(String ar[])
	{
		FDemo f = new FDemo();
		f.setVisible(true);
		f.setSize(800,800);
		f.setLocation(200,100);
	}
}