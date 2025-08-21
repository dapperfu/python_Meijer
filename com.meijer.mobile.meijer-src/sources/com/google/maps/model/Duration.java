package com.google.maps.model;

import java.io.Serializable;

/* loaded from: classes8.dex */
public class Duration implements Serializable {
    private static final long serialVersionUID = 1;
    public String humanReadable;
    public long inSeconds;

    public String toString() {
        return this.humanReadable;
    }
}
