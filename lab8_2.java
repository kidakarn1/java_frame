package lab8_2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class lab8_2 extends JFrame implements ActionListener{
	JLabel 			textlabel;
	JTextField 		textField;
	JButton 		Btn[];
	Container 		con;
	static Number 	number;
	
	public lab8_2() {
		// TODO Auto-generated constructor stub
		con = this.getContentPane();
		con.setLayout(new FlowLayout());
		textlabel = new JLabel("Enter number :");
		textlabel.setFont(new Font("Courier New",Font.BOLD,20));
		con.add(textlabel);
		
		textField = new JTextField(10);
		textField.setFont(new Font("Courier New",Font.BOLD,24));
		con.add(textField);
		String[] txt = {"saveBtn", "clearBtn", "showBtn"};
		String m = "1234567890abcdefghijklmnopqrstuvwxyz";
		
		Btn = new JButton[txt.length];
		for(int i=0;i<txt.length;i++){
			Btn[i] = new JButton(txt[i]);
			Btn[i].setFont(new Font("Courier New",Font.BOLD,20));
			Btn[i].addActionListener(this);
			con.add(Btn[i]);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		lab8_2 obj = new lab8_2();
		obj.number = new Number();
		obj.setSize(450, 250);
		obj.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		if(event.getSource()==Btn[0]){
			int value = Integer.parseInt(textField.getText());
			this.number.setValue(value);
			textField.setText("");
		}
		else if(event.getSource()==Btn[1])
		{
			this.number.setValue(0);
			textField.setText("");
		}
		else if(event.getSource()==Btn[2])
		{
			textField.setText(number.toString());
		}
	}

}
