package com.blz.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyseTest
{
	
	@Test
	public void givenMessage_whenSad_shouldReturnSad()
	{
		MoodAnalyser moodanalyser = new MoodAnalyser();
		String mood = moodanalyser.analyseMood("I am in Sad mood");
		Assert.assertEquals("SAD", mood);
	}

}
