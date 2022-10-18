public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public LinearEquation(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }


    public double distance(){
        int xD = x2 - x1;
        int yD = y2 - y1;
        double distance = Math.pow(Math.pow(xD,2)+Math.pow(yD,2),0.5);
        return distance;
    }
    public double slope(){
        double xD = x2 - x1;
        double yD = y2 - y1;
        return yD/xD;
    }
    public double yIntercept(){
        double xSlope = x1 * slope();
        double yIntercept = y1-xSlope;
        return yIntercept;
    }
    public String equation(){
        double yInt = yIntercept();
        String equation = (slope()+ "x");
        if(yInt>0){
            equation += " + " + yInt;
        } else {
             equation += yInt;
        }
        return equation;
    }
    public String lineInfo(){
        String cord1 = ("The first cord is :(" + x1 + "," + y1 + ")");
        cord1 += ("\n The Second cord is :(" + x2 + "," + y2 + ")");
        return cord1;
    }
}
