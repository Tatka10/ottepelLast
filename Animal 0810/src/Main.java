//Упр. Создать класс Корова, который наследуется от класса Animal. В классе Animal есть поля name и age, а также конструктор, который инициализирует эти поля. В классе корова есть свое приватное поле - количество пятен (int), а также есть свой конструктор.
//Для класса корова создать геттеры и сеттеры для поля "количество пятен".
//В классе Корова переопределить метод hashCode(), чтобы для каждой коровы он генерировал свой хэш из количества пятен + 10.
public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow( "Буренка", 8, 12);
        System.out.println("Число пятен у коровы +10 =  "+ cow.hashCode());
        cow.setSpots(10);
        //cow.getSpots();
         System.out.println("Измененное число пятен "+ cow.hashCode());

    }
}