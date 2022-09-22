package org.a4j.presentation.ultrafast;

import one.microstream.integrations.cdi.types.Store;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class GalaxyService {

    @Inject
    private Galaxy galaxy;

    @Store
    public void add(CelestialBody body) {
        this.galaxy.add(body);
    }

    public String getNames() {
        return this.galaxy.getCelestialNames();
    }
}
