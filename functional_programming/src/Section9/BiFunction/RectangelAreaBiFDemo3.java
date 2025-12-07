package Section9.BiFunction;

import java.util.function.BiFunction;

public class RectangelAreaBiFDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiFunction<Integer, Integer, Integer> rectangleArea = (length,  width) -> length*width;
		int result = rectangleArea.apply(5, 3);
		System.out.println(result);

	}

}
