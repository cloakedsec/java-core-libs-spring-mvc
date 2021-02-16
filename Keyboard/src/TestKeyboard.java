import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestKeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "1234567890";

		JFrame myFrame = new JFrame();
		JPanel myPanel = new JPanel();

		for (int i = 0; i < alphabet.length(); i++) {

			myPanel.add(new JButton(alphabet.substring(i, i + 1)));
		}

		for (int j = 0; j < numbers.length(); j++) {

			myPanel.add(new JButton(numbers.substring(j, j + 1)));
		}

		myFrame.add(myPanel);
		myFrame.pack();
		myFrame.setVisible(true);

	}

}
