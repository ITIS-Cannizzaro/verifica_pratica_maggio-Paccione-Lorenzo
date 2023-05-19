import java.awt.event.*;
import java.lang.reflect.Array;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class MyFrame extends JFrame implements ActionListener {
	
	ArrayList <Integer> r = new ArrayList <Integer> ();
	JLabel a = new JLabel("inserisci un numero");
	JTextArea b = new JTextArea();
	JLabel x = new JLabel ();
	JButton visualizza = new JButton("visualizza");
	JButton inserisci = new JButton("inserisci");
	
	MyFrame(){
		super("verifica pazza");
		this.setVisible(true);
		this.setSize(500, 500);
		this.setLayout(null);
		this.add(a);
		this.add(b);
		this.add(x);
		this.add(visualizza);
		this.add(inserisci);
		a.setBounds(10, 50, 140, 30);
		b.setBounds(160, 55, 40, 15);
		visualizza.setBounds(20, 100, 100, 50);
		inserisci.setBounds(20, 170, 100, 50);
		x.setBounds(140, 125, 320, 60);
		inserisci.addActionListener(e -> ins());
		visualizza.addActionListener(e -> vis());
	}
	
	public void ins () {
		int i = 0;
		int m = (int) Integer.parseInt(b.getText());
		r.add(m);
		for (int f = 0; f<r.size(); f ++) {
			if (m > i) {
				m = r.indexOf(f);
				i = m;
			}
		}
	}
	
	public void vis () {

		int[] g = new int[r.size()];
		for (int h = 0; h < r.size(); h ++) {
			g[h] = r.indexOf(h);
		}
		x.setText(Arrays.toString(g));
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()== inserisci) {
			ins();
		}
		if (e.getSource() == visualizza) {
			vis();
		}
		
	}
}
