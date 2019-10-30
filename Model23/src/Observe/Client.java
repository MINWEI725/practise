package Observe;

public class Client {
    public static void main(String[]args){
        ConcreteSubject subject=new ConcreteSubject();//目标对象

        ObserveA obs1=new ObserveA();
        ObserveA obs2=new ObserveA();
        ObserveA obs3=new ObserveA();

        subject.registerObserve(obs1);//将三个观察者添加到subject对象的观察者队伍中
        subject.registerObserve(obs2);
        subject.registerObserve(obs3);

        subject.setState(3000);//改变subject的状态

        System.out.println(obs1.getMyState());
        System.out.println(obs2.getMyState());
        System.out.println(obs3.getMyState());

    }
}
