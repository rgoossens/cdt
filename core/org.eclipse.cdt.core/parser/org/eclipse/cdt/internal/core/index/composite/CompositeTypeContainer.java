/*******************************************************************************
 * Copyright (c) 2007 Symbian Software Systems and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Andrew Ferguson (Symbian) - Initial implementation
 *******************************************************************************/

package org.eclipse.cdt.internal.core.index.composite;

import org.eclipse.cdt.core.dom.ast.ASTTypeUtil;
import org.eclipse.cdt.core.dom.ast.DOMException;
import org.eclipse.cdt.core.dom.ast.IType;
import org.eclipse.cdt.internal.core.dom.parser.ITypeContainer;
import org.eclipse.cdt.internal.core.index.IIndexType;

public class CompositeTypeContainer extends CompositeType implements ITypeContainer {

	protected CompositeTypeContainer(ITypeContainer rtype, ICompositesFactory cf) {
		super(rtype, cf);
	}

	public final IType getType() throws DOMException {
		return cf.getCompositeType((IIndexType)((ITypeContainer)type).getType());
	}

	public String toString() {
		try {
			return ASTTypeUtil.getType(getType());
		} catch (DOMException e) {
			return ""; //$NON-NLS-1$
		}
	}
}
