package com.xwd.study.util.execl;

public enum ExportStatus {
	EXPORT_SUCCESS("000","导出文件处理成功"),
	EXPORT_FAIL("001","导出文件处理失败"),
	EXPORT_FILE_ALREADY_EXIST("003","文件已存在");
	private String code;
	private String msg;
	ExportStatus(String code,String msg){
		this.code=code;
		this.msg=msg;
	}
	public String getCode() {
		return code;
	}
	public String getMsg() {
		return msg;
	}
}
