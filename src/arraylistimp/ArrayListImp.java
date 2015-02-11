/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistimp;

import java.util.Arrays;

/**
 *
 * @author Pratik
 */
public class ArrayListImp<E> {
    
    
    private int size = 0;
    private static final int capacity = 20;
    private Object elements[];
    
    public ArrayListImp(){
     elements = new Object[capacity];   
    }
    
    public void add(E e){
        
        if(size==elements.length){
            increaseCap();
        }
        elements[size++] = e;
    }
    
    public void increaseCap(){
       int newsize = capacity * 2;
       elements = Arrays.copyOf(elements, newsize);
    }
    
    
    public E get(int i){
        if(i>=size || i<0){
            throw new IndexOutOfBoundsException();
        }
        return (E) elements[i];
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayListImp list = new ArrayListImp();
        list.add(1);
        list.add(5);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        
        //IndexOutOfBounds Exception test
        //System.out.println(list.get(3));

    }
    
}
