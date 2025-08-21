package e3;

import a3.y;

/* loaded from: classes.dex */
public final class e implements y.a {

    /* renamed from: a, reason: collision with root package name */
    public final long f129417a;

    /* renamed from: b, reason: collision with root package name */
    public final long f129418b;

    /* renamed from: c, reason: collision with root package name */
    public final long f129419c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f129417a == eVar.f129417a && this.f129418b == eVar.f129418b && this.f129419c == eVar.f129419c;
    }

    public int hashCode() {
        return ((((527 + Je.h.a(this.f129417a)) * 31) + Je.h.a(this.f129418b)) * 31) + Je.h.a(this.f129419c);
    }

    public String toString() {
        return "Mp4Timestamp: creation time=" + this.f129417a + ", modification time=" + this.f129418b + ", timescale=" + this.f129419c;
    }

    public e(long j10, long j11, long j12) {
        this.f129417a = j10;
        this.f129418b = j11;
        this.f129419c = j12;
    }
}
