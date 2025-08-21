package com.bumptech.glide.load.engine;

import s7.C17028a;

/* loaded from: classes4.dex */
final class r<Z> implements Z6.c<Z>, C17028a.f {

    /* renamed from: e, reason: collision with root package name */
    private static final o2.f<r<?>> f64823e = C17028a.d(20, new a());

    /* renamed from: a, reason: collision with root package name */
    private final s7.c f64824a = s7.c.a();

    /* renamed from: b, reason: collision with root package name */
    private Z6.c<Z> f64825b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f64826c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f64827d;

    class a implements C17028a.d<r<?>> {
        @Override // s7.C17028a.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public r<?> a() {
            return new r<>();
        }

        a() {
        }
    }

    private void b(Z6.c<Z> cVar) {
        this.f64827d = false;
        this.f64826c = true;
        this.f64825b = cVar;
    }

    private void f() {
        this.f64825b = null;
        f64823e.a(this);
    }

    @Override // Z6.c
    public synchronized void a() {
        this.f64824a.c();
        this.f64827d = true;
        if (!this.f64826c) {
            this.f64825b.a();
            f();
        }
    }

    synchronized void g() {
        this.f64824a.c();
        if (!this.f64826c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f64826c = false;
        if (this.f64827d) {
            a();
        }
    }

    static <Z> r<Z> d(Z6.c<Z> cVar) {
        r<Z> rVar = (r) r7.k.d(f64823e.b());
        rVar.b(cVar);
        return rVar;
    }

    @Override // Z6.c
    public Class<Z> c() {
        return this.f64825b.c();
    }

    @Override // s7.C17028a.f
    public s7.c e() {
        return this.f64824a;
    }

    @Override // Z6.c
    public Z get() {
        return this.f64825b.get();
    }

    @Override // Z6.c
    public int getSize() {
        return this.f64825b.getSize();
    }

    r() {
    }
}
