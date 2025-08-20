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

import org.eclipse.daanse.olap.api.element.Property;
import org.eclipse.daanse.olap.api.formatter.MemberPropertyFormatter;

public class VolapProperty implements Property {

    Datatype type;

    MemberPropertyFormatter formatter;

    String caption;

    boolean internal;

    boolean memberProperty;

    boolean cellProperty;

    String name;

    String description;

	public Datatype getType() {
		return type;
	}

	public void setType(Datatype type) {
		this.type = type;
	}

	public MemberPropertyFormatter getFormatter() {
		return formatter;
	}

	public void setFormatter(MemberPropertyFormatter formatter) {
		this.formatter = formatter;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public boolean isInternal() {
		return internal;
	}

	public void setInternal(boolean internal) {
		this.internal = internal;
	}

	public boolean isMemberProperty() {
		return memberProperty;
	}

	public void setMemberProperty(boolean memberProperty) {
		this.memberProperty = memberProperty;
	}

	public boolean isCellProperty() {
		return cellProperty;
	}

	public void setCellProperty(boolean cellProperty) {
		this.cellProperty = cellProperty;
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
	

}
