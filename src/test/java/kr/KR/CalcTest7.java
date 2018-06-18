/**
 * Объявление пакета, в котором находится класс.
 */
package kr.KR;
/**
 * Добавление библиотек для проверки результата теста.
 */
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
/**
 * Добавление библиотеки для тестирования.
 */
import org.junit.jupiter.api.Test;
public class Calc{
	/**
	 * Создание тестовых методов.
	 */
    @BeforeEach
   void setUp() {
    	new ComponentForm();
    }
    @Test
   	void testn7() {
   			/**
   			   * Проверка формы содержащей компоненты на возможность отображения.
   			   */
   	    assertTrue(ComponentForm.frame.isVisible());
   	}
}
