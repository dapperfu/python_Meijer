package com.radiusnetworks.flybuy.api.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import og.InterfaceC16127c;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ>\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\nR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/WrongSiteArrivalConfig;", "", "siteLimit", "", "worstAccuracyLimit", "", "sitesFetchLatitudePrecision", "sitesFetchLongitudePrecision", "(Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getSiteLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSitesFetchLatitudePrecision", "getSitesFetchLongitudePrecision", "getWorstAccuracyLimit", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/radiusnetworks/flybuy/api/model/WrongSiteArrivalConfig;", "equals", "", "other", "hashCode", "toString", "", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class WrongSiteArrivalConfig {

    @InterfaceC16127c("site_limit")
    private final Integer siteLimit;

    @InterfaceC16127c("sites_fetch_latitude_precision")
    private final Integer sitesFetchLatitudePrecision;

    @InterfaceC16127c("sites_fetch_longitude_precision")
    private final Integer sitesFetchLongitudePrecision;

    @InterfaceC16127c("worst_accuracy_limit")
    private final Double worstAccuracyLimit;

    public static /* synthetic */ WrongSiteArrivalConfig copy$default(WrongSiteArrivalConfig wrongSiteArrivalConfig, Integer num, Double d10, Integer num2, Integer num3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = wrongSiteArrivalConfig.siteLimit;
        }
        if ((i10 & 2) != 0) {
            d10 = wrongSiteArrivalConfig.worstAccuracyLimit;
        }
        if ((i10 & 4) != 0) {
            num2 = wrongSiteArrivalConfig.sitesFetchLatitudePrecision;
        }
        if ((i10 & 8) != 0) {
            num3 = wrongSiteArrivalConfig.sitesFetchLongitudePrecision;
        }
        return wrongSiteArrivalConfig.copy(num, d10, num2, num3);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getSiteLimit() {
        return this.siteLimit;
    }

    /* renamed from: component2, reason: from getter */
    public final Double getWorstAccuracyLimit() {
        return this.worstAccuracyLimit;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getSitesFetchLatitudePrecision() {
        return this.sitesFetchLatitudePrecision;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getSitesFetchLongitudePrecision() {
        return this.sitesFetchLongitudePrecision;
    }

    public final WrongSiteArrivalConfig copy(Integer siteLimit, Double worstAccuracyLimit, Integer sitesFetchLatitudePrecision, Integer sitesFetchLongitudePrecision) {
        return new WrongSiteArrivalConfig(siteLimit, worstAccuracyLimit, sitesFetchLatitudePrecision, sitesFetchLongitudePrecision);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WrongSiteArrivalConfig)) {
            return false;
        }
        WrongSiteArrivalConfig wrongSiteArrivalConfig = (WrongSiteArrivalConfig) other;
        return Intrinsics.e(this.siteLimit, wrongSiteArrivalConfig.siteLimit) && Intrinsics.e(this.worstAccuracyLimit, wrongSiteArrivalConfig.worstAccuracyLimit) && Intrinsics.e(this.sitesFetchLatitudePrecision, wrongSiteArrivalConfig.sitesFetchLatitudePrecision) && Intrinsics.e(this.sitesFetchLongitudePrecision, wrongSiteArrivalConfig.sitesFetchLongitudePrecision);
    }

    public int hashCode() {
        Integer num = this.siteLimit;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Double d10 = this.worstAccuracyLimit;
        int iHashCode2 = (iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Integer num2 = this.sitesFetchLatitudePrecision;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.sitesFetchLongitudePrecision;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public String toString() {
        return "WrongSiteArrivalConfig(siteLimit=" + this.siteLimit + ", worstAccuracyLimit=" + this.worstAccuracyLimit + ", sitesFetchLatitudePrecision=" + this.sitesFetchLatitudePrecision + ", sitesFetchLongitudePrecision=" + this.sitesFetchLongitudePrecision + ')';
    }

    public final Integer getSiteLimit() {
        return this.siteLimit;
    }

    public final Integer getSitesFetchLatitudePrecision() {
        return this.sitesFetchLatitudePrecision;
    }

    public final Integer getSitesFetchLongitudePrecision() {
        return this.sitesFetchLongitudePrecision;
    }

    public final Double getWorstAccuracyLimit() {
        return this.worstAccuracyLimit;
    }

    public WrongSiteArrivalConfig(Integer num, Double d10, Integer num2, Integer num3) {
        this.siteLimit = num;
        this.worstAccuracyLimit = d10;
        this.sitesFetchLatitudePrecision = num2;
        this.sitesFetchLongitudePrecision = num3;
    }
}
