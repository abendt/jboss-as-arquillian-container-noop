package de.akquinet.arquillian.container.noop;

import org.jboss.arquillian.container.spi.client.container.DeployableContainer;
import org.jboss.arquillian.container.spi.client.container.DeploymentException;
import org.jboss.arquillian.container.spi.client.container.LifecycleException;
import org.jboss.arquillian.container.spi.client.protocol.ProtocolDescription;
import org.jboss.arquillian.container.spi.client.protocol.metadata.ProtocolMetaData;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.descriptor.api.Descriptor;

import java.util.logging.Logger;

/**
 * @author Alphonse Bendt
 */
public class NoOpContainer implements DeployableContainer<NoOpConfiguration> {

    private static final Logger LOG = Logger.getLogger(NoOpContainer.class.getName());

    @Override
    public Class getConfigurationClass() {
        return NoOpConfiguration.class;
    }

    @Override
    public void setup(NoOpConfiguration configuration) {
    }

    @Override
    public void start() throws LifecycleException {
        LOG.info("skipping container start.");
    }

    @Override
    public void stop() throws LifecycleException {
    }

    @Override
    public ProtocolDescription getDefaultProtocol() {
        return null;
    }

    @Override
    public ProtocolMetaData deploy(Archive<?> archive) throws DeploymentException {
        LOG.info("skipping deploy.");
        return new ProtocolMetaData();
    }

    @Override
    public void undeploy(Archive<?> archive) throws DeploymentException {
    }

    @Override
    public void deploy(Descriptor descriptor) throws DeploymentException {
    }

    @Override
    public void undeploy(Descriptor descriptor) throws DeploymentException {
    }
}
