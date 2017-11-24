package com.janp.justanormalperson.services.util;

import java.text.Normalizer;
import java.util.StringTokenizer;

public class StringsTratment {

	public static String removeWhitespaces(String value, String delimitator) {
		return value.replaceAll("\\s", delimitator);
	}

	public static String removeWhitespacesAndConvertCamelCase(String value) {
		value = removeSpecialCharacters(value);
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(value, " ");

		while (st.hasMoreTokens()) {
			String strWord = st.nextToken();
			sb.append(Character.toUpperCase(strWord.charAt(0)));
			sb.append(strWord.substring(1).toLowerCase());
		}
		return sb.toString();

	}

	public static String removeWhitespacesAndConvertUppercase(String value) {
		value = removeSpecialCharacters(value);
		String valueToReturn = StringsTratment.removeWhitespaces(value, "_");
		return valueToReturn.toUpperCase();
	}

	public static String removeSpecialCharacters(String value) {

		return Normalizer.normalize(value, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}_]", "");
	}

	public static String generateCode(String value, String code) {
		if (!value.startsWith(code)) {
			value = StringsTratment.removeWhitespacesAndConvertUppercase(value);
			value = StringsTratment.removeSpecialCharacters(value);
			value = code.concat(value);
		}
		return value;
	}

	public static String removeWhitespacesAndConvertCamelCaseSpecial(String value, String delimitator) {
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(value, " ");
		int key = 0;
		while (st.hasMoreTokens()) {
			String strWord = st.nextToken();
			if(key > 0)
				sb.append(delimitator);
			
			sb.append(Character.toUpperCase(strWord.charAt(0)));
			sb.append(strWord.substring(1).toLowerCase());
			key++;
			
		}
		return sb.toString();
	}
}