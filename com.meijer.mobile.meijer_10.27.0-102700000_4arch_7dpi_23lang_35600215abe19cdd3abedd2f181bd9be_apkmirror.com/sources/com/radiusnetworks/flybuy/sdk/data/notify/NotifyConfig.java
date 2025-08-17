package com.radiusnetworks.flybuy.sdk.data.notify;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/notify/NotifyConfig;", "", "defaultGeofenceRadiusMeters", "", "defaultSiteSearchRadiusMeters", "analyticsEventLimit", "sitesFetchLatitudePrecision", "sitesFetchLongitudePrecision", "(IIIII)V", "getAnalyticsEventLimit", "()I", "getDefaultGeofenceRadiusMeters", "getDefaultSiteSearchRadiusMeters", "getSitesFetchLatitudePrecision", "getSitesFetchLongitudePrecision", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class NotifyConfig {
    public static final int DEFAULT_GEO_PRECISION = 3;
    private final int analyticsEventLimit;
    private final int defaultGeofenceRadiusMeters;
    private final int defaultSiteSearchRadiusMeters;
    private final int sitesFetchLatitudePrecision;
    private final int sitesFetchLongitudePrecision;

    public static /* synthetic */ NotifyConfig copy$default(NotifyConfig notifyConfig, int i10, int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i10 = notifyConfig.defaultGeofenceRadiusMeters;
        }
        if ((i15 & 2) != 0) {
            i11 = notifyConfig.defaultSiteSearchRadiusMeters;
        }
        if ((i15 & 4) != 0) {
            i12 = notifyConfig.analyticsEventLimit;
        }
        if ((i15 & 8) != 0) {
            i13 = notifyConfig.sitesFetchLatitudePrecision;
        }
        if ((i15 & 16) != 0) {
            i14 = notifyConfig.sitesFetchLongitudePrecision;
        }
        int i16 = i14;
        int i17 = i12;
        return notifyConfig.copy(i10, i11, i17, i13, i16);
    }

    /* renamed from: component1, reason: from getter */
    public final int getDefaultGeofenceRadiusMeters() {
        return this.defaultGeofenceRadiusMeters;
    }

    /* renamed from: component2, reason: from getter */
    public final int getDefaultSiteSearchRadiusMeters() {
        return this.defaultSiteSearchRadiusMeters;
    }

    /* renamed from: component3, reason: from getter */
    public final int getAnalyticsEventLimit() {
        return this.analyticsEventLimit;
    }

    /* renamed from: component4, reason: from getter */
    public final int getSitesFetchLatitudePrecision() {
        return this.sitesFetchLatitudePrecision;
    }

    /* renamed from: component5, reason: from getter */
    public final int getSitesFetchLongitudePrecision() {
        return this.sitesFetchLongitudePrecision;
    }

    public final NotifyConfig copy(int defaultGeofenceRadiusMeters, int defaultSiteSearchRadiusMeters, int analyticsEventLimit, int sitesFetchLatitudePrecision, int sitesFetchLongitudePrecision) {
        return new NotifyConfig(defaultGeofenceRadiusMeters, defaultSiteSearchRadiusMeters, analyticsEventLimit, sitesFetchLatitudePrecision, sitesFetchLongitudePrecision);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotifyConfig)) {
            return false;
        }
        NotifyConfig notifyConfig = (NotifyConfig) other;
        return this.defaultGeofenceRadiusMeters == notifyConfig.defaultGeofenceRadiusMeters && this.defaultSiteSearchRadiusMeters == notifyConfig.defaultSiteSearchRadiusMeters && this.analyticsEventLimit == notifyConfig.analyticsEventLimit && this.sitesFetchLatitudePrecision == notifyConfig.sitesFetchLatitudePrecision && this.sitesFetchLongitudePrecision == notifyConfig.sitesFetchLongitudePrecision;
    }

    public int hashCode() {
        return Integer.hashCode(this.sitesFetchLongitudePrecision) + ((Integer.hashCode(this.sitesFetchLatitudePrecision) + ((Integer.hashCode(this.analyticsEventLimit) + ((Integer.hashCode(this.defaultSiteSearchRadiusMeters) + (Integer.hashCode(this.defaultGeofenceRadiusMeters) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "NotifyConfig(defaultGeofenceRadiusMeters=" + this.defaultGeofenceRadiusMeters + ", defaultSiteSearchRadiusMeters=" + this.defaultSiteSearchRadiusMeters + ", analyticsEventLimit=" + this.analyticsEventLimit + ", sitesFetchLatitudePrecision=" + this.sitesFetchLatitudePrecision + ", sitesFetchLongitudePrecision=" + this.sitesFetchLongitudePrecision + ')';
    }

    public final int getAnalyticsEventLimit() {
        return this.analyticsEventLimit;
    }

    public final int getDefaultGeofenceRadiusMeters() {
        return this.defaultGeofenceRadiusMeters;
    }

    public final int getDefaultSiteSearchRadiusMeters() {
        return this.defaultSiteSearchRadiusMeters;
    }

    public final int getSitesFetchLatitudePrecision() {
        return this.sitesFetchLatitudePrecision;
    }

    public final int getSitesFetchLongitudePrecision() {
        return this.sitesFetchLongitudePrecision;
    }

    public NotifyConfig(int i10, int i11, int i12, int i13, int i14) {
        this.defaultGeofenceRadiusMeters = i10;
        this.defaultSiteSearchRadiusMeters = i11;
        this.analyticsEventLimit = i12;
        this.sitesFetchLatitudePrecision = i13;
        this.sitesFetchLongitudePrecision = i14;
    }
}
