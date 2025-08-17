package com.radiusnetworks.flybuy.api.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mg.InterfaceC15617c;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJD\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/NotifyConfig;", "", "defaultGeofenceRadiusMeters", "", "defaultSiteSearchRadiusMeters", "analyticsEventLimit", "sitesFetchLatitudePrecision", "sitesFetchLongitudePrecision", "(IIILjava/lang/Integer;Ljava/lang/Integer;)V", "getAnalyticsEventLimit", "()I", "getDefaultGeofenceRadiusMeters", "getDefaultSiteSearchRadiusMeters", "getSitesFetchLatitudePrecision", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSitesFetchLongitudePrecision", "component1", "component2", "component3", "component4", "component5", "copy", "(IIILjava/lang/Integer;Ljava/lang/Integer;)Lcom/radiusnetworks/flybuy/api/model/NotifyConfig;", "equals", "", "other", "hashCode", "toString", "", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class NotifyConfig {

    @InterfaceC15617c("analytics_event_limit")
    private final int analyticsEventLimit;

    @InterfaceC15617c("default_geofence_radius_meters")
    private final int defaultGeofenceRadiusMeters;

    @InterfaceC15617c("default_site_search_radius_meters")
    private final int defaultSiteSearchRadiusMeters;

    @InterfaceC15617c("sites_fetch_latitude_precision")
    private final Integer sitesFetchLatitudePrecision;

    @InterfaceC15617c("sites_fetch_longitude_precision")
    private final Integer sitesFetchLongitudePrecision;

    public NotifyConfig(int i10, int i11, int i12, Integer num, Integer num2) {
        this.defaultGeofenceRadiusMeters = i10;
        this.defaultSiteSearchRadiusMeters = i11;
        this.analyticsEventLimit = i12;
        this.sitesFetchLatitudePrecision = num;
        this.sitesFetchLongitudePrecision = num2;
    }

    public static /* synthetic */ NotifyConfig copy$default(NotifyConfig notifyConfig, int i10, int i11, int i12, Integer num, Integer num2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = notifyConfig.defaultGeofenceRadiusMeters;
        }
        if ((i13 & 2) != 0) {
            i11 = notifyConfig.defaultSiteSearchRadiusMeters;
        }
        if ((i13 & 4) != 0) {
            i12 = notifyConfig.analyticsEventLimit;
        }
        if ((i13 & 8) != 0) {
            num = notifyConfig.sitesFetchLatitudePrecision;
        }
        if ((i13 & 16) != 0) {
            num2 = notifyConfig.sitesFetchLongitudePrecision;
        }
        Integer num3 = num2;
        int i14 = i12;
        return notifyConfig.copy(i10, i11, i14, num, num3);
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
    public final Integer getSitesFetchLatitudePrecision() {
        return this.sitesFetchLatitudePrecision;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getSitesFetchLongitudePrecision() {
        return this.sitesFetchLongitudePrecision;
    }

    public final NotifyConfig copy(int defaultGeofenceRadiusMeters, int defaultSiteSearchRadiusMeters, int analyticsEventLimit, Integer sitesFetchLatitudePrecision, Integer sitesFetchLongitudePrecision) {
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
        return this.defaultGeofenceRadiusMeters == notifyConfig.defaultGeofenceRadiusMeters && this.defaultSiteSearchRadiusMeters == notifyConfig.defaultSiteSearchRadiusMeters && this.analyticsEventLimit == notifyConfig.analyticsEventLimit && Intrinsics.e(this.sitesFetchLatitudePrecision, notifyConfig.sitesFetchLatitudePrecision) && Intrinsics.e(this.sitesFetchLongitudePrecision, notifyConfig.sitesFetchLongitudePrecision);
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

    public final Integer getSitesFetchLatitudePrecision() {
        return this.sitesFetchLatitudePrecision;
    }

    public final Integer getSitesFetchLongitudePrecision() {
        return this.sitesFetchLongitudePrecision;
    }

    public int hashCode() {
        int iHashCode = (Integer.hashCode(this.analyticsEventLimit) + ((Integer.hashCode(this.defaultSiteSearchRadiusMeters) + (Integer.hashCode(this.defaultGeofenceRadiusMeters) * 31)) * 31)) * 31;
        Integer num = this.sitesFetchLatitudePrecision;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.sitesFetchLongitudePrecision;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "NotifyConfig(defaultGeofenceRadiusMeters=" + this.defaultGeofenceRadiusMeters + ", defaultSiteSearchRadiusMeters=" + this.defaultSiteSearchRadiusMeters + ", analyticsEventLimit=" + this.analyticsEventLimit + ", sitesFetchLatitudePrecision=" + this.sitesFetchLatitudePrecision + ", sitesFetchLongitudePrecision=" + this.sitesFetchLongitudePrecision + ')';
    }
}
