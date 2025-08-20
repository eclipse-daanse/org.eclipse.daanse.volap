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

import org.eclipse.daanse.olap.api.element.Dimension;
import org.eclipse.daanse.olap.api.element.Hierarchy;
import org.eclipse.daanse.olap.api.element.Level;
import org.eclipse.daanse.olap.api.element.Member;
import org.eclipse.daanse.olap.api.element.MetaData;
import org.eclipse.daanse.olap.api.query.component.Formula;

public class VolapHierarchy extends VolapOlapElement implements Hierarchy {

	private Dimension dimension;

	private List<Level> levels;

	private Member defaultMember;

	private Member allMember;

	private Member nullMember;

	private boolean hasAll;

	private String uniqueNameSsas;

	private String displayFolder;

	private String origin;

	private List<Member> rootMembers;

	private int ordinalInCube;

	private String subName;
	
	private MetaData metaData;

	public Dimension getDimension() {
		return dimension;
	}

	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}

	public List<? extends Level> getLevels() {
		return levels;
	}

	public void setLevels(List<Level> levels) {
		this.levels = levels;
	}

	public Member getDefaultMember() {
		return defaultMember;
	}

	public void setDefaultMember(Member defaultMember) {
		this.defaultMember = defaultMember;
	}

	public Member getAllMember() {
		return allMember;
	}

	public void setAllMember(Member allMember) {
		this.allMember = allMember;
	}

	public Member getNullMember() {
		return nullMember;
	}

	public void setNullMember(Member nullMember) {
		this.nullMember = nullMember;
	}

	public boolean hasAll() {
		return hasAll;
	}

	public void setHasAll(boolean hasAll) {
		this.hasAll = hasAll;
	}

	public String getUniqueNameSsas() {
		return uniqueNameSsas;
	}

	public void setUniqueNameSsas(String uniqueNameSsas) {
		this.uniqueNameSsas = uniqueNameSsas;
	}

	public String getDisplayFolder() {
		return displayFolder;
	}

	public void setDisplayFolder(String displayFolder) {
		this.displayFolder = displayFolder;
	}

	public String origin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public List<Member> getRootMembers() {
		return rootMembers;
	}

	public void setRootMembers(List<Member> rootMembers) {
		this.rootMembers = rootMembers;
	}

	public int getOrdinalInCube() {
		return ordinalInCube;
	}

	public void setOrdinalInCube(int ordinalInCube) {
		this.ordinalInCube = ordinalInCube;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	@Override
	public MetaData getMetaData() {
		return metaData;
	}

	@Override
	public Member createMember(Member parent, Level level, String name, Formula formula) {
		// TODO Auto-generated method stub
		return null;
	}	
	
	public void addHierarch(Level level) {
		if (levels == null) {
			levels = new ArrayList<Level>();
		}
		levels.add(level);		
	}

}
