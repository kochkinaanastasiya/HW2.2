public class Puffenduy extends HogwartsStudents {

    //Захария Смит, Седрик Диггори, Джастин Финч-Флетчли
    private int hardWork;
    private int loyalty;
    private int honestly;

    public Puffenduy(String name, int magicPower, int transgressionDistance, int hardWork, int loyalty, int honestly){
        super(name, magicPower, transgressionDistance);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honestly = honestly;
    }
    public int getHardWork(){
        return hardWork;
    }
    public int getLoyalty() {
        return loyalty;
    }
    public int getHonestly(){
        return honestly;
    }

    public String toString(){
        return "Имя = " + getName() + "; Сила магии = " + getMagicPower() + "; Расстояние трансгресии = " + getTransgressionDistance()
                + "; Трудолюбие = " + hardWork + "; Верность = " + loyalty + "; Честность = " + honestly;
    }
    public void compareStudents(Puffenduy student1){
        int sumPower1 = this.hardWork + this.loyalty + this.honestly;
        int sumPower2 = student1.hardWork + student1.loyalty + student1.honestly;
        if(sumPower1 > sumPower2){
            System.out.println(student1.getName() + " лучший Пуффендорец, чем " + this.getName());
        } else {
            System.out.println("Студенты равны");
        }
    }

}
