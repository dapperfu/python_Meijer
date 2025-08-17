package M3;

import Ce.B;
import M3.c;
import a3.y;
import d3.C13466a;
import d3.P;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class c implements y.a {

    /* renamed from: a, reason: collision with root package name */
    public final List<a> f18906a;

    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        public static final Comparator<a> f18907d = new Comparator() { // from class: M3.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                c.a aVar = (c.a) obj;
                c.a aVar2 = (c.a) obj2;
                return B.k().e(aVar.f18908a, aVar2.f18908a).e(aVar.f18909b, aVar2.f18909b).d(aVar.f18910c, aVar2.f18910c).j();
            }
        };

        /* renamed from: a, reason: collision with root package name */
        public final long f18908a;

        /* renamed from: b, reason: collision with root package name */
        public final long f18909b;

        /* renamed from: c, reason: collision with root package name */
        public final int f18910c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f18908a == aVar.f18908a && this.f18909b == aVar.f18909b && this.f18910c == aVar.f18910c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.f18908a), Long.valueOf(this.f18909b), Integer.valueOf(this.f18910c));
        }

        public String toString() {
            return P.F("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f18908a), Long.valueOf(this.f18909b), Integer.valueOf(this.f18910c));
        }

        public a(long j10, long j11, int i10) {
            boolean z10;
            if (j10 < j11) {
                z10 = true;
            } else {
                z10 = false;
            }
            C13466a.a(z10);
            this.f18908a = j10;
            this.f18909b = j11;
            this.f18910c = i10;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return this.f18906a.equals(((c) obj).f18906a);
    }

    public int hashCode() {
        return this.f18906a.hashCode();
    }

    public String toString() {
        return "SlowMotion: segments=" + this.f18906a;
    }

    public c(List<a> list) {
        this.f18906a = list;
        C13466a.a(!d(list));
    }

    private static boolean d(List<a> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j10 = list.get(0).f18909b;
        for (int i10 = 1; i10 < list.size(); i10++) {
            if (list.get(i10).f18908a < j10) {
                return true;
            }
            j10 = list.get(i10).f18909b;
        }
        return false;
    }
}
