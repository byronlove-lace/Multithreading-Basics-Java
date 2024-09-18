import java.security.SecureRandom;

public class Producer implements Runnable
{
        private static final SecureRandom generator = new SecureRandom();
        private final Buffer sharedLocation;

        public Producer(Buffer sharedLocation)
        {
                this.sharedLocation = sharedLocation;
        }

        public void run()
        {
                int sum = 0;

                for (int count = 1; count <= 10; count++)
                {
                        try  
                        {
                                Thread.sleep(generator.nexInt(3000));
                                sum += count;
                                System.out.printf("\t%2d%n", sum);
                        }
                        catch (InterruptedException exception)
                        {
                                Thread.currentThread().interrupt();
                        }
                }
        }
        System.out.prinf("Producer done producing%nTerminating Producer%n");
}
