

package com.team1160.scouting.frontend.elements;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.team1160.scouting.frontend.resourcePackets.CardLayoutPacket;
import javax.swing.JMenuItem;

/**
 * This class is used with a card layout to go to the next card in the layout.
 * @author Saketh Kasibatla
 */
public class NextMenuItem extends JMenuItem implements ActionListener{
    /**
	 * 
	 */
	private static final long serialVersionUID = 6730292825391612557L;
	/**
     * Contains the card layout and its parent.
     */
    CardLayoutPacket layout;
    
    /**
     * creates a NextButton with text name.
     * @param layout a CardLayoutPacket whose cards the button will flip thru.
     * @param name the text displayed on the button.
     */
    public NextMenuItem(CardLayoutPacket layout, String name) {
        super(name);
        this.layout = layout;
        this.addActionListener(this);

    }

    /**
     * creates a generic NextButton with the name "next"
     * @param layout a CardLayoutPacket whose cards the button will flip thru.
     */
    public NextMenuItem(CardLayoutPacket layout) {
        super("next");
        this.layout = layout;
        this.addActionListener(this);
    }



    /**
     * when the button is clicked, will go to the next card.
     * @param e the actionevent
     */
    public void actionPerformed(ActionEvent e) {
        this.layout.getLayout().next(this.layout.getParent());
    }

}
