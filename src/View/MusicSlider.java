package View;

import javax.swing.*;
import java.awt.*;

public class MusicSlider extends JPanel implements Runnable {
    private MusicTools musicTools;
    private JSlider slider;

    private Color color1=new Color(16,28,41);

    public MusicSlider(MusicTools musicTools) {
        this.musicTools = musicTools;

        slider = new JSlider();
        JPanel freeSpace1 = new JPanel();
        JPanel freeSpace2 = new JPanel();

        freeSpace1.setPreferredSize(new Dimension(80, 5));
        freeSpace1.setOpaque(true);
        freeSpace1.setBackground(color1);

        freeSpace2.setPreferredSize(new Dimension(80, 5));
        freeSpace2.setOpaque(true);
        freeSpace2.setBackground(color1);

        setLayout(new BorderLayout());
        setOpaque(true);
        setBackground(color1);

        slider.setLayout(new BorderLayout());
        slider.setOpaque(true);
        slider.setBackground(Color.GRAY);

        add(slider, BorderLayout.CENTER);
        add(freeSpace1, BorderLayout.WEST);
        add(freeSpace2, BorderLayout.EAST);
    }

    public MusicTools getMusicTools() {
        return musicTools;
    }

    @Override
    public void run() {

    }
}
