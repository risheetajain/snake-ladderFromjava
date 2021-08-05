import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class FDemo extends JFrame
{   JPDemo jp;
	FDemo()
	{
	  jp =new JPDemo();
		add(jp);
		super.setTitle("gATI");
		}
}
class JPDemo extends JPanel implements ActionListener,KeyListener
{ ImageIcon img1,img2,img3,img4;
ImageIcon img5,img6,img7,img8;
ImageIcon img9,img10,img11,img12;
ImageIcon img13,img14,img15,img16;
ImageIcon img17,img18,img19,img20;
ImageIcon img21,img22,img23,img24;
ImageIcon img25,img26,img27,img28;
JButton b1,b2,b3,b4,b5;
JTextField tx1,tx2,tx3,tx4,tx5,tx6,tx7,tx8,tx9,tx10;
int random;
int px1=10,px2=150,py2=720;
int py1=720;
int sum=0;
int count=0, counts=0;
Image logo,about,start,reset,board,dice,dice1,swt,player1,player2,snake,player11,player12,a,b,c,d,e,f,gu,h,i,j,k,l,m,n,o,p;
	JPDemo()
	{ setBackground(Color.white);
	  img17=new ImageIcon("boar1.jpg");
	  logo=img17.getImage();
	  img18=new ImageIcon("aboutus.jpg");
	  about=img18.getImage();
	  img19=new ImageIcon("reset2.jpg");
	  reset=img19.getImage();
	img20=new ImageIcon("start.jpg");
	start=img20.getImage();
	img21=new ImageIcon("1.jpg");
	board=img21.getImage();
	img1=new ImageIcon("1.jpg");
	a=img1.getImage();
	img2=new ImageIcon("1.jpg");
	b=img2.getImage();
	img3=new ImageIcon("1.jpg");
	c=img3.getImage();
	img4=new ImageIcon("1.jpg");
	d=img4.getImage();
	img5=new ImageIcon("2.jpg");
	e=img5.getImage();
	img6=new ImageIcon("2.jpg");
	f=img6.getImage();
	img7=new ImageIcon("2.jpg");
	gu=img7.getImage();
	img8=new ImageIcon("2.jpg");
	h=img8.getImage();
    img9=new ImageIcon("3.jpg");
	i=img9.getImage();
	img10=new ImageIcon("3.jpg");
	j=img10.getImage();
	img11=new ImageIcon("3.jpg");
	k=img11.getImage();
	img12=new ImageIcon("3.jpg");
	l=img12.getImage();
	img13=new ImageIcon("4.jpg");
	m=img13.getImage();
	img14=new ImageIcon("4.jpg");
	n=img14.getImage();
	img15=new ImageIcon("4.jpg");
	o=img15.getImage();
	img16=new ImageIcon("4.jpg");
	p=img16.getImage();
	
    setLayout(null);
	b1=new JButton("about");
	b1.setBounds(0,0,100,50);
	add(b1);
	b1.setBackground(new Color(36,219,223));
	b2=new JButton("reset");
	b2.setBounds(0,100,100,60);
	add(b2);
	b2.setBackground(new Color(36,219,223));
	Font f=new Font("",Font.ITALIC,20);
	tx1=new JTextField("PLAYER2 NAME");
	tx1.setBounds(700,0,100,50);
	add(tx1);
	tx1.setBackground(new Color(36,219,223));
	tx1.setForeground(Color.red);
	tx1.setFont(f);
	tx2=new JTextField("PLAYER1 NAME");
	tx2.setBounds(900,100,200,40);
	add(tx2);
	tx2.setBackground(new Color(36,219,223));
	tx2.setForeground(Color.red);
	tx2.setFont(f);
	tx3=new JTextField("PLAYER3 NAME");
	tx3.setBounds(900,200,100,40);
	add(tx3);
	tx3.setBackground(new Color(36,219,223));
	tx3.setForeground(Color.red);
	tx3.setFont(f);
	b3=new JButton("Roll");
	b3.setBounds(0,200,100,60);
	add(b3);
	b3.addActionListener(this);
	b3.setBackground(new Color(36,219,223));
	b4=new JButton("start");
	b4.setBounds(0,150,100,50);
	add(b4);
	b5=new JButton();
	b5.setBounds(0,250,100,50);
	add(b5);
	b5.setBackground(new Color(36,219,223));
	tx5=new JTextField("PLAYER4 NAME");
	tx5.setBounds(900,300,172,50);
	add(tx5);
	tx6=new JTextField("1st winnr");
	tx6.setBounds(900,400,172,50);
	add(tx6);
	tx7=new JTextField("1st winnr");
	tx7.setBounds(900,500,172,50);
	add(tx7);
	tx8=new JTextField("1st winnr");
	tx8.setBounds(900,600,172,50);
	add(tx8);
	tx9=new JTextField("losr");
	tx9.setBounds(900,700,172,50);
	add(tx9);
	
	
	b4.setBackground(new Color(36,219,223));
	b4.addActionListener(this);
	b2.addActionListener(this);
	b1.addActionListener(this);
	tx1.addKeyListener(this);
	tx2.addKeyListener(this);
	tx3.addKeyListener(this);
	}
	public void paintComponent(Graphics g)
	{  super.paintComponent(g);
   g.drawImage(a,750,300,this);
	g.drawImage(b,500,400,this);
	g.drawImage(c,800,40,this);
	g.drawImage(d,800,80,this);
	g.drawImage(e,800,80,this);
	g.drawImage(f,800,100,this);
	g.drawImage(gu,800,120,this);
	g.drawImage(h,800,140,this);
	g.drawImage(i,800,160,this);
	g.drawImage(j,800,180,this);
	g.drawImage(k,800,200,this);
	g.drawImage(l,800,220,this);
	g.drawImage(m,800,240,this);
	g.drawImage(n,800,260,this);
	g.drawImage(o,800,280,this);
	g.drawImage(p,800,0,this);
	g.drawImage(logo,200,100,this);
	g.drawImage(about,0,0,this);
	g.drawImage(start,0,200,this);
	g.drawImage(reset,0,100,this);
	g.drawImage(player11,px1,py1,this);
	g.drawImage(player12,px2,py2,this);
	}
	public void actionPerformed(ActionEvent e)
	{
	}
	public void keyReleased(KeyEvent e)
				 {
				 }
				 public void keyPressed(KeyEvent e)
				 {
					 
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
