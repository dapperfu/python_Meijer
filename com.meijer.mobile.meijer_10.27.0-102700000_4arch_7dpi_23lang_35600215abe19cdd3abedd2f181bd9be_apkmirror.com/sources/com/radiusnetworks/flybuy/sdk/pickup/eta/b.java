package com.radiusnetworks.flybuy.sdk.pickup.eta;

import j$.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public Integer f120002a;

    /* renamed from: b, reason: collision with root package name */
    public Instant f120003b;

    /* renamed from: c, reason: collision with root package name */
    public int f120004c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f120005d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.e(this.f120002a, bVar.f120002a) && Intrinsics.e(this.f120003b, bVar.f120003b) && this.f120004c == bVar.f120004c && this.f120005d == bVar.f120005d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        Integer num = this.f120002a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Instant instant = this.f120003b;
        int iHashCode2 = (Integer.hashCode(this.f120004c) + ((iHashCode + (instant != null ? instant.hashCode() : 0)) * 31)) * 31;
        boolean z10 = this.f120005d;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return iHashCode2 + i10;
    }

    public final String toString() {
        return "ETAData(lastComputedETASeconds=" + this.f120002a + ", lastETAFetchedAt=" + this.f120003b + ", cachedETAExpirySeconds=" + this.f120004c + ", directionsFailed=" + this.f120005d + ')';
    }

    public b(Integer num, Instant instant, int i10, boolean z10) {
        this.f120002a = num;
        this.f120003b = instant;
        this.f120004c = i10;
        this.f120005d = z10;
    }
}
