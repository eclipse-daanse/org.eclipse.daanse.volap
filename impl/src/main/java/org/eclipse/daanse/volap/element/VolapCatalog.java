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

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.eclipse.daanse.olap.api.CatalogReader;
import org.eclipse.daanse.olap.api.IdentifierSegment;
import org.eclipse.daanse.olap.api.Parameter;
import org.eclipse.daanse.olap.api.access.Role;
import org.eclipse.daanse.olap.api.connection.Connection;
import org.eclipse.daanse.olap.api.element.Catalog;
import org.eclipse.daanse.olap.api.element.Cube;
import org.eclipse.daanse.olap.api.element.DatabaseSchema;
import org.eclipse.daanse.olap.api.element.MetaData;
import org.eclipse.daanse.olap.api.element.NamedSet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VolapCatalog extends VolapMetaElement implements Catalog {
	public static final Logger LOGGER = LoggerFactory.getLogger(VolapCatalog.class);
	
    private String name;

    private String description;

    private String id;

    private List<Cube> cubes;

    private CatalogReader ctalogReaderWithDefaultRole;

    private Parameter[] parameters;

    private Instant catalogLoadDate;

    private List<Exception> warnings;

    private Role defaultRole;

    private List<DatabaseSchema> databaseSchemas;

    private Connection internalConnection;
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public List<Cube> getCubes() {
		return cubes;
	}

	@Override
	public CatalogReader getCatalogReaderWithDefaultRole() {
		return ctalogReaderWithDefaultRole;
	}

	@Override
	public Role lookupRole(String role) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Parameter[] getParameters() {
		return parameters;
	}

	@Override
	public Instant getCatalogLoadDate() {
		return catalogLoadDate;
	}

	@Override
	public List<Exception> getWarnings() {
		return warnings;
	}

	@Override
	public Optional<? extends Cube> lookupCube(String cubeName) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Role getDefaultRole() {
		return defaultRole;
	}

	@Override
	public NamedSet getNamedSet(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<? extends DatabaseSchema> getDatabaseSchemas() {
		return databaseSchemas;
	}

	@Override
	public Connection getInternalConnection() {
		return internalConnection;
	}

	@Override
	public NamedSet getNamedSet(IdentifierSegment segment) {
		// TODO Auto-generated method stub
		return null;
	}

	public CatalogReader getCtalogReaderWithDefaultRole() {
		return ctalogReaderWithDefaultRole;
	}

	public void setCtalogReaderWithDefaultRole(CatalogReader ctalogReaderWithDefaultRole) {
		this.ctalogReaderWithDefaultRole = ctalogReaderWithDefaultRole;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setCubes(List<Cube> cubes) {
		this.cubes = cubes;
	}

	public void setParameters(Parameter[] parameters) {
		this.parameters = parameters;
	}

	public void setCatalogLoadDate(Instant catalogLoadDate) {
		this.catalogLoadDate = catalogLoadDate;
	}

	public void setWarnings(List<Exception> warnings) {
		this.warnings = warnings;
	}

	public void setDefaultRole(Role defaultRole) {
		this.defaultRole = defaultRole;
	}

	public void setDatabaseSchemas(List<DatabaseSchema> databaseSchemas) {
		this.databaseSchemas = databaseSchemas;
	}

	public void setInternalConnection(Connection internalConnection) {
		this.internalConnection = internalConnection;
	}

	public void addCube(Cube cube) {
		if (cubes == null) {
			cubes = new ArrayList<Cube>();
		}
		cubes.add(cube);		
	}

	public void addDatabaseSchema(DatabaseSchema databaseSchema) {
		if (databaseSchemas == null) {
			databaseSchemas = new ArrayList<DatabaseSchema>();
		}
		databaseSchemas.add(databaseSchema);		
	}

}
