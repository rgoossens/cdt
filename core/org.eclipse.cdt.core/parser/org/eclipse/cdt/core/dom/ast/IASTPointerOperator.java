/*******************************************************************************
 * Copyright (c) 2004, 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * IBM - Initial API and implementation
 *******************************************************************************/
package org.eclipse.cdt.core.dom.ast;

/**
 * @author Doug Schaefer
 * @noimplement This interface is not intended to be implemented by clients.
 */
public interface IASTPointerOperator extends IASTNode {

	/**
	 * Constant/sentinel.
	 */
	public static final IASTPointerOperator[] EMPTY_ARRAY = new IASTPointerOperator[0];

	/**
	 * @since 5.1
	 */
	public IASTPointerOperator copy();
}
