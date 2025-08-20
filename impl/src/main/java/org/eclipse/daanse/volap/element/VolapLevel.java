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

import org.eclipse.daanse.olap.api.SqlExpression;
import org.eclipse.daanse.olap.api.element.Hierarchy;
import org.eclipse.daanse.olap.api.element.Level;
import org.eclipse.daanse.olap.api.element.LevelType;
import org.eclipse.daanse.olap.api.element.Member;
import org.eclipse.daanse.olap.api.element.MetaData;
import org.eclipse.daanse.olap.api.element.Property;
import org.eclipse.daanse.olap.api.formatter.MemberFormatter;

public class VolapLevel extends VolapOlapElement implements Level {

	private int depth;

	private Level childLevel;

	private Level parentLevel;

	private boolean all;

	private boolean areMembersUnique;

	private LevelType levelType;

	private Property[] properties;

	private Property[] inheritedProperties;

	private MemberFormatter memberFormatter;

	private int approxRowCount;

	private int cardinality;

	private List<Member> members;

	private boolean unique;

	private SqlExpression ordinalExp;

	private boolean parentChild;

	private boolean parentAsLeafEnable;

	private String parentAsLeafNameFormat;

	private MetaData metaData;

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public Level getChildLevel() {
		return childLevel;
	}

	public void setChildLevel(Level childLevel) {
		this.childLevel = childLevel;
	}

	public Level getParentLevel() {
		return parentLevel;
	}

	public void setParentLevel(Level parentLevel) {
		this.parentLevel = parentLevel;
	}

	public boolean isAll() {
		return all;
	}

	public void setAll(boolean all) {
		this.all = all;
	}

	public boolean areMembersUnique() {
		return areMembersUnique;
	}

	public void setAreMembersUnique(boolean areMembersUnique) {
		this.areMembersUnique = areMembersUnique;
	}

	public LevelType getLevelType() {
		return levelType;
	}

	public void setLevelType(LevelType levelType) {
		this.levelType = levelType;
	}

	public Property[] getProperties() {
		return properties;
	}

	public void setRoperties(Property[] properties) {
		this.properties = properties;
	}

	public Property[] getInheritedProperties() {
		return inheritedProperties;
	}

	public void setInheritedProperties(Property[] inheritedProperties) {
		this.inheritedProperties = inheritedProperties;
	}

	public MemberFormatter getMemberFormatter() {
		return memberFormatter;
	}

	public void setMemberFormatter(MemberFormatter memberFormatter) {
		this.memberFormatter = memberFormatter;
	}

	public int getApproxRowCount() {
		return approxRowCount;
	}

	public void setApproxRowCount(int approxRowCount) {
		this.approxRowCount = approxRowCount;
	}

	public int getCardinality() {
		return cardinality;
	}

	public void setCardinality(int cardinality) {
		this.cardinality = cardinality;
	}

	public List<Member> getMembers() {
		return members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}

	public boolean isUnique() {
		return unique;
	}

	public void setUnique(boolean unique) {
		this.unique = unique;
	}

	public SqlExpression getOrdinalExp() {
		return ordinalExp;
	}

	public void setOrdinalExp(SqlExpression ordinalExp) {
		this.ordinalExp = ordinalExp;
	}

	public boolean isParentChild() {
		return parentChild;
	}

	public void setParentChild(boolean parentChild) {
		this.parentChild = parentChild;
	}

	public boolean isParentAsLeafEnable() {
		return parentAsLeafEnable;
	}

	public void setParentAsLeafEnable(boolean parentAsLeafEnable) {
		this.parentAsLeafEnable = parentAsLeafEnable;
	}

	public String getParentAsLeafNameFormat() {
		return parentAsLeafNameFormat;
	}

	public void setParentAsLeafNameFormat(String parentAsLeafNameFormat) {
		this.parentAsLeafNameFormat = parentAsLeafNameFormat;
	}

	@Override
	public MetaData getMetaData() {
		return metaData;
	}

	public void addMember(Member member) {
		if (members == null) {
			members = new ArrayList<Member>();
		}
		members.add(member);		
	}

}
