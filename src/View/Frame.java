package View;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class Frame extends JFrame {
    private SideBar sideBar;
    private TopBar topBar;
    private DownBar downBar;
    private FriendActivity friendActivity;
    private CenterBar centerBar;

    public Frame() throws HeadlessException, IOException {
        sideBar = new SideBar(this);
        topBar = new TopBar(this);
        downBar = new DownBar(this);
        friendActivity = new FriendActivity(this);
        centerBar = new CenterBar(this);

        setTitle("JPotify");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(sideBar, BorderLayout.WEST);
        add(downBar, BorderLayout.SOUTH);
        add(topBar, BorderLayout.NORTH);
        add(centerBar, BorderLayout.CENTER);
        add(friendActivity, BorderLayout.EAST);

        pack();
        setVisible(true);
    }

    public SideBar getSideBar() {
        return sideBar;
    }

    public TopBar getTopBar() {
        return topBar;
    }

    public DownBar getDownBar() {
        return downBar;
    }

    public FriendActivity getFriendActivity() {
        return friendActivity;
    }

    public CenterBar getCenterBar() {
        return centerBar;
    }
}


