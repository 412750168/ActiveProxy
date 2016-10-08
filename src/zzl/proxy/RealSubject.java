package zzl.proxy;

public class RealSubject implements Subject {

	@Override
	public void doSomeThing(String str) {
		// TODO Auto-generated method stub
		System.out.println("this is realsubject!!!"+str);
	}

	@Override
	public void doGoodThing(String str) {
		// TODO Auto-generated method stub
		System.out.println("Good:"+str);
	}

}
