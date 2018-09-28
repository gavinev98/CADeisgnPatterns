
import javax.swing.*;
import java.awt.*;

public class VideoServiceSimulator {

    public static void main(String args[])
    {
        ImageIcon icon = new ImageIcon(VideoServiceSimulator.class.getResource("/youtubelogo.jpg"));

        JOptionPane.showMessageDialog(null,"Welcome to VideoPlayer!" , "Youtube",JOptionPane.INFORMATION_MESSAGE,
                icon);


    }
}
