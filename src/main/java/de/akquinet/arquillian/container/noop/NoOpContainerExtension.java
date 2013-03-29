package de.akquinet.arquillian.container.noop;

import org.jboss.arquillian.container.spi.client.container.DeployableContainer;
import org.jboss.arquillian.core.spi.LoadableExtension;
import org.jboss.as.arquillian.container.managed.ManagedContainerExtension;

/**
 * @author Alphonse Bendt
 */
public class NoOpContainerExtension implements LoadableExtension {
    @Override
    public void register(ExtensionBuilder builder) {
        boolean noop = Boolean.parseBoolean(System.getProperty("arquillian.noop", "false"));

        if (noop) {
            builder.service(DeployableContainer.class, NoOpContainer.class);
        } else {
            new ManagedContainerExtension().register(builder);
        }
    }
}
