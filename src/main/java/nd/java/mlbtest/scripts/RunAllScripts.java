package nd.java.mlbtest.scripts;

public class RunAllScripts 
{
	public static void main(String[] args)
	{
		EbayTest.executeTest();
		GmailTest.executeTest();
		GmailWrongLoginTest.executeTest();
	}
}
