package a_star;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;

public class HospitalMap{
    private Dictionary<String, Node> map;
    private List<Node> frontier;
    private List<Node> explored;

    public HospitalMap(){}

    public void addNode(String id, Node node){
        map.put(id, node);
    }

    public List<Node> findPath(Node start, Node end){
        //TODO
        //Also determine heuristic..should be manhattan but we can also use euclydian...up to the team
        ArrayList<Node> stub = new ArrayList<Node>();
        stub.add(new Node());
        return stub;

    }

    public void setDefault(Node defaultNode){
        //TODO
        //also ask what this does. Default = kiosk location?
    }

    public int getDistance(Node start, Node end){
        //Gonna assume this is euclydian
        double xDeltaSquared = Math.pow((end.getX()-start.getX()), 2);
        double yDeltaSquared = Math.pow((end.getY()-start.getY()), 2);
        double distance = Math.sqrt(xDeltaSquared + yDeltaSquared);
        return (int)Math.round(distance);
    }
}