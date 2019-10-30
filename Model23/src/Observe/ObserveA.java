package Observe;

public class ObserveA implements Observe{
    private int myState;//myState需要与目标对象的state值保持一致
    @Override
    public void update(Subject subject) {
        myState=((ConcreteSubject)subject).getState();
    }

    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }
}
