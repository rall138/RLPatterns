package com.rldevel.persistence;

public class Column {
	
	private String column_name;
	//private DataType data_type;
	private boolean isNullable;
	private boolean isColumnKey;

	public Column(String column_name, boolean isNullable, boolean isColumnKey){
		this.column_name = column_name;
		this.isNullable = isNullable;
		this.isColumnKey = isColumnKey;
	}

	public String getColumn_name() {
		return column_name;
	}

	public boolean isNullable() {
		return isNullable;
	}

	public boolean isColumnKey() {
		return isColumnKey;
	}
	
}