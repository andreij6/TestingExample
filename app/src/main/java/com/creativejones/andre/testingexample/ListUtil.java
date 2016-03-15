package com.creativejones.andre.testingexample;

import java.util.ArrayList;
import java.util.List;

public class ListUtil<T> {

    private ArrayList<T> mData;

    public ListUtil(){
        mData = new ArrayList<>();
    }

    public void forEach(IForeachAction<T> action){
        for(T item : mData){
            action.run(item);
        }
    }

    public T firstOrDefault() {
        return mData.get(0);
    }

    public void setData(List<T> data) {
        for (T item : data) {
            mData.add(item);
        }
    }

    public interface IForeachAction<R> {
        void run(R item);
    }

}
