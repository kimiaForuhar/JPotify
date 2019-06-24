package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Playlists extends JPanel {
    private SideBar sideBar;

    private Color color2=new Color(16, 53,53);
    private Color color3=new Color(64, 46, 19, 226);

    public Playlists(SideBar sideBar) {
        this.sideBar = sideBar;
        setOpaque(true);
        setBackground(color2);

        BoxLayout boxLayout = new BoxLayout(this, BoxLayout.Y_AXIS);
        setLayout(boxLayout);

        JLabel playlistLabel = new JLabel("   PLAYLISTS");
        playlistLabel.setOpaque(true);
        playlistLabel.setBackground(color2);
        playlistLabel.setForeground(Color.WHITE);
        playlistLabel.setHorizontalAlignment(SwingConstants.LEFT);

        add(playlistLabel);
        add(Box.createVerticalStrut(30));

        JButton[] buttons = new JButton[5];

        for (int i = 0; i < 5; i++) {
            buttons[i] = new JButton("  playlist " + i);
            setGuiButton(buttons[i]);
            add(buttons[i]);
            add(Box.createVerticalStrut(20));
        }
    }

    public void setGuiButton(JButton button){
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setContentAreaFilled(false);
        button.setOpaque(true);
        button.setForeground(color3);
        button.setBackground(color2);
        button.setHorizontalAlignment(SwingConstants.LEFT);
        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                button.setForeground(Color.green);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button.setForeground(Color.white);
            }
        });
    }
}
