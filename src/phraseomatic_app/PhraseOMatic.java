package phraseomatic_app;

public class PhraseOMatic {
    public static void main(String[] args) {
        // Три набора слов
        String[] wordPackOne = {"yummy", "tasty", "delicious", "disgusting", "awful", "horrible"};

        String[] wordPackTwo = {"juicy", "crispy", "bitter", "chewy", "spicy", "zesty", "peppery", "lean", "barbecued",
                "dry", "saucy", "stringy", "cheesy", "ambrosial", "boneless", "jellied", "briny", "tender", "zesty",
                "skinless", "salty", "caramelized", "sugar-coated"};

        String[] wordPackThree = {"pasta", "beef", "fish", "poultry", "chicken", "vegetables", "fruits", "sweets",
                "toffees", "candies", "doughnuts", "chewing gum", "cheese", "yogurt", "snack", "fresh lettuce pieces",
                "carrots", "mango", "bananas", "apple slices", "lemon chips", "strawberry", "strips of chicken breast",
                "barbecue", "beef strips with julienned sweet peppers", "sharon", "cereals", "peanuts"};

        // Вычисляет количество слов в каждом наборе
        int firstLength = wordPackOne.length;
        int secondLength = wordPackTwo.length;
        int thirdLength = wordPackThree.length;

        // Генерирует три случайных числа
        int randomOne = (int) (Math.random() * firstLength);
        int randomTwo = (int) (Math.random() * secondLength);
        int randomThree = (int) (Math.random() * thirdLength);

        // "Формулы" построения фраз
        String phraseQuestion = " - Did you enjoyed with " + wordPackTwo[randomTwo] + " " + wordPackThree[randomThree] +
                "?";
        String phraseAnswer = " - The " + wordPackThree[randomThree] + " was " + wordPackOne[randomOne];

        // Вывод итогового диалога
        System.out.println(phraseQuestion + "\n" + phraseAnswer);
    }
}