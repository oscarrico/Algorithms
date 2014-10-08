package com.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HTMLTagsDetector {

	private String openTagExpression = "<\\s*";
	private String tagNameExpression = "[a-zA-Z]+\\s*";
	private String selfClosingExpressionExists = "[a-zA-Z]+\\s*/>";
	private String attributesExpression = "\\s[a-zA-Z]+";
	 
	
	private void detect(String line){
		System.out.println(line.matches(openTagExpression));
		line = matchOpenTag(line);
		
		if(line != null){
			String tagName = getTagName(line);
		}

		
	}
	
	private String removeTagName(){
		String newHtml = null;
		Pattern pattern = Pattern.compile(tagNameExpression);
		Matcher matcher = pattern.matcher(html);
		if(matcher.find()){
			newHtml = html.substring(matcher.start(), matcher.end());
		}
		return newHtml;
	}
	
	
	private String getTagName(String html){
		String newHtml = null;
		Pattern pattern = Pattern.compile(tagNameExpression);
		Matcher matcher = pattern.matcher(html);
		if(matcher.find()){
			newHtml = html.substring(matcher.start(), matcher.end());
		}
		return newHtml;
	}
	
	private String matchOpenTag(String html){
		String newHtml = null;
		Pattern pattern = Pattern.compile(openTagExpression);
		Matcher matcher = pattern.matcher(html);
		if(matcher.find()){
			newHtml = html.substring(matcher.end());
		}
		return newHtml;
	}
	
	public static void main(String[] args){
		HTMLTagsDetector detector = new HTMLTagsDetector(); 
		detector.detect("< p");
//		detector.detect("<a");
//		detector.detect("<body");
		
	}
}
