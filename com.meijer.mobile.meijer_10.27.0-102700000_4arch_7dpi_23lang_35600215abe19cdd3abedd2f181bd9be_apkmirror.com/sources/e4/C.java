package e4;

import android.util.SparseArray;
import androidx.media3.common.ParserException;
import androidx.recyclerview.widget.RecyclerView;
import com.medallia.digital.mobilesdk.l3;
import d3.C13466a;
import e4.L;
import java.io.IOException;
import x3.InterfaceC18011p;
import x3.InterfaceC18012q;
import x3.J;

/* loaded from: classes4.dex */
public final class C implements InterfaceC18011p {

    /* renamed from: l, reason: collision with root package name */
    public static final x3.u f128193l = new x3.u() { // from class: e4.B
        @Override // x3.u
        public final InterfaceC18011p[] f() {
            return C.d();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final d3.J f128194a;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray<a> f128195b;

    /* renamed from: c, reason: collision with root package name */
    private final d3.D f128196c;

    /* renamed from: d, reason: collision with root package name */
    private final C13608A f128197d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f128198e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f128199f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f128200g;

    /* renamed from: h, reason: collision with root package name */
    private long f128201h;

    /* renamed from: i, reason: collision with root package name */
    private z f128202i;

    /* renamed from: j, reason: collision with root package name */
    private x3.r f128203j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f128204k;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC13621m f128205a;

        /* renamed from: b, reason: collision with root package name */
        private final d3.J f128206b;

        /* renamed from: c, reason: collision with root package name */
        private final d3.C f128207c = new d3.C(new byte[64]);

        /* renamed from: d, reason: collision with root package name */
        private boolean f128208d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f128209e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f128210f;

        /* renamed from: g, reason: collision with root package name */
        private int f128211g;

        /* renamed from: h, reason: collision with root package name */
        private long f128212h;

        public void d() {
            this.f128210f = false;
            this.f128205a.c();
        }

        private void b() {
            this.f128207c.r(8);
            this.f128208d = this.f128207c.g();
            this.f128209e = this.f128207c.g();
            this.f128207c.r(6);
            this.f128211g = this.f128207c.h(8);
        }

        private void c() {
            this.f128212h = 0L;
            if (this.f128208d) {
                this.f128207c.r(4);
                this.f128207c.r(1);
                this.f128207c.r(1);
                long jH = (this.f128207c.h(3) << 30) | (this.f128207c.h(15) << 15) | this.f128207c.h(15);
                this.f128207c.r(1);
                if (!this.f128210f && this.f128209e) {
                    this.f128207c.r(4);
                    this.f128207c.r(1);
                    this.f128207c.r(1);
                    this.f128207c.r(1);
                    this.f128206b.b((this.f128207c.h(3) << 30) | (this.f128207c.h(15) << 15) | this.f128207c.h(15));
                    this.f128210f = true;
                }
                this.f128212h = this.f128206b.b(jH);
            }
        }

        public void a(d3.D d10) throws ParserException {
            d10.l(this.f128207c.f127058a, 0, 3);
            this.f128207c.p(0);
            b();
            d10.l(this.f128207c.f127058a, 0, this.f128211g);
            this.f128207c.p(0);
            c();
            this.f128205a.e(this.f128212h, 4);
            this.f128205a.a(d10);
            this.f128205a.d(false);
        }

        public a(InterfaceC13621m interfaceC13621m, d3.J j10) {
            this.f128205a = interfaceC13621m;
            this.f128206b = j10;
        }
    }

    public C() {
        this(new d3.J(0L));
    }

    @Override // x3.InterfaceC18011p
    public void release() {
    }

    public C(d3.J j10) {
        this.f128194a = j10;
        this.f128196c = new d3.D(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);
        this.f128195b = new SparseArray<>();
        this.f128197d = new C13608A();
    }

    public static /* synthetic */ InterfaceC18011p[] d() {
        return new InterfaceC18011p[]{new C()};
    }

    private void f(long j10) {
        if (this.f128204k) {
            return;
        }
        this.f128204k = true;
        if (this.f128197d.c() == -9223372036854775807L) {
            this.f128203j.g(new J.b(this.f128197d.c()));
            return;
        }
        z zVar = new z(this.f128197d.d(), this.f128197d.c(), j10);
        this.f128202i = zVar;
        this.f128203j.g(zVar.b());
    }

    @Override // x3.InterfaceC18011p
    public void a(long j10, long j11) {
        boolean z10 = this.f128194a.f() == -9223372036854775807L;
        if (!z10) {
            long jD = this.f128194a.d();
            z10 = (jD == -9223372036854775807L || jD == 0 || jD == j11) ? false : true;
        }
        if (z10) {
            this.f128194a.i(j11);
        }
        z zVar = this.f128202i;
        if (zVar != null) {
            zVar.h(j11);
        }
        for (int i10 = 0; i10 < this.f128195b.size(); i10++) {
            this.f128195b.valueAt(i10).d();
        }
    }

    @Override // x3.InterfaceC18011p
    public int b(InterfaceC18012q interfaceC18012q, x3.I i10) throws IOException {
        InterfaceC13621m c13622n;
        C13466a.i(this.f128203j);
        long length = interfaceC18012q.getLength();
        if (length != -1 && !this.f128197d.e()) {
            return this.f128197d.g(interfaceC18012q, i10);
        }
        f(length);
        z zVar = this.f128202i;
        if (zVar != null && zVar.d()) {
            return this.f128202i.c(interfaceC18012q, i10);
        }
        interfaceC18012q.d();
        long jG = length != -1 ? length - interfaceC18012q.g() : -1L;
        if ((jG != -1 && jG < 4) || !interfaceC18012q.b(this.f128196c.e(), 0, 4, true)) {
            return -1;
        }
        this.f128196c.W(0);
        int iQ = this.f128196c.q();
        if (iQ == 441) {
            return -1;
        }
        if (iQ == 442) {
            interfaceC18012q.m(this.f128196c.e(), 0, 10);
            this.f128196c.W(9);
            interfaceC18012q.k((this.f128196c.H() & 7) + 14);
            return 0;
        }
        if (iQ == 443) {
            interfaceC18012q.m(this.f128196c.e(), 0, 2);
            this.f128196c.W(0);
            interfaceC18012q.k(this.f128196c.P() + 6);
            return 0;
        }
        if (((iQ & (-256)) >> 8) != 1) {
            interfaceC18012q.k(1);
            return 0;
        }
        int i11 = iQ & l3.f92484c;
        a aVar = this.f128195b.get(i11);
        if (!this.f128198e) {
            if (aVar == null) {
                if (i11 == 189) {
                    c13622n = new C13611c("video/mp2p");
                    this.f128199f = true;
                    this.f128201h = interfaceC18012q.getPosition();
                } else if ((iQ & 224) == 192) {
                    c13622n = new t("video/mp2p");
                    this.f128199f = true;
                    this.f128201h = interfaceC18012q.getPosition();
                } else if ((iQ & 240) == 224) {
                    c13622n = new C13622n("video/mp2p");
                    this.f128200g = true;
                    this.f128201h = interfaceC18012q.getPosition();
                } else {
                    c13622n = null;
                }
                if (c13622n != null) {
                    c13622n.f(this.f128203j, new L.d(i11, 256));
                    aVar = new a(c13622n, this.f128194a);
                    this.f128195b.put(i11, aVar);
                }
            }
            if (interfaceC18012q.getPosition() > ((this.f128199f && this.f128200g) ? this.f128201h + 8192 : 1048576L)) {
                this.f128198e = true;
                this.f128203j.p();
            }
        }
        interfaceC18012q.m(this.f128196c.e(), 0, 2);
        this.f128196c.W(0);
        int iP = this.f128196c.P() + 6;
        if (aVar == null) {
            interfaceC18012q.k(iP);
        } else {
            this.f128196c.S(iP);
            interfaceC18012q.readFully(this.f128196c.e(), 0, iP);
            this.f128196c.W(6);
            aVar.a(this.f128196c);
            d3.D d10 = this.f128196c;
            d10.V(d10.b());
        }
        return 0;
    }

    @Override // x3.InterfaceC18011p
    public void c(x3.r rVar) {
        this.f128203j = rVar;
    }

    @Override // x3.InterfaceC18011p
    public boolean j(InterfaceC18012q interfaceC18012q) throws IOException {
        byte[] bArr = new byte[14];
        interfaceC18012q.m(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        interfaceC18012q.i(bArr[13] & 7);
        interfaceC18012q.m(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }
}
