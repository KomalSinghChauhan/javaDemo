/*class threadDemo
{
public static void main(String[] args)
{
new Thread(new Runnable()
{
public void run()
{
for(int i=0;i<10;i++)
{
System.out.println("child thread");
}
}
}).start();
for(int i=0;i<10;i++)
{
System.out.println("main thread");
}
}
}*/
/*
import java.awt.*;
import java.awt.event.*;
 class jardemo
{
public static void main(String[] args)
{
Frame f=new Frame();
f.addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e)
{
for(int i=0;i<10;i++)
{
System.out.println("I am closing window:"+i);
//System.exit(0);
}
System.exit(0);
}
});
f.add(new Label("I can create executable jar Field"));
f.setSize(500,500);
f.setVisible(true);
}
}
*/
class outer
{
static class nested
{
public static void main(String[] args)
{
System.out.println("static nested class main method");
}
}
public static void main(String[] args)
{
System.out.println("outer class main method");
}
}