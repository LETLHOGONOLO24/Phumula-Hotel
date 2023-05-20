package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener {
	
	Dashboard()
	{
		setBounds(0, 0, 1550, 1000);
		
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon("C:\\Users\\USER\\Documents\\eclipse-workspace\\Hotel Management System\\src\\icons\\third.jpg");
		Image i2 = i1.getImage().getScaledInstance(1550, 1000, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0, 0, 1550, 1000);
		add(image);
		
		JLabel text = new JLabel("PHUMULA HOTEL GROUP WELCOMES YOU");
		text.setBounds(400, 80, 1000, 50);
		image.setFont(new Font("Tahoma", Font.PLAIN, 50));
		text.setForeground(Color.WHITE);
		image.add(text);
		
		JMenuBar mb = new JMenuBar();
		mb.setBounds(0, 0, 1550, 30);
		image.add(mb);
		
		JMenu hotel = new JMenu("HOTEL MANAGEMENT");
		hotel.setForeground(Color.RED);
		mb.add(hotel);
		
		JMenuItem reception = new JMenuItem("RECEPTION");
                
                reception.addActionListener(this);
                
		hotel.add(reception);
		
		
		JMenu admin = new JMenu("ADMIN");
		admin.setForeground(Color.BLUE);
		mb.add(admin);
		
		JMenuItem addEmployee = new JMenuItem("ADD EMPLOYEE");
                
                addEmployee.addActionListener(this);
                
		admin.add(addEmployee);
		
		JMenuItem addRooms = new JMenuItem("ADD ROOMS");
                
                addRooms.addActionListener(this);
                
		admin.add(addRooms);
		
		JMenuItem addDrivers = new JMenuItem("ADD DRIVERS");
                
                addDrivers.addActionListener(this);
                
		admin.add(addDrivers);
		
		
		setVisible(true);
		
		
	}
        
        public void actionPerformed(ActionEvent ae)
        {
            if (ae.getActionCommand().equals("ADD EMPLOYEE"))
            {
                new AddEmployee();
            }
            else if (ae.getActionCommand().equals("ADD ROOMS"))
            {
                new AddRoom();
            }
            else if (ae.getActionCommand().equals("ADD DRIVERS"))
            {
                new AddDrivers();
            }
            else if (ae.getActionCommand().equals("RECEPTION"))
            {
                new Reception();
            }
        }
	
	public static void main(String[] args)
	{
		new Dashboard();
	}
}
