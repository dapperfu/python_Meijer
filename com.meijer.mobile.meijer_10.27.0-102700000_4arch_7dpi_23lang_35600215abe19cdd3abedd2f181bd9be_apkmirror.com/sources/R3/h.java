package R3;

import Ce.L;
import U3.r;
import a3.o;
import a3.t;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.a;
import com.medallia.digital.mobilesdk.l3;
import d3.C13466a;
import d3.D;
import d3.J;
import d3.P;
import e3.c;
import e3.i;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import x3.B;
import x3.C18001f;
import x3.C18002g;
import x3.I;
import x3.InterfaceC18011p;
import x3.InterfaceC18012q;
import x3.J;
import x3.N;
import x3.O;

/* loaded from: classes4.dex */
public class h implements InterfaceC18011p {

    /* renamed from: M, reason: collision with root package name */
    @Deprecated
    public static final x3.u f31703M = new x3.u() { // from class: R3.f
        @Override // x3.u
        public final InterfaceC18011p[] f() {
            return h.f();
        }
    };

    /* renamed from: N, reason: collision with root package name */
    private static final byte[] f31704N = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: O, reason: collision with root package name */
    private static final a3.t f31705O = new t.b().u0("application/x-emsg").N();

    /* renamed from: A, reason: collision with root package name */
    private long f31706A;

    /* renamed from: B, reason: collision with root package name */
    private long f31707B;

    /* renamed from: C, reason: collision with root package name */
    private b f31708C;

    /* renamed from: D, reason: collision with root package name */
    private int f31709D;

    /* renamed from: E, reason: collision with root package name */
    private int f31710E;

    /* renamed from: F, reason: collision with root package name */
    private int f31711F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f31712G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f31713H;

    /* renamed from: I, reason: collision with root package name */
    private x3.r f31714I;

    /* renamed from: J, reason: collision with root package name */
    private O[] f31715J;

    /* renamed from: K, reason: collision with root package name */
    private O[] f31716K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f31717L;

    /* renamed from: a, reason: collision with root package name */
    private final r.a f31718a;

    /* renamed from: b, reason: collision with root package name */
    private final int f31719b;

    /* renamed from: c, reason: collision with root package name */
    private final t f31720c;

    /* renamed from: d, reason: collision with root package name */
    private final List<a3.t> f31721d;

    /* renamed from: e, reason: collision with root package name */
    private final SparseArray<b> f31722e;

    /* renamed from: f, reason: collision with root package name */
    private final D f31723f;

    /* renamed from: g, reason: collision with root package name */
    private final D f31724g;

    /* renamed from: h, reason: collision with root package name */
    private final D f31725h;

    /* renamed from: i, reason: collision with root package name */
    private final byte[] f31726i;

    /* renamed from: j, reason: collision with root package name */
    private final D f31727j;

    /* renamed from: k, reason: collision with root package name */
    private final J f31728k;

    /* renamed from: l, reason: collision with root package name */
    private final I3.c f31729l;

    /* renamed from: m, reason: collision with root package name */
    private final D f31730m;

    /* renamed from: n, reason: collision with root package name */
    private final ArrayDeque<c.b> f31731n;

    /* renamed from: o, reason: collision with root package name */
    private final ArrayDeque<a> f31732o;

    /* renamed from: p, reason: collision with root package name */
    private final e3.i f31733p;

    /* renamed from: q, reason: collision with root package name */
    private final O f31734q;

    /* renamed from: r, reason: collision with root package name */
    private L<N> f31735r;

    /* renamed from: s, reason: collision with root package name */
    private int f31736s;

    /* renamed from: t, reason: collision with root package name */
    private int f31737t;

    /* renamed from: u, reason: collision with root package name */
    private long f31738u;

    /* renamed from: v, reason: collision with root package name */
    private int f31739v;

    /* renamed from: w, reason: collision with root package name */
    private D f31740w;

    /* renamed from: x, reason: collision with root package name */
    private long f31741x;

    /* renamed from: y, reason: collision with root package name */
    private int f31742y;

    /* renamed from: z, reason: collision with root package name */
    private long f31743z;

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final O f31747a;

        /* renamed from: d, reason: collision with root package name */
        public w f31750d;

        /* renamed from: e, reason: collision with root package name */
        public c f31751e;

        /* renamed from: f, reason: collision with root package name */
        public int f31752f;

        /* renamed from: g, reason: collision with root package name */
        public int f31753g;

        /* renamed from: h, reason: collision with root package name */
        public int f31754h;

        /* renamed from: i, reason: collision with root package name */
        public int f31755i;

        /* renamed from: j, reason: collision with root package name */
        private final String f31756j;

        /* renamed from: m, reason: collision with root package name */
        private boolean f31759m;

        /* renamed from: b, reason: collision with root package name */
        public final v f31748b = new v();

        /* renamed from: c, reason: collision with root package name */
        public final D f31749c = new D();

        /* renamed from: k, reason: collision with root package name */
        private final D f31757k = new D(1);

        /* renamed from: l, reason: collision with root package name */
        private final D f31758l = new D();

        public int c() {
            int i10 = !this.f31759m ? this.f31750d.f31856g[this.f31752f] : this.f31748b.f31842k[this.f31752f] ? 1 : 0;
            return g() != null ? i10 | 1073741824 : i10;
        }

        public long d() {
            return !this.f31759m ? this.f31750d.f31852c[this.f31752f] : this.f31748b.f31838g[this.f31754h];
        }

