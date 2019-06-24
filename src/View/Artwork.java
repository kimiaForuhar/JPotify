package View;

import javax.swing.*;
import java.awt.*;

public class Artwork extends JPanel {
    private SideBar sideBar;
    private String path;

    private Color color2=new Color(16, 53,53);

    public Artwork(SideBar sideBar) {
        this.sideBar = sideBar;
        setBackground(color2);

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(200, 200));
        panel.setOpaque(true);
        panel.setBackground(Color.cyan);

        add(panel);
    }
}
