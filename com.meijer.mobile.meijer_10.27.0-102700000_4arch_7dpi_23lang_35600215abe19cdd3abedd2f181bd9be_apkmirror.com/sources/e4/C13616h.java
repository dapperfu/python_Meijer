package e4;

import androidx.media3.common.ParserException;
import androidx.recyclerview.widget.RecyclerView;
import d3.C13466a;
import e4.L;
import java.io.EOFException;
import java.io.IOException;
import x3.C18003h;
import x3.InterfaceC18011p;
import x3.InterfaceC18012q;
import x3.J;

/* renamed from: e4.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13616h implements InterfaceC18011p {

    /* renamed from: m, reason: collision with root package name */
    public static final x3.u f128319m = new x3.u() { // from class: e4.g
        @Override // x3.u
        public final InterfaceC18011p[] f() {
            return C13616h.d();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f128320a;

    /* renamed from: b, reason: collision with root package name */
    private final C13617i f128321b;

    /* renamed from: c, reason: collision with root package name */
    private final d3.D f128322c;

    /* renamed from: d, reason: collision with root package name */
    private final d3.D f128323d;

    /* renamed from: e, reason: collision with root package name */
    private final d3.C f128324e;

    /* renamed from: f, reason: collision with root package name */
    private x3.r f128325f;

    /* renamed from: g, reason: collision with root package name */
    private long f128326g;

    /* renamed from: h, reason: collision with root package name */
    private long f128327h;

    /* renamed from: i, reason: collision with root package name */
    private int f128328i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f128329j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f128330k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f128331l;

    public C13616h() {
        this(0);
    }

    private static int g(int i10, long j10) {
        return (int) ((i10 * 8000000) / j10);
    }

    private int l(InterfaceC18012q interfaceC18012q) throws IOException {
        int i10 = 0;
        while (true) {
            interfaceC18012q.m(this.f128323d.e(), 0, 10);
            this.f128323d.W(0);
            if (this.f128323d.K() != 4801587) {
                break;
            }
            this.f128323d.X(3);
            int iG = this.f128323d.G();
            i10 += iG + 10;
            interfaceC18012q.i(iG);
        }
        interfaceC18012q.d();
        interfaceC18012q.i(i10);
        if (this.f128327h == -1) {
            this.f128327h = i10;
        }
        return i10;
    }

    @Override // x3.InterfaceC18011p
    public void a(long j10, long j11) {
        this.f128330k = false;
        this.f128321b.c();
        this.f128326g = j11;
    }

    @Override // x3.InterfaceC18011p
    public void release() {
    }

    public C13616h(int i10) {
        this.f128320a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f128321b = new C13617i(true, "audio/mp4a-latm");
        this.f128322c = new d3.D(RecyclerView.m.FLAG_MOVED);
        this.f128328i = -1;
        this.f128327h = -1L;
        d3.D d10 = new d3.D(10);
        this.f128323d = d10;
        this.f128324e = new d3.C(d10.e());
    }

    public static /* synthetic */ InterfaceC18011p[] d() {
        return new InterfaceC18011p[]{new C13616h()};
    }

    private void f(InterfaceC18012q interfaceC18012q) throws IOException {
        int iH;
        if (this.f128329j) {
            return;
        }
        this.f128328i = -1;
        interfaceC18012q.d();
        long j10 = 0;
        if (interfaceC18012q.getPosition() == 0) {
            l(interfaceC18012q);
        }
        int i10 = 0;
        int i11 = 0;
        do {
            try {
                if (!interfaceC18012q.b(this.f128323d.e(), 0, 2, true)) {
                    break;
                }
                this.f128323d.W(0);
                if (!C13617i.m(this.f128323d.P())) {
                    break;
                }
                if (!interfaceC18012q.b(this.f128323d.e(), 0, 4, true)) {
                    break;
                }
                this.f128324e.p(14);
                iH = this.f128324e.h(13);
                if (iH <= 6) {
                    this.f128329j = true;
                    throw ParserException.a("Malformed ADTS stream", null);
                }
                j10 += iH;
                i11++;
                if (i11 == 1000) {
                    break;
                }
            } catch (EOFException unused) {
            }
        } while (interfaceC18012q.l(iH - 6, true));
        i10 = i11;
        interfaceC18012q.d();
        if (i10 > 0) {
            this.f128328i = (int) (j10 / i10);
        } else {
            this.f128328i = -1;
        }
        this.f128329j = true;
    }

    private x3.J h(long j10, boolean z10) {
        return new C18003h(j10, this.f128327h, g(this.f128328i, this.f128321b.k()), this.f128328i, z10);
    }

    private void k(long j10, boolean z10) {
        if (this.f128331l) {
            return;
        }
        boolean z11 = (this.f128320a & 1) != 0 && this.f128328i > 0;
        if (z11 && this.f128321b.k() == -9223372036854775807L && !z10) {
            return;
        }
        if (!z11 || this.f128321b.k() == -9223372036854775807L) {
            this.f128325f.g(new J.b(-9223372036854775807L));
        } else {
            this.f128325f.g(h(j10, (this.f128320a & 2) != 0));
        }
        this.f128331l = true;
    }

    @Override // x3.InterfaceC18011p
    public int b(InterfaceC18012q interfaceC18012q, x3.I i10) throws IOException {
        C13466a.i(this.f128325f);
        long length = interfaceC18012q.getLength();
        int i11 = this.f128320a;
        if ((i11 & 2) != 0 || ((i11 & 1) != 0 && length != -1)) {
            f(interfaceC18012q);
        }
        int i12 = interfaceC18012q.read(this.f128322c.e(), 0, RecyclerView.m.FLAG_MOVED);
        boolean z10 = i12 == -1;
        k(length, z10);
        if (z10) {
            return -1;
        }
        this.f128322c.W(0);
        this.f128322c.V(i12);
        if (!this.f128330k) {
            this.f128321b.e(this.f128326g, 4);
            this.f128330k = true;
        }
        this.f128321b.a(this.f128322c);
        return 0;
    }

    @Override // x3.InterfaceC18011p
    public void c(x3.r rVar) {
        this.f128325f = rVar;
        this.f128321b.f(rVar, new L.d(0, 1));
        rVar.p();
    }

    @Override // x3.InterfaceC18011p
    public boolean j(InterfaceC18012q interfaceC18012q) throws IOException {
        int iL = l(interfaceC18012q);
        int i10 = iL;
        int i11 = 0;
        int i12 = 0;
        do {
            interfaceC18012q.m(this.f128323d.e(), 0, 2);
            this.f128323d.W(0);
            if (!C13617i.m(this.f128323d.P())) {
                i10++;
                interfaceC18012q.d();
                interfaceC18012q.i(i10);
            } else {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                interfaceC18012q.m(this.f128323d.e(), 0, 4);
                this.f128324e.p(14);
                int iH = this.f128324e.h(13);
                if (iH <= 6) {
                    i10++;
                    interfaceC18012q.d();
                    interfaceC18012q.i(i10);
                } else {
                    interfaceC18012q.i(iH - 6);
                    i12 += iH;
                }
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - iL < 8192);
        return false;
    }
}
