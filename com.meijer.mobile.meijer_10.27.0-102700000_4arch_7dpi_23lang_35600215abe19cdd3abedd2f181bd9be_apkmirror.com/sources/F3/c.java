package F3;

import java.util.List;

/* loaded from: classes.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f10246a;

    /* renamed from: b, reason: collision with root package name */
    public final List<a> f10247b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f10248a;

        /* renamed from: b, reason: collision with root package name */
        public final String f10249b;

        /* renamed from: c, reason: collision with root package name */
        public final long f10250c;

        /* renamed from: d, reason: collision with root package name */
        public final long f10251d;

        public a(String str, String str2, long j10, long j11) {
            this.f10248a = str;
            this.f10249b = str2;
            this.f10250c = j10;
            this.f10251d = j11;
        }
    }

    public M3.a a(long j10) {
        long j11;
        if (this.f10247b.size() < 2) {
            return null;
        }
        long j12 = j10;
        long j13 = -1;
        long j14 = -1;
        long j15 = -1;
        long j16 = -1;
        boolean z10 = false;
        for (int size = this.f10247b.size() - 1; size >= 0; size--) {
            a aVar = this.f10247b.get(size);
            boolean zEquals = "video/mp4".equals(aVar.f10248a) | z10;
            if (size == 0) {
                j12 -= aVar.f10251d;
                j11 = 0;
            } else {
                j11 = j12 - aVar.f10250c;
            }
            long j17 = j11;
            long j18 = j12;
            j12 = j17;
            if (!zEquals || j12 == j18) {
                z10 = zEquals;
            } else {
                j16 = j18 - j12;
                j15 = j12;
                z10 = false;
            }
            if (size == 0) {
                j13 = j12;
                j14 = j18;
            }
        }
        if (j15 == -1 || j16 == -1 || j13 == -1 || j14 == -1) {
            return null;
        }
        return new M3.a(j13, j14, this.f10246a, j15, j16);
    }

    public c(long j10, List<a> list) {
        this.f10246a = j10;
        this.f10247b = list;
    }
}
