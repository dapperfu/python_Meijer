package com.radiusnetworks.flybuy.sdk.pickup.data;

import androidx.annotation.Keep;
import kotlin.Metadata;

@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/pickup/data/LocationFilter;", "", "proximityToSite", "", "intervalSeconds", "", "priority", "smallestDisplacement", "(IFIF)V", "getIntervalSeconds", "()F", "getPriority", "()I", "getProximityToSite", "getSmallestDisplacement", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "pickup_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class LocationFilter {
    private final float intervalSeconds;
    private final int priority;
    private final int proximityToSite;
    private final float smallestDisplacement;

    public static /* synthetic */ LocationFilter copy$default(LocationFilter locationFilter, int i10, float f10, int i11, float f11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = locationFilter.proximityToSite;
        }
        if ((i12 & 2) != 0) {
            f10 = locationFilter.intervalSeconds;
        }
        if ((i12 & 4) != 0) {
            i11 = locationFilter.priority;
        }
        if ((i12 & 8) != 0) {
            f11 = locationFilter.smallestDisplacement;
        }
        return locationFilter.copy(i10, f10, i11, f11);
    }

    /* renamed from: component1, reason: from getter */
    public final int getProximityToSite() {
        return this.proximityToSite;
    }

    /* renamed from: component2, reason: from getter */
    public final float getIntervalSeconds() {
        return this.intervalSeconds;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPriority() {
        return this.priority;
    }

    /* renamed from: component4, reason: from getter */
    public final float getSmallestDisplacement() {
        return this.smallestDisplacement;
    }

    public final LocationFilter copy(int proximityToSite, float intervalSeconds, int priority, float smallestDisplacement) {
        return new LocationFilter(proximityToSite, intervalSeconds, priority, smallestDisplacement);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocationFilter)) {
            return false;
        }
        LocationFilter locationFilter = (LocationFilter) other;
        return this.proximityToSite == locationFilter.proximityToSite && Float.compare(this.intervalSeconds, locationFilter.intervalSeconds) == 0 && this.priority == locationFilter.priority && Float.compare(this.smallestDisplacement, locationFilter.smallestDisplacement) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.smallestDisplacement) + ((Integer.hashCode(this.priority) + ((Float.hashCode(this.intervalSeconds) + (Integer.hashCode(this.proximityToSite) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "LocationFilter(proximityToSite=" + this.proximityToSite + ", intervalSeconds=" + this.intervalSeconds + ", priority=" + this.priority + ", smallestDisplacement=" + this.smallestDisplacement + ')';
    }

    public final float getIntervalSeconds() {
        return this.intervalSeconds;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final int getProximityToSite() {
        return this.proximityToSite;
    }

    public final float getSmallestDisplacement() {
        return this.smallestDisplacement;
    }

    public LocationFilter(int i10, float f10, int i11, float f11) {
        this.proximityToSite = i10;
        this.intervalSeconds = f10;
        this.priority = i11;
        this.smallestDisplacement = f11;
    }
}
