package j0814;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class exam05 extends JFrame{
	exam05()  {
		   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   setTitle("JRadioButtonTest1");
		   
		   //Container c=getContentPane();
		   //c.setLayout(new FlowLayout()); 
		   
		   JCheckBox jc[] = new JCheckBox[5];
		   String[] hobby = {"걷기", "등산", "골프", "스킨스쿠버", "페러글라이딩"};
		   
		   JRadioButton jr[] = new JRadioButton[5];
		   String[] age = {"20대", "30대", "40대", "50대", "60대"};
		   
		   JPanel hobbypanel = new JPanel();
		   JPanel agepanel = new JPanel();
		   ButtonGroup bg = new ButtonGroup();
		   
		   JLabel jl = new JLabel();
		   JLabel jl1 = new JLabel("당신의 취미는?");
		   JLabel jl2 = new JLabel("당신의 나이는?");
		   
		   //jc[0]= jc[1]= ,,,
		   for(int i=0; i<hobby.length; i++) {
			   jc[i] = new JCheckBox(hobby[i]);
			   jr[i] = new JRadioButton(age[i]);
			   
			   jr[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					
					String s = ("당신의 취미 : ");
					for(int j=0; j<5; j++) {
						if(jc[j].isSelected()==true) {
							s=s+hobby[j]+" ";
						}
					}
					
					jl.setText(s);
					s=s+"당신의 나이는 : ";
					jl.setText(s+e.getActionCommand());
					
				}
				   
			   });
			   
			   hobbypanel.add(jc[i]);
			   agepanel.add(jr[i]);
			   
			   bg.add(jr[i]);

		   }

		   Container c = getContentPane();
		   c.setLayout(new GridLayout(3, 1));
		   
		   JPanel jp1 = new JPanel();
		   jp1.add(jl1);
		   jp1.add(hobbypanel);
		   
		   JPanel jp2 = new JPanel();
		  
		   jp2.add(jl2);
		   jp2.add(agepanel);

		   JPanel jp3 = new JPanel();
		   jp3.add(jl);
		   c.add(jp1);
		   c.add(jp2);
		   c.add(jp3);
		   
		   
		   
		/*
		   JLabel lbl1 = new JLabel("당신의 취미는?");   
		   add(lbl1);
		  
		   JRadioButton rdo1 = new JRadioButton("걷기");
		   JRadioButton rdo2 = new JRadioButton("등산");
		   JRadioButton rdo3 = new JRadioButton("골프");
		   JRadioButton rdo4 = new JRadioButton("스킨스쿠버");
		   JRadioButton rdo5 = new JRadioButton("페러글라이딩");
		   
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
		   
		   JLabel lbl2 = new JLabel("당신의 나이는?");
		   add(lbl2);
		   
		   JCheckBox chk1 = new JCheckBox("20대", true);
		   JCheckBox chk2 = new JCheckBox("30대");
		   JCheckBox chk3 = new JCheckBox("40대");  
		   JCheckBox chk4 = new JCheckBox("50대");  
		   JCheckBox chk5 = new JCheckBox("60대");  
		   
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
				 lbl3.setText("당신의 취미: 걷기");
			}
			   
		   });
		   
		   rdo2.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					 lbl3.setText("당신의 취미: 등산");
				}
				   
			   });
		   
		   rdo3.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					 lbl3.setText("당신의 취미: 골프");
				}
				   
			   });
		   
		   rdo4.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					 lbl3.setText("당신의 취미: 스킨스쿠버");
				}
				   
			   });
		   
		   rdo5.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					 lbl3.setText("당신의 취미: 페러글라이딩");
				}
				   
			   });
		   
		   JLabel lbl4 = new JLabel(" ");
		   add(lbl4);
		   
		   chk1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 lbl4.setText("당신의 나이: 20대");
			}
			   
			   
		   });
		   
		   chk2.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					 lbl4.setText("당신의 나이: 30대");
				}
				   
				   
			   });
			   
		   chk3.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					 lbl4.setText("당신의 나이: 40대");
				}
				   
				   
			   });
		   
		   chk4.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					 lbl4.setText("당신의 나이: 50대");
				}
				   
				   
			   });
		   
		   chk5.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					 lbl4.setText("당신의 나이: 60대");
				}
 
			   });*/
		   
		   setSize(360, 300);
		   setVisible(true);
	}

	public static void main(String[] args) {
		// 실습05
		new exam05();
	}

}