        public long e() {
            return !this.f31759m ? this.f31750d.f31855f[this.f31752f] : this.f31748b.c(this.f31752f);
        }

        public int f() {
            return !this.f31759m ? this.f31750d.f31853d[this.f31752f] : this.f31748b.f31840i[this.f31752f];
        }

        public u g() {
            if (!this.f31759m) {
                return null;
            }
            int i10 = ((c) P.h(this.f31748b.f31832a)).f31691a;
            u uVarB = this.f31748b.f31845n;
            if (uVarB == null) {
                uVarB = this.f31750d.f31850a.b(i10);
            }
            if (uVarB == null || !uVarB.f31827a) {
                return null;
            }
            return uVarB;
        }

        public boolean h() {
            this.f31752f++;
            if (!this.f31759m) {
                return false;
            }
            int i10 = this.f31753g + 1;
            this.f31753g = i10;
            int[] iArr = this.f31748b.f31839h;
            int i11 = this.f31754h;
            if (i10 != iArr[i11]) {
                return true;
            }
            this.f31754h = i11 + 1;
            this.f31753g = 0;
            return false;
        }

        public void j(w wVar, c cVar) {
            this.f31750d = wVar;
            this.f31751e = cVar;
            this.f31747a.b(wVar.f31850a.f31821g.b().U(this.f31756j).N());
            k();
        }

        public void k() {
            this.f31748b.f();
            this.f31752f = 0;
            this.f31754h = 0;
            this.f31753g = 0;
            this.f31755i = 0;
            this.f31759m = false;
        }

        public void l(long j10) {
            int i10 = this.f31752f;
            while (true) {
                v vVar = this.f31748b;
                if (i10 >= vVar.f31837f || vVar.c(i10) > j10) {
                    return;
                }
                if (this.f31748b.f31842k[i10]) {
                    this.f31755i = i10;
                }
                i10++;
            }
        }

        public void n(a3.o oVar) {
            u uVarB = this.f31750d.f31850a.b(((c) P.h(this.f31748b.f31832a)).f31691a);
            this.f31747a.b(this.f31750d.f31850a.f31821g.b().U(this.f31756j).Y(oVar.b(uVarB != null ? uVarB.f31828b : null)).N());
        }

        public b(O o10, w wVar, c cVar, String str) {
            this.f31747a = o10;
            this.f31750d = wVar;
            this.f31751e = cVar;
            this.f31756j = str;
            j(wVar, cVar);
        }

        public int i(int i10, int i11) {
            D d10;
            boolean z10;
            int i12;
            u uVarG = g();
            if (uVarG == null) {
                return 0;
            }
            int length = uVarG.f31830d;
            if (length != 0) {
                d10 = this.f31748b.f31846o;
            } else {
                byte[] bArr = (byte[]) P.h(uVarG.f31831e);
                this.f31758l.U(bArr, bArr.length);
                D d11 = this.f31758l;
                length = bArr.length;
                d10 = d11;
            }
            boolean zG = this.f31748b.g(this.f31752f);
            if (!zG && i11 == 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            byte[] bArrE = this.f31757k.e();
            if (z10) {
                i12 = 128;
            } else {
                i12 = 0;
            }
            bArrE[0] = (byte) (i12 | length);
            this.f31757k.W(0);
            this.f31747a.e(this.f31757k, 1, 1);
            this.f31747a.e(d10, length, 1);
            if (!z10) {
                return length + 1;
            }
            if (!zG) {
                this.f31749c.S(8);
                byte[] bArrE2 = this.f31749c.e();
                bArrE2[0] = 0;
                bArrE2[1] = 1;
                bArrE2[2] = (byte) ((i11 >> 8) & l3.f92484c);
                bArrE2[3] = (byte) (i11 & l3.f92484c);
                bArrE2[4] = (byte) ((i10 >> 24) & l3.f92484c);
                bArrE2[5] = (byte) ((i10 >> 16) & l3.f92484c);
                bArrE2[6] = (byte) ((i10 >> 8) & l3.f92484c);
                bArrE2[7] = (byte) (i10 & l3.f92484c);
                this.f31747a.e(this.f31749c, 8, 1);
                return length + 9;
            }
            D d12 = this.f31748b.f31846o;
            int iP = d12.P();
            d12.X(-2);
            int i13 = (iP * 6) + 2;
            if (i11 != 0) {
                this.f31749c.S(i13);
                byte[] bArrE3 = this.f31749c.e();
                d12.l(bArrE3, 0, i13);
                int i14 = (((bArrE3[2] & 255) << 8) | (bArrE3[3] & 255)) + i11;
                bArrE3[2] = (byte) ((i14 >> 8) & l3.f92484c);
                bArrE3[3] = (byte) (i14 & l3.f92484c);
                d12 = this.f31749c;
            }
            this.f31747a.e(d12, i13, 1);
            return length + 1 + i13;
        }

        public void m() {
            u uVarG = g();
            if (uVarG != null) {
                D d10 = this.f31748b.f31846o;
                int i10 = uVarG.f31830d;
                if (i10 != 0) {
                    d10.X(i10);
                }
                if (this.f31748b.g(this.f31752f)) {
                    d10.X(d10.P() * 6);
                }
            }
        }
    }

    public h(r.a aVar, int i10) {
        this(aVar, i10, null, null, L.x(), null);
    }

    private static void F(D d10, v vVar) throws ParserException {
        E(d10, 0, vVar);
    }

    private void l() {
        this.f31736s = 0;
        this.f31739v = 0;
    }

