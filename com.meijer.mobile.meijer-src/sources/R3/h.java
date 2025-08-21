package R3;

import Ee.L;
import U3.r;
import a3.o;
import a3.t;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.a;
import com.medallia.digital.mobilesdk.l3;
import d3.C13599a;
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
import x3.C18067f;
import x3.C18068g;
import x3.I;
import x3.InterfaceC18077p;
import x3.InterfaceC18078q;
import x3.J;
import x3.N;
import x3.O;

/* loaded from: classes4.dex */
public class h implements InterfaceC18077p {

    /* renamed from: M, reason: collision with root package name */
    @Deprecated
    public static final x3.u f31705M = new x3.u() { // from class: R3.f
        @Override // x3.u
        public final InterfaceC18077p[] f() {
            return h.f();
        }
    };

    /* renamed from: N, reason: collision with root package name */
    private static final byte[] f31706N = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: O, reason: collision with root package name */
    private static final a3.t f31707O = new t.b().u0("application/x-emsg").N();

    /* renamed from: A, reason: collision with root package name */
    private long f31708A;

    /* renamed from: B, reason: collision with root package name */
    private long f31709B;

    /* renamed from: C, reason: collision with root package name */
    private b f31710C;

    /* renamed from: D, reason: collision with root package name */
    private int f31711D;

    /* renamed from: E, reason: collision with root package name */
    private int f31712E;

    /* renamed from: F, reason: collision with root package name */
    private int f31713F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f31714G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f31715H;

    /* renamed from: I, reason: collision with root package name */
    private x3.r f31716I;

    /* renamed from: J, reason: collision with root package name */
    private O[] f31717J;

    /* renamed from: K, reason: collision with root package name */
    private O[] f31718K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f31719L;

    /* renamed from: a, reason: collision with root package name */
    private final r.a f31720a;

    /* renamed from: b, reason: collision with root package name */
    private final int f31721b;

    /* renamed from: c, reason: collision with root package name */
    private final t f31722c;

    /* renamed from: d, reason: collision with root package name */
    private final List<a3.t> f31723d;

    /* renamed from: e, reason: collision with root package name */
    private final SparseArray<b> f31724e;

    /* renamed from: f, reason: collision with root package name */
    private final D f31725f;

    /* renamed from: g, reason: collision with root package name */
    private final D f31726g;

    /* renamed from: h, reason: collision with root package name */
    private final D f31727h;

    /* renamed from: i, reason: collision with root package name */
    private final byte[] f31728i;

    /* renamed from: j, reason: collision with root package name */
    private final D f31729j;

    /* renamed from: k, reason: collision with root package name */
    private final J f31730k;

    /* renamed from: l, reason: collision with root package name */
    private final I3.c f31731l;

    /* renamed from: m, reason: collision with root package name */
    private final D f31732m;

    /* renamed from: n, reason: collision with root package name */
    private final ArrayDeque<c.b> f31733n;

    /* renamed from: o, reason: collision with root package name */
    private final ArrayDeque<a> f31734o;

    /* renamed from: p, reason: collision with root package name */
    private final e3.i f31735p;

    /* renamed from: q, reason: collision with root package name */
    private final O f31736q;

    /* renamed from: r, reason: collision with root package name */
    private L<N> f31737r;

    /* renamed from: s, reason: collision with root package name */
    private int f31738s;

    /* renamed from: t, reason: collision with root package name */
    private int f31739t;

    /* renamed from: u, reason: collision with root package name */
    private long f31740u;

    /* renamed from: v, reason: collision with root package name */
    private int f31741v;

    /* renamed from: w, reason: collision with root package name */
    private D f31742w;

    /* renamed from: x, reason: collision with root package name */
    private long f31743x;

    /* renamed from: y, reason: collision with root package name */
    private int f31744y;

    /* renamed from: z, reason: collision with root package name */
    private long f31745z;

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final O f31749a;

        /* renamed from: d, reason: collision with root package name */
        public w f31752d;

        /* renamed from: e, reason: collision with root package name */
        public c f31753e;

        /* renamed from: f, reason: collision with root package name */
        public int f31754f;

        /* renamed from: g, reason: collision with root package name */
        public int f31755g;

        /* renamed from: h, reason: collision with root package name */
        public int f31756h;

        /* renamed from: i, reason: collision with root package name */
        public int f31757i;

        /* renamed from: j, reason: collision with root package name */
        private final String f31758j;

        /* renamed from: m, reason: collision with root package name */
        private boolean f31761m;

