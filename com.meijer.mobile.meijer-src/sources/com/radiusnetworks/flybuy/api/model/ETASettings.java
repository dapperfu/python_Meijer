package com.radiusnetworks.flybuy.api.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import og.InterfaceC16127c;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/ETASettings;", "", "minimumETACacheInterval", "", "cacheFilterETASecondsMultiplier", "", "(Ljava/lang/Integer;Ljava/lang/Double;)V", "getCacheFilterETASecondsMultiplier", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getMinimumETACacheInterval", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/Double;)Lcom/radiusnetworks/flybuy/api/model/ETASettings;", "equals", "", "other", "hashCode", "toString", "", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ETASettings {

    @InterfaceC16127c("cache_filter_eta_seconds_multiplier")
    private final Double cacheFilterETASecondsMultiplier;

    @InterfaceC16127c("minimum_eta_cache_interval")
    private final Integer minimumETACacheInterval;

    /* JADX WARN: Multi-variable type inference failed */
    public ETASettings() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ETASettings copy$default(ETASettings eTASettings, Integer num, Double d10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = eTASettings.minimumETACacheInterval;
        }
        if ((i10 & 2) != 0) {
            d10 = eTASettings.cacheFilterETASecondsMultiplier;
        }
        return eTASettings.copy(num, d10);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getMinimumETACacheInterval() {
        return this.minimumETACacheInterval;
    }

    /* renamed from: component2, reason: from getter */
    public final Double getCacheFilterETASecondsMultiplier() {
        return this.cacheFilterETASecondsMultiplier;
    }

    public final ETASettings copy(Integer minimumETACacheInterval, Double cacheFilterETASecondsMultiplier) {
        return new ETASettings(minimumETACacheInterval, cacheFilterETASecondsMultiplier);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ETASettings)) {
            return false;
        }
        ETASettings eTASettings = (ETASettings) other;
        return Intrinsics.e(this.minimumETACacheInterval, eTASettings.minimumETACacheInterval) && Intrinsics.e(this.cacheFilterETASecondsMultiplier, eTASettings.cacheFilterETASecondsMultiplier);
    }

    public int hashCode() {
        Integer num = this.minimumETACacheInterval;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Double d10 = this.cacheFilterETASecondsMultiplier;
        return iHashCode + (d10 != null ? d10.hashCode() : 0);
    }

    public String toString() {
        return "ETASettings(minimumETACacheInterval=" + this.minimumETACacheInterval + ", cacheFilterETASecondsMultiplier=" + this.cacheFilterETASecondsMultiplier + ')';
    }

    public ETASettings(Integer num, Double d10) {
        this.minimumETACacheInterval = num;
        this.cacheFilterETASecondsMultiplier = d10;
    }

    public final Double getCacheFilterETASecondsMultiplier() {
        return this.cacheFilterETASecondsMultiplier;
    }

    public final Integer getMinimumETACacheInterval() {
        return this.minimumETACacheInterval;
    }

    public /* synthetic */ ETASettings(Integer num, Double d10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : d10);
    }
}
