public class Person {

    private double højde;
    private int alder;

    public Person(double højde, int alder) {
        this.højde = højde;
        this.alder = alder;
    }

    public Person() {

    }

    public double getHøjde() {
        return højde;
    }


    public void setHøjde(double højde) {
        this.højde = højde;

    }
    public int getAlder() {
        return alder;
    }

    public void harFødselsdag() {
alder++;
// alder = alder +1 (dvs. at alder++ er det samme og det pulser alderen hver gang.
    }


}



