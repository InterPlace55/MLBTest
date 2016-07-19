package nd.java.mlbtest.scripts;

public class RunAllScripts 
{
	//Runs all the scripts that have been written
	public static void main(String[] args)
	{
		GmailTest.executeTest();
		GmailWrongLoginTest.executeTest();
		GmailWrongNameTest.executeTest();
		EbayTest.executeTest();
	}
}
