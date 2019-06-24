package View;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class MusicTools extends JPanel {
    private DownBar downBar;
    private MusicControllerButtons musicControllerButtons;
    private MusicSlider musicSlider;

    private Color color=new Color(16,28,41);

    public MusicTools(DownBar downBar) throws IOException {
        this.downBar = downBar;

        setOpaque(true);
        setBackground(color);
        setLayout(new BorderLayout());


        musicControllerButtons = new MusicControllerButtons(this);
        musicSlider = new MusicSlider(this);

        add(musicControllerButtons, BorderLayout.CENTER);
        add(musicSlider, BorderLayout.SOUTH);
    }
}
