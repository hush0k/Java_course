public class Phone {
    private String number;
    private String model;
    private float weight;
    private OS os;
    public static int counter = 0;

    {
        String number = "+7 777 777 7777";
        String model = "unknown";
        float weight = 100f;
        OS os = OS.ANDROID;
        counter++;
    }

    Phone (String number, String model, float weight, OS os) {
        this.number = number;
        this.model = model;
        this.weight = weight;
        this.os = os;
    }

    Phone() {}

    void receiveCall(String name) {
        System.out.println("Calling " + name);
    }

    void sendMessage(String text) {
        System.out.println("Number " + number + " sent a message: " + text);
    }

    void displayInfo() {
        System.out.println("Number: " + number + " | Model: " + model + "| Weight " + weight + " | OS: " + os);

    }


    //Getter
    public String getNumber(){
        return number;
    }

    public String getModel(){
        return model;
    }

    public float getWeight(){
        return weight;
    }

    public OS getOS(){
        return os;
    }


    //Setter
    public void setNumber(String number){
        this.number = number;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setWeight(float weight){
        this.weight = weight;
    }

    public void setOS(OS os){
        this.os = os;
    }


    public String toString(){
        return "Information about this phone\n" +
                "\n  Number: " + number +
                "\n  Model: " + model +
                "\n  Weight: " + weight +
                "\n  OS: " + os;
    }


}