package j0814;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class exam07 extends JFrame{
	exam07() {
		   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   setTitle("JRadioButtonTest1");
		   
		   Container c=getContentPane();
		   c.setLayout(new FlowLayout());
		
		   JLabel lbl1 = new JLabel("당신의 나이는?");   
		   add(lbl1);
		  
		   JRadioButton rdo1 = new JRadioButton("20대");
		   JRadioButton rdo2 = new JRadioButton("30대");
		   JRadioButton rdo3 = new JRadioButton("40대");
		   JRadioButton rdo4 = new JRadioButton("50대");
		   JRadioButton rdo5 = new JRadioButton("60대");
		   
		   add(rdo1);
		   add(rdo2);
		   add(rdo3);
		   add(rdo4);
		   add(rdo5);
		   
		   ButtonGroup grp1 = new ButtonGroup();   //라디오버튼은 그룹을 생성해야함!
		   grp1.add(rdo1);
		   grp1.add(rdo2);
		   grp1.add(rdo3);
		   grp1.add(rdo4);
		   grp1.add(rdo5);
		   
		   JLabel lbl2 = new JLabel("당신의 취미는?");
		   add(lbl2);
		   
		   JCheckBox chk1 = new JCheckBox("걷기");
		   JCheckBox chk2 = new JCheckBox("등산");
		   JCheckBox chk3 = new JCheckBox("골프");  
		   JCheckBox chk4 = new JCheckBox("스킨스쿠버");  
		   JCheckBox chk5 = new JCheckBox("페러글라이딩");  
		   
		   add(chk1);
		   add(chk2);
		   add(chk3);
		   add(chk4);
		   add(chk5);
		   
		   
		   JLabel lbl3 = new JLabel(" ");
		   add(lbl3);
		   
		   rdo1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 lbl3.setText("당신의 나이: 20대");
			}
			   
		   });
		   
		   rdo2.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					 lbl3.setText("당신의 나이: 30대");
				}
				   
			   });
		   
		   rdo3.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					 lbl3.setText("당신의 나이: 40대");
				}
				   
			   });
		   
		   rdo4.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					 lbl3.setText("당신의 나이: 50대");
				}
				   
			   });
		   
		   rdo5.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					 lbl3.setText("당신의 나이: 60대");
				}
				   
			   });
		   
		   JLabel lbl4 = new JLabel(" ");
		   add(lbl4);
		   
		   chk1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 lbl4.setText("당신의 취미 :걷기");
			}
			   
			   
		   });
		   
		   chk2.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					 lbl4.setText("당신의 취미 :등산");
				}
				   
				   
			   });
			   
		   chk3.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					 lbl4.setText("당신의 취미 :골프");
				}
				   
				   
			   });
		   
		   chk4.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					 lbl4.setText("당신의 취미 :스킨스쿠버");
				}
				   
				   
			   });
		   
		   chk5.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					 lbl4.setText("당신의 취미 :페러글라이딩");
				}
				   
				   
			   });
		   
		   setSize(300, 300);
		   setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new exam07();

	}

}
