package fj;

import j$.time.OffsetDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001b¨\u0006\u001e"}, d2 = {"Lfj/r;", "", "", "code", "partnerCustomerId", "j$/time/OffsetDateTime", "timeCreated", "timeUpdated", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/OffsetDateTime;Lj$/time/OffsetDateTime;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCode", "b", "getPartnerCustomerId", "c", "Lj$/time/OffsetDateTime;", "getTimeCreated", "()Lj$/time/OffsetDateTime;", "d", "getTimeUpdated", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: fj.r, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class Membership {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String code;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String partnerCustomerId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime timeCreated;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime timeUpdated;

    public Membership() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Membership)) {
            return false;
        }
        Membership membership = (Membership) other;
        return Intrinsics.e(this.code, membership.code) && Intrinsics.e(this.partnerCustomerId, membership.partnerCustomerId) && Intrinsics.e(this.timeCreated, membership.timeCreated) && Intrinsics.e(this.timeUpdated, membership.timeUpdated);
    }

    public Membership(String code, String str, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2) {
        Intrinsics.j(code, "code");
        this.code = code;
        this.partnerCustomerId = str;
        this.timeCreated = offsetDateTime;
        this.timeUpdated = offsetDateTime2;
    }

    public int hashCode() {
        int iHashCode = this.code.hashCode() * 31;
        String str = this.partnerCustomerId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        OffsetDateTime offsetDateTime = this.timeCreated;
        int iHashCode3 = (iHashCode2 + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31;
        OffsetDateTime offsetDateTime2 = this.timeUpdated;
        return iHashCode3 + (offsetDateTime2 != null ? offsetDateTime2.hashCode() : 0);
    }

    public String toString() {
        return "Membership(code=" + this.code + ", partnerCustomerId=" + this.partnerCustomerId + ", timeCreated=" + this.timeCreated + ", timeUpdated=" + this.timeUpdated + ')';
    }

    public /* synthetic */ Membership(String str, String str2, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : offsetDateTime, (i10 & 8) != 0 ? null : offsetDateTime2);
    }
}
