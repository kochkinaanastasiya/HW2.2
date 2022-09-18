public class Griffindor extends HogwartsStudents {

    private int nobility;
    private int honor;
    private int courage;
    public Griffindor(String name, int magicPower, int transgressionDistance, int nobility, int honor, int courage) {
        super(name, magicPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }
    public int getNobility() {
        return nobility;
    }
    public int getHonor() {
        return honor;
    }
    public int getCourage() {
        return courage;
    }
    public String toString() {
        return " Имя = " + getName() + "; Сила магии = " + getMagicPower() + "; Расстояние трансгресии = " + getTransgressionDistance()
                + "; Благородство = " + nobility + "; Честь = " + honor + "; Храбрость = " + courage;
    }

    public void compareStudents(Griffindor student1){
        int sumPower1 = this.nobility + this.honor + this.courage;
        int sumPower2 = student1.nobility + student1.honor + student1.courage;
        if(sumPower1 > sumPower2){
            System.out.println(student1.getName() + " лучший Гриффиндорец, чем " + this.getName());
        } else {
            System.out.println("Студенты равны");
        }
    }
}