    private void q() {
        int i10;
        O[] oArr = new O[2];
        this.f31715J = oArr;
        O o10 = this.f31734q;
        int i11 = 0;
        if (o10 != null) {
            oArr[0] = o10;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i12 = 100;
        if ((this.f31719b & 4) != 0) {
            oArr[i10] = this.f31714I.t(100, 5);
            i12 = 101;
            i10++;
        }
        O[] oArr2 = (O[]) P.R0(this.f31715J, i10);
        this.f31715J = oArr2;
        for (O o11 : oArr2) {
            o11.b(f31705O);
        }
        this.f31716K = new O[this.f31721d.size()];
        while (i11 < this.f31716K.length) {
            O oT = this.f31714I.t(i12, 3);
            oT.b(this.f31721d.get(i11));
            this.f31716K[i11] = oT;
            i11++;
            i12++;
        }
    }

    @Override // x3.InterfaceC18011p
    public void release() {
    }

    protected t s(t tVar) {
        return tVar;
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f31744a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f31745b;

        /* renamed from: c, reason: collision with root package name */
        public final int f31746c;

        public a(long j10, boolean z10, int i10) {
            this.f31744a = j10;
            this.f31745b = z10;
            this.f31746c = i10;
        }
    }

    private static void A(c.b bVar, SparseArray<b> sparseArray, boolean z10, int i10, byte[] bArr) throws ParserException {
        int size = bVar.f128077d.size();
        for (int i11 = 0; i11 < size; i11++) {
            c.b bVar2 = bVar.f128077d.get(i11);
            if (bVar2.f128074a == 1953653094) {
                J(bVar2, sparseArray, z10, i10, bArr);
            }
        }
    }

    private static void B(D d10, v vVar) throws ParserException {
        d10.W(8);
        int iQ = d10.q();
        if ((R3.b.m(iQ) & 1) == 1) {
            d10.X(8);
        }
        int iL = d10.L();
        if (iL == 1) {
            vVar.f31835d += R3.b.n(iQ) == 0 ? d10.J() : d10.O();
        } else {
            throw ParserException.a("Unexpected saio entry count: " + iL, null);
        }
    }

    private static void C(u uVar, D d10, v vVar) throws ParserException {
        int i10;
        int i11 = uVar.f31830d;
        d10.W(8);
        if ((R3.b.m(d10.q()) & 1) == 1) {
            d10.X(8);
        }
        int iH = d10.H();
        int iL = d10.L();
        if (iL > vVar.f31837f) {
            throw ParserException.a("Saiz sample count " + iL + " is greater than fragment sample count" + vVar.f31837f, null);
        }
        if (iH == 0) {
            boolean[] zArr = vVar.f31844m;
            i10 = 0;
            for (int i12 = 0; i12 < iL; i12++) {
                int iH2 = d10.H();
                i10 += iH2;
                zArr[i12] = iH2 > i11;
            }
        } else {
            i10 = iH * iL;
            Arrays.fill(vVar.f31844m, 0, iL, iH > i11);
        }
        Arrays.fill(vVar.f31844m, iL, vVar.f31837f, false);
        if (i10 > 0) {
            vVar.d(i10);
        }
    }

    private static void D(c.b bVar, String str, v vVar) throws ParserException {
        byte[] bArr = null;
        D d10 = null;
        D d11 = null;
        for (int i10 = 0; i10 < bVar.f128076c.size(); i10++) {
            c.C2018c c2018c = bVar.f128076c.get(i10);
            D d12 = c2018c.f128078b;
            int i11 = c2018c.f128074a;
            if (i11 == 1935828848) {
                d12.W(12);
                if (d12.q() == 1936025959) {
                    d10 = d12;
                }
            } else if (i11 == 1936158820) {
                d12.W(12);
                if (d12.q() == 1936025959) {
                    d11 = d12;
                }
            }
        }
        if (d10 == null || d11 == null) {
            return;
        }
        d10.W(8);
        int iN = R3.b.n(d10.q());
        d10.X(4);
        if (iN == 1) {
            d10.X(4);
        }
        if (d10.q() != 1) {
            throw ParserException.c("Entry count in sbgp != 1 (unsupported).");
        }
        d11.W(8);
        int iN2 = R3.b.n(d11.q());
        d11.X(4);
        if (iN2 == 1) {
            if (d11.J() == 0) {
                throw ParserException.c("Variable length description in sgpd found (unsupported)");
            }
        } else if (iN2 >= 2) {
            d11.X(4);
        }
        if (d11.J() != 1) {
            throw ParserException.c("Entry count in sgpd != 1 (unsupported).");
        }
        d11.X(1);
        int iH = d11.H();
        int i12 = (iH & 240) >> 4;
        int i13 = iH & 15;
        boolean z10 = d11.H() == 1;
        if (z10) {
            int iH2 = d11.H();
            byte[] bArr2 = new byte[16];
            d11.l(bArr2, 0, 16);
            if (iH2 == 0) {
                int iH3 = d11.H();
                bArr = new byte[iH3];
                d11.l(bArr, 0, iH3);
            }
            vVar.f31843l = true;
            vVar.f31845n = new u(z10, str, iH2, bArr2, i12, i13, bArr);
        }
    }

    private static void E(D d10, int i10, v vVar) throws ParserException {
        d10.W(i10 + 8);
        int iM = R3.b.m(d10.q());
        if ((iM & 1) != 0) {
            throw ParserException.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (iM & 2) != 0;
        int iL = d10.L();
        if (iL == 0) {
            Arrays.fill(vVar.f31844m, 0, vVar.f31837f, false);
            return;
        }
        if (iL == vVar.f31837f) {
            Arrays.fill(vVar.f31844m, 0, iL, z10);
            vVar.d(d10.a());
            vVar.a(d10);
        } else {
            throw ParserException.a("Senc sample count " + iL + " is different from fragment sample count" + vVar.f31837f, null);
        }
    }

    private static Pair<Long, C18002g> G(D d10, long j10) throws ParserException {
        long jO;
        long jO2;
        d10.W(8);
        int iN = R3.b.n(d10.q());
        d10.X(4);
        long J10 = d10.J();
        if (iN == 0) {
            jO = d10.J();
            jO2 = d10.J();
        } else {
            jO = d10.O();
            jO2 = d10.O();
        }
        long j11 = j10 + jO2;
        long jV0 = P.V0(jO, 1000000L, J10);
        d10.X(2);
        int iP = d10.P();
        int[] iArr = new int[iP];
        long[] jArr = new long[iP];
        long[] jArr2 = new long[iP];
        long[] jArr3 = new long[iP];
        long j12 = j11;
        long jV02 = jV0;
        int i10 = 0;
        while (i10 < iP) {
            int iQ = d10.q();
            if ((Integer.MIN_VALUE & iQ) != 0) {
                throw ParserException.a("Unhandled indirect reference", null);
            }
            long J11 = d10.J();
            iArr[i10] = iQ & a.e.API_PRIORITY_OTHER;
            jArr[i10] = j12;
            jArr3[i10] = jV02;
            jO += J11;
            long[] jArr4 = jArr3;
            jV02 = P.V0(jO, 1000000L, J10);
            jArr2[i10] = jV02 - jArr4[i10];
            d10.X(4);
            j12 += iArr[i10];
            i10++;
            jArr3 = jArr4;
        }
        return Pair.create(Long.valueOf(jV0), new C18002g(iArr, jArr, jArr2, jArr3));
    }

    private static long H(D d10) {
        d10.W(8);
        return R3.b.n(d10.q()) == 1 ? d10.O() : d10.J();
    }

    private static b I(D d10, SparseArray<b> sparseArray, boolean z10) {
        d10.W(8);
        int iM = R3.b.m(d10.q());
        b bVarValueAt = z10 ? sparseArray.valueAt(0) : sparseArray.get(d10.q());
        if (bVarValueAt == null) {
            return null;
        }
        if ((iM & 1) != 0) {
            long jO = d10.O();
            v vVar = bVarValueAt.f31748b;
            vVar.f31834c = jO;
            vVar.f31835d = jO;
        }
        c cVar = bVarValueAt.f31751e;
        bVarValueAt.f31748b.f31832a = new c((iM & 2) != 0 ? d10.q() - 1 : cVar.f31691a, (iM & 8) != 0 ? d10.q() : cVar.f31692b, (iM & 16) != 0 ? d10.q() : cVar.f31693c, (iM & 32) != 0 ? d10.q() : cVar.f31694d);
        return bVarValueAt;
    }

    private static Pair<Integer, c> K(D d10) {
        d10.W(12);
        return Pair.create(Integer.valueOf(d10.q()), new c(d10.q() - 1, d10.q(), d10.q(), d10.q()));
    }

    private static int L(b bVar, int i10, int i11, D d10, int i12) throws ParserException {
        boolean z10;
        int iQ;
        int i13;
        int iQ2;
        int i14;
        int iQ3;
        int i15;
        int iQ4;
        d10.W(8);
        int iM = R3.b.m(d10.q());
        t tVar = bVar.f31750d.f31850a;
        v vVar = bVar.f31748b;
        c cVar = (c) P.h(vVar.f31832a);
        vVar.f31839h[i10] = d10.L();
        long[] jArr = vVar.f31838g;
        long j10 = vVar.f31834c;
        jArr[i10] = j10;
        if ((iM & 1) != 0) {
            jArr[i10] = j10 + d10.q();
        }
        boolean z11 = (iM & 4) != 0;
        int iQ5 = cVar.f31694d;
        if (z11) {
            iQ5 = d10.q();
        }
        boolean z12 = (iM & 256) != 0;
        boolean z13 = (iM & 512) != 0;
        boolean z14 = (iM & 1024) != 0;
        boolean z15 = (iM & RecyclerView.m.FLAG_MOVED) != 0;
        long j11 = r(tVar) ? ((long[]) P.h(tVar.f31824j))[0] : 0L;
        int[] iArr = vVar.f31840i;
        long[] jArr2 = vVar.f31841j;
        boolean[] zArr = vVar.f31842k;
        boolean z16 = z15;
        boolean z17 = tVar.f31816b == 2 && (i11 & 1) != 0;
        int i16 = i12 + vVar.f31839h[i10];
        boolean z18 = z11;
        long j12 = tVar.f31817c;
        long j13 = vVar.f31848q;
        int i17 = i12;
        while (i17 < i16) {
            if (z12) {
                iQ = d10.q();
                z10 = z17;
            } else {
                z10 = z17;
                iQ = cVar.f31692b;
            }
            int iH = h(iQ);
            if (z13) {
                iQ2 = d10.q();
                i13 = i16;
            } else {
                i13 = i16;
                iQ2 = cVar.f31693c;
            }
            int iH2 = h(iQ2);
            if (z14) {
                i14 = iH2;
                iQ3 = d10.q();
            } else if (i17 == 0 && z18) {
                i14 = iH2;
                iQ3 = iQ5;
            } else {
                i14 = iH2;
                iQ3 = cVar.f31694d;
            }
            if (z16) {
                i15 = iQ3;
                iQ4 = d10.q();
            } else {
                i15 = iQ3;
                iQ4 = 0;
            }
            int i18 = i17;
            long jV0 = P.V0((iQ4 + j13) - j11, 1000000L, j12);
            jArr2[i18] = jV0;
            if (!vVar.f31849r) {
                jArr2[i18] = jV0 + bVar.f31750d.f31857h;
            }
            iArr[i18] = i14;
            zArr[i18] = ((i15 >> 16) & 1) == 0 && (!z10 || i18 == 0);
            j13 += iH;
            i17 = i18 + 1;
            i16 = i13;
            z17 = z10;
        }
        int i19 = i16;
        vVar.f31848q = j13;
        return i19;
    }

    private static void M(c.b bVar, b bVar2, int i10) throws ParserException {
        List<c.C2018c> list = bVar.f128076c;
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            c.C2018c c2018c = list.get(i13);
            if (c2018c.f128074a == 1953658222) {
                D d10 = c2018c.f128078b;
                d10.W(12);
                int iL = d10.L();
                if (iL > 0) {
                    i12 += iL;
                    i11++;
                }
            }
        }
        bVar2.f31754h = 0;
        bVar2.f31753g = 0;
        bVar2.f31752f = 0;
        bVar2.f31748b.e(i11, i12);
        int i14 = 0;
        int iL2 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            c.C2018c c2018c2 = list.get(i15);
            if (c2018c2.f128074a == 1953658222) {
                iL2 = L(bVar2, i14, i10, c2018c2.f128078b, iL2);
                i14++;
            }
        }
    }