        /* renamed from: b, reason: collision with root package name */
        public final v f31750b = new v();

        /* renamed from: c, reason: collision with root package name */
        public final D f31751c = new D();

        /* renamed from: k, reason: collision with root package name */
        private final D f31759k = new D(1);

        /* renamed from: l, reason: collision with root package name */
        private final D f31760l = new D();

        public int c() {
            int i10 = !this.f31761m ? this.f31752d.f31858g[this.f31754f] : this.f31750b.f31844k[this.f31754f] ? 1 : 0;
            return g() != null ? i10 | 1073741824 : i10;
        }

        public long d() {
            return !this.f31761m ? this.f31752d.f31854c[this.f31754f] : this.f31750b.f31840g[this.f31756h];
        }

        public long e() {
            return !this.f31761m ? this.f31752d.f31857f[this.f31754f] : this.f31750b.c(this.f31754f);
        }

        public int f() {
            return !this.f31761m ? this.f31752d.f31855d[this.f31754f] : this.f31750b.f31842i[this.f31754f];
        }

        public u g() {
            if (!this.f31761m) {
                return null;
            }
            int i10 = ((c) P.h(this.f31750b.f31834a)).f31693a;
            u uVarB = this.f31750b.f31847n;
            if (uVarB == null) {
                uVarB = this.f31752d.f31852a.b(i10);
            }
            if (uVarB == null || !uVarB.f31829a) {
                return null;
            }
            return uVarB;
        }

        public boolean h() {
            this.f31754f++;
            if (!this.f31761m) {
                return false;
            }
            int i10 = this.f31755g + 1;
            this.f31755g = i10;
            int[] iArr = this.f31750b.f31841h;
            int i11 = this.f31756h;
            if (i10 != iArr[i11]) {
                return true;
            }
            this.f31756h = i11 + 1;
            this.f31755g = 0;
            return false;
        }

        public void j(w wVar, c cVar) {
            this.f31752d = wVar;
            this.f31753e = cVar;
            this.f31749a.b(wVar.f31852a.f31823g.b().U(this.f31758j).N());
            k();
        }

        public void k() {
            this.f31750b.f();
            this.f31754f = 0;
            this.f31756h = 0;
            this.f31755g = 0;
            this.f31757i = 0;
            this.f31761m = false;
        }

        public void l(long j10) {
            int i10 = this.f31754f;
            while (true) {
                v vVar = this.f31750b;
                if (i10 >= vVar.f31839f || vVar.c(i10) > j10) {
                    return;
                }
                if (this.f31750b.f31844k[i10]) {
                    this.f31757i = i10;
                }
                i10++;
            }
        }

        public void n(a3.o oVar) {
            u uVarB = this.f31752d.f31852a.b(((c) P.h(this.f31750b.f31834a)).f31693a);
            this.f31749a.b(this.f31752d.f31852a.f31823g.b().U(this.f31758j).Y(oVar.b(uVarB != null ? uVarB.f31830b : null)).N());
        }

