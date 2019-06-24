package View;

import javax.swing.*;

public class TitleOfCenterBar extends JPanel {
    private CenterBar centerBar;

    public TitleOfCenterBar(CenterBar centerBar) {
        this.centerBar = centerBar;
    }

    public CenterBar getCenterBar() {
        return centerBar;
    }
}
