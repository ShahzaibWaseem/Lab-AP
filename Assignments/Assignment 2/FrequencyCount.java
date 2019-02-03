public class FrequencyCount {
	public static void main(String[] args) {
		// Non Threaded	
		long startTime_NonThread = System.currentTimeMillis();
		NonThreaded nonThreaded_Object = new NonThreaded();
		nonThreaded_Object.run();
		long estimatedTime_NonThread = System.currentTimeMillis() - startTime_NonThread;
        System.out.println("Non Threaded: " + estimatedTime_NonThread + " miliseconds");

        // Threaded
        long startTime_Thread = System.currentTimeMillis();
        Threaded thread_Object = new Threaded();
        thread_Object.start();
        long estimatedTime_Thread = System.currentTimeMillis() - startTime_Thread;
        System.out.println("Threaded: " + estimatedTime_Thread + " miliseconds");
	}
}