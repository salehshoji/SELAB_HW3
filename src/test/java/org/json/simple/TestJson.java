/*
 * $Id: Test.java,v 1.1 2006/04/15 14:40:06 platform Exp $
 * Created on 2006-4-15
 */
package org.json.simple;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class TestJson {

	@Test
	public void testDecode() throws Exception{
		System.out.println("=======decode=======");

		String s="[0,10]";
		Object obj=JSONValue.parse(s);
		JSONArray array=(JSONArray)obj;
		System.out.println("======the 2nd element of array======");
		System.out.println(array.get(1));
		System.out.println();
		assertEquals("10",array.get(1).toString());
	}
	
	@Test
	public void testJSONArrayCollection() {
		final ArrayList<String> testList = new ArrayList<String>();
		testList.add("First item");
		testList.add("Second item");
		final JSONArray jsonArray = new JSONArray(testList);
		
		assertEquals("[\"First item\",\"Second item\"]", jsonArray.toString());
	}

	@Test
	public void testJSONMap(){
		final Map<String, Integer> testmap = new HashMap<String, Integer>();
		testmap.put("a", 100);
		testmap.put("b", 200);
		testmap.put("c", 300);
		final JSONObject jsonObject = new JSONObject(testmap);
		assertEquals("{\"a\":100,\"b\":200,\"c\":300}", jsonObject.toString());
	}

	@Test
	public void TestwriteJSONString() throws IOException {
		final String str = "test JSON string";
		assertEquals("\"test JSON string\"", JSONValue.toJSONString(str));
	}
}
