package com.corevalueskill.CommonUtil.String;

import java.util.Random;

public class RandomString {

	/**
	 * 랜덤한 문자열을 원하는 길이만큼 반환합니다.
	 * 
	 * @param length
	 *            문자열 길이
	 * @return 랜덤문자열
	 */
	public static String getRandomString(int length) {
		StringBuffer buffer = new StringBuffer();
		Random random = new Random();

		String chars[] = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z"
				.split(",");

		for (int i = 0; i < length; i++) {
			buffer.append(chars[random.nextInt(chars.length)]);
		}
		return buffer.toString();
	}

	/**
	 * 랜덤한 문자열을 원하는 길이만큼 반환합니다. With Number
	 * 
	 * @param length
	 *            문자열 길이
	 * @return 랜덤문자
	 */
	public static String getRandomStringWithNumber(int length) {
		StringBuffer buffer = new StringBuffer();
		Random random = new Random();

		String chars[] = "0,1,2,3,4,5,6,7,8,9,a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z"
				.split(",");

		for (int i = 0; i < length; i++) {
			buffer.append(chars[random.nextInt(chars.length)]);
		}
		return buffer.toString();
	}

	/*
	public static void main(String[] args) {
		System.out.println(getRandomString(4).toUpperCase() + "-"
				+ getRandomString(4).toUpperCase() + "-"
				+ getRandomString(4).toUpperCase() + "-"
				+ getRandomString(4).toUpperCase());

		System.out.println(getRandomStringWithNumber(7));
	}
	*/

}
