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

import java.util.Locale;

import org.eclipse.daanse.olap.api.CatalogReader;
import org.eclipse.daanse.olap.api.MatchType;
import org.eclipse.daanse.olap.api.Segment;
import org.eclipse.daanse.olap.api.element.Dimension;
import org.eclipse.daanse.olap.api.element.Hierarchy;
import org.eclipse.daanse.olap.api.element.OlapElement;

public class VolapOlapElement implements OlapElement{

	 private String uniqueName;

	 private String name;

	 private String description;

	 private String qualifiedName;

	 private String caption;

	 private Hierarchy hierarchy;


	 private Dimension dimension;


	 private boolean visible;


	public String getUniqueName() {
		return uniqueName;
	}


	public void setUniqueName(String uniqueName) {
		this.uniqueName = uniqueName;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getQualifiedName() {
		return qualifiedName;
	}


	public void setQualifiedName(String qualifiedName) {
		this.qualifiedName = qualifiedName;
	}


	public String getCaption() {
		return caption;
	}


	public void setCaption(String caption) {
		this.caption = caption;
	}


	public Hierarchy getHierarchy() {
		return hierarchy;
	}


	public void setHierarchy(Hierarchy hierarchy) {
		this.hierarchy = hierarchy;
	}


	public Dimension getDimension() {
		return dimension;
	}


	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}


	public boolean isVisible() {
		return visible;
	}


	public void setVisible(boolean visible) {
		this.visible = visible;
	}


	@Override
	public OlapElement lookupChild(CatalogReader schemaReader, Segment s, MatchType matchType) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String getLocalized(LocalizedProperty prop, Locale locale) {
		// TODO Auto-generated method stub
		return null;
	}
 

}
