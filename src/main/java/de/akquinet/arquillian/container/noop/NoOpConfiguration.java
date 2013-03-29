package de.akquinet.arquillian.container.noop;

import org.jboss.arquillian.container.spi.ConfigurationException;
import org.jboss.as.arquillian.container.managed.ManagedContainerConfiguration;

/**
 * @author Alphonse Bendt
 */
public class NoOpConfiguration extends ManagedContainerConfiguration {
    @Override
    public void validate() throws ConfigurationException {
        System.err.println("No Op is ignoring all configuration!");
    }
}
