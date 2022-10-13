package com.adi;
import java.io.*;
public class Main {

    static Invoice myInvoice=new Invoice();
    public static void main(String[] args) {
        Item[] itemsArray=new Item[3];
        itemsArray[0]=(new InvoiceItem(223,"aadi",5,500));
        itemsArray[1]=(new InvoiceItem(2563,"hrt",55,100));
        itemsArray[2]=(new InvoiceItem(2121,"tertry",23,700));

        processItems(itemsArray);
    }
    public static void processItems(Item[] items){
        for(Item item:items){
            if(item instanceof InvoiceItem){
                myInvoice.addItem((InvoiceItem) item);
                myInvoice.show();
            }else if(item instanceof PrescriptionItem){
                try {

                    FileOutputStream file = new FileOutputStream("items.ser");
                    ObjectOutputStream output = new ObjectOutputStream(file);

                    PrescriptionItem pItem = (PrescriptionItem) item;
                    output.writeObject(pItem);

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
        try {
            FileInputStream fis = new FileInputStream("items.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            for (int i=0;i<items.length;i++) {
                Item prescriptionItem = (PrescriptionItem) ois.readObject();

                if (prescriptionItem.getId() == 223) {
                    System.out.println("ITEMS.SER");
                    System.out.println(prescriptionItem);
                    break;
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        myInvoice.show();
    }
}
