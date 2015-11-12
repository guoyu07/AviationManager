package com.youyun.codegen.generate;

import java.util.List;

import com.youyun.codegen.vo.Table;

/**
 * 根据模板生成文件
 */
public interface Generate {

	public void generate(Table table) throws Exception;

	public void generate(List<Table> tables) throws Exception;

}
