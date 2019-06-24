package View;

import javax.swing.*;
import java.awt.*;

public class TopBar extends JPanel {
    private JFrame frame;
    private JLabel friendActivityLable;
    private JLabel jpotifyPicture;
    private TitleOfTopBar titleOfTopBar;

    private Color color2 = new Color(16, 53, 53);
    private Font font1 = new Font("font1", Font.BOLD, 17);

    public TopBar(JFrame frame) {
        this.frame = frame;
        setLayout(new BorderLayout());
        setOpaque(true);
        setBackground(Color.cyan);
        setPreferredSize(new Dimension(1200, 50));

        titleOfTopBar = new TitleOfTopBar(this);
        friendActivityLable = new JLabel("Friend Activity");
        jpotifyPicture = new JLabel();

        friendActivityLable.setPreferredSize(new Dimension(200, 50));
        friendActivityLable.setOpaque(true);
        friendActivityLable.setBackground(color2);
        friendActivityLable.setHorizontalAlignment(SwingConstants.CENTER);
        friendActivityLable.setForeground(Color.white);
        friendActivityLable.setFont(font1);

        jpotifyPicture.setPreferredSize(new Dimension(200, 50));
        jpotifyPicture.setOpaque(true);
        jpotifyPicture.setBackground(color2);

        add(friendActivityLable, BorderLayout.EAST);
        add(jpotifyPicture, BorderLayout.WEST);
        add(titleOfTopBar);
    }

}


class TitleOfTopBar extends JPanel {
    private TopBar topBar;
    private SearchBar searchBar;
    private JPanel usersPanel;

    public TitleOfTopBar(TopBar topBar) {
        this.topBar = topBar;

        setLayout(new BorderLayout());

        searchBar = new SearchBar(this);
        usersPanel = new JPanel();

        usersPanel.setOpaque(true);
        usersPanel.setBackground(Color.black);

        usersPanel.setPreferredSize(new Dimension(100, 50));

        add(searchBar, BorderLayout.WEST);
        add(usersPanel, BorderLayout.EAST);
    }
}


class SearchBar extends JPanel {
    private TitleOfTopBar titleOfTopBar;

    public SearchBar(TitleOfTopBar titleOfTopBar) {
        this.titleOfTopBar = titleOfTopBar;

        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(300, 50));

        JLabel searchPicture = new JLabel();
        JTextField searchField = new JTextField();

        searchField.setPreferredSize(new Dimension(270, 35));
        searchPicture.setPreferredSize(new Dimension(30, 35));

//        add(searchPicture,BorderLayout.WEST);
        add(searchField,BorderLayout.NORTH);
    }

    public TitleOfTopBar getTitleOfTopBar() {
        return titleOfTopBar;
    }
}
