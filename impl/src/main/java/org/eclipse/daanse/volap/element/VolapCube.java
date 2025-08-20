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
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.daanse.olap.api.CatalogReader;
import org.eclipse.daanse.olap.api.DataTypeJdbc;
import org.eclipse.daanse.olap.api.NameSegment;
import org.eclipse.daanse.olap.api.access.Role;
import org.eclipse.daanse.olap.api.element.Catalog;
import org.eclipse.daanse.olap.api.element.Cube;
import org.eclipse.daanse.olap.api.element.Dimension;
import org.eclipse.daanse.olap.api.element.DrillThroughAction;
import org.eclipse.daanse.olap.api.element.Hierarchy;
import org.eclipse.daanse.olap.api.element.KPI;
import org.eclipse.daanse.olap.api.element.Level;
import org.eclipse.daanse.olap.api.element.Member;
import org.eclipse.daanse.olap.api.element.MetaData;
import org.eclipse.daanse.olap.api.element.NamedSet;
import org.eclipse.daanse.olap.api.query.component.Formula;
import org.eclipse.daanse.olap.api.result.AllocationPolicy;

public class VolapCube extends VolapOlapElement implements Cube {

	 private Catalog catalog;

	 private List<Dimension> dimensions;

	 private NamedSet getNamedSets;

	 private List<Member> measures;

	 private DrillThroughAction defaultDrillThroughAction;

	 private List<DrillThroughAction> drillThroughActions;

	 private List<KPI> kpis;

	 private List<Hierarchy> hierarchies;

	 private boolean loadInProgress;
	 
	 private MetaData metaData;

	public Catalog getCatalog() {
		return catalog;
	}

	public void setCatalog(Catalog catalog) {
		this.catalog = catalog;
	}

	public List<Dimension> getDimensions() {
		return dimensions;
	}

	public void setDimensions(List<Dimension> dimensions) {
		this.dimensions = dimensions;
	}

	public NamedSet getGetNamedSets() {
		return getNamedSets;
	}

	public void setGetNamedSets(NamedSet getNamedSets) {
		this.getNamedSets = getNamedSets;
	}

	public List<Member> getMeasures() {
		return measures;
	}

	public void setMeasures(List<Member> measures) {
		this.measures = measures;
	}

	public DrillThroughAction getDefaultDrillThroughAction() {
		return defaultDrillThroughAction;
	}

	public void setDefaultDrillThroughAction(DrillThroughAction defaultDrillThroughAction) {
		this.defaultDrillThroughAction = defaultDrillThroughAction;
	}

	public List<DrillThroughAction> getDrillThroughActions() {
		return drillThroughActions;
	}

	public void setDrillThroughActions(List<DrillThroughAction> drillThroughActions) {
		this.drillThroughActions = drillThroughActions;
	}

	public List<KPI> getKPIs() {
		return kpis;
	}

	public void setKPIs(List<KPI> kpis) {
		this.kpis = kpis;
	}

	public List<Hierarchy> getHierarchies() {
		return hierarchies;
	}

	public void setHierarchies(List<Hierarchy> hierarchies) {
		this.hierarchies = hierarchies;
	}

	public boolean isLoadInProgress() {
		return loadInProgress;
	}

	public void setLoadInProgress(boolean loadInProgress) {
		this.loadInProgress = loadInProgress;
	}

	@Override
	public MetaData getMetaData() {		
		return metaData;
	}

	public void setMetaData(MetaData metaData) {
		this.metaData = metaData;
	}

	@Override
	public NamedSet[] getNamedSets() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Hierarchy lookupHierarchy(NameSegment s, boolean unique) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member[] getMembersForQuery(String query, List<Member> calcMembers) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CatalogReader getCatalogReader(Role role) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Dimension> nonJoiningDimensions(Member[] tuple) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Dimension> nonJoiningDimensions(Set<Dimension> otherDims) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member createCalculatedMember(Formula formula) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createNamedSet(Formula formula) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Member> getLevelMembers(Level level, boolean includeCalculated) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getLevelCardinality(Level level, boolean approximate, boolean materialize) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void modifyFact(List<Map<String, Entry<DataTypeJdbc, Object>>> sessionValues) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void restoreFact() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void commit(List<Map<String, Entry<DataTypeJdbc, Object>>> sessionValues, String userId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Map<String, Entry<DataTypeJdbc, Object>>> getAllocationValues(String tupleString, Object value,
			AllocationPolicy allocationPolicy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Hierarchy getTimeHierarchy(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addDimension(Dimension dimension) {
		if (dimensions == null) {
			dimensions = new ArrayList<Dimension>();
		}
		dimensions.add(dimension);		
	}

	public void addMeasury(Member member) {
		if (measures == null) {
			measures = new ArrayList<Member>();
		}
		measures.add(member);		
	}

	public void addDrillThroughAction(DrillThroughAction drillThroughAction) {
		if (drillThroughActions == null) {
			drillThroughActions = new ArrayList<DrillThroughAction>();
		}
		drillThroughActions.add(drillThroughAction);		
	}

	public void addKpi(KPI kpi) {
		if (kpis == null) {
			kpis = new ArrayList<KPI>();
		}
		kpis.add(kpi);		
	}

	public void addHierarch(Hierarchy hierarchy) {
		if (hierarchies == null) {
			hierarchies = new ArrayList<Hierarchy>();
		}
		hierarchies.add(hierarchy);		
	}

}
