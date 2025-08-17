package com.google.maps.model;

import java.io.Serializable;

/* loaded from: classes7.dex */
public class FindPlaceFromText implements Serializable {
    private static final long serialVersionUID = 1;
    public PlacesSearchResult[] candidates;

    public String toString() {
        return String.format("[FindPlaceFromText %d candidates]", Integer.valueOf(this.candidates.length));
    }
}
