/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity2;
/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Mr. T
 * @version December 2016
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
                String clear = statement.trim();

		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else
		{
			response = getRandomResponse();
		}
                if (statement.indexOf("dog") >= 0 
                        || statement.indexOf("cat") >= 0)
                {
                    response = "Tell me more about your pets.";
                }
                if (statement.indexOf("Mr. Tholking") >= 0)
                {
                    response = "I like Mr. Tholking very much";
                }
                if (statement.indexOf("homework") >= 0)
                {
                    response = "Do your homework a few minutes before class.";
                }
                if (statement.indexOf("Nazi") >= 0)
                {
                    response = "Naziism is not a good thing.";
                }
                if (statement.indexOf("Goodbye") >= 0)
                {
                    response = "See you later!";
                }                
                if (clear.length() <1)
                {
                    response = "Say something, please.";
                }
		return response;
                
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 7;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if (whichResponse == 4)
		{
			response = "I do not understand.";
		}                
		else if (whichResponse == 5)
		{
			response = "I am a bot, I mean what?";
		}
		else if (whichResponse == 6)
		{
			response = "Well you suck.";
		}                
		return response;
	}
}
