import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Font;

/**
 * @author Masih T
 * @version 1.0.0
 * @since 09.02.2022
 *
 * <b>Labels</b>
 *
 * <p>This class is used to learn following topics:</p>
 * <ul>
 *     <li> How can we create a label (JLabel) and work with it in Swing? </li>
 *     <li> How can we add some text or icon to our label? </li>
 *     <li> How can we change the size, alignment or position of our label or its components? </li>
 * </ul>
 *
 * <p>Photo by <a href="https://unsplash.com/@sunder_2k25?utm_source=unsplash&utm_medium=referral&utm_content=creditCopyText">Sunder Muthukumaran</a> on <a href="https://unsplash.com/@sunder_2k25?utm_source=unsplash&utm_medium=referral&utm_content=creditCopyText">Unsplash</a></p>
 */
public class MainFrame {
    public static void main(String[] args) {

        ImageIcon imageForLabel = new ImageIcon("Images/sunder-muthukumaran-n7eJHQwefeI-unsplash.jpg"); // Creating an image-icon that will be used later as an icon for our label
        Border simpleBorder = BorderFactory.createLineBorder(Color.YELLOW, 5); // Creating a simple border that will be used later as the border of our label

        JLabel firstLabel = new JLabel(); // Creating (Instantiating) a new label
        firstLabel.setBackground(new Color(0x123456)); // Setting a background color for our label
        firstLabel.setOpaque(true); // Making the background color visible
        firstLabel.setBorder(simpleBorder);// Setting the border of our label
        firstLabel.setText("It is my first label :) !"); // Setting a text for our label
        firstLabel.setIcon(imageForLabel); // Setting an icon for our label
        firstLabel.setHorizontalTextPosition(JLabel.CENTER); // Setting the horizontal position for the text used in our label
        firstLabel.setVerticalTextPosition(JLabel.TOP); // Setting the vertical position for the text used in our label
        firstLabel.setFont(new Font("MV Boli", Font.PLAIN, 30)); // Setting the font-name, font-style ans font-size
        firstLabel.setForeground(Color.WHITE); // Setting a color for the text used in our label
        firstLabel.setIconTextGap(-50); // Setting the gap between the text and the icon
        firstLabel.setVerticalAlignment(JLabel.CENTER); // Setting the vertical alignment of our label's content
        firstLabel.setHorizontalAlignment(JLabel.CENTER); // Setting the horizontal alignment of our label's content
        //firstLabel.setBounds(120, 0, 700, 700); -> This line of code can be used in cooperation with mainFrame.setLayout(null)


        JFrame mainFrame = new JFrame();
        mainFrame.setVisible(true);
        mainFrame.setResizable(false);
        // mainFrame.setSize(1000, 1000);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setTitle("Working with Labels");
        mainFrame.add(firstLabel); // Adding our label to our frame
        mainFrame.pack(); // Recognizing the required size by its components and adjusting the size of frame accordingly
        //mainFrame.setLayout(null); -> See firstLabel.setBounds()
    }
}
