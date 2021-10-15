package Exercise_section7;

public class Printer {
    private int tonerLevel, pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel <=100 && tonerLevel > -1) {
            this.tonerLevel = tonerLevel;
        }else {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount){
        if(tonerAmount > 0 && tonerAmount <= 100){
            if((tonerAmount + tonerLevel) > 100){
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        }else{
            return  -1;
        }
    }

    public int printPages(int pages){
        int pagesToPrint = pages;
        int numPages = 0;
        if(duplex){
            numPages = pagesToPrint/2 + pagesToPrint%2;
        }else{
            numPages = pages;
        }
        this.pagesPrinted += numPages;
        return numPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
