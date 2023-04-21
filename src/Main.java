public class Main {
    public static void main(String[] args) {
        Akvarium akvar = new Akvarium();
        akvar.addList(new Shark("Bill"))
                .addList(new Fish("Pony"))
                .addList(new SeaLion("Vary"))
                .addList(new Dolphin("Bory"));


        for (var item :
                akvar.getListAnimal()) {
            System.out.println(item);
        }
        System.out.println("---------------");
        System.out.println("Быстрее всех плавает - " + akvar.speedWinner());
    }
}