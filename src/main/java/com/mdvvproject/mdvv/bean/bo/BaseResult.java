package com.mdvvproject.mdvv.bean.bo;

import com.mdvvproject.mdvv.util.AppConst;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.Map;

/**
 * layui框架table返回数据的bean类
 * @author cgh 2019年4月12日 上午9:36:32
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BaseResult {
	/**
	 * 返回状态码（成功0，失败1）
	 */
	private Integer errorCode;
	/**
	 * 错误提示
	 */
	private String errorMsg;
	/**
	 * 总条数
	 */
	private Integer pageCount;
	/**
	 *  总条数
	 */
	private int total;
	/**
	 * 返回实体对象集合
	 */
	private Object data;


	public BaseResult(Integer errorCode, String errorMsg) {
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}

	public BaseResult(Integer errorCode, String errorMsg, int pageCount, int total) {
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
		this.pageCount = pageCount;
		this.total = total;
	}

	public BaseResult(Integer errorCode, String errorMsg, Object data) {
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
		this.data = data;
	}

	/**
	 * 返回成功
	 * 
	 * @return
	 */
	public static BaseResult success(int count, List<Map<String, Object>> mapList) {
		BaseResult result = new BaseResult();
		result.setErrorCode(AppConst.SUCCESS_CODE);
		result.setErrorMsg("成功");
		result.setPageCount(count);
		result.setData(mapList);
		return result;
	}
	
	/**
	 * 返回失败
	 * 
	 * @return
	 */
	public static BaseResult fail(int count, List<Map<String, Object>> mapList) {
		BaseResult result = new BaseResult();
		result.setErrorCode(AppConst.FAIL_CODE);
		result.setErrorMsg("无数据");
		result.setPageCount(count);
		result.setData(mapList);
		return result;
	}
}
