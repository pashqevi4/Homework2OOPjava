public interface Meow {
    default void sayMeow(){
        System.out.println("Мяу!"); //Все коты "по дефолту" мяукают :)
    }

    public void angryMeow(); // Мякуают по-разному, когда злятся
}
