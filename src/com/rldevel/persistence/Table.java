package com.rldevel.persistence;

import java.util.ArrayList;
import java.util.List;

public class Table {

	private String table_name;
	private String table_comment;
	private boolean auto_increment;
	List<Column> column_list = new ArrayList<>();
	
	public Table(String table_name, String table_comment, boolean auto_increment){
		this.table_name = table_name;
		this.table_comment = table_comment;
		this.auto_increment = auto_increment;
	}

	public String getTable_name() {
		return table_name;
	}

	public String getTable_comment() {
		return table_comment;
	}

	public boolean isAuto_increment() {
		return auto_increment;
	}

	public List<Column> getColumn_list() {
		return column_list;
	}

	public void setColumn_list(List<Column> column_list) {
		this.column_list = column_list;
	}
	
}
