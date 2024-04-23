import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) {


        System.out.println("number1.");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        System.out.println("number2.");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        System.out.println("number3.");
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        System.out.println("number4");
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);
        System.out.println();

        System.out.println("number5");
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);
        System.out.println();

        System.out.println("number6");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        System.out.println(boxer1 + boxer2);
        System.out.println();

        System.out.println("number7");
        var weight1 = 78.2;
        var weight2 = 82.7;
        System.out.println(weight2 % weight1);
        System.out.println();

        System.out.println("number8");
        var totalHours = 640;
        var hoursPerDey = 8;
        var totalEmployee = totalHours / hoursPerDey;
        System.out.println("Всего работников в компании — " + totalEmployee + " … человек.");

        int totalEmployee2 = totalEmployee + 94;
        System.out.println("Если в компании работает " + totalEmployee2 +
                " человек, то всего" + (totalEmployee2 * totalEmployee) +
                " часов работы может быть поделено между сотрудниками ");
        System.out.println();
    }
}