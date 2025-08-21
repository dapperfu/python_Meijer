package com.google.maps.model;

import java.io.Serializable;

/* loaded from: classes8.dex */
public class PlaceEditorialSummary implements Serializable {
    private static final long serialVersionUID = 1;
    public String language;
    public String overview;

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[EditorialSummary: ");
        if (this.language != null) {
            sb2.append("language=");
            sb2.append(this.language);
            sb2.append(", ");
        }
        if (this.overview != null) {
            sb2.append("overview=");
            sb2.append(this.overview);
        }
        sb2.append("]");
        return sb2.toString();
    }
}
