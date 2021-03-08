package ru.evgen.phrazegen;

public class MainApp {
    public static void main(String[] args) {
        String [] wordListOne = {"круглосуточный","трех-звенный","30000-фунтовый","взаимный",
                "обоюдный выйгрыш","фронтенд","на основе веб-технологий","проникающий","умный",
                "динамический"};
        String [] wordListTwo = {"уполномоченный","трудный","чистый продукт","ориентриованный",
                "центральный","распределенный","кластеризованный","фирменный","нестандартный ум",
                "позиционированный","сетевой","сфокусированный",
                "выровненный","нацеленный на","общий","совместный","ускоренный"};
        String [] wordListThree = {"процесс","пункт разгрузки","выход из положения","тип структуры",
                "талант","подход","уровень завоёванного внимания","портал","период времени",
                "обзор","образец","пунк следования","латте",
                "дикобраз","пылесос","фильтр","использованный с выгодой"};

        int oneLenght = wordListOne.length;
        int twoLenght = wordListTwo.length;
        int threeLenght = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLenght);
        int rand2 = (int) (Math.random() * twoLenght);
        int rand3 = (int) (Math.random() * threeLenght);

        String phraze = wordListOne[rand1]+" "+wordListTwo[rand2]+" "+wordListThree[rand3];
        System.out.println("Все что вам нужно - это, " + phraze);
    }
}
