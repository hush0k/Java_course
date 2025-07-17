public class Toyota {
    private String Model;
    private int doors;
    private float maxSpeed;
    private ClassOfModel ClassOfModel;

    public Toyota(String Model, int doors, float maxSpeed) {
        this.Model = Model;
        this.doors = doors;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return Model;
    }

}
