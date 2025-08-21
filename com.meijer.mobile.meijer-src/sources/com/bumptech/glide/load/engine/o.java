package com.bumptech.glide.load.engine;

/* loaded from: classes4.dex */
class o<Z> implements Z6.c<Z> {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f64810a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f64811b;

    /* renamed from: c, reason: collision with root package name */
    private final Z6.c<Z> f64812c;

    /* renamed from: d, reason: collision with root package name */
    private final a f64813d;

    /* renamed from: e, reason: collision with root package name */
    private final X6.e f64814e;

    /* renamed from: f, reason: collision with root package name */
    private int f64815f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f64816g;

    interface a {
        void b(X6.e eVar, o<?> oVar);
    }

    @Override // Z6.c
    public synchronized void a() {
        if (this.f64815f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f64816g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f64816g = true;
        if (this.f64811b) {
            this.f64812c.a();
        }
    }

    synchronized void b() {
        if (this.f64816g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f64815f++;
    }

    void f() {
        boolean z10;
        synchronized (this) {
            int i10 = this.f64815f;
            if (i10 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z10 = true;
            int i11 = i10 - 1;
            this.f64815f = i11;
            if (i11 != 0) {
                z10 = false;
            }
        }
        if (z10) {
            this.f64813d.b(this.f64814e, this);
        }
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f64810a + ", listener=" + this.f64813d + ", key=" + this.f64814e + ", acquired=" + this.f64815f + ", isRecycled=" + this.f64816g + ", resource=" + this.f64812c + '}';
    }

    @Override // Z6.c
    public Class<Z> c() {
        return this.f64812c.c();
    }

    Z6.c<Z> d() {
        return this.f64812c;
    }

    boolean e() {
        return this.f64810a;
    }

    @Override // Z6.c
    public Z get() {
        return this.f64812c.get();
    }

    @Override // Z6.c
    public int getSize() {
        return this.f64812c.getSize();
    }

    o(Z6.c<Z> cVar, boolean z10, boolean z11, X6.e eVar, a aVar) {
        this.f64812c = (Z6.c) r7.k.d(cVar);
        this.f64810a = z10;
        this.f64811b = z11;
        this.f64814e = eVar;
        this.f64813d = (a) r7.k.d(aVar);
    }
}
