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

import org.eclipse.daanse.olap.api.element.Catalog;
import org.eclipse.daanse.olap.api.element.Cube;
import org.eclipse.daanse.olap.api.element.Dimension;
import org.eclipse.daanse.olap.api.element.DimensionType;
import org.eclipse.daanse.olap.api.element.Hierarchy;
import org.eclipse.daanse.olap.api.element.MetaData;


public class VolapDimension extends VolapOlapElement implements Dimension {
	private Catalog catalog;
    private MetaData metaData;
    private Cube cube;
	private boolean measures;
	private List<Hierarchy> hierarchies;
	private DimensionType dimensionType;

	@Override
	public Catalog getCatalog() {
		return catalog;
	}

	@Override
	public Cube getCube() {
		return cube;
	}

	@Override
	public MetaData getMetaData() {
		return metaData;
	}

	public void setCatalog(Catalog catalog) {
		this.catalog = catalog;
	}

	public void setMetaData(MetaData metaData) {
		this.metaData = metaData;
	}

	public void setCube(Cube cube) {
		this.cube = cube;
	}

	@Override
	public List<? extends Hierarchy> getHierarchies() {		
		return this.hierarchies;
	}

	@Override
	public boolean isMeasures() {
		return this.measures;
	}

	@Override
	public DimensionType getDimensionType() {
		return this.dimensionType;
	}

	public void setMeasures(boolean measures) {
		this.measures = measures;
	}

	public void setHierarchies(List<Hierarchy> hierarchies) {
		this.hierarchies = hierarchies;
	}

	public void setDimensionType(DimensionType dimensionType) {
		this.dimensionType = dimensionType;
	}

	public void addHierarch(Hierarchy hierarchy) {
		if (hierarchies == null) {
			hierarchies = new ArrayList<Hierarchy>();
		}
		hierarchies.add(hierarchy);		
	}

}
