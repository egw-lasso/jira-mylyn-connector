/*******************************************************************************
 * Copyright (c) 2006 - 2006 Mylar eclipse.org project and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Mylar project committers - initial API and implementation
 *******************************************************************************/

package org.eclipse.mylar.internal.jira.ui.wizards;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.mylar.internal.jira.JiraServerFacade;
import org.eclipse.mylar.internal.jira.MylarJiraPlugin;
import org.eclipse.mylar.internal.tasklist.ui.wizards.AbstractRepositorySettingsPage;
import org.eclipse.swt.widgets.Composite;

/**
 * Wizard page used to specify a Jira repository address, username, and
 * password.
 * 
 * @author Wesley Coelho (initial integration patch)
 * @author Mik Kersten
 */
public class JiraRepositorySettingsPage extends AbstractRepositorySettingsPage {

	private static final String TITLE = "Jira Repository Settings";

	private static final String DESCRIPTION = "Example: http://developer.atlassian.com/jira";

	public JiraRepositorySettingsPage() {
		super(TITLE, DESCRIPTION);
	}

	/** Create a button to validate the specified repository settings */
	protected void createAdditionalControls(Composite parent) {
		// ignore
	}

	protected void validateSettings() {
		if (JiraServerFacade.getDefault().validateServerAndCredentials(super.serverUrlEditor.getStringValue(),
				getUserName(), getPassword())) {
			MessageDialog.openInformation(null, MylarJiraPlugin.TITLE_MESSAGE_DIALOG,
					"Valid Jira server found and your login was accepted.");
			super.getWizard().getContainer().updateButtons();
		} else {
			MessageDialog.openInformation(null, MylarJiraPlugin.TITLE_MESSAGE_DIALOG,
					"Could not connect to the Jira server, or the login was not accepted.");
		}
	}
}
