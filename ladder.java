import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class FDemo extends JFrame
{
	JPDemo jp;
	FDemo()
	{
		jp =new JPDemo();
		add(jp);
		super.setTitle("SNAKE AND LADDER");
		
	}
}
class JPDemo extends JPanel implements ActionListener,KeyListener
{ ImageIcon img1,img2,img3,img4;
ImageIcon img5,img6,img7,img8;
ImageIcon img9,img10,img11,img12;
JButton b1,b2,b3,b4;
JTextField tx1,tx2,tx3;
int random;
int px1=10,px2=150,py2=720;
int py1=720;
int sum=0;
int count=0, counts=0,c=0;

  Image swt,about,start,reset,board,snake,player1,player2,player11,player12,dice,dice1;
	JPDemo()
	{    setBackground(Color.black);
	  img1=new ImageIcon("swt.jpg");;
	  swt=img1.getImage();
	  img2=new ImageIcon("aboutus.jpg");
	  about=img2.getImage();
	  img3=new ImageIcon("reset2.jpg");
	  reset=img3.getImage();
	  img4=new ImageIcon("start.jpg");
	  start=img4.getImage();
	 img5=new ImageIcon("board2.jpg");
	board=img5.getImage();
	img6=new ImageIcon("snake.jpg");
	snake=img6.getImage();
    img7=new ImageIcon("player123.jpg");
	player1=img7.getImage();
	img8=new ImageIcon("playerabc.jpg");
	player2=img8.getImage();
	img9=new ImageIcon("dice000.gif");
	dice=img9.getImage();
	img11=new ImageIcon("rav.jpg");
	player11=img11.getImage();
	img12=new ImageIcon("ravi.jpg");
	player12=img12.getImage();
	b1=new JButton(img2);
	setLayout(null);
	b1.setBounds(0,220,172,80);
	add(b1);
	b1.setBackground(new Color(36,219,223));
	b2=new JButton(img3);
	b2.setBounds(0,300,172,50);
	add(b2);
	b2.setBackground(new Color(36,219,223));
	Font f=new Font("",Font.ITALIC,20);
	tx1=new JTextField("START GAME");
	tx1.setBounds(0,350,172,50);
	add(tx1);
	tx1.setBackground(new Color(36,219,223));
	tx1.setForeground(Color.red);
	tx1.setFont(f);
	tx2=new JTextField("PLAYER1 NAME");
	tx2.setBounds(50,400,200,40);
	add(tx2);
	tx2.setBackground(new Color(36,219,223));
	tx2.setForeground(Color.red);
	tx2.setFont(f);
	tx3=new JTextField("PLAYER2 NAME");
	tx3.setBounds(50,475,200,40);
	add(tx3);
	tx3.setBackground(new Color(36,219,223));
	tx3.setForeground(Color.red);
	tx3.setFont(f);
	b3=new JButton("Roll");
	b3.setBounds(50,520,100,50);
	add(b3);
	b3.addActionListener(this);
	b3.setBackground(new Color(36,219,223));
	b4=new JButton(img4);
	b4.setBounds(45,720,100,50);
	add(b4);
	b4.setBackground(new Color(36,219,223));
	b4.addActionListener(this);
	b2.addActionListener(this);
	b1.addActionListener(this);
	tx1.addKeyListener(this);
	tx2.addKeyListener(this);
	tx3.addKeyListener(this);
	
	
	}
	
