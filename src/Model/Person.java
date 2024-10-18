
package Model;
/**
 *
 * @author Jorge
 */
public class Person {

    protected String names;
    protected String surnames;
    protected int identification;

    public Person(String names, String surnames, int identification) {
        this.names = names;
        this.surnames = surnames;
        this.identification = identification;
    }

    public Person(Person data) {
        this.names = data.names;
        this.surnames = data.surnames;
        this.identification = data.identification;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public int getIdentification() {
        return identification;
    }

    public void setIdentification(int identification) {
        this.identification = identification;
    }

    
    

}
