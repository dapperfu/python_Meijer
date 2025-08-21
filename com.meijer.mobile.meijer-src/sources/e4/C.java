package e4;

import android.util.SparseArray;
import androidx.media3.common.ParserException;
import androidx.recyclerview.widget.RecyclerView;
import com.medallia.digital.mobilesdk.l3;
import d3.C13599a;
import e4.L;
import java.io.IOException;
import x3.InterfaceC18077p;
import x3.InterfaceC18078q;
import x3.J;

/* loaded from: classes4.dex */
public final class C implements InterfaceC18077p {

    /* renamed from: l, reason: collision with root package name */
    public static final x3.u f129529l = new x3.u() { // from class: e4.B
        @Override // x3.u
        public final InterfaceC18077p[] f() {
            return C.d();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final d3.J f129530a;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray<a> f129531b;

    /* renamed from: c, reason: collision with root package name */
    private final d3.D f129532c;

    /* renamed from: d, reason: collision with root package name */
    private final C13756A f129533d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f129534e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f129535f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f129536g;

    /* renamed from: h, reason: collision with root package name */
    private long f129537h;

    /* renamed from: i, reason: collision with root package name */
    private z f129538i;

    /* renamed from: j, reason: collision with root package name */
    private x3.r f129539j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f129540k;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC13770m f129541a;

        /* renamed from: b, reason: collision with root package name */
        private final d3.J f129542b;

        /* renamed from: c, reason: collision with root package name */
        private final d3.C f129543c = new d3.C(new byte[64]);

        /* renamed from: d, reason: collision with root package name */
        private boolean f129544d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f129545e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f129546f;

        /* renamed from: g, reason: collision with root package name */
        private int f129547g;

        /* renamed from: h, reason: collision with root package name */
        private long f129548h;

        public void d() {
            this.f129546f = false;
            this.f129541a.c();
        }

        private void b() {
            this.f129543c.r(8);
            this.f129544d = this.f129543c.g();
            this.f129545e = this.f129543c.g();
            this.f129543c.r(6);
            this.f129547g = this.f129543c.h(8);
        }

        private void c() {
            this.f129548h = 0L;
            if (this.f129544d) {
                this.f129543c.r(4);
                this.f129543c.r(1);
                this.f129543c.r(1);
                long jH = (this.f129543c.h(3) << 30) | (this.f129543c.h(15) << 15) | this.f129543c.h(15);
                this.f129543c.r(1);
                if (!this.f129546f && this.f129545e) {
                    this.f129543c.r(4);
                    this.f129543c.r(1);
                    this.f129543c.r(1);
                    this.f129543c.r(1);
                    this.f129542b.b((this.f129543c.h(3) << 30) | (this.f129543c.h(15) << 15) | this.f129543c.h(15));
                    this.f129546f = true;
                }
                this.f129548h = this.f129542b.b(jH);
            }
        }

        public void a(d3.D d10) throws ParserException {
            d10.l(this.f129543c.f127860a, 0, 3);
            this.f129543c.p(0);
            b();
            d10.l(this.f129543c.f127860a, 0, this.f129547g);
            this.f129543c.p(0);
            c();
            this.f129541a.e(this.f129548h, 4);
            this.f129541a.a(d10);
            this.f129541a.d(false);
        }

        public a(InterfaceC13770m interfaceC13770m, d3.J j10) {
            this.f129541a = interfaceC13770m;
            this.f129542b = j10;
        }
    }

    public C() {
        this(new d3.J(0L));
    }

    @Override // x3.InterfaceC18077p
    public void release() {
    }

    public C(d3.J j10) {
        this.f129530a = j10;
        this.f129532c = new d3.D(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);
        this.f129531b = new SparseArray<>();
        this.f129533d = new C13756A();
    }

    public static /* synthetic */ InterfaceC18077p[] d() {
        return new InterfaceC18077p[]{new C()};
    }

    private void f(long j10) {
        if (this.f129540k) {
            return;
        }
        this.f129540k = true;
        if (this.f129533d.c() == -9223372036854775807L) {
            this.f129539j.g(new J.b(this.f129533d.c()));
            return;
        }
        z zVar = new z(this.f129533d.d(), this.f129533d.c(), j10);
        this.f129538i = zVar;
        this.f129539j.g(zVar.b());
    }

    @Override // x3.InterfaceC18077p
    public void a(long j10, long j11) {
        boolean z10 = this.f129530a.f() == -9223372036854775807L;
        if (!z10) {
            long jD = this.f129530a.d();
            z10 = (jD == -9223372036854775807L || jD == 0 || jD == j11) ? false : true;
        }
        if (z10) {
            this.f129530a.i(j11);
        }
        z zVar = this.f129538i;
        if (zVar != null) {
            zVar.h(j11);
        }
        for (int i10 = 0; i10 < this.f129531b.size(); i10++) {
            this.f129531b.valueAt(i10).d();
        }
    }

    @Override // x3.InterfaceC18077p
    public int b(InterfaceC18078q interfaceC18078q, x3.I i10) throws IOException {
        InterfaceC13770m c13771n;
        C13599a.i(this.f129539j);
        long length = interfaceC18078q.getLength();
        if (length != -1 && !this.f129533d.e()) {
            return this.f129533d.g(interfaceC18078q, i10);
        }
        f(length);
        z zVar = this.f129538i;
        if (zVar != null && zVar.d()) {
            return this.f129538i.c(interfaceC18078q, i10);
        }
        interfaceC18078q.d();
        long jG = length != -1 ? length - interfaceC18078q.g() : -1L;
        if ((jG != -1 && jG < 4) || !interfaceC18078q.b(this.f129532c.e(), 0, 4, true)) {
            return -1;
        }
        this.f129532c.W(0);
        int iQ = this.f129532c.q();
        if (iQ == 441) {
            return -1;
        }
        if (iQ == 442) {
            interfaceC18078q.m(this.f129532c.e(), 0, 10);
            this.f129532c.W(9);
            interfaceC18078q.k((this.f129532c.H() & 7) + 14);
            return 0;
        }
        if (iQ == 443) {
            interfaceC18078q.m(this.f129532c.e(), 0, 2);
            this.f129532c.W(0);
            interfaceC18078q.k(this.f129532c.P() + 6);
            return 0;
        }
        if (((iQ & (-256)) >> 8) != 1) {
            interfaceC18078q.k(1);
            return 0;
        }
        int i11 = iQ & l3.f93323c;
        a aVar = this.f129531b.get(i11);
        if (!this.f129534e) {
            if (aVar == null) {
                if (i11 == 189) {
                    c13771n = new C13760c("video/mp2p");
                    this.f129535f = true;
                    this.f129537h = interfaceC18078q.getPosition();
                } else if ((iQ & 224) == 192) {
                    c13771n = new t("video/mp2p");
                    this.f129535f = true;
                    this.f129537h = interfaceC18078q.getPosition();
                } else if ((iQ & 240) == 224) {
                    c13771n = new C13771n("video/mp2p");
                    this.f129536g = true;
                    this.f129537h = interfaceC18078q.getPosition();
                } else {
                    c13771n = null;
                }
                if (c13771n != null) {
                    c13771n.f(this.f129539j, new L.d(i11, 256));
                    aVar = new a(c13771n, this.f129530a);
                    this.f129531b.put(i11, aVar);
                }
            }
            if (interfaceC18078q.getPosition() > ((this.f129535f && this.f129536g) ? this.f129537h + 8192 : 1048576L)) {
                this.f129534e = true;
                this.f129539j.p();
            }
        }
        interfaceC18078q.m(this.f129532c.e(), 0, 2);
        this.f129532c.W(0);
        int iP = this.f129532c.P() + 6;
        if (aVar == null) {
            interfaceC18078q.k(iP);
        } else {
            this.f129532c.S(iP);
            interfaceC18078q.readFully(this.f129532c.e(), 0, iP);
            this.f129532c.W(6);
            aVar.a(this.f129532c);
            d3.D d10 = this.f129532c;
            d10.V(d10.b());
        }
        return 0;
    }

    @Override // x3.InterfaceC18077p
    public void c(x3.r rVar) {
        this.f129539j = rVar;
    }

    @Override // x3.InterfaceC18077p
    public boolean j(InterfaceC18078q interfaceC18078q) throws IOException {
        byte[] bArr = new byte[14];
        interfaceC18078q.m(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        interfaceC18078q.i(bArr[13] & 7);
        interfaceC18078q.m(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }
}
