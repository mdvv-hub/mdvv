package com.mdvvproject.mdvv.util;

/**
 * 静态常量
 * @author CGH
 * @create 2018-04-20 下午3:04
 *
 */
public class AppConst implements ICodeConst{
	/** 构造函数。 */
	public AppConst() {

	}
}

interface ICodeConst {

	/** 缓存键的连接符 */
	public static final String FILE_CONNE = "-";
	/** 系统配置项的缓存器 */
	public static final String SYS_CONFIG = "sysConfig";
	/** 公共代码的缓存器 */
	public static final String BIZ_CODE = "bizCode";
	/** 公共代码的缓存器1  只有公共代码查询时用 其余还是使用bizCode */
	public static final String SYS_BIZ_CODE = "sysBizCode";
	/** 存储视频通话时需要的小鱼号的缓存器，在此可查询用户对应的小鱼号 */
	public static final String CALL_NUMBER_LIST = "callNumberList";

	/**************************************************************************************/
	/** 手机端:0 */
	public static final String APP = "app";

	/** TV端:0 */
	public static final String TV = "tv";

	/** 电脑端:0 */
	public static final String WEB = "web";

	/** 成功状态码:0 */
	public static final int SUCCESS_CODE = 0;

	/** 失败状态码:1 */
	public static final int FAIL_CODE = 1;

	/** 有效 */
	public static final String TRUE_CODE = "1";

	/** 无效 */
	public static final String FALSE_CODE = "0";

	/** TOKEN错误代码 */
	public static final int  TOKEN_ERROR_CODE = 3;
	/** TOKEN错误代码 */
	public static final String TOKEN_ERROR_MESSAGE = "TOKEN有误";

	/** 斜线 */
	public static final String FILE_LINE = "/";

	/** 代码类型*/
	public static final String CODE_TYPE = "CODE_TYPE";

	/** 归属省份*/
	public static final String AREA_CODE = "AreaCode";
	/** 公司*/
	public static final String COMPANY_CODE = "CompanyCode";
	/** 用户类型*/
	public static final String USER_TYPE = "userType";
	/** 页面用户02*/
	public static final String USER_TYPE_TWO = "02";
	/** 接口用户01*/
	public static final String USER_TYPE_ONE = "01";
	/** 用户状态*/
	public static final String USER_STATUS = "UserStatus";
	/** 机构类型*/
	public static final String COMPANY_TYPE = "CompanyType";
	/** 日志操作类型*/
	public static final String OPERATE_TYPE = "OperateType";
	/**日志功能类型 其他-0 */
	public static final String FUNCTION_TYPE_0 = "0";
	/** 日志功能类型-远程门诊*/
	public static final String LOG_TELECLINIC = "1";
	/** 日志功能类型-健康教育*/
	public static final String LOG_EDUCATIONAL = "2";
	/** 日志功能类型-远程培训*/
	public static final String LOG_NETWORK = "3";
	/** 日志功能类型-视频访视*/
	public static final String LOG_VIDEO = "4";
	/** 日志功能类型-健康扶贫*/
	public static final String LOG_HEALTH_POVERTY = "5";
	/** 日志功能类型-健康咨询*/
	public static final String LOG_HEALTH_COUNSEL = "6";
	/** 日志操作类型-新增*/
	public static final String LOG_ADD = "1";
	/** 日志操作类型-修改*/
	public static final String LOG_UPDATE = "2";
	/** 日志操作类型-删除*/
	public static final String LOG_DEL = "3";
	/** 日志操作类型 -其他*/
	public static final String LOG_OTHER = "0";
	/** 日志操作类型 -导出*/
	public static final String LOG_EXPORT = "4";
	/** 日志操作类型 -登录*/
	public static final String LOG_LOGIN = "5";
	/** 培训申请状态 ---待处理-1 */
	public static final String APPLY_STATUS_1 = "1";

	/** 培训申请状态 ---已处理-2 */
	public static final String APPLY_STATUS_2 = "2";

	/** 计划状态 --- 待完善-1 */
	public static final String Status_1 = "1";

	/** 计划状态 ---待审核-2 */
	public static final String STATUS_2 = "2";

	/** 计划状态 ---审核未通过-3 */
	public static final String STATUS_3 = "3";

