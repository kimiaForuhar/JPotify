package View;

import javax.swing.*;
import java.awt.*;

public class FriendActivity extends JPanel {
    private Frame frame;

    private Color color2=new Color(16, 53,53);

    public FriendActivity(Frame frame) {
        this.frame=frame;
        setPreferredSize(new Dimension(200, 550));
        setOpaque(true);
        setBackground(color2);
    }
}
