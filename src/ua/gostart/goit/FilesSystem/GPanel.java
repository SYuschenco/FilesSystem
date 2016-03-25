package ua.gostart.goit.FilesSystem;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class GPanel extends JPanel
{
    JTextField res = null;

    String tmpA  = "";
    String tmpOp = "";

    public GPanel()
    {
        setLayout(null);

        res = new JTextField();
        res.setBounds(10, 10, 200, 20);
        //add(res);

        ANum anum = new ANum();
        AOp  aop  = new AOp();

        JPanel pNum = new JPanel();
        pNum.setBounds(10, 40, 200, 200);
        pNum.setBackground(Color.gray);
        pNum.setLayout(new GridLayout(4, 3, 5, 5));
        add(pNum);

        String[] strNum = {"7","8","9","4","5","6","1","2","3","0","00","C"};
        for (int i = 0; i < strNum.length; i++)
        {
            JButton btn = new JButton(strNum[i]);
            btn.addActionListener(anum);
            pNum.add(btn);
        }

//        JPanel pOp = new JPanel();
//        pOp.setBounds(250, 40, 70, 200);
//        pOp.setBackground(Color.YELLOW);
//        pOp.setLayout(new GridLayout(5, 1, 5, 5));
//        add(pOp);
//
//        String[] strOp = {"+","-","/","*","="};
//        for (int i = 0; i < strOp.length; i++)
//        {
//            JButton btn = new JButton(strOp[i]);
//            btn.addActionListener(aop);
//            pOp.add(btn);
//        }

    }

    class ANum implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            res.setText( res.getText() + e.getActionCommand() );
        }
    }
    class AOp implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            String str = e.getActionCommand();
            if( str.equals("=") )
            {
                int  a  = Integer.parseInt( tmpA );
                int  b  = Integer.parseInt( res.getText() );
                char op = tmpOp.charAt(0);
                //int rr = CalcMain.calc(a, b, op);
                //res.setText("" + rr);
            }
            else
            {
                tmpA  = res.getText();
                tmpOp = str;
                res.setText("");
            }
        }
    }
}