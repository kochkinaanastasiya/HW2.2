public class Slizerin extends HogwartsStudents {

    //Драко Малфой, Грэхэм Монтегю, Грегори Гойл

    private int cunning;
    private int determination;
    private int ambition;
    private int inventiveness;
    private int wantPower;

    public Slizerin(String name, int magicPower, int transgressionDistance, int cunning,
                    int determination, int ambition, int inventiveness, int wantPower){
        super(name, magicPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.inventiveness = inventiveness;
        this.wantPower = wantPower;
    }

    public int getCunning(){
        return cunning;
    }
    public int getDetermination(){
        return determination;
    }
    public int getAmbition(){
        return ambition;
    }
    public int getInventiveness(){
        return inventiveness;
    }
    public int getWantPower(){
        return wantPower;
    }

    public String toString(){
        return "Имя = " + getName() + "; Сила магии = " + getMagicPower() + "; Расстояние трансгресии = "
                + getTransgressionDistance() + "; Хитрость = " + cunning + "; Решительность = " + determination +
                "; Амбициозность = " + ambition + "; Находчивость = " + inventiveness + "; Жажда власти = " + wantPower;
    }
    public void compareStudents(Slizerin student1){
        int sumPower1 = this.cunning + this.determination + this.ambition + this.inventiveness + this.wantPower;
        int sumPower2 = student1.cunning + student1.determination + student1.ambition + student1.inventiveness + student1.wantPower;
        if(sumPower1 > sumPower2){
            System.out.println(student1.getName() + " лучший Слизеринец, чем " + this.getName());
        } else {
            System.out.println("Студенты равны");
        }
    }


}
