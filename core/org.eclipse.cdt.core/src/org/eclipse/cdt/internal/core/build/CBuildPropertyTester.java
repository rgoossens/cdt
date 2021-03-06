/*******************************************************************************
 * Copyright (c) 2016, QNX Software Systems and others
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.cdt.internal.core.build;

import org.eclipse.cdt.core.CCorePlugin;
import org.eclipse.cdt.core.build.ICBuildConfigurationManager;
import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;

public class CBuildPropertyTester extends PropertyTester {

	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		switch (property) {
		case "isSupported": //$NON-NLS-1$
			if (receiver instanceof IResource) {
				IProject project = ((IResource) receiver).getProject();
				try {
					return CCorePlugin.getService(ICBuildConfigurationManager.class).supports(project);
				} catch (CoreException e) {
					CCorePlugin.log(e.getStatus());
					return false;
				}
			}
			return false;
		default:
			return false;
		}
	}

}