	public void paintComponent(Graphics g)
	{ 
		super.paintComponent(g);
	g.setColor(new Color(36,219,223));  
	g.fillRect(0,0,250,1000);
	g.drawImage(swt,0,0,this);
	//g.drawImage(start,0,700,this);
	g.drawImage(board,250,50,this);
	g.drawImage(snake,950,50,this);
	g.drawImage(player1,0,400,this);
	g.drawImage(player2,0,475,this);
	g.drawImage(dice,20,550,this);
	g.drawImage(dice1,120,630,this);
	g.drawImage(player11,px1,py1,this);
	g.drawImage(player12,px2,py2,this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b3)
		{ 
	 c++;
	 random=(int)Math.round(Math.random()*5+1);
	
	
		switch(random)
		{  
			case 1:
			img10=new ImageIcon("dicea.jpg");
			
			break;
			case 2:
			img10=new ImageIcon("diceb.jpg");
			
			
			break;
			case 3:
			img10=new ImageIcon("dicec.jpg");
			
			break;
			case 4:
			img10=new ImageIcon("diced.jpg");

			break;
			case 5:
			img10=new ImageIcon("dicee.jpg");
			
			break;
			case 6:
			img10=new ImageIcon("dicef.jpg");
		
		break;}
		
if(c%2==1)
			{
			count+=random;
			if(count==2)count=38;
			if(count==7)count=14;
			if(count==8)count=31;
			if(count==15)count=26;
				if(count==16)count=6;
		if(count==21)count=42;
		if(count==28)count=84;
		if(count==36)count=44;
		
		if(count==46)count=25;
		if(count==49)count=11;
		if(count==51)count=67;
		if(count==62)count=19;
		if(count==64)count=60;
		if(count==71)count=91;
		if(count==74)count=53;
		if(count==78)count=98;
		if(count==87)count=94;
		if(count==89)count=68;
		if(count==92)count=88;
		if(count==95)count=75;
			if(count==96&&(random==5||random==6))count=96;
		if(count==97&&(random==5||random==6||random==4))count=97;
		if(count==98&&(random==5||random==6||random==3||random==4))count=98;
		if(count==99)count=80;
		
		if(count>=100)
		{
	String s1=tx2.getText();
	tx1.setText(s1);
b3.removeActionListener(this);
		}
int x=275;
int y=720;
int count1=0;
int k=1;
m:
for(int i=1;i<=10;i++)
{
if(k==11)
{
x-=70;
k--;
}
if(k==0)
{
x+=70;
k++;
}
for(int j=1;j<=10;j++)
{count1++;
px1=x;py1=y;
if(count1==count)break m;
if(i%2==1)
{
x+=70;
k++;
}
else
{
x-=70;
k--;
}

}
y-=70;
}
			}
else if(c%2==0)
		{
			
		counts+=random;
		if(counts==2)counts=38;
			if(counts==7)counts=14;
			if(counts==8)counts=31;
			if(counts==15)counts=26;
			if(counts==16)counts=6;
		if(counts==21)counts=42;
		if(counts==28)counts=84;
		if(counts==36)counts=44;

		if(counts==46)counts=25;
		if(counts==49)counts=11;
		if(counts==51)counts=67;
		if(counts==62)counts=19;
		if(counts==64)counts=60;
		if(counts==71)counts=91;
		if(counts==74)counts=53;
		if(counts==78)counts=98;
		if(counts==87)counts=94;
		if(counts==89)counts=68;
		if(counts==92)counts=88;
		if(counts==96&&(random==5||random==6))counts=96;
		if(counts==97&&(random==5||random==6||random==4))counts=97;
		if(counts==98&&(random==5||random==6||random==3||random==4))counts=98;
		if(counts==95)counts=75;
		if(counts==99)counts=80;
		
		if(counts>=100)
		{
	
	String s1=tx3.getText();
	tx1.setText(s1);
	

b3.removeActionListener(this);
		}
int x=275;
int y=720;
int count1=0;
int k=1;
m:
for(int i=1;i<=10;i++)
{
if(k==11)
{
x-=68;
k--;
}
if(k==0)
{
x+=70;
k++;
}
for(int j=1;j<=10;j++)
{count1++;
px2=x;py2=y;
if(count1==counts)break m;
if(i%2==1)
{
x+=70;
k++;
}
else
{
x-=70;
k--;
}
}
y-=70;
}

			}
		}		
		else if(e.getSource()==b2)
		{
			 px1=10;px2=150;py2=720;
 py1=720;
		}
		else if(e.getSource()==b4)
		{ 
	 px1=270;
	 px2=290;
	 py2=720;
     py1=720;
	}
	else if(e.getSource()==b1)
	{ 
	System.out.println("softwaves");
	}
		dice1=img10.getImage();
		repaint();
		}
			
    public void keyReleased(KeyEvent ey)
				 {
					 if(tx2.isFocusOwner())
					 {
						  String s1=tx2.getText().trim();
						   if(s1.equals(""))
						   {
							    tx2.setForeground(Color.gray);
						        tx2.setText("PLAYER1 NAME");
				           }
					 }
					  if(tx3.isFocusOwner())
					 {
						  String s1=tx3.getText().trim();
						   if(s1.equals(""))
						   {
							    tx3.setForeground(Color.gray);
						        tx3.setText("PLAYER2 NAME ");
				           }
					 }
				 }
public void keyPressed(KeyEvent e)
				 {
					   if(tx2.isFocusOwner())
					 {
					 String s1=tx2.getText();
					 if(s1.equals("PLAYER1 NAME "))
					 {
						 tx2.setForeground(Color.red);
						 tx2.setText("");
						 }
				 }
				    if(tx3.isFocusOwner())
					 {
					 String s1=tx3.getText();
					 if(s1.equals("PLAYER2 NAME"))
					 {
						 tx3.setForeground(Color.red);
						 tx3.setText("");
					 }
				}
				 }
	public void keyTyped(KeyEvent e) {}
	}
class Demo
{ public static void main(String args[])
	{
		FDemo f= new FDemo();
		f.setVisible(true);
		f.setSize(1000,1000);
		f.setLocation(200,0);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		
	}
	
} 
