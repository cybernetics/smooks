/*
	Milyn - Copyright (C) 2006 - 2010

	This library is free software; you can redistribute it and/or
	modify it under the terms of the GNU Lesser General Public
	License (version 2.1) as published by the Free Software
	Foundation.

	This library is distributed in the hope that it will be useful,
	but WITHOUT ANY WARRANTY; without even the implied warranty of
	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.

	See the GNU Lesser General Public License for more details:
	http://www.gnu.org/licenses/lgpl.txt
*/
package org.smooks.persistence.config.ext;

import org.smooks.SmooksException;
import org.smooks.container.ExecutionContext;
import org.smooks.delivery.dom.DOMVisitBefore;

import org.w3c.dom.Element;

/**
 * @author <a href="mailto:maurice.zeijen@smies.com">maurice.zeijen@smies.com</a>
 *
 */
public class ParameterIndexInitializer implements DOMVisitBefore {

	public static String PARAMETER_INDEX = ParameterIndexInitializer.class.getName() + "#PARAMETER_INDEX";

	/* (non-Javadoc)
	 * @see org.smooks.delivery.dom.DOMVisitBefore#visitBefore(org.w3c.dom.Element, org.smooks.container.ExecutionContext)
	 */
	public void visitBefore(Element element, ExecutionContext executionContext)	throws SmooksException {

		executionContext.setAttribute(PARAMETER_INDEX, new Integer(0));

	}

}