package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			int r = 0;
			Random w = new Random();
			r = w.nextInt(100);
			JOptionPane.showMessageDialog(null, r);
		}

	}

}
