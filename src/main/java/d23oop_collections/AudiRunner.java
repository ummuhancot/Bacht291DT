package d23oop_collections;

public class AudiRunner {
    public static void main(String[] args) {


        //EngineI1Interface e = new EngineI1Interface();// HATA; interfacelerden object üretilmez
        AudiA4 a4 = new AudiA4();
        a4.turbo();//Audi A4 turbo motor kullanir
        a4.esp();//Audi A4 esp fren sistemi kullanir
        a4.dijital();//Audi A4 dijital klima kullanir

        //4
        a4.run();//Audi A4 hava yastığı çalıştırır

        System.out.println(EngineI1.fiyat);//300
        System.out.println(AC2.fiyat);//200
        System.out.println(Brake3.fiyat);

        EngineI1.speed();//Satte 300km hız yapar
        a4.power();//200HP






    }
}
