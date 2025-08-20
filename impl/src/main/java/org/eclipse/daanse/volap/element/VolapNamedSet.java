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

import org.eclipse.daanse.olap.api.Validator;
import org.eclipse.daanse.olap.api.element.Hierarchy;
import org.eclipse.daanse.olap.api.element.MetaData;
import org.eclipse.daanse.olap.api.element.NamedSet;
import org.eclipse.daanse.olap.api.query.component.Expression;
import org.eclipse.daanse.olap.api.type.Type;

public class VolapNamedSet extends VolapOlapElement implements NamedSet {

	private Type type;

	private Expression exp;

	private String nameUniqueWithinQuery;

	private boolean dynamic;

	private List<Hierarchy> hierarchies;

	private String displayFolder;

	private MetaData metaData;

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Expression getExp() {
		return exp;
	}

	public void setExp(Expression exp) {
		this.exp = exp;
	}

	public String getNameUniqueWithinQuery() {
		return nameUniqueWithinQuery;
	}

	public void setNameUniqueWithinQuery(String nameUniqueWithinQuery) {
		this.nameUniqueWithinQuery = nameUniqueWithinQuery;
	}

	public boolean isDynamic() {
		return dynamic;
	}

	public void setDynamic(boolean dynamic) {
		this.dynamic = dynamic;
	}

	public List<Hierarchy> getHierarchies() {
		return hierarchies;
	}

	public void setHierarchies(List<Hierarchy> hierarchies) {
		this.hierarchies = hierarchies;
	}

	public String getDisplayFolder() {
		return displayFolder;
	}

	public void setDisplayFolder(String displayFolder) {
		this.displayFolder = displayFolder;
	}

	@Override
	public MetaData getMetaData() {
		return this.metaData;
	}

	public void setMetaData(MetaData metaData) {
		this.metaData = metaData;
	}

	@Override
	public NamedSet validate(Validator validator) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addHierarch(Hierarchy hierarchy) {
		if (hierarchies == null) {
			hierarchies = new ArrayList<Hierarchy>();
		}
		hierarchies.add(hierarchy);		
	}

}
