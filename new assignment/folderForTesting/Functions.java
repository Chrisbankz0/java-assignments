public class Functions {

    public static int[] countLetters(String text) {

        int vowels = 0;
        int consonants = 0;

        text = text.toLowerCase();

        for (int index = 0; index < text.length(); index++) {

            char character = text.charAt(index);

            if (Character.isLetter(character)) {

                if (character == 'a' || character == 'e' || character == 'i'
                        || character == 'o' || character == 'u') {

                    vowels++;

                } else {
                    consonants++;
                }
            }
        }

        return new int[]{vowels, consonants};
    }


    public static String evenCharacters(String text) {

        String result = "";

        String[] words = text.split(" ");

        for (String word : words) {

            for (int index = 1; index < word.length(); index += 2) {

                result += word.charAt(index);
            }
        }

        return result;
    }


    public static long factorial(int number) {

        long result = 1;

        for (int index = 1; index <= number; index++) {
            result *= index;
        }

        return result;
    }


    public static long combination(int n, int r) {

        return factorial(n) / (factorial(r) * factorial(n - r));
    }
}