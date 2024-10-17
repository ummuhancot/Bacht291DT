package d23oop_collections;

public class HondaRunner {
    public static void main(String[] args) {

        //i) Abstract Class:
        //    Kendisinden object olusturulmaz.
        //Honda h = new Honda();(abstrak class lardan obje üretilmez. çünkü sınıflandırma için üretilir abstract ondan anonim class denir)

        //-------------------------
        //4)Abstract method'lar ancak abstract class'lar icinde olusturulabilir.
        Civic c = new Civic();
        c.engine();//Gas 1.6 Eco

        //-------------------------
        //6)Concrete method'lar child class'lar tarafindan istenirse override edilebilirler
        Accord a = new Accord();
        a.engine();//Gas 2.0 Turbo

        a.music();//Pro müzik sistemi




















    }
}
