package F3;

import java.util.List;

/* loaded from: classes.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f9013a;

    /* renamed from: b, reason: collision with root package name */
    public final List<a> f9014b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f9015a;

        /* renamed from: b, reason: collision with root package name */
        public final String f9016b;

        /* renamed from: c, reason: collision with root package name */
        public final long f9017c;

        /* renamed from: d, reason: collision with root package name */
        public final long f9018d;

        public a(String str, String str2, long j10, long j11) {
            this.f9015a = str;
            this.f9016b = str2;
            this.f9017c = j10;
            this.f9018d = j11;
        }
    }

    public M3.a a(long j10) {
        long j11;
        if (this.f9014b.size() < 2) {
            return null;
        }
        long j12 = j10;
        long j13 = -1;
        long j14 = -1;
        long j15 = -1;
        long j16 = -1;
        boolean z10 = false;
        for (int size = this.f9014b.size() - 1; size >= 0; size--) {
            a aVar = this.f9014b.get(size);
            boolean zEquals = "video/mp4".equals(aVar.f9015a) | z10;
            if (size == 0) {
                j12 -= aVar.f9018d;
                j11 = 0;
            } else {
                j11 = j12 - aVar.f9017c;
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
        return new M3.a(j13, j14, this.f9013a, j15, j16);
    }

    public c(long j10, List<a> list) {
        this.f9013a = j10;
        this.f9014b = list;
    }
}
