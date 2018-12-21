import java.util.ArrayList;
import java.util.Arrays;

public class Converter {

    private StringBuilder binaryNumberSb = new StringBuilder();
    private StringBuilder finalDecimal = new StringBuilder();
    private int sumOfBinToDecNumbers;
    private ArrayList<String> listOfBinaryNumbers = new ArrayList<>();
    private String binaryNumber;
    private String numbers[];
    private String[] binToDec;

    public Converter(String number) {
        this.numbers = number.split("");
    }

    private ArrayList<String> toBinaryReversed(){

        for (int i = 0; i < this.numbers.length; i++) {

            int numberInt = Integer.parseInt(this.numbers[i]);

            while(numberInt > 0){
                if(numberInt %2 ==0){
                    binaryNumberSb.append(0);
                    numberInt = numberInt/2;
                }else{
                    binaryNumberSb.append(1);
                    numberInt = numberInt/2;
                }
            }

            binaryNumber = binaryNumberSb.toString();

            binaryNumberSb.delete(0,binaryNumberSb.length());

            listOfBinaryNumbers.add(binaryNumber);
        }

        return listOfBinaryNumbers;
    }

    public String toDecReversed(){

        this.toBinaryReversed();

        for (int i = 0; i < this.listOfBinaryNumbers.size() ; i++) {
            this.binToDec = this.listOfBinaryNumbers.get(i).split("");

            for (int j = 0,k = this.binToDec.length-1; j < this.binToDec.length; j++,k--) {
                sumOfBinToDecNumbers += Integer.parseInt(this.binToDec[j]) * Math.pow(2,k);
            }

            finalDecimal.append(sumOfBinToDecNumbers);
            sumOfBinToDecNumbers = 0;
        }

        return finalDecimal.toString();
    }

    public static void main(String[] args) {
        Converter c = new Converter("245374985734985");
        System.out.println(c.toDecReversed());

    }
}
