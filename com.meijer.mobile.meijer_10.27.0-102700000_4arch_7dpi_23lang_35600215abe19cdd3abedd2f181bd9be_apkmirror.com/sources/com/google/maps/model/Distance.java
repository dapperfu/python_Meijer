package com.google.maps.model;

import java.io.Serializable;

/* loaded from: classes7.dex */
public class Distance implements Serializable {
    private static final long serialVersionUID = 1;
    public String humanReadable;
    public long inMeters;

    public String toString() {
        return this.humanReadable;
    }
}
