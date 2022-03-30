import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class ScheduleListener implements ActionListener {

    private static final int SCHEDULE_HEIGHT = 600;
    private static final int SCHEDULE_WIDTH = 400;

    public void actionPerformed( ActionEvent e ){
        JFrame schedule = new JFrame( "Schedule" );
        JLabel copyMsg = new JLabel( "<html><body><div style='color:#000000;font-size:16px;font-family:微軟正黑體;'>貼上在全校課程查詢系統複製的資料</div></body></html>" );
        JTextArea rawData = new JTextArea();
        JScrollPane scrollRawData = new JScrollPane( rawData );
        JButton mocking = new JButton( "<html><body><div style='color:#0538AD;font-size:20px;font-family:微軟正黑體;'>匯整成模擬課表</div></body></html>" );

        rawData.setLineWrap( true );

        schedule.add( copyMsg, BorderLayout.NORTH );
        schedule.add( scrollRawData, BorderLayout.CENTER );
        schedule.add( mocking, BorderLayout.SOUTH );

        //將輸到TextArea裡面的資料，轉成ArrayList<Course>
        class MockingListener implements ActionListener{
    
            public void actionPerformed( ActionEvent e ){
        
                String rawtxt = rawData.getText();
                rawtxt = rawtxt.replaceAll("\r|\n|\t", " ");
                rawtxt = rawtxt.replace("    "," ");
                System.out.println( rawtxt );
                String[] txt = rawtxt.split( " " );

                for( int i=0; i<txt.length; ++i ){
                    // System.out.println( txt[i] );
                    if( i%7!=6 ){
                        System.out.print( txt[i] + " " );
                    }else{
                        System.out.println( txt[i] );
                    }
                }
                int order=0, number=0, credit=0;
                String name="", teacher="", place="";
                ArrayList<Course> courses = new ArrayList<>();
                // for( int i=0; i<txt.length; ++i ){
                //     if( i%7==0 ){
                //         order = i+1;
                //     }else if( i%7==1 ){
                //         number = Integer.parseInt(txt[i]);
                //     }else if( i%7==2 ){
                //         name = txt[i];
                //     }else if( i%7==3 ){
                //         teacher = txt[i];
                //     }else if( i%7==4 ){
                //         credit = Integer.parseInt(txt[i]);
                //     }else if( i%7==5 ){
                //         place = txt[i];
                //     }else{
                //         courses.add( new Course( order, number, name, teacher, credit, place ) );
                //     }
                // }
        
            }
        
        }

        schedule.setSize( SCHEDULE_WIDTH, SCHEDULE_HEIGHT );
        mocking.addActionListener( new MockingListener() );
        
        schedule.setVisible( true );

    }

}

