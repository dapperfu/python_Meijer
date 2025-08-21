package com.radiusnetworks.flybuy.sdk.pickup.eta;

import androidx.annotation.Keep;
import j$.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J<\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u001a\u0010\u001a\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u001fR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010#R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010\u0010\"\u0004\b&\u0010'R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010\u0012\"\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/pickup/eta/ETAData;", "", "", "lastComputedETASeconds", "j$/time/Instant", "lastETAFetchedAt", "cachedETAExpirySeconds", "", "directionsFailed", "<init>", "(Ljava/lang/Integer;Lj$/time/Instant;IZ)V", "component1", "()Ljava/lang/Integer;", "component2", "()Lj$/time/Instant;", "component3", "()I", "component4", "()Z", "copy", "(Ljava/lang/Integer;Lj$/time/Instant;IZ)Lcom/radiusnetworks/flybuy/sdk/pickup/eta/ETAData;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getLastComputedETASeconds", "setLastComputedETASeconds", "(Ljava/lang/Integer;)V", "Lj$/time/Instant;", "getLastETAFetchedAt", "setLastETAFetchedAt", "(Lj$/time/Instant;)V", "I", "getCachedETAExpirySeconds", "setCachedETAExpirySeconds", "(I)V", "Z", "getDirectionsFailed", "setDirectionsFailed", "(Z)V", "pickup_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ETAData {
    private int cachedETAExpirySeconds;
    private boolean directionsFailed;
    private Integer lastComputedETASeconds;
    private Instant lastETAFetchedAt;

    public ETAData() {
        this(null, null, 0, false, 15, null);
    }

    public static /* synthetic */ ETAData copy$default(ETAData eTAData, Integer num, Instant instant, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = eTAData.lastComputedETASeconds;
        }
        if ((i11 & 2) != 0) {
            instant = eTAData.lastETAFetchedAt;
        }
        if ((i11 & 4) != 0) {
            i10 = eTAData.cachedETAExpirySeconds;
        }
        if ((i11 & 8) != 0) {
            z10 = eTAData.directionsFailed;
        }
        return eTAData.copy(num, instant, i10, z10);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getLastComputedETASeconds() {
        return this.lastComputedETASeconds;
    }

    /* renamed from: component2, reason: from getter */
    public final Instant getLastETAFetchedAt() {
        return this.lastETAFetchedAt;
    }

    /* renamed from: component3, reason: from getter */
    public final int getCachedETAExpirySeconds() {
        return this.cachedETAExpirySeconds;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getDirectionsFailed() {
        return this.directionsFailed;
    }

    public final ETAData copy(Integer lastComputedETASeconds, Instant lastETAFetchedAt, int cachedETAExpirySeconds, boolean directionsFailed) {
        return new ETAData(lastComputedETASeconds, lastETAFetchedAt, cachedETAExpirySeconds, directionsFailed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ETAData)) {
            return false;
        }
        ETAData eTAData = (ETAData) other;
        return Intrinsics.e(this.lastComputedETASeconds, eTAData.lastComputedETASeconds) && Intrinsics.e(this.lastETAFetchedAt, eTAData.lastETAFetchedAt) && this.cachedETAExpirySeconds == eTAData.cachedETAExpirySeconds && this.directionsFailed == eTAData.directionsFailed;
    }

    public int hashCode() {
        Integer num = this.lastComputedETASeconds;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Instant instant = this.lastETAFetchedAt;
        return Boolean.hashCode(this.directionsFailed) + ((Integer.hashCode(this.cachedETAExpirySeconds) + ((iHashCode + (instant != null ? instant.hashCode() : 0)) * 31)) * 31);
    }

    public String toString() {
        return "ETAData(lastComputedETASeconds=" + this.lastComputedETASeconds + ", lastETAFetchedAt=" + this.lastETAFetchedAt + ", cachedETAExpirySeconds=" + this.cachedETAExpirySeconds + ", directionsFailed=" + this.directionsFailed + ')';
    }

    public ETAData(Integer num, Instant instant, int i10, boolean z10) {
        this.lastComputedETASeconds = num;
        this.lastETAFetchedAt = instant;
        this.cachedETAExpirySeconds = i10;
        this.directionsFailed = z10;
    }

    public final int getCachedETAExpirySeconds() {
        return this.cachedETAExpirySeconds;
    }

    public final boolean getDirectionsFailed() {
        return this.directionsFailed;
    }

    public final Integer getLastComputedETASeconds() {
        return this.lastComputedETASeconds;
    }

    public final Instant getLastETAFetchedAt() {
        return this.lastETAFetchedAt;
    }

    public final void setCachedETAExpirySeconds(int i10) {
        this.cachedETAExpirySeconds = i10;
    }

    public final void setDirectionsFailed(boolean z10) {
        this.directionsFailed = z10;
    }

    public final void setLastComputedETASeconds(Integer num) {
        this.lastComputedETASeconds = num;
    }

    public final void setLastETAFetchedAt(Instant instant) {
        this.lastETAFetchedAt = instant;
    }

    public /* synthetic */ ETAData(Integer num, Instant instant, int i10, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : instant, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? false : z10);
    }
}
