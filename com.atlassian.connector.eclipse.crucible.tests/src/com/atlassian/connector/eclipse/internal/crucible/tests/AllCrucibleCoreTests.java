package com.atlassian.connector.eclipse.internal.crucible.tests;

import com.atlassian.connector.eclipse.internal.crucible.core.CrucibleClientManagerTest;
import com.atlassian.connector.eclipse.internal.crucible.core.CrucibleRepositoryConnectorTest;
import com.atlassian.connector.eclipse.internal.crucible.core.CrucibleTaskMapperTest;
import com.atlassian.connector.eclipse.internal.crucible.core.CrucibleUtilTest;
import com.atlassian.connector.eclipse.internal.crucible.core.VersionedCommentDateComparatorTest;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * All of the Crucible tests for the Atlassian Eclipse Connector can be run from this class
 * 
 * @author Shawn Minto
 */
public final class AllCrucibleCoreTests {

	// TODO test the cache - cache a partial review
	// TODO test CrucibleServerCfg equals and hashcode

	private AllCrucibleCoreTests() {
	}

	public static Test suite() {

		TestSuite suite = new TestSuite("Tests for Crucible");
		// $JUnit-BEGIN$

		suite.addTestSuite(CrucibleClientManagerTest.class);
		suite.addTestSuite(CrucibleRepositoryConnectorTest.class);
		suite.addTestSuite(CrucibleUtilTest.class);
		suite.addTestSuite(VersionedCommentDateComparatorTest.class);
		suite.addTestSuite(CrucibleClientManagerTest.class);
		suite.addTestSuite(CrucibleTaskMapperTest.class);

		// $JUnit-END$
		return suite;
	}
}
