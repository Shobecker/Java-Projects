public class Main {
    public static void main(String[] args) {
        // Test your program here
        PromissoryNote eliasNote = new PromissoryNote();
        eliasNote.setLoan("Elias", 51.5);
        
        System.out.println(eliasNote.howMuchIsTheDebt("Elias"));
    }
}
