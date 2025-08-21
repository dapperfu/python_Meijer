package N3;

import d3.D;
import d3.J;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class d extends N3.b {

    /* renamed from: a, reason: collision with root package name */
    public final long f20544a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f20545b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f20546c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f20547d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f20548e;

    /* renamed from: f, reason: collision with root package name */
    public final long f20549f;

    /* renamed from: g, reason: collision with root package name */
    public final long f20550g;

    /* renamed from: h, reason: collision with root package name */
    public final List<b> f20551h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f20552i;

    /* renamed from: j, reason: collision with root package name */
    public final long f20553j;

    /* renamed from: k, reason: collision with root package name */
    public final int f20554k;

    /* renamed from: l, reason: collision with root package name */
    public final int f20555l;

    /* renamed from: m, reason: collision with root package name */
    public final int f20556m;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f20557a;

        /* renamed from: b, reason: collision with root package name */
        public final long f20558b;

        /* renamed from: c, reason: collision with root package name */
        public final long f20559c;

        private b(int i10, long j10, long j11) {
            this.f20557a = i10;
            this.f20558b = j10;
            this.f20559c = j11;
        }
    }

    static d d(D d10, long j10, J j11) {
        List list;
        long j12;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        int iH;
        int iH2;
        boolean z14;
        int i11;
        long jE;
        long J10 = d10.J();
        boolean z15 = (d10.H() & 128) != 0;
        List list2 = Collections.EMPTY_LIST;
        long J11 = -9223372036854775807L;
        if (z15) {
            list = list2;
            j12 = -9223372036854775807L;
            z10 = false;
            z11 = false;
            z12 = false;
            z13 = false;
            i10 = 0;
            iH = 0;
            iH2 = 0;
        } else {
            int iH3 = d10.H();
            boolean z16 = (iH3 & 128) != 0;
            boolean z17 = (iH3 & 64) != 0;
            boolean z18 = (iH3 & 32) != 0;
            boolean z19 = (iH3 & 16) != 0;
            long jE2 = (!z17 || z19) ? -9223372036854775807L : g.e(d10, j10);
            if (!z17) {
                int iH4 = d10.H();
                ArrayList arrayList = new ArrayList(iH4);
                int i12 = 0;
                while (i12 < iH4) {
                    int iH5 = d10.H();
                    if (z19) {
                        i11 = iH4;
                        jE = -9223372036854775807L;
                    } else {
                        i11 = iH4;
                        jE = g.e(d10, j10);
                    }
                    arrayList.add(new b(iH5, jE, j11.b(jE)));
                    i12++;
                    iH4 = i11;
                }
                list2 = arrayList;
            }
            if (z18) {
                long jH = d10.H();
                boolean z20 = (128 & jH) != 0;
                J11 = ((((jH & 1) << 32) | d10.J()) * 1000) / 90;
                z14 = z20;
            } else {
                z14 = false;
            }
            int iP = d10.P();
            long j13 = jE2;
            j12 = J11;
            J11 = j13;
            iH = d10.H();
            iH2 = d10.H();
            i10 = iP;
            z13 = z14;
            z10 = z16;
            z11 = z17;
            list = list2;
            z12 = z19;
        }
        return new d(J10, z15, z10, z11, z12, J11, j11.b(J11), list, z13, j12, i10, iH, iH2);
    }

    @Override // N3.b
    public String toString() {
        return "SCTE-35 SpliceInsertCommand { programSplicePts=" + this.f20549f + ", programSplicePlaybackPositionUs= " + this.f20550g + " }";
    }

    private d(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List<b> list, boolean z14, long j13, int i10, int i11, int i12) {
        this.f20544a = j10;
        this.f20545b = z10;
        this.f20546c = z11;
        this.f20547d = z12;
        this.f20548e = z13;
        this.f20549f = j11;
        this.f20550g = j12;
        this.f20551h = Collections.unmodifiableList(list);
        this.f20552i = z14;
        this.f20553j = j13;
        this.f20554k = i10;
        this.f20555l = i11;
        this.f20556m = i12;
    }
}
