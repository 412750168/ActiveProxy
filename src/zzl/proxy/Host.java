package zzl.proxy;

import java.lang.reflect.Proxy;

public class Host {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RealSubject real = new RealSubject();
		Subject proxySubject = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(),
				new Class[] { Subject.class }, new ProxyHandler(real));

		proxySubject.doSomeThing("zzl");
		proxySubject.doGoodThing("zilong");
		//test 
	}

}
