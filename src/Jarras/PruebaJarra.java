package Jarras;

public class PruebaJarra {
    public static void main(String[] args) {
        Jarra jarra1 = new Jarra(7);
        Jarra jarra2 = new Jarra(4);

        jarra1.llenar();

        System.out.print(jarra1);
        System.out.println(jarra2);

        jarra2.llenaDesde(jarra1);

        System.out.print(jarra1);
        System.out.println(jarra2);

        jarra2.vaciar();
        System.out.print(jarra1);
        System.out.println(jarra2);

        jarra2.llenaDesde(jarra1);
        System.out.print(jarra1);
        System.out.println(jarra2);
    }

}
