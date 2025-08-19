import java.util.Scanner;

public class CostOfItem {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the cost of pencil: ");
        float pencil = s.nextFloat();
        System.out.println("Enter the cost of pen: ");
        float pen = s.nextFloat();
        System.out.println("Enter the cost of eraser: ");
        float eraser = s.nextFloat();
        float totalcost = pencil + pen + eraser;
        System.out.println("Total cost of the item (without GST): " + totalcost);


        float gst = totalcost * 0.18f;
        float finalcost = totalcost + gst ;
        System.out.println("GST added for an items(18%): " + gst);
        System.out.println("total cost of an item (after adding GST)  : " + finalcost);


    }
}