    private static void N(D d10, v vVar, byte[] bArr) throws ParserException {
        d10.W(8);
        d10.l(bArr, 0, 16);
        if (Arrays.equals(bArr, f31704N)) {
            E(d10, 16, vVar);
        }
    }

    private void O(long j10) throws ParserException {
        while (!this.f31731n.isEmpty() && this.f31731n.peek().f128075b == j10) {
            t(this.f31731n.pop());
        }
        l();
    }

    private boolean P(InterfaceC18012q interfaceC18012q) throws IOException {
        if (this.f31739v == 0) {
            if (!interfaceC18012q.f(this.f31730m.e(), 0, 8, true)) {
                return false;
            }
            this.f31739v = 8;
            this.f31730m.W(0);
            this.f31738u = this.f31730m.J();
            this.f31737t = this.f31730m.q();
        }
        long j10 = this.f31738u;
        if (j10 == 1) {
            interfaceC18012q.readFully(this.f31730m.e(), 8, 8);
            this.f31739v += 8;
            this.f31738u = this.f31730m.O();
        } else if (j10 == 0) {
            long length = interfaceC18012q.getLength();
            if (length == -1 && !this.f31731n.isEmpty()) {
                length = this.f31731n.peek().f128075b;
            }
            if (length != -1) {
                this.f31738u = (length - interfaceC18012q.getPosition()) + this.f31739v;
            }
        }
        if (this.f31738u < this.f31739v) {
            throw ParserException.c("Atom size less than header length (unsupported).");
        }
        long position = interfaceC18012q.getPosition() - this.f31739v;
        int i10 = this.f31737t;
        if ((i10 == 1836019558 || i10 == 1835295092) && !this.f31717L) {
            this.f31714I.g(new J.b(this.f31706A, position));
            this.f31717L = true;
        }
        if (this.f31737t == 1836019558) {
            int size = this.f31722e.size();
            for (int i11 = 0; i11 < size; i11++) {
                v vVar = this.f31722e.valueAt(i11).f31748b;
                vVar.f31833b = position;
                vVar.f31835d = position;
                vVar.f31834c = position;
            }
        }
        int i12 = this.f31737t;
        if (i12 == 1835295092) {
            this.f31708C = null;
            this.f31741x = position + this.f31738u;
            this.f31736s = 2;
            return true;
        }
        if (T(i12)) {
            long position2 = (interfaceC18012q.getPosition() + this.f31738u) - 8;
            this.f31731n.push(new c.b(this.f31737t, position2));
            if (this.f31738u == this.f31739v) {
                O(position2);
            } else {
                l();
            }
        } else if (U(this.f31737t)) {
            if (this.f31739v != 8) {
                throw ParserException.c("Leaf atom defines extended atom size (unsupported).");
            }
            if (this.f31738u > 2147483647L) {
                throw ParserException.c("Leaf atom with length > 2147483647 (unsupported).");
            }
            D d10 = new D((int) this.f31738u);
            System.arraycopy(this.f31730m.e(), 0, d10.e(), 0, 8);
            this.f31740w = d10;
            this.f31736s = 1;
        } else {
            if (this.f31738u > 2147483647L) {
                throw ParserException.c("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.f31740w = null;
            this.f31736s = 1;
        }
        return true;
    }

    private void Q(InterfaceC18012q interfaceC18012q) throws IOException {
        int i10 = (int) (this.f31738u - this.f31739v);
        D d10 = this.f31740w;
        if (d10 != null) {
            interfaceC18012q.readFully(d10.e(), 8, i10);
            v(new c.C2018c(this.f31737t, d10), interfaceC18012q.getPosition());
        } else {
            interfaceC18012q.k(i10);
        }
        O(interfaceC18012q.getPosition());
    }

    private void R(InterfaceC18012q interfaceC18012q) throws IOException {
        int size = this.f31722e.size();
        long j10 = Long.MAX_VALUE;
        b bVarValueAt = null;
        for (int i10 = 0; i10 < size; i10++) {
            v vVar = this.f31722e.valueAt(i10).f31748b;
            if (vVar.f31847p) {
                long j11 = vVar.f31835d;
                if (j11 < j10) {
                    bVarValueAt = this.f31722e.valueAt(i10);
                    j10 = j11;
                }
            }
        }
        if (bVarValueAt == null) {
            this.f31736s = 3;
            return;
        }
        int position = (int) (j10 - interfaceC18012q.getPosition());
        if (position < 0) {
            throw ParserException.a("Offset to encryption data was negative.", null);
        }
        interfaceC18012q.k(position);
        bVarValueAt.f31748b.b(interfaceC18012q);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean S(x3.InterfaceC18012q r17) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R3.h.S(x3.q):boolean");
    }

    public static /* synthetic */ InterfaceC18011p[] f() {
        return new InterfaceC18011p[]{new h(r.a.f35728a, 32)};
    }

    private boolean g(a3.t tVar) {
        return Objects.equals(tVar.f43949o, "video/avc") ? (this.f31719b & 64) != 0 : Objects.equals(tVar.f43949o, "video/hevc") && (this.f31719b & 128) != 0;
    }

    private static int h(int i10) throws ParserException {
        if (i10 >= 0) {
            return i10;
        }
        throw ParserException.a("Unexpected negative value: " + i10, null);
    }

    public static int k(int i10) {
        int i11 = (i10 & 1) != 0 ? 64 : 0;
        return (i10 & 2) != 0 ? i11 | 128 : i11;
    }

    private static boolean r(t tVar) {
        long[] jArr = tVar.f31823i;
        if (jArr != null && jArr.length == 1 && tVar.f31824j != null) {
            long j10 = jArr[0];
            if (j10 == 0 || P.V0(j10, 1000000L, tVar.f31818d) + P.V0(tVar.f31824j[0], 1000000L, tVar.f31817c) >= tVar.f31819e) {
                return true;
            }
        }
        return false;
    }

    private void t(c.b bVar) throws ParserException {
        int i10 = bVar.f128074a;
        if (i10 == 1836019574) {
            x(bVar);
        } else if (i10 == 1836019558) {
            w(bVar);
        } else {
            if (this.f31731n.isEmpty()) {
                return;
            }
            this.f31731n.peek().b(bVar);
        }
    }

    private void u(D d10) {
        String str;
        String str2;
        long jV0;
        long jV02;
        long J10;
        long jA;
        if (this.f31715J.length == 0) {
            return;
        }
        d10.W(8);
        int iN = R3.b.n(d10.q());
        if (iN == 0) {
            str = (String) C13466a.e(d10.B());
            str2 = (String) C13466a.e(d10.B());
            long J11 = d10.J();
            jV0 = P.V0(d10.J(), 1000000L, J11);
            long j10 = this.f31707B;
            long j11 = j10 != -9223372036854775807L ? j10 + jV0 : -9223372036854775807L;
            jV02 = P.V0(d10.J(), 1000L, J11);
            J10 = d10.J();
            jA = j11;
        } else {
            if (iN != 1) {
                d3.r.i("FragmentedMp4Extractor", "Skipping unsupported emsg version: " + iN);
                return;
            }
            long J12 = d10.J();
            jA = P.V0(d10.O(), 1000000L, J12);
            long jV03 = P.V0(d10.J(), 1000L, J12);
            long J13 = d10.J();
            str = (String) C13466a.e(d10.B());
            str2 = (String) C13466a.e(d10.B());
            jV02 = jV03;
            J10 = J13;
            jV0 = -9223372036854775807L;
        }
        String str3 = str;
        String str4 = str2;
        byte[] bArr = new byte[d10.a()];
        d10.l(bArr, 0, d10.a());
        D d11 = new D(this.f31729l.a(new I3.a(str3, str4, jV02, J10, bArr)));
        int iA = d11.a();
        for (O o10 : this.f31715J) {
            d11.W(0);
            o10.d(d11, iA);
        }
        if (jA == -9223372036854775807L) {
            this.f31732o.addLast(new a(jV0, true, iA));
            this.f31742y += iA;
            return;
        }
        if (!this.f31732o.isEmpty()) {
            this.f31732o.addLast(new a(jA, false, iA));
            this.f31742y += iA;
            return;
        }
        d3.J j12 = this.f31728k;
        if (j12 != null && !j12.g()) {
            this.f31732o.addLast(new a(jA, false, iA));
            this.f31742y += iA;
            return;
        }
        d3.J j13 = this.f31728k;
        if (j13 != null) {
            jA = j13.a(jA);
        }
        long j14 = jA;
        for (O o11 : this.f31715J) {
            o11.c(j14, 1, iA, 0, null);
        }
    }

    private void v(c.C2018c c2018c, long j10) throws ParserException {
        if (!this.f31731n.isEmpty()) {
            this.f31731n.peek().c(c2018c);
            return;
        }
        int i10 = c2018c.f128074a;
        if (i10 != 1936286840) {
            if (i10 == 1701671783) {
                u(c2018c.f128078b);
            }
        } else {
            Pair<Long, C18002g> pairG = G(c2018c.f128078b, j10);
            this.f31707B = ((Long) pairG.first).longValue();
            this.f31714I.g((x3.J) pairG.second);
            this.f31717L = true;
        }
    }

    private void w(c.b bVar) throws ParserException {
        A(bVar, this.f31722e, this.f31720c != null, this.f31719b, this.f31726i);
        a3.o oVarN = n(bVar.f128076c);
        if (oVarN != null) {
            int size = this.f31722e.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f31722e.valueAt(i10).n(oVarN);
            }
        }
        if (this.f31743z != -9223372036854775807L) {
            int size2 = this.f31722e.size();
            for (int i11 = 0; i11 < size2; i11++) {
                this.f31722e.valueAt(i11).l(this.f31743z);
            }
            this.f31743z = -9223372036854775807L;
        }
    }

    private void x(c.b bVar) throws ParserException {
        int i10 = 0;
        C13466a.h(this.f31720c == null, "Unexpected moov box.");
        a3.o oVarN = n(bVar.f128076c);
        c.b bVar2 = (c.b) C13466a.e(bVar.d(1836475768));
        SparseArray<c> sparseArray = new SparseArray<>();
        int size = bVar2.f128076c.size();
        long jZ = -9223372036854775807L;
        for (int i11 = 0; i11 < size; i11++) {
            c.C2018c c2018c = bVar2.f128076c.get(i11);
            int i12 = c2018c.f128074a;
            if (i12 == 1953654136) {
                Pair<Integer, c> pairK = K(c2018c.f128078b);
                sparseArray.put(((Integer) pairK.first).intValue(), (c) pairK.second);
            } else if (i12 == 1835362404) {
                jZ = z(c2018c.f128078b);
            }
        }
        List<w> listE = R3.b.E(bVar, new B(), jZ, oVarN, (this.f31719b & 16) != 0, false, new Be.g() { // from class: R3.e
            @Override // Be.g
            public final Object apply(Object obj) {
                return this.f31701a.s((t) obj);
            }
        });
        int size2 = listE.size();
        if (this.f31722e.size() != 0) {
            C13466a.g(this.f31722e.size() == size2);
            while (i10 < size2) {
                w wVar = listE.get(i10);
                t tVar = wVar.f31850a;
                this.f31722e.get(tVar.f31815a).j(wVar, m(sparseArray, tVar.f31815a));
                i10++;
            }
            return;
        }
        String strB = k.b(listE);
        while (i10 < size2) {
            w wVar2 = listE.get(i10);
            t tVar2 = wVar2.f31850a;
            O oT = this.f31714I.t(i10, tVar2.f31816b);
            oT.f(tVar2.f31819e);
            this.f31722e.put(tVar2.f31815a, new b(oT, wVar2, m(sparseArray, tVar2.f31815a), strB));
            this.f31706A = Math.max(this.f31706A, tVar2.f31819e);
            i10++;
        }
        this.f31714I.p();
    }

    private void y(long j10) {
        while (!this.f31732o.isEmpty()) {
            a aVarRemoveFirst = this.f31732o.removeFirst();
            this.f31742y -= aVarRemoveFirst.f31746c;
            long jA = aVarRemoveFirst.f31744a;
            if (aVarRemoveFirst.f31745b) {
                jA += j10;
            }
            d3.J j11 = this.f31728k;
            if (j11 != null) {
                jA = j11.a(jA);
            }
            long j12 = jA;
            for (O o10 : this.f31715J) {
                o10.c(j12, 1, aVarRemoveFirst.f31746c, this.f31742y, null);
            }
        }
    }

    private static long z(D d10) {
        d10.W(8);
        return R3.b.n(d10.q()) == 0 ? d10.J() : d10.O();
    }

    @Override // x3.InterfaceC18011p
    public void a(long j10, long j11) {
        int size = this.f31722e.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f31722e.valueAt(i10).k();
        }
        this.f31732o.clear();
        this.f31742y = 0;
        this.f31733p.b();
        this.f31743z = j11;
        this.f31731n.clear();
        l();
    }

