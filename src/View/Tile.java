package View;

import javax.swing.*;
import java.awt.*;

public class Tile extends JPanel{
    private String path;
    private JPanel musicInfo;
    private JPanel buttons;
    private JLabel songName;
    private JLabel artistName;
    private JLabel albumName;
    private JButton playButton;
    private JButton likeIcon;

    public Tile(CenterBar centerBar) {
//        this.path=path;

        setPreferredSize(new Dimension(700,50));
        setOpaque(true);
        setBackground(Color.yellow);
        centerBar.add(this);

        musicInfo=new JPanel();
        musicInfo.setLayout(new BorderLayout());
        musicInfo.setBackground(Color.black);
        musicInfo.setOpaque(true);

        buttons=new JPanel();
        buttons.setLayout(new FlowLayout());
        buttons.setOpaque(true);
        buttons.setBackground(Color.blue);

        songName=new JLabel();
        artistName=new JLabel();
        albumName=new JLabel();
        playButton=new JButton();
        likeIcon=new JButton();

        add(musicInfo);
        add(buttons);

        musicInfo.add(songName);
        musicInfo.add(artistName);
        musicInfo.add(albumName);

        buttons.add(playButton);
        buttons.add(likeIcon);

    }
}

