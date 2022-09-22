package org.a4j.presentation.ultrafast;

import one.microstream.integrations.cdi.types.Storage;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

@Storage
public class Galaxy {

    private final Set<CelestialBody> bodies = new HashSet<>();

    public void add(CelestialBody body) {
        Objects.requireNonNull(body, "body is not null");
        this.bodies.add(body);
    }


    public String getCelestialNames(){
        return bodies.stream()
                .map(CelestialBody::getName)
                .collect(Collectors.joining(","));
    }

    //Create
    //retrieve
    //update
    //delete
}
