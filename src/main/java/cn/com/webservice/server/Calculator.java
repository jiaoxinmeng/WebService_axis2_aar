package cn.com.webservice.server;

import javax.jws.WebService;

/**
 * @author wuliwei
 * 测试直接修改能成功吗
 */
@WebService
public interface Calculator {
	/**
	 * @param summand
	 * @param addend
	 * @return Integer
	 */
	public Integer addInteger(Integer summand, Integer addend);
	
	/**
	 * @param summand
	 * @param addend
	 * @return String 
	 */
	public String addString(String summand, String addend);
	
	/**
	 * @param summand
	 * @param addend
	 * @return Integer[]
	 */
	public Integer[] addIntegerArray(Integer[] summand, Integer[] addend);
	
	/**
	 * @param summand
	 * @param addend
	 * @return String[] 
	 */
	public String[] addStringArray(String[] summand, String[] addend);
}
