package hu.nive.ujratervezes.adddigits;

public class AddDigits {

    int addDigits(String input) {
        if (input == null || input == "") {
            return -1;
        }
        String digits = input.replaceAll("[^0-9]", "");
        return digits.chars()
                .map(c -> Character.getNumericValue(c))
                .sum();
    }

}
