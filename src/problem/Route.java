/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem;

import java.util.ArrayList;

public class Route {
    private int id;
    private double fixedcost;
    private double variablecost;
    private ArrayList<Integer> nodes;
    
    public void Route(int id, double fc){
        this.id=id;
        this.fixedcost=fc;
        this.variablecost=0.0;
        this.nodes= new ArrayList<>();
    }
                    
    public void addNode(int ni,int pi)
    {
        nodes.add(pi,ni);
    }
    public void removeNode(int pi){
        nodes.remove(pi);
    }
    
    public void setcost(double cv){
        variablecost+=cv;
    }
}