	/** 计划状态 ---审核通过-4 */
	public static final String STATUS_4 = "4";
	/**查询类型-1查询全部 */
	public static final String SELECT_1 ="1";
	/**查询类型-2已处理 */
	public static final String SELECT_2 ="2";
	/**查询类型-3未处理 */
	public static final String SELECT_3 ="3";
	/**申请状态-1-待受理 */
	public static final String APPLY_1 ="1";
	/**申请状态-2-已接受 */
	public static final String APPLY_2 ="2";
	/**申请状态-3-已拒绝 */
	public static final String APPLY_3 ="3";
	/**申请状态-4-已取消 */
	public static final String APPLY_4 ="4";
	/**申请状态-5-已完成 */
	public static final String APPLY_5 ="5";
	/**是否提交审核-1-是 */
	public static final String IS_SUBMIT_CHECK_1 ="1";
	/**是否提交审核-0-否 */
	public static final String IS_SUBMIT_CHECK_0 ="0";
	/**申请处理结果-1接受 */
	public static final String RAPPLY_ESULT_1 = "1";
	/**申请处理结果-2拒绝 */
	public static final String RAPPLY_ESULT_2= "2";
	/**视频点播记录来源-1-远程培训 */
	public static final String VIDEO_RECORD_SOURCE_1 = "1";
	/**视频点播记录来源-2-健康教育 */
	public static final String VIDEO_RECORD_SOURCE_2 = "2";
	/**远程培训视频案例类别 内科*/
	public static final String CASE_KIND_1 = "1";
	/**远程培训视频案例类别 外科*/
	public static final String CASE_KIND_2 = "2";
	/**地区标识 本镇— 0 */
	public static final String AREA_FLAG_0 = "0";
	/**地区标识 全部— 1 */
	public static final String AREA_FLAG_1 = "1";

	/**通话类型 远程门诊-1 */
	public static final String CALL_TYPE_1 = "1";
	/**通话类型 视频访视-2*/
	public static final String CALL_TYPE_2 = "2";
	/**通话类型 健康扶贫-3*/
	public static final String CALL_TYPE_3 = "3";
	/**通话类型 健康咨询-4*/
	public static final String CALL_TYPE_4 = "4";


	/**审核状态  待审核-0*/
	public static final String AUDIT_STATUS_0 = "0";
	/**审核状态 通过-1*/
	public static final String AUDIT_STATUS_1 = "1";
	/**审核状态 未通过-2*/
	public static final String AUDIT_STATUS_2 = "2";

	/** 通话结果 0-已接通*/
	public static final String CALL_RESULT_1 = "1";
	/** 通话结果 1-未接通*/
	public static final String CALL_RESULT_2 = "2";

	/** 省级*/
	public static final String AREA_LEVEL_1 = "1";
	/** 市级*/
	public static final String AREA_LEVEL_2 = "2";
	/** 县级*/
	public static final String AREA_LEVEL_3 = "3";
	/** 乡级*/
	public static final String AREA_LEVEL_4 = "4";
	/** 村级*/
	public static final String AREA_LEVEL_5 = "5";

	/** tab全部*/
	public static final String tab_0 = "0";
	/** tab全部*/
	public static final String tab_1 = "1";
	/** tab全部*/
	public static final String tab_2 = "2";
	/** tab全部*/
	public static final String tab_3 = "3";


	/************************************公用常量**************************************************/
	/** 动态表名  居民表*/
	public static final String RESIDNT_INFO = "residentinfo";
	/** 动态表名  居民人群分类信息表*/
	public static final String RESIDENT_PERSON_CLASSIFY = "residentpersonclassify";
	/** 登录用户账号 */
	public static final String USER_INFO = "userInfo";
	/** 登录用户账号和身份证信息 */
	public static final String USER_ID_AND_CARDNO = "userIdAndCardNo";
	/** 登录用户设备类型 */
	public static final String DEVICE_TYPE = "deviceType";
	/** 登录用户账号 */
	public static final String USER_CODE = "userCode";

	/** 登录用户名 */
	public static final String USER_NAME = "userName";

	/** 登录用户邮箱 */
	public static final String USER_EMAIL = "userEmail";

	/** 登录用户电话 */
	public static final String USER_PHONE = "userPhone";

	/** 验证码 */
	public static final String CHECK_CODE = "checkCode";

	/** 空格 */
	public static final String WHITE_SPACE = " ";

	/** 1 男 */
	public static final String BOY = "1";

	/** 2 女 */
	public static final String GIRL = "2";
	/**************************************编码集常量************************************************/
	//zn_gbk编码
	public static final String ZH_CN_GBK = "zh_CN.GBK";
	//zn_u8编码
	public static final String ZH_CN_UTF_8 = "zh_CN.UTF-8";
	//en_u8编码
	public static final String EN_US_UTF_8 = "en_US.UTF-8";
	//zn_gb18030编码
	public static final String ZH_CN_GB18030 = "zh_CN.GB18030";
	//zn_CN编码(对应GB2312)
	public static final String ZH_CN = "zh_CN";
	//en_US编码(对应ISO-8859-1)
	public static final String EN_US = "en_US";
	//utf-8编码
	public static final String UTF_8 = "UTF-8";
	//GBK编码
	public static final String GBK = "GBK";
	//GB2312编码
	public static final String GB2312 = "GB2312";
	//ISO-8859-1编码
	public static final String ISO_8859_1 = "ISO-8859-1";
	//GB18030编码
	public static final String GB18030 = "GB18030";
	//ISO-8859
	public static final String ISO_8859 = "ISO-8859";
	//DOS
	public static final String DOS = "DOS";
	//ERROR:
	public static final String ERROR_ = "ERROR:";

