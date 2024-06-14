package AnnaP.LessonArrayList;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Goods good1 = new Goods("milk", "Muller", 20, 10.5, LocalDate.of(2020, 11, 22));
        Goods good2 = new Goods("cheese", "Muller", 12, 19.5, LocalDate.of(2023, 4, 13));
        Goods good3 = new Goods("bread", "Opa", 55, 4.2, LocalDate.of(2024, 10, 1));
        Goods good4 = new Goods("egg", "Muller", 100, 1.5, LocalDate.of(2024, 1, 2));
        Goods good5 = new Goods("salami", "Farm", 10, 9.1, LocalDate.of(2024, 11, 20));
        Goods good6 = new Goods("butter", "Muller", 90, 5.5, LocalDate.of(2024, 1, 2));

        List<Goods> allGoods = new ArrayList<>();
        allGoods.add(good1);
        allGoods.add(good2);
        allGoods.add(good3);
        allGoods.add(good4);
        allGoods.add(good5);
        allGoods.add(good6);

        Main main = new Main();
        System.out.println("The Goods from this year are: " + main.priceForAllGoods(allGoods).toString());

    }

    public List<Goods> priceForAllGoods(List<Goods> priceForAllGoods) {
        Iterator<Goods> iterator = priceForAllGoods.iterator();
        double fullPrice = 0;
        List<Goods> goods2024 = new ArrayList<>();
        for (int i = 0; i < priceForAllGoods.size(); i++) {
            Goods good = priceForAllGoods.get(i);
            if (LocalDate.now().getYear() == good.getDate().getYear()) {
                fullPrice = fullPrice + good.getPrice();
                goods2024.add(good);
            }
        }
        System.out.println("All goods fot this year costs " + fullPrice + "$");

        return goods2024;
    }
}


//    Определить общую стоимость всех
//товаров, выпущенных в текущем
//        году и вывести сведения об этих
//        товарах.


//     Наименование
//        Изготовитель
//       Год_выпуска
//            Количество
//         Цена
