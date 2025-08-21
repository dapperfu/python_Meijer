package t8;

import i8.p;
import i8.w;
import z8.f;

/* renamed from: t8.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17207c extends p {

    /* renamed from: u, reason: collision with root package name */
    private final String f162352u;

    /* renamed from: v, reason: collision with root package name */
    private final long f162353v;

    /* renamed from: w, reason: collision with root package name */
    private final long f162354w;

    /* renamed from: x, reason: collision with root package name */
    private final int f162355x;

    /* renamed from: y, reason: collision with root package name */
    private final boolean f162356y;

    /* renamed from: t8.c$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private String f162357a;

        /* renamed from: b, reason: collision with root package name */
        private long f162358b;

        /* renamed from: c, reason: collision with root package name */
        private long f162359c;

        /* renamed from: d, reason: collision with root package name */
        private int f162360d;

        /* renamed from: e, reason: collision with root package name */
        private int f162361e;

        /* renamed from: f, reason: collision with root package name */
        private int f162362f;

        /* renamed from: g, reason: collision with root package name */
        private p8.b f162363g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f162364h;

        public C17207c i() {
            return new C17207c(this);
        }

        public b j(String str) {
            this.f162357a = str;
            return this;
        }

        public b k(long j10) {
            this.f162358b = j10;
            return this;
        }

        public b l(boolean z10) {
            this.f162364h = z10;
            return this;
        }

        public b m(long j10) {
            this.f162359c = j10;
            return this;
        }

        public b n(int i10) {
            this.f162360d = i10;
            return this;
        }

        public b o(int i10) {
            this.f162362f = i10;
            return this;
        }

        public b p(int i10) {
            this.f162361e = i10;
            return this;
        }

        public b q(p8.b bVar) {
            this.f162363g = bVar;
            return this;
        }
    }

    private C17207c(b bVar) {
        super(bVar.f162357a, 16, bVar.f162363g, bVar.f162361e, bVar.f162364h);
        this.f137325b = bVar.f162358b;
        this.f137333j = w.f137403t;
        this.f137330g = bVar.f162362f;
        this.f162352u = f.s(bVar.f162357a, 250);
        this.f162353v = bVar.f162358b;
        this.f162354w = bVar.f162359c;
        this.f162355x = bVar.f162360d;
        this.f137328e = true;
        this.f162356y = bVar.f162364h;
    }

    public String D() {
        return this.f162352u;
    }

    public long E() {
        return this.f162353v;
    }

    public boolean F() {
        return this.f162356y;
    }

    public long G() {
        return this.f162354w;
    }

    public int H() {
        return this.f162355x;
    }

    @Override // i8.p
    public StringBuilder b() {
        return new C17205a().a(this);
    }
}
