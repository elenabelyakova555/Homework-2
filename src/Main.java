public class Main {
    public static void main(String[] args) {
        //Задача №1
        System.out.println("Задача №1");
        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        //Задача №2
        System.out.println("Задача №2");
        dog = dog +4;
        System.out.println(dog);
        cat = cat +4;
        System.out.println(cat);
        paper =paper +4;
        System.out.println(paper);

        //Задача №3
        System.out.println("Задача №3");
        var dog1=8.0;
        dog1 = dog1 -3.5;
        System.out.println(dog1);
        cat = cat -1.6;
        System.out.println(cat);
        paper =paper -7639;
        System.out.println(paper);

        //Задача №4
        System.out.println("Задача №4");
        var friend =19;
        System.out.println(friend);
        friend= friend+2;
        System.out.println(friend);
        friend= friend/7;// friend/=7;
        System.out.println(friend);

        //Задача №5
        System.out.println("Задача №5");
        var frog=3.5;
        System.out.println(frog);
        frog=frog*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog=frog+4;
        System.out.println(frog);

        //Задача №6
        System.out.println("Задача №6");
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        System.out.println("Общий вес боксеров: "  + (boxer1Weight+boxer2Weight)+"кг");
        System.out.println("Разница двух весов боксеров: "  + (boxer2Weight-boxer1Weight)+"кг");

        //Задача №7
        System.out.println("Задача №7");
        System.out.println("Разница двух весов боксеров (1 способ): "  + (boxer2Weight-boxer1Weight)+"кг");
        System.out.println("Разница веса боксеров (2 способ): " + (boxer2Weight % boxer1Weight)+"кг");
        //Задача №8
        System.out.println("Задача №8");
        var openingHours = 640;
        var employee= openingHours/8;
        System.out.println("Всего работников в компании: " + openingHours + " человек");

        //Задача №9
        System.out.println("Задача №9");
        var totalEmployees = employee+94;
        var employeeDailyOutput= openingHours/totalEmployees;
        System.out.println("Если в компании работает  " + totalEmployees + " человек, то всего "+ employeeDailyOutput+" часов работы может быть поделено между сотрудниками");


    }
}