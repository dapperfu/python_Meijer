package com.radiusnetworks.flybuy.api.mapbox.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/radiusnetworks/flybuy/api/mapbox/model/SearchBoxFeature;", "", "properties", "Lcom/radiusnetworks/flybuy/api/mapbox/model/SearchBoxProperties;", "(Lcom/radiusnetworks/flybuy/api/mapbox/model/SearchBoxProperties;)V", "getProperties", "()Lcom/radiusnetworks/flybuy/api/mapbox/model/SearchBoxProperties;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SearchBoxFeature {
    private final SearchBoxProperties properties;

    public static /* synthetic */ SearchBoxFeature copy$default(SearchBoxFeature searchBoxFeature, SearchBoxProperties searchBoxProperties, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            searchBoxProperties = searchBoxFeature.properties;
        }
        return searchBoxFeature.copy(searchBoxProperties);
    }

    /* renamed from: component1, reason: from getter */
    public final SearchBoxProperties getProperties() {
        return this.properties;
    }

    public final SearchBoxFeature copy(SearchBoxProperties properties) {
        Intrinsics.j(properties, "properties");
        return new SearchBoxFeature(properties);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SearchBoxFeature) && Intrinsics.e(this.properties, ((SearchBoxFeature) other).properties);
    }

    public int hashCode() {
        return this.properties.hashCode();
    }

    public String toString() {
        return "SearchBoxFeature(properties=" + this.properties + ')';
    }

    public SearchBoxFeature(SearchBoxProperties properties) {
        Intrinsics.j(properties, "properties");
        this.properties = properties;
    }

    public final SearchBoxProperties getProperties() {
        return this.properties;
    }
}
