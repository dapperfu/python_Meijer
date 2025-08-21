package M3;

import Je.h;
import a3.y;

/* loaded from: classes4.dex */
public final class a implements y.a {

    /* renamed from: a, reason: collision with root package name */
    public final long f19642a;

    /* renamed from: b, reason: collision with root package name */
    public final long f19643b;

    /* renamed from: c, reason: collision with root package name */
    public final long f19644c;

    /* renamed from: d, reason: collision with root package name */
    public final long f19645d;

    /* renamed from: e, reason: collision with root package name */
    public final long f19646e;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f19642a == aVar.f19642a && this.f19643b == aVar.f19643b && this.f19644c == aVar.f19644c && this.f19645d == aVar.f19645d && this.f19646e == aVar.f19646e) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + h.a(this.f19642a)) * 31) + h.a(this.f19643b)) * 31) + h.a(this.f19644c)) * 31) + h.a(this.f19645d)) * 31) + h.a(this.f19646e);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f19642a + ", photoSize=" + this.f19643b + ", photoPresentationTimestampUs=" + this.f19644c + ", videoStartPosition=" + this.f19645d + ", videoSize=" + this.f19646e;
    }

    public a(long j10, long j11, long j12, long j13, long j14) {
        this.f19642a = j10;
        this.f19643b = j11;
        this.f19644c = j12;
        this.f19645d = j13;
        this.f19646e = j14;
    }
}
