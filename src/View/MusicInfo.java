package View;

import javax.swing.*;
import java.awt.*;

public class MusicInfo extends JPanel {
    private DownBar downBar;
    private JLabel musicName;
    private JLabel artistName;

    private Color color=new Color(16,28,41);

    public MusicInfo(DownBar downBar) {
        this.downBar = downBar;
        setLayout(new GridLayout(2, 1));
        setPreferredSize(new Dimension(200, 110));

        setOpaque(true);
        setBackground(color);

        musicName = new JLabel("test music name");
        artistName = new JLabel("test artist name");

        add(artistName);
        add(musicName);
    }

    public DownBar getDownBar() {
        return downBar;
    }

    public void setMusicName(JLabel musicName) {
        this.musicName = musicName;
    }

    public void setArtistName(JLabel artistName) {
        this.artistName = artistName;
    }
}