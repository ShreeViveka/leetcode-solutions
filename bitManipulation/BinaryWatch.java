import java.util.ArrayList;
class BinaryWatch {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> d=new ArrayList<>();
        for(int i=0;i<12;i++){
            for(int j=0;j<=59;j++){
                if(Integer.bitCount(i)+Integer.bitCount(j)==turnedOn){
                    d.add(String.format("%d:%02d",i,j));
                }
            }
        }
        return d;
    }
}