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
package org.eclipse.cdt.core.dom.ast.gnu.cpp;

import org.eclipse.cdt.core.dom.ast.cpp.ICPPASTPointerToMember;

/**
 * G++ Pointer 2 Members accept the restrict qualified as well.
 * 
 * @author jcamelon
 * @noimplement This interface is not intended to be implemented by clients.
 */
public interface IGPPASTPointerToMember extends IGPPASTPointer, ICPPASTPointerToMember {

	/**
	 * @since 5.1
	 */
	public IGPPASTPointerToMember copy();
}
