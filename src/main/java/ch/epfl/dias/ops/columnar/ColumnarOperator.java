package ch.epfl.dias.ops.columnar;

import ch.epfl.dias.store.column.DBColumn;

public interface ColumnarOperator {
	
	/**
	 * This method invokes the execution of the block-at-a-time operator
	 * 
	 * @return each operator returns the set of result columns
	 */
	public DBColumn[] execute();

}
