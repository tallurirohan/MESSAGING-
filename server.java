import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
//import javax.

public class server extends JFrame implements ActionListener {
    JTextField text = new JTextField();
    JPanel a1;
    Box vertical = Box.createVerticalBox();
    server(){
        setLayout(null);

        JPanel p = new JPanel();
        p.setBackground(new Color(7,94,84));
        p.setBounds(0,0,450,70);
        p.setLayout(null);
        add(p);

        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("icons/3.png"));
        Image i1 = i.getImage().getScaledInstance(25,25,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        JLabel back = new JLabel(i2);
        back.setBounds(5,20,25,25);
        p.add(back);

        back.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent ae){
                System.exit(0);
            }
        });

        ImageIcon i3 = new ImageIcon(ClassLoader.getSystemResource("icons/1.png"));
        Image i4 = i3.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT);
        ImageIcon i5 = new ImageIcon(i4);
        JLabel profile = new JLabel(i5);
        profile.setBounds(40,10,50,50);
        p.add(profile);

        ImageIcon i6 = new ImageIcon(ClassLoader.getSystemResource("icons/video.png"));
        Image i7 = i6.getImage().getScaledInstance(35,30,Image.SCALE_DEFAULT);
        ImageIcon i8 = new ImageIcon(i7);
        JLabel video = new JLabel(i8);
        video.setBounds(300,20,30,30);
        p.add(video);


        ImageIcon i9 = new ImageIcon(ClassLoader.getSystemResource("icons/phone.png"));
        Image i10 = i9.getImage().getScaledInstance(35,30,Image.SCALE_DEFAULT);
        ImageIcon i11 = new ImageIcon(i10);
        JLabel phone = new JLabel(i11);
        phone.setBounds(360,20,35,30);
        p.add(phone);

        ImageIcon i12 = new ImageIcon(ClassLoader.getSystemResource("icons/3icon.png"));
        Image i13 = i12.getImage().getScaledInstance(10,25,Image.SCALE_DEFAULT);
        ImageIcon i14 = new ImageIcon(i13);
        JLabel more = new JLabel(i14);
        more.setBounds(410,20,10,25);
        p.add(more);


        JLabel name = new JLabel("Gaitonde");
        name.setBounds(110,15,100,18);
        name.setForeground(Color.white);
        name.setFont(new Font("SAN_FERIF",Font.BOLD,18));
        p.add(name);

        JLabel status = new JLabel("Active Now");
        status.setBounds(110,35,100,18);
        status.setForeground(Color.white);
        status.setFont(new Font("SAN_FERIF",Font.BOLD,13));
        p.add(status);

        a1 = new JPanel();
        a1.setBounds(5,75,440,570);
        add(a1);

        text.setBounds(5,655,310,40);
        text.setFont(new Font("SAN_FERIF",Font.PLAIN,16));
        add(text);

        JButton send = new JButton("send");
        send.setBounds(320,655,123,40);
        send.setFont(new Font("SAN_FERIF",Font.PLAIN,16));
        send.setBackground(new Color(7,94,84));
        send.setForeground(Color.white);
        send.addActionListener(this);
        add(send);



        setSize(450,700);
        setLocation(200,50);
        setUndecorated(true);
        getContentPane().setBackground(Color.white);


        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        String s = text.getText();


        a1.setLayout(new BorderLayout());

        JPanel right = new JPanel(new BorderLayout());
        right.add(out,BorderLayout.LINE_END);



    }
    public static void main(String[] args) {
        server s  = new server();

    }
}
