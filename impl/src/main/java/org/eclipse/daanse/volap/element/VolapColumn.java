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
 * ---- All changes after Fork in 2023 ------------------------
 *
 * Project: Eclipse daanse
 *
 * Copyright (c) 2023 Contributors to the Eclipse Foundation.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors after Fork in 2023:
 *   SmartCity Jena - initial
 */

package org.eclipse.daanse.volap.element;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.daanse.olap.api.SqlExpression;
import org.eclipse.daanse.olap.api.SqlStatement;


public class VolapColumn implements SqlExpression {

    private String table;
    private String name;
    private List<SqlStatement> sqls;


    public String getTable() {
	    return table;
    }

    public String getName() {
	    return name;
    }

    @Override
	public List<SqlStatement> getSqls() {
    	return sqls;
	}

	public void setTable(String table) {
		 this.table =  table;

	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSqls(List<SqlStatement> sqls) {
		this.sqls = sqls;
	}
	
	public void addSqls(SqlStatement sqlStatement) {
		if (sqls == null) {
			sqls = new ArrayList<SqlStatement>();
		}
		sqls.add(sqlStatement);
	}
}
