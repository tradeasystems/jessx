// 
//This program is free software; GNU license ; USE AT YOUR RISK , WITHOUT ANY WARRANTY
// 

package jessx.agent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class JesseAgentFrame_jMenuFileExit_ActionAdapter implements ActionListener
{
    JesseAgentFrame adaptee;
    
    JesseAgentFrame_jMenuFileExit_ActionAdapter(final JesseAgentFrame adaptee) {
        this.adaptee = adaptee;
    }
    
    public void actionPerformed(final ActionEvent e) {
        this.adaptee.jMenuFileExit_actionPerformed(e);
    }
}
