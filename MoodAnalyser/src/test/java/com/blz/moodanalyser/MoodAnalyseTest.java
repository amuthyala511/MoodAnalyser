package com.blz.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyseTest
{
	
	static MoodAnalyser moodanalyser;
	
//	@BeforeClass
//	public static void MoodAnalyseObj()
//	{
//		moodanalyser = new MoodAnalyser();
//	}
	@Test
	public void givenMessage_whenSad_shouldReturnSad()
	{
		moodanalyser = new MoodAnalyser("I am in Sad mood");
		Assert.assertEquals("SAD", moodanalyser.analyseMood());
	}
	
	@Test
	public void givenMessage_whenNotSad_shouldReturnHappy()
	{
		moodanalyser = new MoodAnalyser("I am in Any mood");
		Assert.assertEquals("HAPPY", moodanalyser.analyseMood());
	}

}
