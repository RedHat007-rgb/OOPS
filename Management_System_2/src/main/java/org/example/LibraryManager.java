//LibraryManager class:

package org.example;

public class LibraryManager {
    LibraryItem[] items;

    public LibraryManager(){
        this.items =new LibraryItem[0];
    }
    public LibraryManager(LibraryItem[] items) {
        this.items =new LibraryItem[0];
    }

    public LibraryItem[] getItems() {
        return items;
    }

    public void setItems(LibraryItem[] items) {
        this.items = items;
    }

    public String addItem(LibraryItem item){
        System.out.println("Adding Library item.....");
        LibraryItem[] AddingItem=new LibraryItem[items.length+1];
        for(int i=0;i<items.length;i++){
            AddingItem[i]=items[i];
        }
        AddingItem[items.length]=item;
        items=AddingItem;
        return "Item has been added";
    }


    public void displayAllItems(){
        for(int i=0;i<items.length;i++){
            items[i].DisplayInfo();
        }
    }
}
