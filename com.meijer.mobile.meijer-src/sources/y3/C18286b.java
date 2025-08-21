package y3;

import a3.t;
import androidx.media3.common.ParserException;
import d3.C13599a;
import d3.P;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import x3.C18069h;
import x3.C18074m;
import x3.E;
import x3.I;
import x3.InterfaceC18077p;
import x3.InterfaceC18078q;
import x3.J;
import x3.O;
import x3.r;
import x3.u;

/* renamed from: y3.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C18286b implements InterfaceC18077p {

    /* renamed from: s, reason: collision with root package name */
    public static final u f171186s = new u() { // from class: y3.a
        @Override // x3.u
        public final InterfaceC18077p[] f() {
            return C18286b.d();
        }
    };

    /* renamed from: t, reason: collision with root package name */
    private static final int[] f171187t = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: u, reason: collision with root package name */
    private static final int[] f171188u = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* renamed from: v, reason: collision with root package name */
    private static final byte[] f171189v = P.q0("#!AMR\n");

    /* renamed from: w, reason: collision with root package name */
    private static final byte[] f171190w = P.q0("#!AMR-WB\n");

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f171191a;

    /* renamed from: b, reason: collision with root package name */
    private final int f171192b;

    /* renamed from: c, reason: collision with root package name */
    private final O f171193c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f171194d;

    /* renamed from: e, reason: collision with root package name */
    private long f171195e;

    /* renamed from: f, reason: collision with root package name */
    private int f171196f;

    /* renamed from: g, reason: collision with root package name */
    private int f171197g;

    /* renamed from: h, reason: collision with root package name */
    private long f171198h;

    /* renamed from: i, reason: collision with root package name */
    private int f171199i;

    /* renamed from: j, reason: collision with root package name */
    private int f171200j;

    /* renamed from: k, reason: collision with root package name */
    private long f171201k;

    /* renamed from: l, reason: collision with root package name */
    private r f171202l;

    /* renamed from: m, reason: collision with root package name */
    private O f171203m;

    /* renamed from: n, reason: collision with root package name */
    private O f171204n;

    /* renamed from: o, reason: collision with root package name */
    private J f171205o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f171206p;

    /* renamed from: q, reason: collision with root package name */
    private long f171207q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f171208r;

    public C18286b() {
        this(0);
    }

    private static int g(int i10, long j10) {
        return (int) ((i10 * 8000000) / j10);
    }

    private boolean m(long j10, long j11) {
        return Math.abs(j11 - j10) < 20000;
    }

    @Override // x3.InterfaceC18077p
    public void release() {
    }

    public C18286b(int i10) {
        this.f171192b = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f171191a = new byte[1];
        this.f171199i = -1;
        C18074m c18074m = new C18074m();
        this.f171193c = c18074m;
        this.f171204n = c18074m;
    }

    public static /* synthetic */ InterfaceC18077p[] d() {
        return new InterfaceC18077p[]{new C18286b()};
    }

    private void f() {
        C13599a.i(this.f171203m);
        P.h(this.f171202l);
    }

    private J h(long j10, boolean z10) {
        return new C18069h(j10, this.f171198h, g(this.f171199i, 20000L), this.f171199i, z10);
    }

    private boolean l(int i10) {
        if (this.f171194d) {
            return false;
        }
        return i10 < 12 || i10 > 14;
    }

    private boolean n(int i10) {
        if (i10 < 0 || i10 > 15) {
            return false;
        }
        return o(i10) || l(i10);
    }

    private boolean o(int i10) {
        if (this.f171194d) {
            return i10 < 10 || i10 > 13;
        }
        return false;
    }

    private void p() {
        if (this.f171208r) {
            return;
        }
        this.f171208r = true;
        boolean z10 = this.f171194d;
        String str = z10 ? "audio/amr-wb" : "audio/amr";
        this.f171203m.b(new t.b().U(str).u0(z10 ? "audio/amr-wb" : "audio/3gpp").k0(z10 ? f171188u[8] : f171187t[7]).R(1).v0(z10 ? 16000 : 8000).N());
    }

    private void q(long j10, int i10) {
        int i11;
        if (this.f171205o != null) {
            return;
        }
        int i12 = this.f171192b;
        if ((i12 & 4) != 0) {
            this.f171205o = new E(new long[]{this.f171198h}, new long[]{0}, -9223372036854775807L);
        } else if ((i12 & 1) == 0 || !((i11 = this.f171199i) == -1 || i11 == this.f171196f)) {
            this.f171205o = new J.b(-9223372036854775807L);
        } else if (this.f171200j >= 20 || i10 == -1) {
            J jH = h(j10, (i12 & 2) != 0);
            this.f171205o = jH;
            this.f171203m.f(jH.l());
        }
        J j11 = this.f171205o;
        if (j11 != null) {
            this.f171202l.g(j11);
        }
    }

    private boolean t(InterfaceC18078q interfaceC18078q) throws IOException {
        byte[] bArr = f171189v;
        if (r(interfaceC18078q, bArr)) {
            this.f171194d = false;
            interfaceC18078q.k(bArr.length);
            return true;
        }
        byte[] bArr2 = f171190w;
        if (!r(interfaceC18078q, bArr2)) {
            return false;
        }
        this.f171194d = true;
        interfaceC18078q.k(bArr2.length);
        return true;
    }

    private int u(InterfaceC18078q interfaceC18078q) throws IOException {
        if (this.f171197g == 0) {
            try {
                int iS = s(interfaceC18078q);
                this.f171196f = iS;
                this.f171197g = iS;
                if (this.f171199i == -1) {
                    this.f171198h = interfaceC18078q.getPosition();
                    this.f171199i = this.f171196f;
                }
                if (this.f171199i == this.f171196f) {
                    this.f171200j++;
                }
                J j10 = this.f171205o;
                if (j10 instanceof E) {
                    E e10 = (E) j10;
                    long j11 = this.f171201k + this.f171195e + 20000;
                    long position = interfaceC18078q.getPosition() + this.f171196f;
                    if (!e10.b(j11, 100000L)) {
                        e10.a(j11, position);
                    }
                    if (this.f171206p && m(j11, this.f171207q)) {
                        this.f171206p = false;
                        this.f171204n = this.f171203m;
                    }
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iG = this.f171204n.g(interfaceC18078q, this.f171197g, true);
        if (iG == -1) {
            return -1;
        }
        int i10 = this.f171197g - iG;
        this.f171197g = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f171204n.c(this.f171201k + this.f171195e, 1, this.f171196f, 0, null);
        this.f171195e += 20000;
        return 0;
    }

    @Override // x3.InterfaceC18077p
    public void a(long j10, long j11) {
        this.f171195e = 0L;
        this.f171196f = 0;
        this.f171197g = 0;
        this.f171207q = j11;
        J j12 = this.f171205o;
        if (!(j12 instanceof E)) {
            if (j10 == 0 || !(j12 instanceof C18069h)) {
                this.f171201k = 0L;
                return;
            } else {
                this.f171201k = ((C18069h) j12).b(j10);
                return;
            }
        }
        long jH = ((E) j12).h(j10);
        this.f171201k = jH;
        if (m(jH, this.f171207q)) {
            return;
        }
        this.f171206p = true;
        this.f171204n = this.f171193c;
    }

    @Override // x3.InterfaceC18077p
    public void c(r rVar) {
        this.f171202l = rVar;
        O oT = rVar.t(0, 1);
        this.f171203m = oT;
        this.f171204n = oT;
        rVar.p();
    }

    private int k(int i10) throws ParserException {
        String str;
        if (!n(i10)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Illegal AMR ");
            if (this.f171194d) {
                str = "WB";
            } else {
                str = "NB";
            }
            sb2.append(str);
            sb2.append(" frame type ");
            sb2.append(i10);
            throw ParserException.a(sb2.toString(), null);
        }
        if (this.f171194d) {
            return f171188u[i10];
        }
        return f171187t[i10];
    }

    private static boolean r(InterfaceC18078q interfaceC18078q, byte[] bArr) throws IOException {
        interfaceC18078q.d();
        byte[] bArr2 = new byte[bArr.length];
        interfaceC18078q.m(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    private int s(InterfaceC18078q interfaceC18078q) throws IOException {
        interfaceC18078q.d();
        interfaceC18078q.m(this.f171191a, 0, 1);
        byte b10 = this.f171191a[0];
        if ((b10 & 131) <= 0) {
            return k((b10 >> 3) & 15);
        }
        throw ParserException.a("Invalid padding bits for frame header " + ((int) b10), null);
    }

    @Override // x3.InterfaceC18077p
    public int b(InterfaceC18078q interfaceC18078q, I i10) throws IOException {
        f();
        if (interfaceC18078q.getPosition() == 0 && !t(interfaceC18078q)) {
            throw ParserException.a("Could not find AMR header.", null);
        }
        p();
        int iU = u(interfaceC18078q);
        q(interfaceC18078q.getLength(), iU);
        if (iU == -1) {
            J j10 = this.f171205o;
            if (j10 instanceof E) {
                long j11 = this.f171201k + this.f171195e;
                ((E) j10).c(j11);
                this.f171202l.g(this.f171205o);
                this.f171203m.f(j11);
            }
        }
        return iU;
    }

    @Override // x3.InterfaceC18077p
    public boolean j(InterfaceC18078q interfaceC18078q) throws IOException {
        return t(interfaceC18078q);
    }
}
