import java.util.LinkedList;

public class Sequence {
    private int numberOfRow;
    private LinkedList<StringBuilder> listOfSequence;

    public Sequence(int numberOfRow) {
        this.numberOfRow = numberOfRow;
        this.listOfSequence = new LinkedList<>();
        listOfSequence.addFirst(new StringBuilder("1"));
    }

    private StringBuilder createRow(StringBuilder pred) {
        int count = 1;
        StringBuilder row = new StringBuilder();
        char number = pred.charAt(0);
        for(int i = 1; i < pred.length(); i++){
            if(number == pred.charAt(i)){
                count++;
            }
            else{
                row.append(Integer.toString(count).concat(Character.toString(number)));
                count = 1;
                number = pred.charAt(i);
            }
        }
        row.append(Integer.toString(count).concat(Character.toString(number)));
        return row;
    }

    private void addRow(){
        StringBuilder pred = listOfSequence.getFirst();
        for(int i = 1; i < numberOfRow; i++){
            pred = createRow(pred);
            listOfSequence.addLast(pred);
        }
    }

    public void printSequence(){
        addRow();
        for(StringBuilder s : listOfSequence){
            System.out.println(s);
        }
    }

    public LinkedList<StringBuilder> getListOfSequence() {
        addRow();
        return listOfSequence;
    }
}
