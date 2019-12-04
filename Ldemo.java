import java.awt.*;
import java.applet.*;

public class Ldemo extends Applet
{
Label L1,L2; 
public void inti()
{
setLayout(new GridLayout(3,2));
Label L1 = new Label("one");
Label L2 = new Label("two");
add(L1);
add(L2);
}
}

/*< APPLET CODE=Ldemo WIDTH=300 HEIGHT=300>
</ APPLET >
*/