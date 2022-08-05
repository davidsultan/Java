package arrays;


/**
 * Created by IntelliJ IDEA.
 * User: Milan V�t (Cellane)
 * Date: May 12, 2010
 * Time: 2:16:44 PM
 */

import java.text.MessageFormat;

public class MatrixDeterminant {
	/**
	 * Main method that initializes the matrix and calls method to calculate
	 * its determinant
	 *
	 * @param args command line arguments; unused
	 */
	public static void main (String[] args) {
		double determinant;
		double x[][] = {
				{10, 15, 7,},
				{0, 57, 30,},
				{0, 0, 2,},
		};

		determinant = MatrixOperations.matrixDeterminant (x);
		System.out.println (MessageFormat.format ("Determinant: {0}", Double.toString (determinant)));
	}
}