
class MyThread extends Thread
{
        private final int  MAX_COUNT;
        private final String THREAD_NAME;

        MyThread(String threadName)
        {
                this.THREAD_NAME = threadName;
                this.MAX_COUNT = 5;
        }

        @Override
        public void run()
        {
                int total = 0;

                for (int i = 0; i < MAX_COUNT; ++i)
                {
                        System.out.printf("%d. %s total: %d%n", i, THREAD_NAME, total += i);
                }
        }
}

