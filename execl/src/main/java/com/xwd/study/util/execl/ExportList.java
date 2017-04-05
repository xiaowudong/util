package com.xwd.study.util.execl;

import java.util.List;

public interface ExportList {
	/**
	 * 
	 * @param sheetName
	 * @param fielsName
	 * @param datas
	 * @param outFilePath
	 * @param cla
	 * @return
	 */
	public ExportStatus  exportExcel(String sheetName,String[] fielsName,List<?>datas,String outFilePath,Class<?> cla);
	/**
	 * 
	 * @param sheetName
	 * @param fielsName
	 * @param datas
	 * @param outFilePath
	 * @param cla
	 * @return
	 */
	public <T> ExportStatus exportExcel(String sheetName,String[] fielsName,List<T>datas,String outFilePath,String[] headers,Class<?> cla);
	/**
	 * 
	 * @param sheetName
	 * @param fielsName
	 * @param datas
	 * @param outFilePath
	 * @param cla
	 * @return
	 */
	public ExportStatus  exportExcelAddSheet(String sheetName,String[] fielsName,List<?>datas,String outFilePath,Class<?> cla);
	/**
	 * 
	 * @param sheetName
	 * @param fielsName
	 * @param datas
	 * @param outFilePath
	 * @param cla
	 * @return
	 */
	public ExportStatus  exportExcelAddSheet(String sheetName,String[] fielsName,List<?>datas,String outFilePath,String[] headers,Class<?> cla);
}
