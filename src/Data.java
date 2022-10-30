public class Data extends Initialize {
    private final int length = 9; // Переменная для указания длины массива, каждый элемент которой - экземпляр карты
    // Типы карт
    private final String six = "6";
    private final String seven = "7";
    private final String eight = "8";
    private final String nine = "9";
    private final String ten = "10";
    private final String valet = "Валет";
    private final String dama = "Дама";
    private final String king = "Король";
    private final String tyz = "Туз";
    // Добавление всех видов карт в массив
    private final String[] arrayOfTypes = {six,seven,eight,nine,ten,valet,dama,king,tyz};
    // Масти
    private final String chervy = "Червы"; //?
    private final String boobny = "Бубны"; // ?
    private final String trefy = "Трефы"; //?
    private final String piki = "Пики"; //?
    // Массивы
    private String[] chervyArr = new String[length];
    private String[] boobnyArr = new String[length];
    private String[] trefyArr = new String[length];
    private String[] pikiArr = new String[length];
    // Двумерный массивы из одномерных массивов мастей и заполнение одномерных массивов видами карт.
    public String[][] masti(){
        for(int i = 0; i < i; i++){
            chervyArr[i] = chervy + six;
        }
    }

}
