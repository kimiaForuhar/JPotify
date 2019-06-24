package View;

import javax.swing.*;
import java.awt.*;

public class SideBar extends JPanel {
    private Frame frame;
    private Playlists playlists;
    private Libraries libraries;
    private Artwork artwork;
    private JButton addPlaylistBottun;

    private Color color2=new Color(16, 53,53);

    public SideBar(Frame frame) {
        this.frame = frame;
        setPreferredSize(new Dimension(200, 550));
        setOpaque(true);
        setBackground(color2);
        setLayout(new BorderLayout());

        playlists = new Playlists(this);
        libraries = new Libraries(this);
        artwork = new Artwork(this);


        JPanel panel = new JPanel();
        BoxLayout layout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(layout);
        panel.add(libraries);
        panel.add(playlists);
        panel.setOpaque(true);
        panel.setBackground(color2);

        JScrollPane scrollPane = new JScrollPane(panel, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setBorder(null);
        scrollPane.setOpaque(true);
        scrollPane.setBackground(color2);

        addPlaylistBottun = new JButton("  Add Playlist");
        JPanel panel2 = new JPanel(new BorderLayout());
        panel2.add(addPlaylistBottun, BorderLayout.NORTH);

        add(scrollPane, BorderLayout.CENTER);
        panel2.add(artwork, BorderLayout.SOUTH);
        panel2.add(addPlaylistBottun, BorderLayout.CENTER);
        add(panel2, BorderLayout.SOUTH);

        addPlaylistBottun.setBackground(color2);
        addPlaylistBottun.setFocusPainted(false);
        addPlaylistBottun.setBorderPainted(false);
        addPlaylistBottun.setContentAreaFilled(false);
    }

    public Frame getFrame() {
        return frame;
    }
}
