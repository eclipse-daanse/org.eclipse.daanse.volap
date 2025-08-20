package org.eclipse.daanse.volap.element;

import org.eclipse.daanse.olap.api.element.MetaData;
import org.eclipse.daanse.olap.api.element.MetaElement;

public class VolapMetaElement implements MetaElement {

	private MetaData metaData;

	public MetaData getMetaData() {
		return metaData;
	}

	public void setMetaData(MetaData metaData) {
		this.metaData = metaData;
	}
	

}