    @Override // x3.InterfaceC18011p
    public int b(InterfaceC18012q interfaceC18012q, I i10) throws IOException {
        while (true) {
            int i11 = this.f31736s;
            if (i11 != 0) {
                if (i11 == 1) {
                    Q(interfaceC18012q);
                } else if (i11 == 2) {
                    R(interfaceC18012q);
                } else if (S(interfaceC18012q)) {
                    return 0;
                }
            } else if (!P(interfaceC18012q)) {
                this.f31733p.d();
                return -1;
            }
        }
    }

    @Override // x3.InterfaceC18011p
    public void c(x3.r rVar) {
        if ((this.f31719b & 32) == 0) {
            rVar = new U3.s(rVar, this.f31718a);
        }
        this.f31714I = rVar;
        l();
        q();
        t tVar = this.f31720c;
        if (tVar != null) {
            this.f31722e.put(0, new b(this.f31714I.t(0, tVar.f31816b), new w(this.f31720c, new long[0], new int[0], 0, new long[0], new int[0], 0L), new c(0, 0, 0, 0), k.a(this.f31720c.f31821g)));
            this.f31714I.p();
        }
    }

    @Override // x3.InterfaceC18011p
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public L<N> i() {
        return this.f31735r;
    }

    public h(r.a aVar, int i10, d3.J j10, t tVar, List<a3.t> list, O o10) {
        this.f31718a = aVar;
        this.f31719b = i10;
        this.f31728k = j10;
        this.f31720c = tVar;
        this.f31721d = Collections.unmodifiableList(list);
        this.f31734q = o10;
        this.f31729l = new I3.c();
        this.f31730m = new D(16);
        this.f31723f = new D(e3.f.f128084a);
        this.f31724g = new D(6);
        this.f31725h = new D();
        byte[] bArr = new byte[16];
        this.f31726i = bArr;
        this.f31727j = new D(bArr);
        this.f31731n = new ArrayDeque<>();
        this.f31732o = new ArrayDeque<>();
        this.f31722e = new SparseArray<>();
        this.f31735r = L.x();
        this.f31706A = -9223372036854775807L;
        this.f31743z = -9223372036854775807L;
        this.f31707B = -9223372036854775807L;
        this.f31714I = x3.r.f169253y3;
        this.f31715J = new O[0];
        this.f31716K = new O[0];
        this.f31733p = new e3.i(new i.b() { // from class: R3.g
            @Override // e3.i.b
            public final void a(long j11, D d10) {
                C18001f.a(j11, d10, this.f31702a.f31716K);
            }
        });
    }

