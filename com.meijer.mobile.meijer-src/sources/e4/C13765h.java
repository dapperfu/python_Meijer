package e4;

import androidx.media3.common.ParserException;
import androidx.recyclerview.widget.RecyclerView;
import d3.C13599a;
import e4.L;
import java.io.EOFException;
import java.io.IOException;
import x3.C18069h;
import x3.InterfaceC18077p;
import x3.InterfaceC18078q;
import x3.J;

/* renamed from: e4.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13765h implements InterfaceC18077p {

    /* renamed from: m, reason: collision with root package name */
    public static final x3.u f129655m = new x3.u() { // from class: e4.g
        @Override // x3.u
        public final InterfaceC18077p[] f() {
            return C13765h.d();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f129656a;

    /* renamed from: b, reason: collision with root package name */
    private final C13766i f129657b;

    /* renamed from: c, reason: collision with root package name */
    private final d3.D f129658c;

    /* renamed from: d, reason: collision with root package name */
    private final d3.D f129659d;

    /* renamed from: e, reason: collision with root package name */
    private final d3.C f129660e;

    /* renamed from: f, reason: collision with root package name */
    private x3.r f129661f;

    /* renamed from: g, reason: collision with root package name */
    private long f129662g;

    /* renamed from: h, reason: collision with root package name */
    private long f129663h;

    /* renamed from: i, reason: collision with root package name */
    private int f129664i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f129665j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f129666k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f129667l;

    public C13765h() {
        this(0);
    }

    private static int g(int i10, long j10) {
        return (int) ((i10 * 8000000) / j10);
    }

    private int l(InterfaceC18078q interfaceC18078q) throws IOException {
        int i10 = 0;
        while (true) {
            interfaceC18078q.m(this.f129659d.e(), 0, 10);
            this.f129659d.W(0);
            if (this.f129659d.K() != 4801587) {
                break;
            }
            this.f129659d.X(3);
            int iG = this.f129659d.G();
            i10 += iG + 10;
            interfaceC18078q.i(iG);
        }
        interfaceC18078q.d();
        interfaceC18078q.i(i10);
        if (this.f129663h == -1) {
            this.f129663h = i10;
        }
        return i10;
    }

    @Override // x3.InterfaceC18077p
    public void a(long j10, long j11) {
        this.f129666k = false;
        this.f129657b.c();
        this.f129662g = j11;
    }

    @Override // x3.InterfaceC18077p
    public void release() {
    }

    public C13765h(int i10) {
        this.f129656a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f129657b = new C13766i(true, "audio/mp4a-latm");
        this.f129658c = new d3.D(RecyclerView.m.FLAG_MOVED);
        this.f129664i = -1;
        this.f129663h = -1L;
        d3.D d10 = new d3.D(10);
        this.f129659d = d10;
        this.f129660e = new d3.C(d10.e());
    }

    public static /* synthetic */ InterfaceC18077p[] d() {
        return new InterfaceC18077p[]{new C13765h()};
    }

    private void f(InterfaceC18078q interfaceC18078q) throws IOException {
        int iH;
        if (this.f129665j) {
            return;
        }
        this.f129664i = -1;
        interfaceC18078q.d();
        long j10 = 0;
        if (interfaceC18078q.getPosition() == 0) {
            l(interfaceC18078q);
        }
        int i10 = 0;
        int i11 = 0;
        do {
            try {
                if (!interfaceC18078q.b(this.f129659d.e(), 0, 2, true)) {
                    break;
                }
                this.f129659d.W(0);
                if (!C13766i.m(this.f129659d.P())) {
                    break;
                }
                if (!interfaceC18078q.b(this.f129659d.e(), 0, 4, true)) {
                    break;
                }
                this.f129660e.p(14);
                iH = this.f129660e.h(13);
                if (iH <= 6) {
                    this.f129665j = true;
                    throw ParserException.a("Malformed ADTS stream", null);
                }
                j10 += iH;
                i11++;
                if (i11 == 1000) {
                    break;
                }
            } catch (EOFException unused) {
            }
        } while (interfaceC18078q.l(iH - 6, true));
        i10 = i11;
        interfaceC18078q.d();
        if (i10 > 0) {
            this.f129664i = (int) (j10 / i10);
        } else {
            this.f129664i = -1;
        }
        this.f129665j = true;
    }

    private x3.J h(long j10, boolean z10) {
        return new C18069h(j10, this.f129663h, g(this.f129664i, this.f129657b.k()), this.f129664i, z10);
    }

    private void k(long j10, boolean z10) {
        if (this.f129667l) {
            return;
        }
        boolean z11 = (this.f129656a & 1) != 0 && this.f129664i > 0;
        if (z11 && this.f129657b.k() == -9223372036854775807L && !z10) {
            return;
        }
        if (!z11 || this.f129657b.k() == -9223372036854775807L) {
            this.f129661f.g(new J.b(-9223372036854775807L));
        } else {
            this.f129661f.g(h(j10, (this.f129656a & 2) != 0));
        }
        this.f129667l = true;
    }

    @Override // x3.InterfaceC18077p
    public int b(InterfaceC18078q interfaceC18078q, x3.I i10) throws IOException {
        C13599a.i(this.f129661f);
        long length = interfaceC18078q.getLength();
        int i11 = this.f129656a;
        if ((i11 & 2) != 0 || ((i11 & 1) != 0 && length != -1)) {
            f(interfaceC18078q);
        }
        int i12 = interfaceC18078q.read(this.f129658c.e(), 0, RecyclerView.m.FLAG_MOVED);
        boolean z10 = i12 == -1;
        k(length, z10);
        if (z10) {
            return -1;
        }
        this.f129658c.W(0);
        this.f129658c.V(i12);
        if (!this.f129666k) {
            this.f129657b.e(this.f129662g, 4);
            this.f129666k = true;
        }
        this.f129657b.a(this.f129658c);
        return 0;
    }

    @Override // x3.InterfaceC18077p
    public void c(x3.r rVar) {
        this.f129661f = rVar;
        this.f129657b.f(rVar, new L.d(0, 1));
        rVar.p();
    }

    @Override // x3.InterfaceC18077p
    public boolean j(InterfaceC18078q interfaceC18078q) throws IOException {
        int iL = l(interfaceC18078q);
        int i10 = iL;
        int i11 = 0;
        int i12 = 0;
        do {
            interfaceC18078q.m(this.f129659d.e(), 0, 2);
            this.f129659d.W(0);
            if (!C13766i.m(this.f129659d.P())) {
                i10++;
                interfaceC18078q.d();
                interfaceC18078q.i(i10);
            } else {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                interfaceC18078q.m(this.f129659d.e(), 0, 4);
                this.f129660e.p(14);
                int iH = this.f129660e.h(13);
                if (iH <= 6) {
                    i10++;
                    interfaceC18078q.d();
                    interfaceC18078q.i(i10);
                } else {
                    interfaceC18078q.i(iH - 6);
                    i12 += iH;
                }
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - iL < 8192);
        return false;
    }
}
