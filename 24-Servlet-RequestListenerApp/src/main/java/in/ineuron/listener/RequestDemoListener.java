package in.ineuron.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class RequestDemoListener implements ServletRequestListener {

	public static int count=0;
	
	static {
		System.out.println("RequestDemoListener.classfile is loading...");
	}
	
    public RequestDemoListener() {
        System.out.println("RequestDemoListener Object is instantiated....");
    }

    public void requestDestroyed(ServletRequestEvent sre)  { 
    	System.out.println("RequestObject is destroyed at ::"+new java.util.Date());
    	System.out.println("RequestDemoListener.requestDestroyed()");
    }

    public void requestInitialized(ServletRequestEvent sre)  { 
    	count++;
    	System.out.println("Request Object is created :: "+new java.util.Date());
    	System.out.println("Hit count for the application is:: "+count);
    	System.out.println("RequestDemoListener.requestInitialized()\n");
    }
}
