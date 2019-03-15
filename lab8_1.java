package lab8_1;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class lab8_1 extends JFrame implements ActionListener{
	JLabel textlabel;
	JTextField textField;
	JButton Btn[];
	Container con;
	private int number;
	static lab8_1	obj;
	
	public lab8_1() {
		// TODO Auto-generated constructor stub
	con = this.getContentPane();
	con.setLayout(new FlowLayout());
	
	textlabel = new JLabel("Enter number :");
	textlabel.setFont(new Font("Conrier new ",Font.BOLD,20));
	con.add(textlabel);
	textField = new JTextField(10);
	textField.setFont(new Font("Courier New",Font.BOLD,24));
	con.add(textField);
	
	String[] txt= {"saveBtn" , "clearBtn" , "showBtn"};
	Btn = new JButton[3];
	for(int i=0;i<3;i++){
		Btn[i] = new JButton(txt[i]);
		Btn[i].setFont(new Font("Courier New",Font.BOLD,20));
		Btn[i].addActionListener(this);
		con.add(Btn[i]);
	}	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		obj = new lab8_1();
		obj.setValue((int)(Math.random()*100));
		obj.setSize(250,200);
		obj.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==Btn[0]){
			int value = Integer.parseInt(textField.getText());
			obj.setValue(value);
			textField.setText("");
		}
		else if (e.getSource()==Btn[1]){
			obj.setValue(0);
			textField.setText("");
		}
		else if (e.getSource()==Btn[2]){
			textField.setText(obj.toString());
		}
		
	}

	public int getValue() {
		return number;
		
	}
	public void setValue(int number) {
		this.number = number;
	}
	public String toString(){
		return Integer.toString(getValue());
	}

}
