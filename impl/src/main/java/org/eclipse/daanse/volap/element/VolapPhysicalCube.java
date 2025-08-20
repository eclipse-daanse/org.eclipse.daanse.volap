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
import org.eclipse.daanse.olap.api.access.Role;
import org.eclipse.daanse.olap.api.element.Catalog;
import org.eclipse.daanse.olap.api.element.Dimension;
import org.eclipse.daanse.olap.api.element.DrillThroughAction;
import org.eclipse.daanse.olap.api.element.Hierarchy;
import org.eclipse.daanse.olap.api.element.KPI;
import org.eclipse.daanse.olap.api.element.Level;
import org.eclipse.daanse.olap.api.element.Member;
import org.eclipse.daanse.olap.api.element.MetaData;
import org.eclipse.daanse.olap.api.element.NamedSet;
import org.eclipse.daanse.olap.api.element.PhysicalCube;
import org.eclipse.daanse.olap.api.query.component.Formula;
import org.eclipse.daanse.olap.api.result.AllocationPolicy;

public class VolapPhysicalCube extends VolapCube implements PhysicalCube {

	private Catalog catalog;
	private List<Dimension> dimensions;
	private NamedSet[] namedSets;
	private List<Member> measures;
	private DrillThroughAction defaultDrillThroughAction;
	private List<DrillThroughAction> drillThroughActions;
	private List<KPI> kpis;
	private List<Hierarchy> hierarchies;
	private boolean loadInProgress;
	private MetaData metaData;

	@Override
	public Catalog getCatalog() {
		return catalog;
	}

	@Override
	public NamedSet[] getNamedSets() {
		return namedSets;
	}

	@Override
	public List<Member> getMeasures() {
		return measures;
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
	public DrillThroughAction getDefaultDrillThroughAction() {
		return defaultDrillThroughAction;
	}

	@Override
	public List<DrillThroughAction> getDrillThroughActions() {
		return drillThroughActions;
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
	public List<KPI> getKPIs() {
		return kpis;
	}

	@Override
	public List<Hierarchy> getHierarchies() {
		return hierarchies;
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

	@Override
	public boolean isLoadInProgress() {
		return loadInProgress;
	}

	@Override
	public MetaData getMetaData() {
		return metaData;
	}

	public List<Dimension> getDimensions() {
		return dimensions;
	}

	public void setDimensions(List<Dimension> dimensions) {
		this.dimensions = dimensions;
	}

	public List<KPI> getKpis() {
		return kpis;
	}

	public void setKpis(List<KPI> kpis) {
		this.kpis = kpis;
	}

	public void setCatalog(Catalog catalog) {
		this.catalog = catalog;
	}

	public void setNamedSets(NamedSet[] namedSets) {
		this.namedSets = namedSets;
	}

	public void setMeasures(List<Member> measures) {
		this.measures = measures;
	}

	public void setDefaultDrillThroughAction(DrillThroughAction defaultDrillThroughAction) {
		this.defaultDrillThroughAction = defaultDrillThroughAction;
	}

	public void setDrillThroughActions(List<DrillThroughAction> drillThroughActions) {
		this.drillThroughActions = drillThroughActions;
	}

	public void setHierarchies(List<Hierarchy> hierarchies) {
		this.hierarchies = hierarchies;
	}

	public void setLoadInProgress(boolean loadInProgress) {
		this.loadInProgress = loadInProgress;
	}

	public void setMetaData(MetaData metaData) {
		this.metaData = metaData;
	}
	

	public void addDimension(Dimension dimension) {
		if (dimensions == null) {
			dimensions = new ArrayList<Dimension>();
		}
		dimensions.add(dimension);
	}

	public void addMeasure(Member member) {
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

	public void addhierarchy(Hierarchy hierarchy) {
		if (hierarchies == null) {
			hierarchies = new ArrayList<Hierarchy>();
		}
		hierarchies.add(hierarchy);
	}
}
