# Lab 03: Design Patterns

## Design Pattern
Follow this Diagram

**![](https://lh6.googleusercontent.com/xp3SWPqFZmuZpwpPx3VPtk8XED3aM-jLBYPcZO3mEN-1jMAHtNx-IrrytWLoVAwtHmqCBX0I2vrDvM80v8VhKgV5duA5ydonwfpHIPawMJZskqdltFMJLiqOr1Hm7Hl91FyEroRxBog_c0x3FA)**

## Tasks
Complete the remaining code files. This includes

1. NonRecursive class
2. Insertion class
3. Some test code that illustrates using both the selection and insertion sorting algorithms.

(You do not have to worry about the recursive factory or recursive sorting algorithms.) 

The pseudo-code for the insertion sort is

```java
public void insertionsort(Object[] items) { 
	int j;
    for (int p = 1; p < items.length; p++) { 
    	Object temp = items[p];
		for (j = p; j > 0 && items[j-1] > temp; j--) 
        	items[j] = items[j-1];
			items[j] = temp;
		} 
} 
```