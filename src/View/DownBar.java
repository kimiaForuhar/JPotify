package View;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class DownBar extends JPanel {
    private Frame frame;
    private MusicTools musicTools;
    private VolumeController volumeController;
    private MusicInfo musicInfo;

    public DownBar(Frame frame) throws IOException {
        this.frame = frame;
        musicTools = new MusicTools(this);
        volumeController = new VolumeController(this);
        musicInfo = new MusicInfo(this);

        setLayout(new BorderLayout());
        setOpaque(true);
        setBackground(Color.getHSBColor(210,61,17));
        setPreferredSize(new Dimension(1200, 70));

        add(musicInfo, BorderLayout.WEST);
        add(volumeController, BorderLayout.EAST);
        add(musicTools, BorderLayout.CENTER);
    }

    public Frame getFrame() {
        return frame;
    }

    public MusicTools getMusicTools() {
        return musicTools;
    }

    public VolumeController getVolumeController() {
        return volumeController;
    }

    public MusicInfo getMusicInfo() {
        return musicInfo;
    }
}