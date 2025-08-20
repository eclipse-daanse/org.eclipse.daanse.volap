/*
 * Copyright (c) 2025 Contributors to the Eclipse Foundation.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   SmartCity Jena, Stefan Bischof - initial
 *
 */

package org.eclipse.daanse.volap.element;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.daanse.olap.api.element.DrillThroughAction;
import org.eclipse.daanse.olap.api.element.DrillThroughColumn;
import org.eclipse.daanse.olap.api.element.Hierarchy;
import org.eclipse.daanse.olap.api.element.OlapElement;

public class VolapDrillThroughAction implements DrillThroughAction {
	private boolean isDefault;
	private List<DrillThroughColumn> columnList;
	String name;
	String caption;
	String description;

	@Override
	public boolean getIsDefault() {
		return this.isDefault;
	}

	public List<DrillThroughColumn> getColumns() {
		return this.columnList;
	}

	@Override
	public List<OlapElement> getOlapElements() {
		List<OlapElement> olapElementList = new ArrayList<>();
		for (DrillThroughColumn rolapDrillThroughColumn : this.columnList) {
			olapElementList.add(rolapDrillThroughColumn.getOlapElement());
		}
		return olapElementList;
	}

	public List<DrillThroughColumn> getColumnList() {
		return columnList;
	}

	public void setColumnList(List<DrillThroughColumn> columnList) {
		this.columnList = columnList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public void addcolumn(DrillThroughColumn drillThroughColumn) {
		if (columnList == null) {
			columnList = new ArrayList<DrillThroughColumn>();
		}
		columnList.add(drillThroughColumn);		
	}

}
