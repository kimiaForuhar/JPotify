package View;

import javax.swing.*;
import java.awt.*;

public class CenterBar extends JPanel {
    private Frame frame;
    private MusicsVeiw musicsVeiw;
    private TitleOfCenterBar titleOfCenterBar;

    public CenterBar(Frame frame) {
        this.frame=frame;
        setLayout(new BorderLayout());

        musicsVeiw=new MusicsVeiw(this);
        titleOfCenterBar=new TitleOfCenterBar(this);

        titleOfCenterBar.setPreferredSize(new Dimension(700,100));

        add(titleOfCenterBar,BorderLayout.NORTH);
        add(musicsVeiw);
    }

    public Frame getFrame() {
        return frame;
    }

    public MusicsVeiw getMusicsVeiw() {
        return musicsVeiw;
    }

    public TitleOfCenterBar getTitleOfCenterBar() {
        return titleOfCenterBar;
    }
}
