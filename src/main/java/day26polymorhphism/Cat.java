package day26polymorhphism;

public class Cat extends Animal {
    public void meow(){
        System.out.println("Cats meow...");
    }
    //Override Annotation: Override kurallarinin java tarafindan kontrol edilmesini saglar
    @Override
    public void eat(){
        //Child daki override ediliş eat() methoduna "Overriding Method" (-etken-geçersiz kılan method) denir
        System.out.println("Cats eat ..");
    }

    @Override
    public void drink() {
        System.out.println("Cats drink...");
    }

    @Override
    public Animal create(){ //neden void değil Animal? Çünkü Cat İS A animal!!! (animal class 5. şıkta açıklama)
        return new Cat();

    }
    @Override
    public int add(int a, int b){ // açıklama 6. şıkta
        return a+b;
    }

    @Override
    public Integer multiply(Integer a, Integer b) { //açıklama 7. şıkta
        return a*b;
    }

}
