package fr.home.appengine;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class Prepa {
    static int count = 0 ;
    int foo ;
    public Prepa(){
        foo = 10 ;
    }
    public static void main(String[] args) {
        System.out.println(count) ;
        List list = new ArrayList<Object>();
        list.add(new Object());
        list.add(new Object());
        list.add(new Object());
        list.add(new Object());
        Prepa p = new Prepa();
        p.purge((ArrayList) list);

    }

    protected void purge(ArrayList someObjects) {
        int size = someObjects.size() ;
        for (int i=0; i < size ; i++) {
            someObjects.remove(i) ;
        }
    }
    protected void fillArray (int[] someIntegers, int sizeMin, int value) {
        if (someIntegers.length < sizeMin) {
            someIntegers = new int[sizeMin] ;
        }
        for (int i=0; i < size ; i++) {
            someIntegers[i] = value ;
        }
    }

    protected void writeToFile (String fileName, String text) {
        try {
            Writer writer = new BufferedWriter(new FileWriter(fileName)) ;
            Writer.write(text) ;
            Writer.close() ;
        }
        catch(IOException e) {
            System.err.println("erreur lors de l’écriture dans le fichier "+fileName) ;
            e.printStackTrace() ;
        }
    }


}