        public b(O o10, w wVar, c cVar, String str) {
            this.f31749a = o10;
            this.f31752d = wVar;
            this.f31753e = cVar;
            this.f31758j = str;
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
            int length = uVarG.f31832d;
            if (length != 0) {
                d10 = this.f31750b.f31848o;
            } else {
                byte[] bArr = (byte[]) P.h(uVarG.f31833e);
                this.f31760l.U(bArr, bArr.length);
                D d11 = this.f31760l;
                length = bArr.length;
                d10 = d11;
            }
            boolean zG = this.f31750b.g(this.f31754f);
            if (!zG && i11 == 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            byte[] bArrE = this.f31759k.e();
            if (z10) {
                i12 = 128;
            } else {
                i12 = 0;
            }
            bArrE[0] = (byte) (i12 | length);
            this.f31759k.W(0);
            this.f31749a.e(this.f31759k, 1, 1);
            this.f31749a.e(d10, length, 1);
            if (!z10) {
                return length + 1;
            }
            if (!zG) {
                this.f31751c.S(8);
                byte[] bArrE2 = this.f31751c.e();
                bArrE2[0] = 0;
                bArrE2[1] = 1;
                bArrE2[2] = (byte) ((i11 >> 8) & l3.f93323c);
                bArrE2[3] = (byte) (i11 & l3.f93323c);
                bArrE2[4] = (byte) ((i10 >> 24) & l3.f93323c);
                bArrE2[5] = (byte) ((i10 >> 16) & l3.f93323c);
                bArrE2[6] = (byte) ((i10 >> 8) & l3.f93323c);
                bArrE2[7] = (byte) (i10 & l3.f93323c);
                this.f31749a.e(this.f31751c, 8, 1);
                return length + 9;
            }
            D d12 = this.f31750b.f31848o;
            int iP = d12.P();
            d12.X(-2);
            int i13 = (iP * 6) + 2;
            if (i11 != 0) {
                this.f31751c.S(i13);
                byte[] bArrE3 = this.f31751c.e();
                d12.l(bArrE3, 0, i13);
                int i14 = (((bArrE3[2] & 255) << 8) | (bArrE3[3] & 255)) + i11;
                bArrE3[2] = (byte) ((i14 >> 8) & l3.f93323c);
                bArrE3[3] = (byte) (i14 & l3.f93323c);
                d12 = this.f31751c;
            }
            this.f31749a.e(d12, i13, 1);
            return length + 1 + i13;
        }

        public void m() {
            u uVarG = g();
            if (uVarG != null) {
                D d10 = this.f31750b.f31848o;
                int i10 = uVarG.f31832d;
                if (i10 != 0) {
                    d10.X(i10);
                }
                if (this.f31750b.g(this.f31754f)) {
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
        this.f31738s = 0;
        this.f31741v = 0;
    }

    private void q() {
        int i10;
        O[] oArr = new O[2];
        this.f31717J = oArr;
        O o10 = this.f31736q;
        int i11 = 0;
        if (o10 != null) {
            oArr[0] = o10;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i12 = 100;
        if ((this.f31721b & 4) != 0) {
            oArr[i10] = this.f31716I.t(100, 5);
            i12 = 101;
            i10++;
        }
        O[] oArr2 = (O[]) P.R0(this.f31717J, i10);
        this.f31717J = oArr2;
        for (O o11 : oArr2) {
            o11.b(f31707O);
        }
        this.f31718K = new O[this.f31723d.size()];
        while (i11 < this.f31718K.length) {
            O oT = this.f31716I.t(i12, 3);
            oT.b(this.f31723d.get(i11));
            this.f31718K[i11] = oT;
            i11++;
            i12++;
        }
    }

    @Override // x3.InterfaceC18077p
    public void release() {
    }

    protected t s(t tVar) {
        return tVar;
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f31746a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f31747b;

        /* renamed from: c, reason: collision with root package name */
        public final int f31748c;

        public a(long j10, boolean z10, int i10) {
            this.f31746a = j10;
            this.f31747b = z10;
            this.f31748c = i10;
        }
    }

    private static void A(c.b bVar, SparseArray<b> sparseArray, boolean z10, int i10, byte[] bArr) throws ParserException {
        int size = bVar.f129413d.size();
        for (int i11 = 0; i11 < size; i11++) {
            c.b bVar2 = bVar.f129413d.get(i11);
            if (bVar2.f129410a == 1953653094) {
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
            vVar.f31837d += R3.b.n(iQ) == 0 ? d10.J() : d10.O();
        } else {
            throw ParserException.a("Unexpected saio entry count: " + iL, null);
        }
    }

    private static void C(u uVar, D d10, v vVar) throws ParserException {
        int i10;
        int i11 = uVar.f31832d;
        d10.W(8);
        if ((R3.b.m(d10.q()) & 1) == 1) {
            d10.X(8);
        }
        int iH = d10.H();
        int iL = d10.L();
        if (iL > vVar.f31839f) {
            throw ParserException.a("Saiz sample count " + iL + " is greater than fragment sample count" + vVar.f31839f, null);
        }
        if (iH == 0) {
            boolean[] zArr = vVar.f31846m;
            i10 = 0;
            for (int i12 = 0; i12 < iL; i12++) {
                int iH2 = d10.H();
                i10 += iH2;
                zArr[i12] = iH2 > i11;
            }
        } else {
            i10 = iH * iL;
            Arrays.fill(vVar.f31846m, 0, iL, iH > i11);
        }
        Arrays.fill(vVar.f31846m, iL, vVar.f31839f, false);
        if (i10 > 0) {
            vVar.d(i10);
        }
    }

    private static void D(c.b bVar, String str, v vVar) throws ParserException {
        byte[] bArr = null;
        D d10 = null;
        D d11 = null;
        for (int i10 = 0; i10 < bVar.f129412c.size(); i10++) {
            c.C2039c c2039c = bVar.f129412c.get(i10);
            D d12 = c2039c.f129414b;
            int i11 = c2039c.f129410a;
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
            vVar.f31845l = true;
            vVar.f31847n = new u(z10, str, iH2, bArr2, i12, i13, bArr);
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
            Arrays.fill(vVar.f31846m, 0, vVar.f31839f, false);
            return;
        }
        if (iL == vVar.f31839f) {
            Arrays.fill(vVar.f31846m, 0, iL, z10);
            vVar.d(d10.a());
            vVar.a(d10);
        } else {
            throw ParserException.a("Senc sample count " + iL + " is different from fragment sample count" + vVar.f31839f, null);
        }
    }

    private static Pair<Long, C18068g> G(D d10, long j10) throws ParserException {
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
        return Pair.create(Long.valueOf(jV0), new C18068g(iArr, jArr, jArr2, jArr3));
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
            v vVar = bVarValueAt.f31750b;
            vVar.f31836c = jO;
            vVar.f31837d = jO;
        }
        c cVar = bVarValueAt.f31753e;
        bVarValueAt.f31750b.f31834a = new c((iM & 2) != 0 ? d10.q() - 1 : cVar.f31693a, (iM & 8) != 0 ? d10.q() : cVar.f31694b, (iM & 16) != 0 ? d10.q() : cVar.f31695c, (iM & 32) != 0 ? d10.q() : cVar.f31696d);
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
        t tVar = bVar.f31752d.f31852a;
        v vVar = bVar.f31750b;
        c cVar = (c) P.h(vVar.f31834a);
        vVar.f31841h[i10] = d10.L();
        long[] jArr = vVar.f31840g;
        long j10 = vVar.f31836c;
        jArr[i10] = j10;
        if ((iM & 1) != 0) {
            jArr[i10] = j10 + d10.q();
        }
        boolean z11 = (iM & 4) != 0;
        int iQ5 = cVar.f31696d;
        if (z11) {
            iQ5 = d10.q();
        }
        boolean z12 = (iM & 256) != 0;
        boolean z13 = (iM & 512) != 0;
        boolean z14 = (iM & 1024) != 0;
        boolean z15 = (iM & RecyclerView.m.FLAG_MOVED) != 0;
        long j11 = r(tVar) ? ((long[]) P.h(tVar.f31826j))[0] : 0L;
        int[] iArr = vVar.f31842i;
        long[] jArr2 = vVar.f31843j;
        boolean[] zArr = vVar.f31844k;
        boolean z16 = z15;
        boolean z17 = tVar.f31818b == 2 && (i11 & 1) != 0;
        int i16 = i12 + vVar.f31841h[i10];
        boolean z18 = z11;
        long j12 = tVar.f31819c;
        long j13 = vVar.f31850q;
        int i17 = i12;
        while (i17 < i16) {
            if (z12) {
                iQ = d10.q();
                z10 = z17;
            } else {
                z10 = z17;
                iQ = cVar.f31694b;
            }
            int iH = h(iQ);
            if (z13) {
                iQ2 = d10.q();
                i13 = i16;
            } else {
                i13 = i16;
                iQ2 = cVar.f31695c;
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
                iQ3 = cVar.f31696d;
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
            if (!vVar.f31851r) {
                jArr2[i18] = jV0 + bVar.f31752d.f31859h;
            }
            iArr[i18] = i14;
            zArr[i18] = ((i15 >> 16) & 1) == 0 && (!z10 || i18 == 0);
            j13 += iH;
            i17 = i18 + 1;
            i16 = i13;
            z17 = z10;
        }
        int i19 = i16;
        vVar.f31850q = j13;
        return i19;
    }

    private static void M(c.b bVar, b bVar2, int i10) throws ParserException {
        List<c.C2039c> list = bVar.f129412c;
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            c.C2039c c2039c = list.get(i13);
            if (c2039c.f129410a == 1953658222) {
                D d10 = c2039c.f129414b;
                d10.W(12);
                int iL = d10.L();
                if (iL > 0) {
                    i12 += iL;
                    i11++;
                }
            }
        }
        bVar2.f31756h = 0;
        bVar2.f31755g = 0;
        bVar2.f31754f = 0;
        bVar2.f31750b.e(i11, i12);
        int i14 = 0;
        int iL2 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            c.C2039c c2039c2 = list.get(i15);
            if (c2039c2.f129410a == 1953658222) {
                iL2 = L(bVar2, i14, i10, c2039c2.f129414b, iL2);
                i14++;
            }
        }
    }

    private static void N(D d10, v vVar, byte[] bArr) throws ParserException {
        d10.W(8);
        d10.l(bArr, 0, 16);
        if (Arrays.equals(bArr, f31706N)) {
            E(d10, 16, vVar);
        }
    }

    private void O(long j10) throws ParserException {
        while (!this.f31733n.isEmpty() && this.f31733n.peek().f129411b == j10) {
            t(this.f31733n.pop());
        }
        l();
    }

    private boolean P(InterfaceC18078q interfaceC18078q) throws IOException {
        if (this.f31741v == 0) {
            if (!interfaceC18078q.f(this.f31732m.e(), 0, 8, true)) {
                return false;
            }
            this.f31741v = 8;
            this.f31732m.W(0);
            this.f31740u = this.f31732m.J();
            this.f31739t = this.f31732m.q();
        }
        long j10 = this.f31740u;
        if (j10 == 1) {
            interfaceC18078q.readFully(this.f31732m.e(), 8, 8);
            this.f31741v += 8;
            this.f31740u = this.f31732m.O();
        } else if (j10 == 0) {
            long length = interfaceC18078q.getLength();
            if (length == -1 && !this.f31733n.isEmpty()) {
                length = this.f31733n.peek().f129411b;
            }
            if (length != -1) {
                this.f31740u = (length - interfaceC18078q.getPosition()) + this.f31741v;
            }
        }
        if (this.f31740u < this.f31741v) {
            throw ParserException.c("Atom size less than header length (unsupported).");
        }
        long position = interfaceC18078q.getPosition() - this.f31741v;
        int i10 = this.f31739t;
        if ((i10 == 1836019558 || i10 == 1835295092) && !this.f31719L) {
            this.f31716I.g(new J.b(this.f31708A, position));
            this.f31719L = true;
        }
        if (this.f31739t == 1836019558) {
            int size = this.f31724e.size();
            for (int i11 = 0; i11 < size; i11++) {
                v vVar = this.f31724e.valueAt(i11).f31750b;
                vVar.f31835b = position;
                vVar.f31837d = position;
                vVar.f31836c = position;
            }
        }
        int i12 = this.f31739t;
        if (i12 == 1835295092) {
            this.f31710C = null;
            this.f31743x = position + this.f31740u;
            this.f31738s = 2;
            return true;
        }
        if (T(i12)) {
            long position2 = (interfaceC18078q.getPosition() + this.f31740u) - 8;
            this.f31733n.push(new c.b(this.f31739t, position2));
            if (this.f31740u == this.f31741v) {
                O(position2);
            } else {
                l();
            }
        } else if (U(this.f31739t)) {
            if (this.f31741v != 8) {
                throw ParserException.c("Leaf atom defines extended atom size (unsupported).");
            }
            if (this.f31740u > 2147483647L) {
                throw ParserException.c("Leaf atom with length > 2147483647 (unsupported).");
            }
            D d10 = new D((int) this.f31740u);
            System.arraycopy(this.f31732m.e(), 0, d10.e(), 0, 8);
            this.f31742w = d10;
            this.f31738s = 1;
        } else {
            if (this.f31740u > 2147483647L) {
                throw ParserException.c("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.f31742w = null;
            this.f31738s = 1;
        }
        return true;
    }

    private void Q(InterfaceC18078q interfaceC18078q) throws IOException {
        int i10 = (int) (this.f31740u - this.f31741v);
        D d10 = this.f31742w;
        if (d10 != null) {
            interfaceC18078q.readFully(d10.e(), 8, i10);
            v(new c.C2039c(this.f31739t, d10), interfaceC18078q.getPosition());
        } else {
            interfaceC18078q.k(i10);
        }
        O(interfaceC18078q.getPosition());
    }

    private void R(InterfaceC18078q interfaceC18078q) throws IOException {
        int size = this.f31724e.size();
        long j10 = Long.MAX_VALUE;
        b bVarValueAt = null;
        for (int i10 = 0; i10 < size; i10++) {
            v vVar = this.f31724e.valueAt(i10).f31750b;
            if (vVar.f31849p) {
                long j11 = vVar.f31837d;
                if (j11 < j10) {
                    bVarValueAt = this.f31724e.valueAt(i10);
                    j10 = j11;
                }
            }
        }
        if (bVarValueAt == null) {
            this.f31738s = 3;
            return;
        }
        int position = (int) (j10 - interfaceC18078q.getPosition());
        if (position < 0) {
            throw ParserException.a("Offset to encryption data was negative.", null);
        }
        interfaceC18078q.k(position);
        bVarValueAt.f31750b.b(interfaceC18078q);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean S(x3.InterfaceC18078q r17) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R3.h.S(x3.q):boolean");
    }

    public static /* synthetic */ InterfaceC18077p[] f() {
        return new InterfaceC18077p[]{new h(r.a.f37064a, 32)};
    }

    private boolean g(a3.t tVar) {
        return Objects.equals(tVar.f44767o, "video/avc") ? (this.f31721b & 64) != 0 : Objects.equals(tVar.f44767o, "video/hevc") && (this.f31721b & 128) != 0;
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
        long[] jArr = tVar.f31825i;
        if (jArr != null && jArr.length == 1 && tVar.f31826j != null) {
            long j10 = jArr[0];
            if (j10 == 0 || P.V0(j10, 1000000L, tVar.f31820d) + P.V0(tVar.f31826j[0], 1000000L, tVar.f31819c) >= tVar.f31821e) {
                return true;
            }
        }
        return false;
    }

    private void t(c.b bVar) throws ParserException {
        int i10 = bVar.f129410a;
        if (i10 == 1836019574) {
            x(bVar);
        } else if (i10 == 1836019558) {
            w(bVar);
        } else {
            if (this.f31733n.isEmpty()) {
                return;
            }
            this.f31733n.peek().b(bVar);
        }
    }

    private void u(D d10) {
        String str;
        String str2;
        long jV0;
        long jV02;
        long J10;
        long jA;
        if (this.f31717J.length == 0) {
            return;
        }
        d10.W(8);
        int iN = R3.b.n(d10.q());
        if (iN == 0) {
            str = (String) C13599a.e(d10.B());
            str2 = (String) C13599a.e(d10.B());
            long J11 = d10.J();
            jV0 = P.V0(d10.J(), 1000000L, J11);
            long j10 = this.f31709B;
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
            str = (String) C13599a.e(d10.B());
            str2 = (String) C13599a.e(d10.B());
            jV02 = jV03;
            J10 = J13;
            jV0 = -9223372036854775807L;
        }
        String str3 = str;
        String str4 = str2;
        byte[] bArr = new byte[d10.a()];
        d10.l(bArr, 0, d10.a());
        D d11 = new D(this.f31731l.a(new I3.a(str3, str4, jV02, J10, bArr)));
        int iA = d11.a();
        for (O o10 : this.f31717J) {
            d11.W(0);
            o10.d(d11, iA);
        }
        if (jA == -9223372036854775807L) {
            this.f31734o.addLast(new a(jV0, true, iA));
            this.f31744y += iA;
            return;
        }
        if (!this.f31734o.isEmpty()) {
            this.f31734o.addLast(new a(jA, false, iA));
            this.f31744y += iA;
            return;
        }
        d3.J j12 = this.f31730k;
        if (j12 != null && !j12.g()) {
            this.f31734o.addLast(new a(jA, false, iA));
            this.f31744y += iA;
            return;
        }
        d3.J j13 = this.f31730k;
        if (j13 != null) {
            jA = j13.a(jA);
        }
        long j14 = jA;
        for (O o11 : this.f31717J) {
            o11.c(j14, 1, iA, 0, null);
        }
    }

    private void v(c.C2039c c2039c, long j10) throws ParserException {
        if (!this.f31733n.isEmpty()) {
            this.f31733n.peek().c(c2039c);
            return;
        }
        int i10 = c2039c.f129410a;
        if (i10 != 1936286840) {
            if (i10 == 1701671783) {
                u(c2039c.f129414b);
            }
        } else {
            Pair<Long, C18068g> pairG = G(c2039c.f129414b, j10);
            this.f31709B = ((Long) pairG.first).longValue();
            this.f31716I.g((x3.J) pairG.second);
            this.f31719L = true;
        }
    }

    private void w(c.b bVar) throws ParserException {
        A(bVar, this.f31724e, this.f31722c != null, this.f31721b, this.f31728i);
        a3.o oVarN = n(bVar.f129412c);
        if (oVarN != null) {
            int size = this.f31724e.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f31724e.valueAt(i10).n(oVarN);
            }
        }
        if (this.f31745z != -9223372036854775807L) {
            int size2 = this.f31724e.size();
            for (int i11 = 0; i11 < size2; i11++) {
                this.f31724e.valueAt(i11).l(this.f31745z);
            }
            this.f31745z = -9223372036854775807L;
        }
    }

    private void x(c.b bVar) throws ParserException {
        int i10 = 0;
        C13599a.h(this.f31722c == null, "Unexpected moov box.");
        a3.o oVarN = n(bVar.f129412c);
        c.b bVar2 = (c.b) C13599a.e(bVar.d(1836475768));
        SparseArray<c> sparseArray = new SparseArray<>();
        int size = bVar2.f129412c.size();
        long jZ = -9223372036854775807L;
        for (int i11 = 0; i11 < size; i11++) {
            c.C2039c c2039c = bVar2.f129412c.get(i11);
            int i12 = c2039c.f129410a;
            if (i12 == 1953654136) {
                Pair<Integer, c> pairK = K(c2039c.f129414b);
                sparseArray.put(((Integer) pairK.first).intValue(), (c) pairK.second);
            } else if (i12 == 1835362404) {
                jZ = z(c2039c.f129414b);
            }
        }
        List<w> listE = R3.b.E(bVar, new B(), jZ, oVarN, (this.f31721b & 16) != 0, false, new De.g() { // from class: R3.e
            @Override // De.g
            public final Object apply(Object obj) {
                return this.f31703a.s((t) obj);
            }
        });
        int size2 = listE.size();
        if (this.f31724e.size() != 0) {
            C13599a.g(this.f31724e.size() == size2);
            while (i10 < size2) {
                w wVar = listE.get(i10);
                t tVar = wVar.f31852a;
                this.f31724e.get(tVar.f31817a).j(wVar, m(sparseArray, tVar.f31817a));
                i10++;
            }
            return;
        }
        String strB = k.b(listE);
        while (i10 < size2) {
            w wVar2 = listE.get(i10);
            t tVar2 = wVar2.f31852a;
            O oT = this.f31716I.t(i10, tVar2.f31818b);
            oT.f(tVar2.f31821e);
            this.f31724e.put(tVar2.f31817a, new b(oT, wVar2, m(sparseArray, tVar2.f31817a), strB));
            this.f31708A = Math.max(this.f31708A, tVar2.f31821e);
            i10++;
        }
        this.f31716I.p();
    }

    private void y(long j10) {
        while (!this.f31734o.isEmpty()) {
            a aVarRemoveFirst = this.f31734o.removeFirst();
            this.f31744y -= aVarRemoveFirst.f31748c;
            long jA = aVarRemoveFirst.f31746a;
            if (aVarRemoveFirst.f31747b) {
                jA += j10;
            }
            d3.J j11 = this.f31730k;
            if (j11 != null) {
                jA = j11.a(jA);
            }
            long j12 = jA;
            for (O o10 : this.f31717J) {
                o10.c(j12, 1, aVarRemoveFirst.f31748c, this.f31744y, null);
            }
        }
    }

    private static long z(D d10) {
        d10.W(8);
        return R3.b.n(d10.q()) == 0 ? d10.J() : d10.O();
    }

    @Override // x3.InterfaceC18077p
    public void a(long j10, long j11) {
        int size = this.f31724e.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f31724e.valueAt(i10).k();
        }
        this.f31734o.clear();
        this.f31744y = 0;
        this.f31735p.b();
        this.f31745z = j11;
        this.f31733n.clear();
        l();
    }

    @Override // x3.InterfaceC18077p
    public int b(InterfaceC18078q interfaceC18078q, I i10) throws IOException {
        while (true) {
            int i11 = this.f31738s;
            if (i11 != 0) {
                if (i11 == 1) {
                    Q(interfaceC18078q);
                } else if (i11 == 2) {
                    R(interfaceC18078q);
                } else if (S(interfaceC18078q)) {
                    return 0;
                }
            } else if (!P(interfaceC18078q)) {
                this.f31735p.d();
                return -1;
            }
        }
    }

    @Override // x3.InterfaceC18077p
    public void c(x3.r rVar) {
        if ((this.f31721b & 32) == 0) {
            rVar = new U3.s(rVar, this.f31720a);
        }
        this.f31716I = rVar;
        l();
        q();
        t tVar = this.f31722c;
        if (tVar != null) {
            this.f31724e.put(0, new b(this.f31716I.t(0, tVar.f31818b), new w(this.f31722c, new long[0], new int[0], 0, new long[0], new int[0], 0L), new c(0, 0, 0, 0), k.a(this.f31722c.f31823g)));
            this.f31716I.p();
        }
    }

    @Override // x3.InterfaceC18077p
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public L<N> i() {
        return this.f31737r;
    }

    public h(r.a aVar, int i10, d3.J j10, t tVar, List<a3.t> list, O o10) {
        this.f31720a = aVar;
        this.f31721b = i10;
        this.f31730k = j10;
        this.f31722c = tVar;
        this.f31723d = Collections.unmodifiableList(list);
        this.f31736q = o10;
        this.f31731l = new I3.c();
        this.f31732m = new D(16);
        this.f31725f = new D(e3.f.f129420a);
        this.f31726g = new D(6);
        this.f31727h = new D();
        byte[] bArr = new byte[16];
        this.f31728i = bArr;
        this.f31729j = new D(bArr);
        this.f31733n = new ArrayDeque<>();
        this.f31734o = new ArrayDeque<>();
        this.f31724e = new SparseArray<>();
        this.f31737r = L.x();
        this.f31708A = -9223372036854775807L;
        this.f31745z = -9223372036854775807L;
        this.f31709B = -9223372036854775807L;
        this.f31716I = x3.r.f170341y3;
        this.f31717J = new O[0];
        this.f31718K = new O[0];
        this.f31735p = new e3.i(new i.b() { // from class: R3.g
            @Override // e3.i.b
            public final void a(long j11, D d10) {
                C18067f.a(j11, d10, this.f31704a.f31718K);
            }
        });
    }

    private static void J(c.b bVar, SparseArray<b> sparseArray, boolean z10, int i10, byte[] bArr) throws ParserException {
        String str;
        b bVarI = I(((c.C2039c) C13599a.e(bVar.e(1952868452))).f129414b, sparseArray, z10);
        if (bVarI != null) {
            v vVar = bVarI.f31750b;
            long j10 = vVar.f31850q;
            boolean z11 = vVar.f31851r;
            bVarI.k();
            bVarI.f31761m = true;
            c.C2039c c2039cE = bVar.e(1952867444);
            if (c2039cE != null && (i10 & 2) == 0) {
                vVar.f31850q = H(c2039cE.f129414b);
                vVar.f31851r = true;
            } else {
                vVar.f31850q = j10;
                vVar.f31851r = z11;
            }
            M(bVar, bVarI, i10);
            u uVarB = bVarI.f31752d.f31852a.b(((c) C13599a.e(vVar.f31834a)).f31693a);
            c.C2039c c2039cE2 = bVar.e(1935763834);
            if (c2039cE2 != null) {
                C((u) C13599a.e(uVarB), c2039cE2.f129414b, vVar);
            }
            c.C2039c c2039cE3 = bVar.e(1935763823);
            if (c2039cE3 != null) {
                B(c2039cE3.f129414b, vVar);
            }
            c.C2039c c2039cE4 = bVar.e(1936027235);
            if (c2039cE4 != null) {
                F(c2039cE4.f129414b, vVar);
            }
            if (uVarB != null) {
                str = uVarB.f31830b;
            } else {
                str = null;
            }
            D(bVar, str, vVar);
            int size = bVar.f129412c.size();
            for (int i11 = 0; i11 < size; i11++) {
                c.C2039c c2039c = bVar.f129412c.get(i11);
                if (c2039c.f129410a == 1970628964) {
                    N(c2039c.f129414b, vVar, bArr);
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
        return (c) C13599a.e(sparseArray.get(i10));
    }

    private static a3.o n(List<c.C2039c> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            c.C2039c c2039c = list.get(i10);
            if (c2039c.f129410a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArrE = c2039c.f129414b.e();
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
            if ((bVarValueAt.f31761m || bVarValueAt.f31754f != bVarValueAt.f31752d.f31853b) && (!bVarValueAt.f31761m || bVarValueAt.f31756h != bVarValueAt.f31750b.f31838e)) {
                long jD = bVarValueAt.d();
                if (jD < j10) {
                    bVar = bVarValueAt;
                    j10 = jD;
                }
            }
        }
        return bVar;
    }

    @Override // x3.InterfaceC18077p
    public boolean j(InterfaceC18078q interfaceC18078q) throws IOException {
        L<N> lX;
        N nB = s.b(interfaceC18078q);
        if (nB != null) {
            lX = L.y(nB);
        } else {
            lX = L.x();
        }
        this.f31737r = lX;
        if (nB == null) {
            return true;
        }
        return false;
    }
}
