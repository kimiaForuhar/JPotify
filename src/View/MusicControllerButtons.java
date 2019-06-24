package View;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class MusicControllerButtons extends JPanel {
    private MusicTools musicTools;
    private JButton play;
    private JButton next;
    private JButton previous;
    private JButton repeat;
    private JButton shuffle;
    private JButton seekNext;
    private JButton seekBack;

    private Color color=new Color(16,28,41);

    public MusicControllerButtons(MusicTools musicTools) throws IOException {
        this.musicTools = musicTools;

        setOpaque(true);
        setBackground(color);

        play = new JButton();
        next = new JButton();
        previous = new JButton();
        repeat = new JButton();
        shuffle = new JButton();
        seekBack = new JButton();
        seekNext = new JButton();

        makeIcon("icons\\1\\001-play-button.png", play, 35, 35);
        makeIcon("icons\\1\\005-next.png", next, 35, 35);
        makeIcon("icons\\1\\006-back.png", previous, 35, 35);
        makeIcon("icons\\1\\004-rewind.png", seekBack, 35, 35);
        makeIcon("icons\\1\\003-fast-forward.png", seekNext, 35, 35);
        makeIcon("icons\\1\\009-refresh.png", repeat, 35, 35);
        makeIcon("icons\\1\\010-shuffle.png", shuffle, 35, 35);

        add(shuffle);
        add(seekBack);
        add(previous);
        add(play);
        add(next);
        add(seekNext);
        add(repeat);
    }

    public MusicTools getMusicTools() {
        return musicTools;
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