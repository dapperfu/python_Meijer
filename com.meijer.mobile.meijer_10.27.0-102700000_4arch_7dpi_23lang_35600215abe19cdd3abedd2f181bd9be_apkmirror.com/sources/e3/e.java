package e3;

import a3.y;

/* loaded from: classes.dex */
public final class e implements y.a {

    /* renamed from: a, reason: collision with root package name */
    public final long f128081a;

    /* renamed from: b, reason: collision with root package name */
    public final long f128082b;

    /* renamed from: c, reason: collision with root package name */
    public final long f128083c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f128081a == eVar.f128081a && this.f128082b == eVar.f128082b && this.f128083c == eVar.f128083c;
    }

    public int hashCode() {
        return ((((527 + He.h.a(this.f128081a)) * 31) + He.h.a(this.f128082b)) * 31) + He.h.a(this.f128083c);
    }

    public String toString() {
        return "Mp4Timestamp: creation time=" + this.f128081a + ", modification time=" + this.f128082b + ", timescale=" + this.f128083c;
    }

    public e(long j10, long j11, long j12) {
        this.f128081a = j10;
        this.f128082b = j11;
        this.f128083c = j12;
    }
}
