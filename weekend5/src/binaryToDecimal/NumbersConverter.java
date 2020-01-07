package binaryToDecimal;

public class NumbersConverter {
    public String binaryToDecimal (String binaryValue) {
        binaryValue=new StringBuilder(binaryValue).reverse().toString(); // StringBuilder pozwala nam na wykonanie większej ilości operacji niż String, ale zajmuje więcej miejsca w pamięci komputera
        System.out.println(binaryValue.length());

        // analogia
//        StringBuilder sb=new StringBuilder(binaryValue);
//        sb=sb.reverse();
//        binaryValue=sb.toString();

        int sum=0;
        for(int i=0; i<binaryValue.length(); ++i) {
            int multiplicator=Character.getNumericValue(binaryValue.charAt(i));
            sum+=Math.pow(2, i) * multiplicator;
        }
        return String.valueOf(sum);
    }

    public String binaryToDec (int binaryValue) {
        int ooo=(String.valueOf(binaryValue).length())-1;
        String aaa=String.valueOf(ooo);
        String lolo = String.format("%0" + ooo + "d", binaryValue);
        System.out.println(lolo);
        lolo=new StringBuilder(lolo).reverse().toString(); // StringBuilder pozwala nam na wykonanie większej ilości operacji niż String, ale zajmuje więcej miejsca w pamięci komputera
        System.out.println(lolo.length());

        int sum=0;
        for(int i=0; i<lolo.length(); ++i) {
            int multiplicator=Character.getNumericValue(lolo.charAt(i));
            sum+=Math.pow(2, i) * multiplicator;
        }
        return String.valueOf(sum);
    }
}
