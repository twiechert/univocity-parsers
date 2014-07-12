/*******************************************************************************
 * Copyright 2014 uniVocity Software Pty Ltd
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.univocity.parsers.common.processor;

import java.util.*;

import com.univocity.parsers.common.*;

/**
 * An utility class to store data of a master row and its detail records.
 * 
 * Instances of this class are typically generated by an instance of {@link AbstractParser} during the parsing of an input using a {@link MasterDetailProcessor}.
 * 
 * @see MasterDetailProcessor
 * @see RowProcessor
 * @see AbstractParser
 * 
 * @author uniVocity Software Pty Ltd - <a href="mailto:parsers@univocity.com">parsers@univocity.com</a>
 *
 */
public class MasterDetailRecord implements Cloneable {

	private Object[] masterRow = null;
	private List<Object[]> detailRows = Collections.emptyList();

	/**
	 * Returns the master row as identified by a {@link MasterDetailProcessor}
	 * @return the master row
	 */
	public Object[] getMasterRow() {
		return masterRow;
	}

	/**
	 * Sets the master row data.
	 * @param masterRow the data of a master row
	 */
	public void setMasterRow(Object[] masterRow) {
		this.masterRow = masterRow;
	}

	/**
	 * Returns the detail rows which are associated to the master row
	 * @return the detail rows which are associated to the master row
	 */
	public List<Object[]> getDetailRows() {
		return detailRows;
	}

	/**
	 * Sets the detail rows associated to  the master row
	 * @param detailRows the list of rows associated to the master row
	 */
	public void setDetailRows(List<Object[]> detailRows) {
		this.detailRows = detailRows;
	}

	/**
	 * Empties the detail rows and sets the master row to null.
	 */
	public void clear() {
		this.detailRows = Collections.emptyList();
		this.masterRow = null;
	}

	@Override
	public MasterDetailRecord clone() {
		try {
			return (MasterDetailRecord) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new InternalError(e.getMessage());
		}
	}
}
