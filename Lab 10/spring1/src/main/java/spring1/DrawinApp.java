package spring1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawinApp {

	@SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	
       // System.out.println( "Hello World!" );
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("springcomb.xml");
    	Triangle tr = (Triangle) context.getBean("triangler");
		System.out.println(tr);
    	Triangle triangle = (Triangle) context.getBean("triangle");
    	triangle.draw();
    	
    	Triangle1 triangle1 = (Triangle1) context.getBean("triangle2");
    	triangle1.draw();
    	 Triangle trt = (Triangle) context.getBean("triangles");
         trt.printTriangles();
    	
    }
}
