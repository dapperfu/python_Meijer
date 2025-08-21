package com.google.maps.model;

import java.io.Serializable;

/* loaded from: classes8.dex */
public class DistanceMatrixRow implements Serializable {
    private static final long serialVersionUID = 1;
    public DistanceMatrixElement[] elements;

    public String toString() {
        return String.format("[DistanceMatrixRow %d elements]", Integer.valueOf(this.elements.length));
    }
}
