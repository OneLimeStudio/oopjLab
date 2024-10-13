import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class q1 extends JFrame {

    public static void main(String[] args) {
        JFrame frame = new JFrame() ;
        JPanel panel = new JPanel();
        frame.setSize(800,600);
        //panel.setLayout(null);
        
        JLabel NameLabel = new JLabel();
        NameLabel.setText("Name");
        panel.add(NameLabel);
        
        JTextField nameTextField = new JTextField("Enter the Name");
        panel.add(nameTextField);


        JLabel AtKiit = new JLabel("\nDo You study at KIIT");
        panel.add(AtKiit);
        JCheckBox c1  = new JCheckBox("check");
        panel.add(c1);

        frame.add(panel);
        frame.setVisible(true);

    }

}