    private static void J(c.b bVar, SparseArray<b> sparseArray, boolean z10, int i10, byte[] bArr) throws ParserException {
        String str;
        b bVarI = I(((c.C2018c) C13466a.e(bVar.e(1952868452))).f128078b, sparseArray, z10);
        if (bVarI != null) {
            v vVar = bVarI.f31748b;
            long j10 = vVar.f31848q;
            boolean z11 = vVar.f31849r;
            bVarI.k();
            bVarI.f31759m = true;
            c.C2018c c2018cE = bVar.e(1952867444);
            if (c2018cE != null && (i10 & 2) == 0) {
                vVar.f31848q = H(c2018cE.f128078b);
                vVar.f31849r = true;
            } else {
                vVar.f31848q = j10;
                vVar.f31849r = z11;
            }
            M(bVar, bVarI, i10);
            u uVarB = bVarI.f31750d.f31850a.b(((c) C13466a.e(vVar.f31832a)).f31691a);
            c.C2018c c2018cE2 = bVar.e(1935763834);
            if (c2018cE2 != null) {
                C((u) C13466a.e(uVarB), c2018cE2.f128078b, vVar);
            }
            c.C2018c c2018cE3 = bVar.e(1935763823);
            if (c2018cE3 != null) {
                B(c2018cE3.f128078b, vVar);
            }
            c.C2018c c2018cE4 = bVar.e(1936027235);
            if (c2018cE4 != null) {
                F(c2018cE4.f128078b, vVar);
            }
            if (uVarB != null) {
                str = uVarB.f31828b;
            } else {
                str = null;
            }
            D(bVar, str, vVar);
            int size = bVar.f128076c.size();
            for (int i11 = 0; i11 < size; i11++) {
                c.C2018c c2018c = bVar.f128076c.get(i11);
                if (c2018c.f128074a == 1970628964) {
                    N(c2018c.f128078b, vVar, bArr);
                }
            }
        }
    }

