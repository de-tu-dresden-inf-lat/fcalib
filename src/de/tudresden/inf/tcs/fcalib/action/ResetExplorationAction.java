package de.tudresden.inf.tcs.fcalib.action;

import java.awt.event.ActionEvent;

import org.apache.log4j.Logger;

import de.tudresden.inf.tcs.fcalib.AbstractContext;
import de.tudresden.inf.tcs.fcalib.action.AbstractExpertAction;


/*
 * FCAlib: An open-source extensible library for Formal Concept Analysis 
 *         tool developers
 * Copyright (C) 2009  Baris Sertkaya
 *
 * This file is part of FCAlib.
 * FCAlib is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * FCAlib is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with FCAlib.  If not, see <http://www.gnu.org/licenses/>.
 */

/**
 * The expert action that resets the exploration. After this action, the context should be
 * ready for a fresh exploration.
 * @author Baris Sertkaya
 * Technische Universtaet Dresden
 * sertkaya@tcs.inf.tu-dresden.de
 */

public class ResetExplorationAction<A,O> extends AbstractExpertAction<A,O> {

	private static final long serialVersionUID = 1L;

	/**
	 * The logger.
	 */
	private static final Logger logger = Logger.getLogger(ResetExplorationAction.class);
	
	public ResetExplorationAction(AbstractContext<A,O> c) {
		// super(c);
		setContext(c);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		logger.info("=== Expert reset exploration ===");
		getContext().getAttributes().clear();
		getContext().clearObjects();
		getContext().getImplications().clear();
	}
}
