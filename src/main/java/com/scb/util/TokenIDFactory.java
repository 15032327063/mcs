package com.scb.util;

import java.util.UUID;

/**
 * ClassName: TokenIDFactory <br/>
 * Description: get UUID.<br/>
 * <br/>
 *
 * @author Minghui.Ni
 * @version V1.0
 * @since JDK 1.8 date: 2018年10月31日 下午9:16:57 <br/>
 */
public class TokenIDFactory {
	/**
	 * 得到32位连续无'-'的UUID字符串.<br/>
	 * 
	 * @return String
	 */
	public static String getUUID() {
		String uuid = UUID.randomUUID().toString();
		String[] uuids = uuid.split("-");
		String result = "";
		for (String string : uuids) {
			result += string;
		}
		return result;
	}

	/**
	 * 
	 * 得到8位的UUID.<br/>
	 * 
	 * @return String
	 */
	public static String get8BitUUID() {
		String UUID = getUUID();
		String UUID8 = "";
		for (int i = 0; i < 8; i++) {
			int index = (int) (Math.random() * 32);
			UUID8 += UUID.substring(index, index + 1);
		}
		return UUID8;
	}
}