    private static boolean T(int i10) {
        if (i10 != 1836019574 && i10 != 1953653099 && i10 != 1835297121 && i10 != 1835626086 && i10 != 1937007212 && i10 != 1836019558 && i10 != 1953653094 && i10 != 1836475768 && i10 != 1701082227) {
            return false;
        }
        return true;
    }

    private static boolean U(int i10) {
        if (i10 != 1751411826 && i10 != 1835296868 && i10 != 1836476516 && i10 != 1936286840 && i10 != 1937011556 && i10 != 1937011827 && i10 != 1668576371 && i10 != 1937011555 && i10 != 1937011578 && i10 != 1937013298 && i10 != 1937007471 && i10 != 1668232756 && i10 != 1937011571 && i10 != 1952867444 && i10 != 1952868452 && i10 != 1953196132 && i10 != 1953654136 && i10 != 1953658222 && i10 != 1886614376 && i10 != 1935763834 && i10 != 1935763823 && i10 != 1936027235 && i10 != 1970628964 && i10 != 1935828848 && i10 != 1936158820 && i10 != 1701606260 && i10 != 1835362404 && i10 != 1701671783) {
            return false;
        }
        return true;
    }

    private c m(SparseArray<c> sparseArray, int i10) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (c) C13466a.e(sparseArray.get(i10));
    }

    private static a3.o n(List<c.C2018c> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            c.C2018c c2018c = list.get(i10);
            if (c2018c.f128074a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArrE = c2018c.f128078b.e();
                UUID uuidF = p.f(bArrE);
                if (uuidF == null) {
                    d3.r.i("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new o.b(uuidF, "video/mp4", bArrE));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new a3.o(arrayList);
    }

    private static b o(SparseArray<b> sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j10 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            b bVarValueAt = sparseArray.valueAt(i10);
            if ((bVarValueAt.f31759m || bVarValueAt.f31752f != bVarValueAt.f31750d.f31851b) && (!bVarValueAt.f31759m || bVarValueAt.f31754h != bVarValueAt.f31748b.f31836e)) {
                long jD = bVarValueAt.d();
                if (jD < j10) {
                    bVar = bVarValueAt;
                    j10 = jD;
                }
            }
        }
        return bVar;
    }

    @Override // x3.InterfaceC18011p
    public boolean j(InterfaceC18012q interfaceC18012q) throws IOException {
        L<N> lX;
        N nB = s.b(interfaceC18012q);
        if (nB != null) {
            lX = L.y(nB);
        } else {
            lX = L.x();
        }
        this.f31735r = lX;
        if (nB == null) {
            return true;
        }
        return false;
    }
}
