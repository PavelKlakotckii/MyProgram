


public class Loader
{
    private static Cat getKitten() {
        return new Cat(1100.0);
    }

    public static void main(String[] args)
{
    Cat ret = getKitten();
    System.out.println(ret.getWeight());

    System.out.println();
    Cat kek = new Cat();
    Cat murzik = new Cat();
    Cat kuzya = new Cat();
    Cat shurik = new Cat();
    Cat ujin = new Cat();
    Cat jim = new Cat();
    Cat max = new Cat();

    System.out.println("Вес Keka: " + kek.getWeight());
    System.out.println("Вес Мурзика: " + murzik.getWeight());
    System.out.println("Вес Кузи: " + kuzya.getWeight());
    System.out.println("Вес Шурика: " + shurik.getWeight());
    System.out.println("Вес Юджина: " + ujin.getWeight());
    System.out.println("Вес Джима: " + jim.getWeight());
    System.out.println("Вес Макса: " + max.getWeight());

    kek.feed(1.6);
    System.out.println();
    System.out.println("Вес Кека после кормешки: " + kek.getWeight());
    System.out.println("Сумма еды: " + kek.sumEat());

    System.out.println();

    max.feed(150.0);
    System.out.println("Вес Макса после кормешки: " + max.getWeight());

    max.pee();
    System.out.println("Вес Макса после туалета: " + max.getWeight());
    System.out.println("Макс съел: " + max.sumEat());

    System.out.println();

    while (jim.getStatus().equals("Sleeping") || jim.getStatus().equals("Playing")){
        jim.meow();
        if (jim.getStatus().equals("Dead")){
            System.out.println(jim.getStatus());
            break;
        }
    }

    while (shurik.getStatus().equals("Sleeping") || shurik.getStatus().equals("Playing")){
        shurik.feed(23.0);
        if (shurik.getStatus().equals("Exploded")){
            System.out.println(shurik.getStatus());
            break;
        }
    }

    System.out.println();
    Cat pako = new Cat (3951.0);
    System.out.println("Вес Пако: " + pako.getWeight());

    System.out.println();
    Cat rico = new Cat(1277.7, "Рико", Color.STRIPED);
    Cat jako = new Cat(rico.getWeight(), rico.getName(), rico.getColor());
    System.out.println(rico.getName() + " " + rico.getWeight() + " " + rico.getColor());
    System.out.println(jako.getName() + " " + jako.getWeight() + " " + jako.getColor());
    System.out.println();

    Cat rex = new Cat(9875.5, "Rex", Color.STRIPED);
    System.out.println();

    Cat zurg = new Cat(3785.3, "Zurg", Color.BLACK);
    Cat buz = zurg.copyCat();
    System.out.println(buz.getName() + " " + buz.getWeight() + " " + buz.getColor());
    System.out.println();

    System.out.println("Кол-во кошек: " + Cat.getCount());
    System.out.println();
}
}