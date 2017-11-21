import java.awt.Point;
import java.util.Scanner;

public class PlayfairCipher {
	private static char[][] charTable;
	private static Point[] positions;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String key=prompt("Enter an encryption key", sc,6);
		String txt=prompt("Enter the msg",sc,1);
		String jti=prompt("Replace J with I? y/n - ",sc,1);
		
	}
}