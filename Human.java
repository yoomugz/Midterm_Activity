
package human;


public class Human {
    
    private String name = "Jean Michael";
    private String race = "Filipino";
    private String skinColor = "Brown";
    private String eyeColor = "Brown";
    private String gender = "male";
    private double height = 5.5;
    private double weight = 80.5;
    private int age = 24;
    
    public int intRate = 7;
    public int moodRate = 7;
    public String [] genDis = {"Hypertension", "Cancer", "Physical Deformities"};
    public int wealthRate = 5;

  
    public static void main(String[] args) {
        
        Human man = new Human();
        //run child
        Children child = new Children();
        System.out.println(man.name);
        System.out.println(child.genDis[1]);
        System.out.println(child.intRate);
        System.out.println(child.moodRate);
        System.out.println(child.wealthRate);
        
    }
    
}
