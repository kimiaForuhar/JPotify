package View;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class VolumeController extends JPanel {
    private DownBar downBar;
    private JButton volumeButton;
    private JSlider volumeSlider;

    private Color color=new Color(16,28,41);


    public VolumeController(DownBar downBar) throws IOException {
        this.downBar = downBar;

        volumeButton = new JButton();
        volumeSlider = new JSlider();

        makeIcon("icons\\1\\007-speaker.png", volumeButton, 25, 25);

        setOpaque(true);
        setBackground(color);

        volumeSlider.setOpaque(true);
        volumeSlider.setBackground(color);

        add(volumeButton);
        add(volumeSlider);

    }

    public DownBar getDownBar() {
        return downBar;
    }

    public void makeIcon(String iconAddress, Container container, int width, int height) throws IOException {

        Image img = ImageIO.read(getClass().getResource(iconAddress));
        img = img.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
        ((JButton) container).setIcon(new ImageIcon(img));
        container.setPreferredSize(new Dimension(40, 40));
        ((JButton) container).setBorderPainted(false);
        ((JButton) container).setContentAreaFilled(false);
        ((JButton) container).setFocusPainted(false);
    }
}
