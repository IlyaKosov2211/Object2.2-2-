public class BmiService {
    public float calculate(int weight, float height){
        float bodyMassIndex = weight/((height*height)/10000);
        return bodyMassIndex;
    }
}
