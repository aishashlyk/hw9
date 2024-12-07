public class StarTriangle {
    private int width;
    //Constructors
    public StarTriangle(){}
    public StarTriangle(int width){
        this.width = width;
    }
    @Override
    public String toString(){
        String result = "";

        for(int i=1;i<=width;i++){
            for(int j=0;j<i;j++){
                result += "[*]";
            }
            result += "\n";
        }
        return result;
    }
}
