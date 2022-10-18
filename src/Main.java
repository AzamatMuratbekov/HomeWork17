public class Main {
    public static void main(String[] args) {
        Sheep sheep1 = new Sheep("sheep 15161","M","25kg","15mes");
        Sheep sheep2 = new Sheep("sheep 16565","F","33kg","23mes");
        Sheep sheep3 = new Sheep("sheep 13323","M","55kg","29mes");
        Sheep sheep4 = new Sheep("sheep 19742","F","40kg","9mes");
        Cow cow1 = new Cow("cow 24654","F","472g","35mes");
        Cow cow2 = new Cow("cow 27862","M","384kg","12mes");
        Cow cow3 = new Cow("cow 24686","F","472kg","33mes");
        Cow cow4 = new Cow("cow 23146","M","254kg","21mes");
        Cow cow5 = new Cow("cow 27862","F","387kg","15mes");
        Cow cow6 = new Cow("cow 27461","M","288kg","35mes");
        Horse horse1 = new Horse("horse 35467","M","652g","34mes");
        Horse horse2 = new Horse("horse 34512","M","624kg","42mes");
        Horse horse3 = new Horse("horse 32134","F","562kg","26mes");
        Farm farm1 = new Farm("Bishkek mal bazaar","OOSO Dordoi",new Sheep[]{sheep1,sheep2,sheep3},new Cow[]{cow1,cow2,cow3,cow4,cow5},new Horse[]{horse1,horse2});
        Farm farm2 = new Farm("Naryn mal bazaar","OOSO Ko4kor",new Sheep[]{sheep4},new Cow[]{cow6},new Horse[]{horse3});
        System.out.println(farm1.toString());
        System.out.println(farm2.toString());
    }
}