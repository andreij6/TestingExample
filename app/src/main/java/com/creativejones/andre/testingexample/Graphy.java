package com.creativejones.andre.testingexample;

import java.util.ArrayList;
import java.util.List;

public class Graphy {

    public static <T> boolean findPath(GraphNode<T> start, GraphNode<T> end){
        List<GraphNode<T>> children = start.getChildren();

        if(children == null){
            return false;
        }

        if(children.contains(end)){
            return true;
        } else {
            for (GraphNode<T> child : children) {

                if(findPath(child, end)) {
                    return true;
                }
            }
        }

        return false;
    }

    public class GraphNode<T>{

        public List<GraphNode<T>> getChildren(){
            return new ArrayList<>();
        };
    }
}
