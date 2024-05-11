public class AnimalsNumber {
    public static void main(String[] args) {
        int population = 10000000; // начальная популяция
        double birthRate = 14.0 / 1000; // коэффициент рождаемости
        double deathRate = 8.0 / 1000; // коэффициент смертности

        for (int i = 1; i <= 10; i++) { // проходим по 10 годам
            int births = (int) (population * birthRate); // количество новорожденных
            int deaths = (int) (population * deathRate); // количество погибших

            population = population + births - deaths; // обновляем популяцию

            System.out.println("Через " + i + " лет количество зверей: " + population);
        }
    }
}
