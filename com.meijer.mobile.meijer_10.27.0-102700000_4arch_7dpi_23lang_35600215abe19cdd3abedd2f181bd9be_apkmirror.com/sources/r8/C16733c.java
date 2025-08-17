package r8;

import g8.p;
import g8.w;
import x8.f;

/* renamed from: r8.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16733c extends p {

    /* renamed from: u, reason: collision with root package name */
    private final String f157862u;

    /* renamed from: v, reason: collision with root package name */
    private final long f157863v;

    /* renamed from: w, reason: collision with root package name */
    private final long f157864w;

    /* renamed from: x, reason: collision with root package name */
    private final int f157865x;

    /* renamed from: y, reason: collision with root package name */
    private final boolean f157866y;

    /* renamed from: r8.c$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private String f157867a;

        /* renamed from: b, reason: collision with root package name */
        private long f157868b;

        /* renamed from: c, reason: collision with root package name */
        private long f157869c;

        /* renamed from: d, reason: collision with root package name */
        private int f157870d;

        /* renamed from: e, reason: collision with root package name */
        private int f157871e;

        /* renamed from: f, reason: collision with root package name */
        private int f157872f;

        /* renamed from: g, reason: collision with root package name */
        private n8.b f157873g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f157874h;

        public C16733c i() {
            return new C16733c(this);
        }

        public b j(String str) {
            this.f157867a = str;
            return this;
        }

        public b k(long j10) {
            this.f157868b = j10;
            return this;
        }

        public b l(boolean z10) {
            this.f157874h = z10;
            return this;
        }

        public b m(long j10) {
            this.f157869c = j10;
            return this;
        }

        public b n(int i10) {
            this.f157870d = i10;
            return this;
        }

        public b o(int i10) {
            this.f157872f = i10;
            return this;
        }

        public b p(int i10) {
            this.f157871e = i10;
            return this;
        }

        public b q(n8.b bVar) {
            this.f157873g = bVar;
            return this;
        }
    }

    private C16733c(b bVar) {
        super(bVar.f157867a, 16, bVar.f157873g, bVar.f157871e, bVar.f157874h);
        this.f133109b = bVar.f157868b;
        this.f133117j = w.f133187t;
        this.f133114g = bVar.f157872f;
        this.f157862u = f.s(bVar.f157867a, 250);
        this.f157863v = bVar.f157868b;
        this.f157864w = bVar.f157869c;
        this.f157865x = bVar.f157870d;
        this.f133112e = true;
        this.f157866y = bVar.f157874h;
    }

    public String D() {
        return this.f157862u;
    }

    public long E() {
        return this.f157863v;
    }

    public boolean F() {
        return this.f157866y;
    }

    public long G() {
        return this.f157864w;
    }

    public int H() {
        return this.f157865x;
    }

    @Override // g8.p
    public StringBuilder b() {
        return new C16731a().a(this);
    }
}
