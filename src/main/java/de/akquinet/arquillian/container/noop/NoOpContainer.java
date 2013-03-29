package de.akquinet.arquillian.container.noop;

import org.jboss.arquillian.container.spi.client.container.ContainerConfiguration;
import org.jboss.arquillian.container.spi.client.container.DeployableContainer;
import org.jboss.arquillian.container.spi.client.container.DeploymentException;
import org.jboss.arquillian.container.spi.client.container.LifecycleException;
import org.jboss.arquillian.container.spi.client.protocol.ProtocolDescription;
import org.jboss.arquillian.container.spi.client.protocol.metadata.ProtocolMetaData;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.descriptor.api.Descriptor;

/**
 * @author Alphonse Bendt
 */
public class NoOpContainer implements DeployableContainer<NoOpConfiguration> {

    @Override
    public Class getConfigurationClass() {
        return NoOpConfiguration.class;
    }

    @Override
    public void setup(NoOpConfiguration configuration) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void start() throws LifecycleException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void stop() throws LifecycleException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ProtocolDescription getDefaultProtocol() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ProtocolMetaData deploy(Archive<?> archive) throws DeploymentException {
        return new ProtocolMetaData();
    }

    @Override
    public void undeploy(Archive<?> archive) throws DeploymentException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void deploy(Descriptor descriptor) throws DeploymentException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void undeploy(Descriptor descriptor) throws DeploymentException {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
