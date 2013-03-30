package de.akquinet.arquillian.container.noop;

import org.jboss.arquillian.container.spi.ConfigurationException;
import org.jboss.as.arquillian.container.managed.ManagedContainerConfiguration;

import java.util.logging.Logger;

/**
 * @author Alphonse Bendt
 */
public class NoOpConfiguration extends ManagedContainerConfiguration {

    private static final Logger LOG = Logger.getLogger(NoOpConfiguration.class.getName());

    @Override
    public void validate() throws ConfigurationException {
        LOG.info("skipping configuration");
    }
}
