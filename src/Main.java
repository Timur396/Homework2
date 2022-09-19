public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper +4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19.0;
        friend = friend *2.0;
        System.out.println(friend);
        friend = friend / 7.0;
        System.out.println(friend);

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var amountBoxer = (boxer1 + boxer2 );
        System.out.println(amountBoxer );

        var differenceBoxer = (boxer2 - boxer1 );
        System.out.println(differenceBoxer );

        var DifferenceBoxer = (boxer2 % boxer1 );
        System.out.println(DifferenceBoxer );

        var overClock = 640;
        var workerClock = 8;
        var totalWorker = (overClock / workerClock );
        System.out.println("Всего работников в компании "  + totalWorker + " человек");
        var generalWorker = (totalWorker + 94);
        var generalClock = ( 8 * generalWorker);
        System.out.println("Если в компании работает " + generalWorker + " человек, то всего " + generalClock + " часов работы может быть поделено между сотрудниками");





    }
}