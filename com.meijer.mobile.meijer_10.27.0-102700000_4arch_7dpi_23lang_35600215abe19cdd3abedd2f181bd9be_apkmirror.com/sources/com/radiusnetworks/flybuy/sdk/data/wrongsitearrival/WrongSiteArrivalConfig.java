package com.radiusnetworks.flybuy.sdk.data.wrongsitearrival;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J:\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/wrongsitearrival/WrongSiteArrivalConfig;", "", "siteLimit", "", "worstAccuracyLimit", "", "sitesFetchLatitudePrecision", "sitesFetchLongitudePrecision", "(Ljava/lang/Integer;Ljava/lang/Double;II)V", "getSiteLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSitesFetchLatitudePrecision", "()I", "getSitesFetchLongitudePrecision", "getWorstAccuracyLimit", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Double;II)Lcom/radiusnetworks/flybuy/sdk/data/wrongsitearrival/WrongSiteArrivalConfig;", "equals", "", "other", "hashCode", "toString", "", "Companion", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class WrongSiteArrivalConfig {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final WrongSiteArrivalConfig DEFAULT_CONFIG = new WrongSiteArrivalConfig(10, Double.valueOf(250.0d), 3, 3);
    public static final int DEFAULT_GEO_PRECISION = 3;
    public static final int SITES_DEFAULT_PER = 10;
    public static final double WORST_ACCURACY_LIMIT = 250.0d;
    private final Integer siteLimit;
    private final int sitesFetchLatitudePrecision;
    private final int sitesFetchLongitudePrecision;
    private final Double worstAccuracyLimit;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/wrongsitearrival/WrongSiteArrivalConfig$Companion;", "", "()V", "DEFAULT_CONFIG", "Lcom/radiusnetworks/flybuy/sdk/data/wrongsitearrival/WrongSiteArrivalConfig;", "getDEFAULT_CONFIG", "()Lcom/radiusnetworks/flybuy/sdk/data/wrongsitearrival/WrongSiteArrivalConfig;", "DEFAULT_GEO_PRECISION", "", "SITES_DEFAULT_PER", "WORST_ACCURACY_LIMIT", "", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WrongSiteArrivalConfig getDEFAULT_CONFIG() {
            return WrongSiteArrivalConfig.DEFAULT_CONFIG;
        }
    }

    public static /* synthetic */ WrongSiteArrivalConfig copy$default(WrongSiteArrivalConfig wrongSiteArrivalConfig, Integer num, Double d10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            num = wrongSiteArrivalConfig.siteLimit;
        }
        if ((i12 & 2) != 0) {
            d10 = wrongSiteArrivalConfig.worstAccuracyLimit;
        }
        if ((i12 & 4) != 0) {
            i10 = wrongSiteArrivalConfig.sitesFetchLatitudePrecision;
        }
        if ((i12 & 8) != 0) {
            i11 = wrongSiteArrivalConfig.sitesFetchLongitudePrecision;
        }
        return wrongSiteArrivalConfig.copy(num, d10, i10, i11);
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
    public final int getSitesFetchLatitudePrecision() {
        return this.sitesFetchLatitudePrecision;
    }

    /* renamed from: component4, reason: from getter */
    public final int getSitesFetchLongitudePrecision() {
        return this.sitesFetchLongitudePrecision;
    }

    public final WrongSiteArrivalConfig copy(Integer siteLimit, Double worstAccuracyLimit, int sitesFetchLatitudePrecision, int sitesFetchLongitudePrecision) {
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
        return Intrinsics.e(this.siteLimit, wrongSiteArrivalConfig.siteLimit) && Intrinsics.e(this.worstAccuracyLimit, wrongSiteArrivalConfig.worstAccuracyLimit) && this.sitesFetchLatitudePrecision == wrongSiteArrivalConfig.sitesFetchLatitudePrecision && this.sitesFetchLongitudePrecision == wrongSiteArrivalConfig.sitesFetchLongitudePrecision;
    }

    public int hashCode() {
        Integer num = this.siteLimit;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Double d10 = this.worstAccuracyLimit;
        return Integer.hashCode(this.sitesFetchLongitudePrecision) + ((Integer.hashCode(this.sitesFetchLatitudePrecision) + ((iHashCode + (d10 != null ? d10.hashCode() : 0)) * 31)) * 31);
    }

    public String toString() {
        return "WrongSiteArrivalConfig(siteLimit=" + this.siteLimit + ", worstAccuracyLimit=" + this.worstAccuracyLimit + ", sitesFetchLatitudePrecision=" + this.sitesFetchLatitudePrecision + ", sitesFetchLongitudePrecision=" + this.sitesFetchLongitudePrecision + ')';
    }

    public final Integer getSiteLimit() {
        return this.siteLimit;
    }

    public final int getSitesFetchLatitudePrecision() {
        return this.sitesFetchLatitudePrecision;
    }

    public final int getSitesFetchLongitudePrecision() {
        return this.sitesFetchLongitudePrecision;
    }

    public final Double getWorstAccuracyLimit() {
        return this.worstAccuracyLimit;
    }

    public WrongSiteArrivalConfig(Integer num, Double d10, int i10, int i11) {
        this.siteLimit = num;
        this.worstAccuracyLimit = d10;
        this.sitesFetchLatitudePrecision = i10;
        this.sitesFetchLongitudePrecision = i11;
    }
}
