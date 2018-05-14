/**
 * объявление пакета
 */
package kr.KR;
/**
 * Импорт библиотек классов, необходимых для работы.
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
/**
 * 
 * Объявление публичного класса, наследующего члены класса JFrame 
 */
public class MainForm extends JFrame {
	/**
	 * Значения для напряжения в сети
	 * 
	 */
	static int n1=220,n2=380;
	/**
	 * Загрузка инконки для главной формы
	 * 
	 */
	public static ImageIcon icon1 = new ImageIcon(MainForm.class.getResource("/main.png"));
	/**
	 * Метод, отвечающий за запуск фрейма
	 * 
	 */
	public static void main(String[] args) {
		/**
		 * Создание и вызов главной формы
		 */
					MainForm frame = new MainForm();
					frame.setVisible(true);
	}
