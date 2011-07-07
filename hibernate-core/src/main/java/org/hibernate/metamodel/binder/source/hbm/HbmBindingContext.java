/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * Copyright (c) 2011, Red Hat Inc. or third-party contributors as
 * indicated by the @author tags or express copyright attribution
 * statements applied by the authors.  All third-party contributions are
 * distributed under license by Red Hat Inc.
 *
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution; if not, write to:
 * Free Software Foundation, Inc.
 * 51 Franklin Street, Fifth Floor
 * Boston, MA  02110-1301  USA
 */
package org.hibernate.metamodel.binder.source.hbm;

import java.util.List;

import org.hibernate.metamodel.binder.Origin;
import org.hibernate.metamodel.binder.source.BindingContext;
import org.hibernate.metamodel.binder.source.MetaAttributeContext;
import org.hibernate.metamodel.binder.source.hbm.xml.mapping.EntityElement;
import org.hibernate.metamodel.source.hbm.xml.mapping.XMLFetchProfileElement;

/**
 * Defines features specific to the {@code hbm.xml} variety of a {@link BindingContext}
 * 
 * @author Steve Ebersole
 */
public interface HbmBindingContext extends BindingContext {
	public boolean isAutoImport();

	public MetaAttributeContext getMetaAttributeContext();

	public Origin getOrigin();

	public String determineEntityName(EntityElement entityElement);

	public String qualifyClassName(String unqualifiedName);

	public void processFetchProfiles(List<XMLFetchProfileElement> fetchProfiles, String containingEntityName);
}