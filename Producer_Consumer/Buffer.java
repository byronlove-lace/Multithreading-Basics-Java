
public interface Buffer
{
        // Place val into Buffer
        public void blockingPut(int value) throws INterruptedException;

        // return int value from Buffer
        public int blockingGet() throws INterruptedException;
}

