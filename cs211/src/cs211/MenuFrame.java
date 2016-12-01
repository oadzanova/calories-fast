package cs211;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MenuFrame extends JFrame{
	JLabel serviceLbl;
	JTextArea menuTxt;
	LinkedList<String> order;
	String menu[] = {"Cake","Pizza","CheeseCake","Ice Cream"};
	public MenuFrame(){
		order = new LinkedList<String>();
		serviceLbl = new JLabel(" ");
		this.add(serviceLbl,BorderLayout.NORTH);
		menuTxt = new JTextArea();
		this.add(menuTxt);
		JPanel btns = new JPanel();
		JButton orderBtn = new JButton("Order");
		JButton serveBtn = new JButton("Serve");
		btns.add(orderBtn);
		orderBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Random ran = new Random();
				int no = ran.nextInt(menu.length);
				order.offer(menu[no]);
				showQueue();
			}
		});
		btns.add(serveBtn);
		this.add(btns,BorderLayout.SOUTH);
		serveBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String m = order.poll();
				if (m == null){
					JOptionPane.showMessageDialog(null, "No order");
				}else{
					serviceLbl.setText(m);
				}
				showQueue();
			}
		});
		this.setSize(300,300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	private void showQueue(){
		menuTxt.setText("");
		for (String s: order){
			menuTxt.append(s + "\n");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuFrame mf = new MenuFrame();
	}

}
