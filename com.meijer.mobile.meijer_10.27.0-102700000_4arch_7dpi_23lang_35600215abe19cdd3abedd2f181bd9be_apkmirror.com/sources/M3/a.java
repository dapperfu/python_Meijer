package M3;

import He.h;
import a3.y;

/* loaded from: classes4.dex */
public final class a implements y.a {

    /* renamed from: a, reason: collision with root package name */
    public final long f18901a;

    /* renamed from: b, reason: collision with root package name */
    public final long f18902b;

    /* renamed from: c, reason: collision with root package name */
    public final long f18903c;

    /* renamed from: d, reason: collision with root package name */
    public final long f18904d;

    /* renamed from: e, reason: collision with root package name */
    public final long f18905e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f18901a == aVar.f18901a && this.f18902b == aVar.f18902b && this.f18903c == aVar.f18903c && this.f18904d == aVar.f18904d && this.f18905e == aVar.f18905e) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + h.a(this.f18901a)) * 31) + h.a(this.f18902b)) * 31) + h.a(this.f18903c)) * 31) + h.a(this.f18904d)) * 31) + h.a(this.f18905e);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f18901a + ", photoSize=" + this.f18902b + ", photoPresentationTimestampUs=" + this.f18903c + ", videoStartPosition=" + this.f18904d + ", videoSize=" + this.f18905e;
    }

    public a(long j10, long j11, long j12, long j13, long j14) {
        this.f18901a = j10;
        this.f18902b = j11;
        this.f18903c = j12;
        this.f18904d = j13;
        this.f18905e = j14;
    }
}
