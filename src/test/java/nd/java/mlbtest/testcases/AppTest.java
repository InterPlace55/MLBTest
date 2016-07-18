package nd.java.mlbtest.testcases;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import nd.java.mlbtest.scripts.EbayTest;
import nd.java.mlbtest.scripts.GmailTest;
import nd.java.mlbtest.scripts.GmailWrongLoginTest;
import nd.java.mlbtest.scripts.RunAllScripts;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	RunAllScripts.main(null);
    }
}
