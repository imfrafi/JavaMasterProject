import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Menu {
    
    private static final int MENU_HEIGHT = 100;
    private static final int MENU_WIDTH = 600;
    public static void main( String[] args ){

        JFrame menu = new JFrame( "MENU" );
        JButton schedule = new JButton( "模擬課表" );
        JButton courseSort = new JButton( "歷年加簽資訊統整");
        JButton recommend = new JButton( "排薦擺放志願序" );
        
        menu.setLayout( new GridLayout(1,3) );
        menu.setSize( MENU_WIDTH, MENU_HEIGHT );

        menu.add( schedule );
        menu.add( courseSort );
        menu.add( recommend );

        schedule.addActionListener( new ScheduleListener() );

        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setVisible( true );

    }
    
}
