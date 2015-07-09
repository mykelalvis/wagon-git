package net.trajano.wagon.git.test;

import java.io.IOException;

import net.trajano.wagon.git.GitWagon;

import org.apache.maven.wagon.StreamingWagonTestCase;
import org.apache.maven.wagon.authentication.AuthenticationInfo;
import org.junit.Ignore;

/**
 * Tests {@link GitWagon}. Note this test is ignored as it is specific to the
 * author. However, GitHubPagesWagon and GitWagon share most of their code
 * except the GitUri building logic.
 */
public class GitHubPagesWagonTest extends StreamingWagonTestCase {

	/**
	 * Protocol hint.
	 *
	 * @return "github"
	 */
	@Override
	protected String getProtocol() {

		return "github";
	}

	/**
	 * Unused in the tests.
	 */
	@Override
	protected int getTestRepositoryPort() {

		return 0;
	}

	/**
	 * An existing GitHub Pages repository. The test runner must have access to
	 * this URL to perform the test.
	 *
	 * @return an existing GitHub Pages repository.
	 */
	@Override
	protected String getTestRepositoryUrl() throws IOException {

		return "github:http://site.trajano.net/ZaWorld/";
	}

	/**
	 * Create a repository that has at least one commit.
	 */
	@Override
	protected void setupWagonTestingFixtures() throws Exception {

	}

	/**
	 * Unable to change how the timestamps are set, so getIfNewer is not
	 * testable.
	 */
	@Override
	protected boolean supportsGetIfNewer() {

		return false;
	}

	/**
	 * Remove the "remote" directory.
	 */
	@Override
	protected void tearDownWagonTestingFixtures() throws Exception {

	}

	
}
