package y3;

import a3.t;
import androidx.media3.common.ParserException;
import d3.C13466a;
import d3.P;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import x3.C18003h;
import x3.C18008m;
import x3.E;
import x3.I;
import x3.InterfaceC18011p;
import x3.InterfaceC18012q;
import x3.J;
import x3.O;
import x3.r;
import x3.u;

/* renamed from: y3.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C18159b implements InterfaceC18011p {

    /* renamed from: s, reason: collision with root package name */
    public static final u f170160s = new u() { // from class: y3.a
        @Override // x3.u
        public final InterfaceC18011p[] f() {
            return C18159b.d();
        }
    };

    /* renamed from: t, reason: collision with root package name */
    private static final int[] f170161t = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: u, reason: collision with root package name */
    private static final int[] f170162u = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* renamed from: v, reason: collision with root package name */
    private static final byte[] f170163v = P.q0("#!AMR\n");

    /* renamed from: w, reason: collision with root package name */
    private static final byte[] f170164w = P.q0("#!AMR-WB\n");

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f170165a;

    /* renamed from: b, reason: collision with root package name */
    private final int f170166b;

    /* renamed from: c, reason: collision with root package name */
    private final O f170167c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f170168d;

    /* renamed from: e, reason: collision with root package name */
    private long f170169e;

    /* renamed from: f, reason: collision with root package name */
    private int f170170f;

    /* renamed from: g, reason: collision with root package name */
    private int f170171g;

    /* renamed from: h, reason: collision with root package name */
    private long f170172h;

    /* renamed from: i, reason: collision with root package name */
    private int f170173i;

    /* renamed from: j, reason: collision with root package name */
    private int f170174j;

    /* renamed from: k, reason: collision with root package name */
    private long f170175k;

    /* renamed from: l, reason: collision with root package name */
    private r f170176l;

    /* renamed from: m, reason: collision with root package name */
    private O f170177m;

    /* renamed from: n, reason: collision with root package name */
    private O f170178n;

    /* renamed from: o, reason: collision with root package name */
    private J f170179o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f170180p;

    /* renamed from: q, reason: collision with root package name */
    private long f170181q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f170182r;

    public C18159b() {
        this(0);
    }

    private static int g(int i10, long j10) {
        return (int) ((i10 * 8000000) / j10);
    }

    private boolean m(long j10, long j11) {
        return Math.abs(j11 - j10) < 20000;
    }

    @Override // x3.InterfaceC18011p
    public void release() {
    }

    public C18159b(int i10) {
        this.f170166b = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f170165a = new byte[1];
        this.f170173i = -1;
        C18008m c18008m = new C18008m();
        this.f170167c = c18008m;
        this.f170178n = c18008m;
    }

    public static /* synthetic */ InterfaceC18011p[] d() {
        return new InterfaceC18011p[]{new C18159b()};
    }

    private void f() {
        C13466a.i(this.f170177m);
        P.h(this.f170176l);
    }

    private J h(long j10, boolean z10) {
        return new C18003h(j10, this.f170172h, g(this.f170173i, 20000L), this.f170173i, z10);
    }

    private boolean l(int i10) {
        if (this.f170168d) {
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
        if (this.f170168d) {
            return i10 < 10 || i10 > 13;
        }
        return false;
    }

    private void p() {
        if (this.f170182r) {
            return;
        }
        this.f170182r = true;
        boolean z10 = this.f170168d;
        String str = z10 ? "audio/amr-wb" : "audio/amr";
        this.f170177m.b(new t.b().U(str).u0(z10 ? "audio/amr-wb" : "audio/3gpp").k0(z10 ? f170162u[8] : f170161t[7]).R(1).v0(z10 ? 16000 : 8000).N());
    }

    private void q(long j10, int i10) {
        int i11;
        if (this.f170179o != null) {
            return;
        }
        int i12 = this.f170166b;
        if ((i12 & 4) != 0) {
            this.f170179o = new E(new long[]{this.f170172h}, new long[]{0}, -9223372036854775807L);
        } else if ((i12 & 1) == 0 || !((i11 = this.f170173i) == -1 || i11 == this.f170170f)) {
            this.f170179o = new J.b(-9223372036854775807L);
        } else if (this.f170174j >= 20 || i10 == -1) {
            J jH = h(j10, (i12 & 2) != 0);
            this.f170179o = jH;
            this.f170177m.f(jH.l());
        }
        J j11 = this.f170179o;
        if (j11 != null) {
            this.f170176l.g(j11);
        }
    }

    private boolean t(InterfaceC18012q interfaceC18012q) throws IOException {
        byte[] bArr = f170163v;
        if (r(interfaceC18012q, bArr)) {
            this.f170168d = false;
            interfaceC18012q.k(bArr.length);
            return true;
        }
        byte[] bArr2 = f170164w;
        if (!r(interfaceC18012q, bArr2)) {
            return false;
        }
        this.f170168d = true;
        interfaceC18012q.k(bArr2.length);
        return true;
    }

    private int u(InterfaceC18012q interfaceC18012q) throws IOException {
        if (this.f170171g == 0) {
            try {
                int iS = s(interfaceC18012q);
                this.f170170f = iS;
                this.f170171g = iS;
                if (this.f170173i == -1) {
                    this.f170172h = interfaceC18012q.getPosition();
                    this.f170173i = this.f170170f;
                }
                if (this.f170173i == this.f170170f) {
                    this.f170174j++;
                }
                J j10 = this.f170179o;
                if (j10 instanceof E) {
                    E e10 = (E) j10;
                    long j11 = this.f170175k + this.f170169e + 20000;
                    long position = interfaceC18012q.getPosition() + this.f170170f;
                    if (!e10.b(j11, 100000L)) {
                        e10.a(j11, position);
                    }
                    if (this.f170180p && m(j11, this.f170181q)) {
                        this.f170180p = false;
                        this.f170178n = this.f170177m;
                    }
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iG = this.f170178n.g(interfaceC18012q, this.f170171g, true);
        if (iG == -1) {
            return -1;
        }
        int i10 = this.f170171g - iG;
        this.f170171g = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f170178n.c(this.f170175k + this.f170169e, 1, this.f170170f, 0, null);
        this.f170169e += 20000;
        return 0;
    }

    @Override // x3.InterfaceC18011p
    public void a(long j10, long j11) {
        this.f170169e = 0L;
        this.f170170f = 0;
        this.f170171g = 0;
        this.f170181q = j11;
        J j12 = this.f170179o;
        if (!(j12 instanceof E)) {
            if (j10 == 0 || !(j12 instanceof C18003h)) {
                this.f170175k = 0L;
                return;
            } else {
                this.f170175k = ((C18003h) j12).b(j10);
                return;
            }
        }
        long jH = ((E) j12).h(j10);
        this.f170175k = jH;
        if (m(jH, this.f170181q)) {
            return;
        }
        this.f170180p = true;
        this.f170178n = this.f170167c;
    }

    @Override // x3.InterfaceC18011p
    public void c(r rVar) {
        this.f170176l = rVar;
        O oT = rVar.t(0, 1);
        this.f170177m = oT;
        this.f170178n = oT;
        rVar.p();
    }

    private int k(int i10) throws ParserException {
        String str;
        if (!n(i10)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Illegal AMR ");
            if (this.f170168d) {
                str = "WB";
            } else {
                str = "NB";
            }
            sb2.append(str);
            sb2.append(" frame type ");
            sb2.append(i10);
            throw ParserException.a(sb2.toString(), null);
        }
        if (this.f170168d) {
            return f170162u[i10];
        }
        return f170161t[i10];
    }

    private static boolean r(InterfaceC18012q interfaceC18012q, byte[] bArr) throws IOException {
        interfaceC18012q.d();
        byte[] bArr2 = new byte[bArr.length];
        interfaceC18012q.m(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    private int s(InterfaceC18012q interfaceC18012q) throws IOException {
        interfaceC18012q.d();
        interfaceC18012q.m(this.f170165a, 0, 1);
        byte b10 = this.f170165a[0];
        if ((b10 & 131) <= 0) {
            return k((b10 >> 3) & 15);
        }
        throw ParserException.a("Invalid padding bits for frame header " + ((int) b10), null);
    }

    @Override // x3.InterfaceC18011p
    public int b(InterfaceC18012q interfaceC18012q, I i10) throws IOException {
        f();
        if (interfaceC18012q.getPosition() == 0 && !t(interfaceC18012q)) {
            throw ParserException.a("Could not find AMR header.", null);
        }
        p();
        int iU = u(interfaceC18012q);
        q(interfaceC18012q.getLength(), iU);
        if (iU == -1) {
            J j10 = this.f170179o;
            if (j10 instanceof E) {
                long j11 = this.f170175k + this.f170169e;
                ((E) j10).c(j11);
                this.f170176l.g(this.f170179o);
                this.f170177m.f(j11);
            }
        }
        return iU;
    }

    @Override // x3.InterfaceC18011p
    public boolean j(InterfaceC18012q interfaceC18012q) throws IOException {
        return t(interfaceC18012q);
    }
}
