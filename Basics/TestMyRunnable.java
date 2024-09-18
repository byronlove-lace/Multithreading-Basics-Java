
class TestMyRunnable
{
        public static void main(String args[])
        {
                MyRunnable runMe = new MyRunnable("Thread A");
                Thread t1 = new Thread(runMe);
                t1.start();
        }
}
