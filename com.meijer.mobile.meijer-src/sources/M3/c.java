package M3;

import Ee.B;
import M3.c;
import a3.y;
import d3.C13599a;
import d3.P;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class c implements y.a {

    /* renamed from: a, reason: collision with root package name */
    public final List<a> f19647a;

    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        public static final Comparator<a> f19648d = new Comparator() { // from class: M3.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                c.a aVar = (c.a) obj;
                c.a aVar2 = (c.a) obj2;
                return B.k().e(aVar.f19649a, aVar2.f19649a).e(aVar.f19650b, aVar2.f19650b).d(aVar.f19651c, aVar2.f19651c).j();
            }
        };

        /* renamed from: a, reason: collision with root package name */
        public final long f19649a;

        /* renamed from: b, reason: collision with root package name */
        public final long f19650b;

        /* renamed from: c, reason: collision with root package name */
        public final int f19651c;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f19649a == aVar.f19649a && this.f19650b == aVar.f19650b && this.f19651c == aVar.f19651c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.f19649a), Long.valueOf(this.f19650b), Integer.valueOf(this.f19651c));
        }

        public String toString() {
            return P.F("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f19649a), Long.valueOf(this.f19650b), Integer.valueOf(this.f19651c));
        }

        public a(long j10, long j11, int i10) {
            boolean z10;
            if (j10 < j11) {
                z10 = true;
            } else {
                z10 = false;
            }
            C13599a.a(z10);
            this.f19649a = j10;
            this.f19650b = j11;
            this.f19651c = i10;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return this.f19647a.equals(((c) obj).f19647a);
    }

    public int hashCode() {
        return this.f19647a.hashCode();
    }

    public String toString() {
        return "SlowMotion: segments=" + this.f19647a;
    }

    public c(List<a> list) {
        this.f19647a = list;
        C13599a.a(!d(list));
    }

    private static boolean d(List<a> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j10 = list.get(0).f19650b;
        for (int i10 = 1; i10 < list.size(); i10++) {
            if (list.get(i10).f19649a < j10) {
                return true;
            }
            j10 = list.get(i10).f19650b;
        }
        return false;
    }
}
