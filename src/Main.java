public class Main {
//    Добавить пять интерфейсов к классам из ДЗ 1, включающих все концепции, упомянутые на семинаре. включающих:
//            - интерфейсы,
//            - константы,
//            - default методы,
//            - перегрузки и переопределения методов.Вы можете выбрать любой класс из ДЗ 1 и добавить к нему интерфейсы.
//    Вам также предоставляется возможность добавить новые методы или использовать уже существующие методы в классе.
    public static void main(String[] args) {
        BlackCat bc = new BlackCat();
        WhiteCat wc = new WhiteCat();
        StripedCat sc = new StripedCat();

        System.out.println("----------");
        System.out.println("Как ведёт себя черный кот");
        bc.sayMeow();
        bc.sharpClaws();
        bc.foodDemand();
        bc.runAtNight();

        System.out.println("----------");
        System.out.println("Как ведёт себя белый кот");
        wc.sayMeow();
        wc.sharpClaws();
        wc.foodDemand();
        wc.runAtNight();

        System.out.println("----------");
        System.out.println("Как ведёт себя полосатый кот");
        sc.sayMeow();
        sc.sharpClaws();
        sc.foodDemand();
        sc.runAtNight();


    }
}