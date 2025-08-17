package q8;

import g8.p;
import g8.w;
import t8.C17073a;

/* renamed from: q8.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16484d extends p {

    /* renamed from: u, reason: collision with root package name */
    private final C17073a f156960u;

    /* renamed from: v, reason: collision with root package name */
    private final C17073a f156961v;

    /* renamed from: w, reason: collision with root package name */
    private final C17073a f156962w;

    /* renamed from: x, reason: collision with root package name */
    private final C17073a f156963x;

    /* renamed from: y, reason: collision with root package name */
    private final boolean f156964y;

    /* renamed from: q8.d$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private String f156965a;

        /* renamed from: b, reason: collision with root package name */
        private n8.b f156966b;

        /* renamed from: c, reason: collision with root package name */
        private int f156967c;

        /* renamed from: d, reason: collision with root package name */
        private long f156968d;

        /* renamed from: e, reason: collision with root package name */
        private w f156969e;

        /* renamed from: f, reason: collision with root package name */
        private C17073a f156970f;

        /* renamed from: g, reason: collision with root package name */
        private C17073a f156971g;

        /* renamed from: h, reason: collision with root package name */
        private C17073a f156972h;

        /* renamed from: i, reason: collision with root package name */
        private C17073a f156973i;

        /* renamed from: j, reason: collision with root package name */
        private C17073a f156974j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f156975k;

        public C16484d l() {
            return new C16484d(this);
        }

        public b m(C17073a c17073a) {
            this.f156970f = c17073a;
            return this;
        }

        public b n(C17073a c17073a) {
            this.f156971g = c17073a;
            return this;
        }

        public b o(C17073a c17073a) {
            this.f156974j = c17073a;
            return this;
        }

        public b p(w wVar) {
            this.f156969e = wVar;
            return this;
        }

        public b q(boolean z10) {
            this.f156975k = z10;
            return this;
        }

        public b r(String str) {
            this.f156965a = str;
            return this;
        }

        public b s(long j10) {
            this.f156968d = j10;
            return this;
        }

        public b t(C17073a c17073a) {
            this.f156973i = c17073a;
            return this;
        }

        public b u(int i10) {
            this.f156967c = i10;
            return this;
        }

        public b v(n8.b bVar) {
            this.f156966b = bVar;
            return this;
        }

        public b w(C17073a c17073a) {
            this.f156972h = c17073a;
            return this;
        }
    }

    private C16484d(b bVar) {
        super(bVar.f156965a, 15, bVar.f156966b, bVar.f156967c, bVar.f156975k);
        this.f133117j = bVar.f156969e;
        this.f133114g = bVar.f156970f.a();
        this.f133109b = bVar.f156970f.b();
        this.f133111d = bVar.f156968d;
        this.f156960u = bVar.f156971g;
        this.f156961v = bVar.f156972h;
        this.f156962w = bVar.f156973i;
        this.f156963x = bVar.f156974j;
        this.f133112e = true;
        this.f156964y = bVar.f156975k;
    }

    public C17073a D() {
        return new C17073a(n(), this.f133114g);
    }

    public C17073a E() {
        return this.f156960u;
    }

    public C17073a F() {
        return this.f156963x;
    }

    public boolean G() {
        return this.f156964y;
    }

    public C17073a H() {
        return this.f156962w;
    }

    public C17073a I() {
        return this.f156961v;
    }

    @Override // g8.p
    public StringBuilder b() {
        return new C16483c().a(this);
    }

    @Override // g8.p
    protected int p() {
        return super.p();
    }
}
