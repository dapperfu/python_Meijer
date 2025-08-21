package s8;

import i8.p;
import i8.w;
import v8.C17648a;

/* renamed from: s8.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17032d extends p {

    /* renamed from: u, reason: collision with root package name */
    private final C17648a f160075u;

    /* renamed from: v, reason: collision with root package name */
    private final C17648a f160076v;

    /* renamed from: w, reason: collision with root package name */
    private final C17648a f160077w;

    /* renamed from: x, reason: collision with root package name */
    private final C17648a f160078x;

    /* renamed from: y, reason: collision with root package name */
    private final boolean f160079y;

    /* renamed from: s8.d$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private String f160080a;

        /* renamed from: b, reason: collision with root package name */
        private p8.b f160081b;

        /* renamed from: c, reason: collision with root package name */
        private int f160082c;

        /* renamed from: d, reason: collision with root package name */
        private long f160083d;

        /* renamed from: e, reason: collision with root package name */
        private w f160084e;

        /* renamed from: f, reason: collision with root package name */
        private C17648a f160085f;

        /* renamed from: g, reason: collision with root package name */
        private C17648a f160086g;

        /* renamed from: h, reason: collision with root package name */
        private C17648a f160087h;

        /* renamed from: i, reason: collision with root package name */
        private C17648a f160088i;

        /* renamed from: j, reason: collision with root package name */
        private C17648a f160089j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f160090k;

        public C17032d l() {
            return new C17032d(this);
        }

        public b m(C17648a c17648a) {
            this.f160085f = c17648a;
            return this;
        }

        public b n(C17648a c17648a) {
            this.f160086g = c17648a;
            return this;
        }

        public b o(C17648a c17648a) {
            this.f160089j = c17648a;
            return this;
        }

        public b p(w wVar) {
            this.f160084e = wVar;
            return this;
        }

        public b q(boolean z10) {
            this.f160090k = z10;
            return this;
        }

        public b r(String str) {
            this.f160080a = str;
            return this;
        }

        public b s(long j10) {
            this.f160083d = j10;
            return this;
        }

        public b t(C17648a c17648a) {
            this.f160088i = c17648a;
            return this;
        }

        public b u(int i10) {
            this.f160082c = i10;
            return this;
        }

        public b v(p8.b bVar) {
            this.f160081b = bVar;
            return this;
        }

        public b w(C17648a c17648a) {
            this.f160087h = c17648a;
            return this;
        }
    }

    private C17032d(b bVar) {
        super(bVar.f160080a, 15, bVar.f160081b, bVar.f160082c, bVar.f160090k);
        this.f137333j = bVar.f160084e;
        this.f137330g = bVar.f160085f.a();
        this.f137325b = bVar.f160085f.b();
        this.f137327d = bVar.f160083d;
        this.f160075u = bVar.f160086g;
        this.f160076v = bVar.f160087h;
        this.f160077w = bVar.f160088i;
        this.f160078x = bVar.f160089j;
        this.f137328e = true;
        this.f160079y = bVar.f160090k;
    }

    public C17648a D() {
        return new C17648a(n(), this.f137330g);
    }

    public C17648a E() {
        return this.f160075u;
    }

    public C17648a F() {
        return this.f160078x;
    }

    public boolean G() {
        return this.f160079y;
    }

    public C17648a H() {
        return this.f160077w;
    }

    public C17648a I() {
        return this.f160076v;
    }

    @Override // i8.p
    public StringBuilder b() {
        return new C17031c().a(this);
    }

    @Override // i8.p
    protected int p() {
        return super.p();
    }
}
