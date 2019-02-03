# Lab 06: Maven Project

## Tasks

1. Create the Maven Project for a Calculator (Structure given Below). Configure the pom.xml yourself.
2. In this lab students are needed to convert the project you built in [Lab 04](https://github.com/ShahzaibWaseem/Lab-AP/tree/master/Lab%2004) into a Maven Project. Also needed to write junit tests.

### Calculator

Calculator.java
```java
public class Calculator {
	public int add(int i, int j){
		return i + j;
	}
	public int sub(int i, int j){
		if(i > j)
			return i - j;
		else
			return j - i;
	}
}
```

Test_Calculator.java
```java
import static org.junit.Assert.*;
import org.junit.Test;

public class Test_Calculator {
	Calculator c = new Calculator();
	@Test
	public void test() {
		assertEquals(5,c.add(3, 2));
		//fail("Not yet implemented");
	}

}
```