	/**案例类别 */
	public static final String CASE_KIND = "caseKind";
	/**培训计划状态 */
	public static final String TRAIN_STATUS = "trainStatus";
	/**培训计划状态 */
	public static final String CALL_RESURT = "callResult";
	/**健康教育视频分类 */
	public static final String VIDEO_COLUMN_TYPE = "videoColumnType";
	/**审核状态 */
	public static final String AUDIT_STATUS = "auditStatus";
	/**健康状况 */
	public static final String HEALTH_STATE = "healthState";
	/**人群分类 */
	public static final String PATIENT_SORT = "patientSort";

	/**支付状态 */
	public static final String PAYMENT_STATUS = "paymentStatus";

	/**用户类型 userType--1 居民*/
	public static final String USER_TYPE_1 = "1";
	/**用户类型 userType--2 村医*/
	public static final String USER_TYPE_2 = "2";
	/**用户类型 userType--3 乡医*/
	public static final String USER_TYPE_3 = "3";
	/**用户类型 userType--4 管理员*/
	public static final String USER_TYPE_4 = "4";

	/***************************************响应码**************************************************/
	/** 请求状态-成功 */
	public static final String HTTPSTATUS_200 = "200";
	/** 请求状态-系统异常 */
	public static final String HTTPSTATUS_500 = "500";
	/**  登录状态 0成功 */
	public static final String LOGIN_STATUS_0 = "0";
	/**********贵服通对接请求交易码常量**************/

	/**登录请求交易码*/
	public static final String REQUEST_T001 = "T001";
	/**查询扫码登录状态交易码*/
	public static final String QUERY_T003 = "T003";
	/**用户信息查询交易码*/
	public static final String USERQURTY_T004 = "T004";


	/**********配置项**************/

	/**SMD4密匙*/
	public static final String SM4_KEY = "sm4key";
	/**SIGN_KEY*/
	public static final String SIGN_KEY = "signKey";
	/**居民登录二维码接口地址*/
	public static final String TWO_DIMENSIONALCODE_URL ="TwoDimensionalCodeUrl";
	/**1居民登录二维码接口地址*/
	public static final String TWO_DIMENSIONALCODE_URL1 ="TwoDimensionalCodeUrl1";
	/**2村医登录二维码接口地址*/
	public static final String TWO_DIMENSIONALCODE_URL2 ="TwoDimensionalCodeUrl2";
	/**交互渠道*/
	public static final String GFT_CHANNEL ="channel";
	/**连接超时等待时间*/
	public static final String GFT_CONNECTTIMEOUT ="connectTimeout";
	/**响应超时等待时间*/
	public static final String GFT_WAITRESTIMEOUT ="waitResTimeout";
	/**商户号*/
	public static final String GFT_BIZ_NO ="bizNO";
	/**ftp服务器地址*/
	public static final String SFTP_ADDR ="sftpHost";
	/**ftp服务器端口号*/
	public static final String SFTP_PORT ="sftpPort";
	/**ftp登录用户名*/
	public static final String SFTP_USERNAME ="sftpUserName";
	/**ftp登录密码*/
	public static final String SFTP_PASSWORD ="sftpPassWord";
	/**ftp播放视频地址*/
	public static final String SFTP_PLAYURL ="sftpPlayUrl";
	/**ftp头像外网映射地址*/
	public static final String SFTP_IMG_URL ="sftpImgUrl";
	/**ftp服务器存储用户头像的文件路径*/
	public static final String SFTP_HEAD_PIC_FOLDER ="sftpHeadPicFolder";
	/**村医扫码登录结果接口地址*/
	public static final String DOCTOR_SCAN_LOGIN_URL ="doctorScanLoginUrl";
	/**居民扫码登录结果接口地址*/
	public static final String CITIZEN_SCAN_LOGIN_URL ="citizenScanLoginUrl";
	/**与小鱼对接的enterpriseId*/
	public static final String XY_ENTERPRISEID ="xyEnterpriseId";
	/**与小鱼对接的token */
	public static final String XY_TOKEN ="xyToken";
}
