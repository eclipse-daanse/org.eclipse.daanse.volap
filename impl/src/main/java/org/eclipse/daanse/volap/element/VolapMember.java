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

import org.eclipse.daanse.olap.api.element.Hierarchy;
import org.eclipse.daanse.olap.api.element.Level;
import org.eclipse.daanse.olap.api.element.Member;
import org.eclipse.daanse.olap.api.element.MetaData;
import org.eclipse.daanse.olap.api.element.Property;
import org.eclipse.daanse.olap.api.query.component.Expression;

public class VolapMember extends VolapOlapElement implements Member {

	  private Member parentMember;

	  private Level level;

	  private Hierarchy Hierarchy;

	  private String ParentUniqueName;

	  private MemberType memberType;

	  private boolean parentChildLeaf;

	  private boolean parentChildPhysicalMember;

	  private boolean all;

	  private boolean measure;

	  private boolean isNull;

	  private boolean calculated;

	  private boolean evaluated;

	  private int solveOrder;

	  private Expression expression;

	  private List<Member> ancestorMembers;

	  private boolean calculatedInQuery;

	  private Property[] properties;

	  private int ordinal;

	  private Comparable orderKey;

	  private boolean hidden;

	  private int dpth;

	  private Member dataMember;
	  
	  private MetaData metaData;

	public Member getParentMember() {
		return parentMember;
	}

	public void setParentMember(Member parentMember) {
		this.parentMember = parentMember;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public Hierarchy getHierarchy() {
		return Hierarchy;
	}

	public void setHierarchy(Hierarchy hierarchy) {
		Hierarchy = hierarchy;
	}

	public String getParentUniqueName() {
		return ParentUniqueName;
	}

	public void setParentUniqueName(String parentUniqueName) {
		ParentUniqueName = parentUniqueName;
	}

	public MemberType getMemberType() {
		return memberType;
	}

	public void setMemberType(MemberType memberType) {
		this.memberType = memberType;
	}

	public boolean isParentChildLeaf() {
		return parentChildLeaf;
	}

	public void setParentChildLeaf(boolean parentChildLeaf) {
		this.parentChildLeaf = parentChildLeaf;
	}

	public boolean isParentChildPhysicalMember() {
		return parentChildPhysicalMember;
	}

	public void setParentChildPhysicalMember(boolean parentChildPhysicalMember) {
		this.parentChildPhysicalMember = parentChildPhysicalMember;
	}

	public boolean isAll() {
		return all;
	}

	public void setAll(boolean all) {
		this.all = all;
	}

	public boolean isMeasure() {
		return measure;
	}

	public void setMeasure(boolean measure) {
		this.measure = measure;
	}

	public boolean isNull() {
		return isNull;
	}

	public void setNull(boolean isNnull) {
		this.isNull = isNnull;
	}

	public boolean isCalculated() {
		return calculated;
	}

	public void setCalculated(boolean calculated) {
		this.calculated = calculated;
	}

	public boolean isEvaluated() {
		return evaluated;
	}

	public void setEvaluated(boolean evaluated) {
		this.evaluated = evaluated;
	}

	public int getSolveOrder() {
		return solveOrder;
	}

	public void setSolveOrder(int solveOrder) {
		this.solveOrder = solveOrder;
	}

	public Expression getExpression() {
		return expression;
	}

	public void setExpression(Expression expression) {
		this.expression = expression;
	}

	public List<Member> getAncestorMembers() {
		return ancestorMembers;
	}

	public void setAncestorMembers(List<Member> ancestorMembers) {
		this.ancestorMembers = ancestorMembers;
	}

	public boolean isCalculatedInQuery() {
		return calculatedInQuery;
	}

	public void setCalculatedInQuery(boolean calculatedInQuery) {
		this.calculatedInQuery = calculatedInQuery;
	}

	public Property[] getProperties() {
		return properties;
	}

	public void setProperties(Property[] properties) {
		this.properties = properties;
	}

	public int getOrdinal() {
		return ordinal;
	}

	public void setOrdinal(int ordinal) {
		this.ordinal = ordinal;
	}

	public Comparable getOrderKey() {
		return orderKey;
	}

	public void setOrderKey(Comparable orderKey) {
		this.orderKey = orderKey;
	}

	public boolean isHidden() {
		return hidden;
	}

	public void setHidden(boolean hidden) {
		this.hidden = hidden;
	}

	public int getDpth() {
		return dpth;
	}

	public void setDpth(int dpth) {
		this.dpth = dpth;
	}

	public Member getDataMember() {
		return dataMember;
	}

	public void setDataMember(Member dataMember) {
		this.dataMember = dataMember;
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public MetaData getMetaData() {
		return metaData;
	}


	@Override
	public boolean isChildOrEqualTo(Member member) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object getPropertyValue(String propertyName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getPropertyValue(String propertyName, boolean matchCase) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPropertyFormattedValue(String propertyName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setProperty(String name, Object value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getDepth() {
		// TODO Auto-generated method stub
		return dpth;
	}

	@Override
	public boolean isOnSameHierarchyChain(Member otherMember) {
		// TODO Auto-generated method stub
		return false;
	}

	public void addAncestorMember(Member member) {
		if (ancestorMembers == null) {
			ancestorMembers = new ArrayList<Member>();
		}
		ancestorMembers.add(member);		
	}


}
