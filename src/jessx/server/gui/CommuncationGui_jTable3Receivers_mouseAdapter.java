// 
//This program is free software; GNU license ; USE AT YOUR RISK , WITHOUT ANY WARRANTY
// 

package jessx.server.gui;

import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

class CommuncationGui_jTable3Receivers_mouseAdapter extends MouseAdapter
{
    CommunicationGui adaptee;
    
    CommuncationGui_jTable3Receivers_mouseAdapter(final CommunicationGui adaptee) {
        this.adaptee = adaptee;
    }
    
    @Override
    public void mouseClicked(final MouseEvent e) {
        this.adaptee.jTable3Receivers_mouseClicked(e);
    }
}
