public class FeezBeez {

	public static void main(String[] args) {

		for (int i = 1; i <= 15; i++) {

			if (i % 15 == 0) {
				System.out.println("FeezBeez");
            }else if (i % 3 == 0) {
				System.out.println("Feez");
			} else if (i % 5 == 0) {
				System.out.println("Beez");
			} else {
				System.out.println(i);
			}
		}

	}

}
