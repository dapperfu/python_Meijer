package io;

import j$.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"Lio/a;", "", "", "points", "j$/time/LocalDate", "expiresOn", "<init>", "(ILj$/time/LocalDate;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Lj$/time/LocalDate;", "()Lj$/time/LocalDate;", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: io.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes9.dex */
public final /* data */ class ExpiringPoints {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int points;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate expiresOn;

    /* JADX WARN: Multi-variable type inference failed */
    public ExpiringPoints() {
        this(0, null, 3, 0 == true ? 1 : 0);
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

    public ExpiringPoints(int i10, LocalDate localDate) {
        this.points = i10;
        this.expiresOn = localDate;
    }

    /* renamed from: a, reason: from getter */
    public final LocalDate getExpiresOn() {
        return this.expiresOn;
    }

    /* renamed from: b, reason: from getter */
    public final int getPoints() {
        return this.points;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.points) * 31;
        LocalDate localDate = this.expiresOn;
        return iHashCode + (localDate == null ? 0 : localDate.hashCode());
    }

    public String toString() {
        return "ExpiringPoints(points=" + this.points + ", expiresOn=" + this.expiresOn + ')';
    }

    public /* synthetic */ ExpiringPoints(int i10, LocalDate localDate, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? null : localDate);
    }
}
