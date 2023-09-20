package entities;

public class Scanner extends Device implements InScanner{

    public Scanner (String serialNumber){
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Scanner processing: " + doc);
    }

    @Override
    public String scan(){
        return "Scanned content";
    }

}
