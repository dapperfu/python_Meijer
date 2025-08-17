package com.bumptech.glide.load.engine;

/* loaded from: classes4.dex */
class o<Z> implements X6.c<Z> {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f63970a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f63971b;

    /* renamed from: c, reason: collision with root package name */
    private final X6.c<Z> f63972c;

    /* renamed from: d, reason: collision with root package name */
    private final a f63973d;

    /* renamed from: e, reason: collision with root package name */
    private final V6.e f63974e;

    /* renamed from: f, reason: collision with root package name */
    private int f63975f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f63976g;

    interface a {
        void a(V6.e eVar, o<?> oVar);
    }

    @Override // X6.c
    public synchronized void a() {
        if (this.f63975f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f63976g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f63976g = true;
        if (this.f63971b) {
            this.f63972c.a();
        }
    }

    synchronized void b() {
        if (this.f63976g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f63975f++;
    }

    void f() {
        boolean z10;
        synchronized (this) {
            int i10 = this.f63975f;
            if (i10 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z10 = true;
            int i11 = i10 - 1;
            this.f63975f = i11;
            if (i11 != 0) {
                z10 = false;
            }
        }
        if (z10) {
            this.f63973d.a(this.f63974e, this);
        }
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f63970a + ", listener=" + this.f63973d + ", key=" + this.f63974e + ", acquired=" + this.f63975f + ", isRecycled=" + this.f63976g + ", resource=" + this.f63972c + '}';
    }

    @Override // X6.c
    public Class<Z> c() {
        return this.f63972c.c();
    }

    X6.c<Z> d() {
        return this.f63972c;
    }

    boolean e() {
        return this.f63970a;
    }

    @Override // X6.c
    public Z get() {
        return this.f63972c.get();
    }

    @Override // X6.c
    public int getSize() {
        return this.f63972c.getSize();
    }

    o(X6.c<Z> cVar, boolean z10, boolean z11, V6.e eVar, a aVar) {
        this.f63972c = (X6.c) p7.k.d(cVar);
        this.f63970a = z10;
        this.f63971b = z11;
        this.f63974e = eVar;
        this.f63973d = (a) p7.k.d(aVar);
    }
}
