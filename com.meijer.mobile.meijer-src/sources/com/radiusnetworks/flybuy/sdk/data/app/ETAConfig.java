package com.radiusnetworks.flybuy.sdk.data.app;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/app/ETAConfig;", "", "minimumETACacheInterval", "", "cacheFilterETASecondsMultiplier", "", "(ID)V", "getCacheFilterETASecondsMultiplier", "()D", "getMinimumETACacheInterval", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ETAConfig {
    private final double cacheFilterETASecondsMultiplier;
    private final int minimumETACacheInterval;

    public static /* synthetic */ ETAConfig copy$default(ETAConfig eTAConfig, int i10, double d10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = eTAConfig.minimumETACacheInterval;
        }
        if ((i11 & 2) != 0) {
            d10 = eTAConfig.cacheFilterETASecondsMultiplier;
        }
        return eTAConfig.copy(i10, d10);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMinimumETACacheInterval() {
        return this.minimumETACacheInterval;
    }

    /* renamed from: component2, reason: from getter */
    public final double getCacheFilterETASecondsMultiplier() {
        return this.cacheFilterETASecondsMultiplier;
    }

    public final ETAConfig copy(int minimumETACacheInterval, double cacheFilterETASecondsMultiplier) {
        return new ETAConfig(minimumETACacheInterval, cacheFilterETASecondsMultiplier);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ETAConfig)) {
            return false;
        }
        ETAConfig eTAConfig = (ETAConfig) other;
        return this.minimumETACacheInterval == eTAConfig.minimumETACacheInterval && Double.compare(this.cacheFilterETASecondsMultiplier, eTAConfig.cacheFilterETASecondsMultiplier) == 0;
    }

    public int hashCode() {
        return Double.hashCode(this.cacheFilterETASecondsMultiplier) + (Integer.hashCode(this.minimumETACacheInterval) * 31);
    }

    public String toString() {
        return "ETAConfig(minimumETACacheInterval=" + this.minimumETACacheInterval + ", cacheFilterETASecondsMultiplier=" + this.cacheFilterETASecondsMultiplier + ')';
    }

    public final double getCacheFilterETASecondsMultiplier() {
        return this.cacheFilterETASecondsMultiplier;
    }

    public final int getMinimumETACacheInterval() {
        return this.minimumETACacheInterval;
    }

    public ETAConfig(int i10, double d10) {
        this.minimumETACacheInterval = i10;
        this.cacheFilterETASecondsMultiplier = d10;
    }
}
