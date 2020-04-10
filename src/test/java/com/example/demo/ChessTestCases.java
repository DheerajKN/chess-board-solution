package com.example.demo;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

public class ChessTestCases extends BaseTest
{
	@Test
	public void PawnTest() throws Exception
	{
		MockHttpServletRequestBuilder builder = get("/moves/Pawn/A5");

		executeRequest(builder, ContentType.JSON, null, status().isOk(), 
				MockMvcResultMatchers.jsonPath("$", hasSize(2)));
	}
	
	@Test
	public void BishopTest() throws Exception
	{
		MockHttpServletRequestBuilder builder = get("/moves/Bishop/A5");

		executeRequest(builder, ContentType.JSON, null, status().isOk(), 
				MockMvcResultMatchers.jsonPath("$", hasSize(6)));
	}
	
	@Test
	public void HorseTest() throws Exception
	{
		MockHttpServletRequestBuilder builder = get("/moves/Horse/A5");

		executeRequest(builder, ContentType.JSON, null, status().isOk(), 
				MockMvcResultMatchers.jsonPath("$", hasSize(4)));
	}
	
	@Test
	public void KingTest() throws Exception
	{
		MockHttpServletRequestBuilder builder = get("/moves/King/A5");

		executeRequest(builder, ContentType.JSON, null, status().isOk(), 
				MockMvcResultMatchers.jsonPath("$", hasSize(3)));
	}
	
	@Test
	public void QueenTest() throws Exception
	{
		MockHttpServletRequestBuilder builder = get("/moves/Queen/A5");

		executeRequest(builder, ContentType.JSON, null, status().isOk(), 
				MockMvcResultMatchers.jsonPath("$", hasSize(21)));
	}
	
	@Test
	public void RookTest() throws Exception
	{
		MockHttpServletRequestBuilder builder = get("/moves/Rook/A5");

		executeRequest(builder, ContentType.JSON, null, status().isOk(), 
				MockMvcResultMatchers.jsonPath("$", hasSize(15)));
	}
}
