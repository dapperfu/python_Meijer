package com.meijer.mobile.mperks.networking.domain.models;

import j$.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\tJ\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/ExpiringPoints;", "", "", "points", "j$/time/LocalDate", "expiresOn", "<init>", "(ILj$/time/LocalDate;)V", "component1", "()I", "component2", "()Lj$/time/LocalDate;", "copy", "(ILj$/time/LocalDate;)Lcom/meijer/mobile/mperks/networking/domain/models/ExpiringPoints;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPoints", "Lj$/time/LocalDate;", "getExpiresOn", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ExpiringPoints {
    private final LocalDate expiresOn;
    private final int points;

    /* JADX WARN: Multi-variable type inference failed */
    public ExpiringPoints() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ExpiringPoints copy$default(ExpiringPoints expiringPoints, int i10, LocalDate localDate, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = expiringPoints.points;
        }
        if ((i11 & 2) != 0) {
            localDate = expiringPoints.expiresOn;
        }
        return expiringPoints.copy(i10, localDate);
    }

    /* renamed from: component1, reason: from getter */
    public final int getPoints() {
        return this.points;
    }

    /* renamed from: component2, reason: from getter */
    public final LocalDate getExpiresOn() {
        return this.expiresOn;
    }

    public final ExpiringPoints copy(int points, LocalDate expiresOn) {
        return new ExpiringPoints(points, expiresOn);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpiringPoints)) {
            return false;
        }
        ExpiringPoints expiringPoints = (ExpiringPoints) other;
        return this.points == expiringPoints.points && Intrinsics.e(this.expiresOn, expiringPoints.expiresOn);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.points) * 31;
        LocalDate localDate = this.expiresOn;
        return iHashCode + (localDate == null ? 0 : localDate.hashCode());
    }

    public String toString() {
        return "ExpiringPoints(points=" + this.points + ", expiresOn=" + this.expiresOn + ')';
    }

    public ExpiringPoints(int i10, LocalDate localDate) {
        this.points = i10;
        this.expiresOn = localDate;
    }

    public final LocalDate getExpiresOn() {
        return this.expiresOn;
    }

    public final int getPoints() {
        return this.points;
    }

    public /* synthetic */ ExpiringPoints(int i10, LocalDate localDate, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? null : localDate);
    }
}
