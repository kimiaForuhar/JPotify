package View;

import javax.swing.*;
import java.awt.*;

public class MusicsVeiw extends JPanel {
    private CenterBar centerBar;
    private JPanel showPart;
    private JPanel emptySpace;

    public MusicsVeiw(CenterBar centerBar) {
        this.centerBar = centerBar;

        setLayout(new BorderLayout());

        showPart = new JPanel();
        emptySpace = new JPanel();

        JScrollPane scrollPane = new JScrollPane(showPart, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
//        JPanel panel = new JPanel(new BorderLayout());
//        panel.add(scrollPane, BorderLayout.CENTER);

        add(scrollPane, BorderLayout.NORTH);
        add(emptySpace, BorderLayout.CENTER);

        BoxLayout boxLayout = new BoxLayout(showPart, BoxLayout.Y_AXIS);
        add(Box.createVerticalStrut(5));
        showPart.setLayout(boxLayout);
        makeTile();
        makeTile();
        makeTile();
        makeTile();
        makeTile();
        makeTile();
        makeTile();
        makeTile();
        makeTile();
        makeTile();

    }

    public CenterBar getCenterBar() {
        return centerBar;
    }

    public void makeTile() {
        JPanel titleBar = new JPanel();
        titleBar.setOpaque(true);
        titleBar.setBackground(Color.yellow);
        titleBar.setLayout(new BorderLayout());

        JPanel musicInfo = new JPanel();
        musicInfo.setLayout(new BorderLayout());
        musicInfo.setOpaque(true);
        musicInfo.setBackground(Color.black);
        setPreferredSize(new Dimension(700, 20));

        JPanel buttons = new JPanel();
        buttons.setLayout(new GridLayout(1, 2));
        buttons.setOpaque(true);
        buttons.setBackground(Color.blue);

        JLabel songName = new JLabel();
        JLabel artistName = new JLabel();
        JLabel albumName = new JLabel();
        JButton playButton = new JButton();
        JButton likeIcon = new JButton();

        titleBar.add(buttons, BorderLayout.EAST);
        titleBar.add(musicInfo);

        songName.setOpaque(true);
        songName.setBackground(Color.red);
        songName.setPreferredSize(new Dimension(200, 50));
        artistName.setOpaque(true);
        artistName.setBackground(Color.green);
        albumName.setOpaque(true);
        albumName.setBackground(Color.black);
        albumName.setPreferredSize(new Dimension(200, 50));


        musicInfo.add(songName, BorderLayout.WEST);
        musicInfo.add(artistName, BorderLayout.CENTER);
        musicInfo.add(albumName, BorderLayout.EAST);

        buttons.add(playButton);
        buttons.add(likeIcon);

        showPart.add(titleBar);
        showPart.add(Box.createVerticalStrut(10));

    }
}
