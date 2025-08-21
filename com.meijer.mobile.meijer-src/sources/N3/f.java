package N3;

import d3.D;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class f extends N3.b {

    /* renamed from: a, reason: collision with root package name */
    public final List<c> f20560a;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f20561a;

        /* renamed from: b, reason: collision with root package name */
        public final long f20562b;

        private b(int i10, long j10) {
            this.f20561a = i10;
            this.f20562b = j10;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final long f20563a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f20564b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f20565c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f20566d;

        /* renamed from: e, reason: collision with root package name */
        public final long f20567e;

        /* renamed from: f, reason: collision with root package name */
        public final List<b> f20568f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f20569g;

        /* renamed from: h, reason: collision with root package name */
        public final long f20570h;

        /* renamed from: i, reason: collision with root package name */
        public final int f20571i;

        /* renamed from: j, reason: collision with root package name */
        public final int f20572j;

        /* renamed from: k, reason: collision with root package name */
        public final int f20573k;

        private c(long j10, boolean z10, boolean z11, boolean z12, List<b> list, long j11, boolean z13, long j12, int i10, int i11, int i12) {
            this.f20563a = j10;
            this.f20564b = z10;
            this.f20565c = z11;
            this.f20566d = z12;
            this.f20568f = Collections.unmodifiableList(list);
            this.f20567e = j11;
            this.f20569g = z13;
            this.f20570h = j12;
            this.f20571i = i10;
            this.f20572j = i11;
            this.f20573k = i12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c b(D d10) {
            boolean z10;
            ArrayList arrayList;
            boolean z11;
            boolean z12;
            long j10;
            boolean z13;
            long j11;
            int i10;
            int i11;
            int iH;
            boolean z14;
            boolean z15;
            boolean z16;
            long J10;
            boolean z17;
            long J11;
            boolean z18;
            long J12 = d10.J();
            boolean z19 = true;
            if ((d10.H() & 128) != 0) {
                z10 = true;
            } else {
                z10 = true;
                z19 = false;
            }
            ArrayList arrayList2 = new ArrayList();
            if (!z19) {
                int iH2 = d10.H();
                if ((iH2 & 128) != 0) {
                    z14 = z10;
                } else {
                    z14 = false;
                }
                if ((iH2 & 64) != 0) {
                    z15 = z10;
                } else {
                    z15 = false;
                }
                if ((iH2 & 32) != 0) {
                    z16 = z10;
                } else {
                    z16 = false;
                }
                if (z15) {
                    J10 = d10.J();
                } else {
                    J10 = -9223372036854775807L;
                }
                if (!z15) {
                    int iH3 = d10.H();
                    ArrayList arrayList3 = new ArrayList(iH3);
                    int i12 = 0;
                    while (i12 < iH3) {
                        arrayList3.add(new b(d10.H(), d10.J()));
                        i12++;
                        iH3 = iH3;
                    }
                    arrayList2 = arrayList3;
                }
                if (z16) {
                    long jH = d10.H();
                    if ((128 & jH) != 0) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    J11 = ((((jH & 1) << 32) | d10.J()) * 1000) / 90;
                    z17 = z18;
                } else {
                    z17 = false;
                    J11 = -9223372036854775807L;
                }
                int iP = d10.P();
                int iH4 = d10.H();
                boolean z20 = z14;
                z13 = z17;
                z11 = z20;
                iH = d10.H();
                long j12 = J10;
                i10 = iP;
                i11 = iH4;
                long j13 = J11;
                arrayList = arrayList2;
                z12 = z15;
                j10 = j12;
                j11 = j13;
            } else {
                arrayList = arrayList2;
                z11 = false;
                z12 = false;
                j10 = -9223372036854775807L;
                z13 = false;
                j11 = -9223372036854775807L;
                i10 = 0;
                i11 = 0;
                iH = 0;
            }
            return new c(J12, z19, z11, z12, arrayList, j10, z13, j11, i10, i11, iH);
        }
    }

    private f(List<c> list) {
        this.f20560a = Collections.unmodifiableList(list);
    }

    static f d(D d10) {
        int iH = d10.H();
        ArrayList arrayList = new ArrayList(iH);
        for (int i10 = 0; i10 < iH; i10++) {
            arrayList.add(c.b(d10));
        }
        return new f(arrayList);
    }
}
