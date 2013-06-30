package careercup;

import org.junit.Test;

public class PaintFill {
	public enum Color {
//		Black, White, Red, Yellow, Green		
		b, w, r, y, g
	}
	
	private boolean paintFill(Color[][] screen, int x, int y, Color ocolor, Color ncolor) {
		if(x < 0 || y < 0 || x >= screen.length || y >= screen[0].length) {
			return false;
		}
		if(screen[x][y] == ocolor) {
			screen[x][y] = ncolor;
			paintFill(screen, x, y - 1, ocolor, ncolor);
			paintFill(screen, x - 1, y, ocolor, ncolor);
			paintFill(screen, x, y + 1, ocolor, ncolor);
			paintFill(screen, x + 1, y, ocolor, ncolor);
		}
		return true;
	}
	
	public boolean paintFill(Color[][] screen, int x, int y, Color ncolor) {
		return paintFill(screen, x, y, screen[x][y], ncolor);
	}
	
	@Test
	public void test() {
		Color[][] screen = {
				//usage of enum, get the enumnation of enum Colro
				{Color.b, Color.r, Color.b, Color.b, Color.b},
				{Color.b, Color.w, Color.w, Color.w, Color.b},
				{Color.b, Color.w, Color.r, Color.w, Color.b},
				{Color.b, Color.w, Color.w, Color.w, Color.b},
//				{Color.b, Color.r, Color.b, Color.b, Color.b},
		};
		paintFill(screen, 1, 4, Color.g);
//		System.out.println(screen[0].length);
//		System.out.println(screen.length);
		for(int i = 0; i < screen.length; ++i) {
			for(int j = 0; j < screen[0].length; ++j) {
				System.out.print(screen[i][j] + " ");
			}
			System.out.println();
		}
	}
}
