package zzl.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandler implements InvocationHandler {
	
	private Object object;
	

	public ProxyHandler(Object object) {
		super();
		this.object = object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		Object temp_obj;
		System.out.println("before!!");
	    temp_obj = method.invoke( object, args);  
	    System.out.println("after!!");
	    
	    return temp_obj;
	        
	}

}
