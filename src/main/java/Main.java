public class Main {
    public static void main(String[] args) {
        // poniższy kod ma się uruchomić bez błędów, a na konsoli ma się pojawić:
        //        Hau hau!
        //        Miau miau
        //        Cwir cwir cwir
        Pies burek = new Pies();
        Kot mruczek = new Kot();
        Ptak papug = new Ptak();

        burek.wydajDzwiek();
        mruczek.wydajDzwiek();
        papug.wydajDzwiek();
    }
}
