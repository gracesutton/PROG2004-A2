public interface RideInterface {
    public void addVisitorToQueue(Visitor visitor); // adds a visitor to the queue
    public void removeVisitorFromQueue(); // removes a visitor from the queue
    public void printQueue(); // print the list of waiting visitors in the queue
    public void runOneCycle(); // runs the ride for one cycle
    public void addVisitorToHistory(Visitor visitor); // adds a visitor to the ride history
    public void checkVisitorFromHistory(Visitor visitor); //  checks whether the visitor is in the ride history
    public void numberOfVisitors(); // return the number of Visitors in the ride history
    public void printRideHistory(); // print the list of visitors who took the rides
}
