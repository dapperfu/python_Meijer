package com.google.maps.model;

import java.io.Serializable;

/* loaded from: classes7.dex */
public class PlacesSearchResponse implements Serializable {
    private static final long serialVersionUID = 1;
    public String[] htmlAttributions;
    public String nextPageToken;
    public PlacesSearchResult[] results;

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[PlacesSearchResponse: ");
        sb2.append(this.results.length);
        sb2.append(" results");
        if (this.nextPageToken != null) {
            sb2.append(", nextPageToken=");
            sb2.append(this.nextPageToken);
        }
        String[] strArr = this.htmlAttributions;
        if (strArr != null && strArr.length > 0) {
            sb2.append(", ");
            sb2.append(this.htmlAttributions.length);
            sb2.append(" htmlAttributions");
        }
        sb2.append("]");
        return sb2.toString();
    }
}
