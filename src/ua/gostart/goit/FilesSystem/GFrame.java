package ua.gostart.goit.FilesSystem;

import javax.swing.JFrame;


public class GFrame extends JFrame
{
    public GFrame()
    {
        setTitle("Output");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(100, 100, 1200, 800);
        add(new GPanel());
        setVisible(true);
    }
}
