package recursionExercise3;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SierpinskiTriangleFrame extends JFrame {

	private JButton btnMinus = new JButton("-");
	private JButton btnPlus = new JButton("+");

	private JTextField jtfOrder = new JTextField("0", 5); // How many triangles we want to create
	private SierpinskiTrianglePanel trianglePanel = new SierpinskiTrianglePanel(); // To display the pattern

	public SierpinskiTriangleFrame() {
// Panel to hold label, text field, and a button
		JPanel panel = new JPanel();
		panel.add(new JLabel("Enter an order: "));
		panel.add(btnMinus);
		panel.add(btnPlus);
// Add a Sierpinski triangle panel to the frame
		add(trianglePanel);
		add(panel, BorderLayout.SOUTH);
// Register a listener
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(trianglePanel.getOrder() > 0) {
					trianglePanel.setOrder(trianglePanel.getOrder() - 1);
					SierpinskiTrianglePanel.gradient = 255;
					SierpinskiTrianglePanel.blue = 0;
				}
			}
		});
		
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				trianglePanel.setOrder(trianglePanel.getOrder() + 1);
				SierpinskiTrianglePanel.gradient = 255;
				SierpinskiTrianglePanel.blue = 0;
			}
		});

	}

}