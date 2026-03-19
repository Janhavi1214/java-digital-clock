
import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class digitalClock extends JFrame{
    private JLabel timeLabel;
    private SimpleDateFormat timeFormat;

    public digitalClock(){
        setTitle("Digital Clock");
        setSize(300,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);

        timeFormat = new SimpleDateFormat("HH:mm:ss");
        timeLabel = new JLabel();
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        timeLabel.setFont(new Font("Arial", Font.BOLD, 40));
        timeLabel.setOpaque(true);
        timeLabel.setBackground(Color.BLACK);
        timeLabel.setBackground(Color.MAGENTA);

        add(timeLabel);

        javax.swing.Timer timer = new javax.swing.Timer(1000, e ->updateTime());
        timer.start();

        updateTime();

    }
    private void updateTime(){
            Date now = new Date();
            timeLabel.setText(timeFormat.format(now));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            digitalClock clock = new digitalClock();
            clock.setVisible(true);
        });
    }
}