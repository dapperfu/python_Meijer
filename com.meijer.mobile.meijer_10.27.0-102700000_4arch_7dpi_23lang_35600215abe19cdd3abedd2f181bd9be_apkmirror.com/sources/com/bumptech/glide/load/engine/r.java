package com.bumptech.glide.load.engine;

import q7.C16480a;

/* loaded from: classes4.dex */
final class r<Z> implements X6.c<Z>, C16480a.f {

    /* renamed from: e, reason: collision with root package name */
    private static final o2.f<r<?>> f63983e = C16480a.d(20, new a());

    /* renamed from: a, reason: collision with root package name */
    private final q7.c f63984a = q7.c.a();

    /* renamed from: b, reason: collision with root package name */
    private X6.c<Z> f63985b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f63986c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f63987d;

    class a implements C16480a.d<r<?>> {
        @Override // q7.C16480a.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public r<?> a() {
            return new r<>();
        }

        a() {
        }
    }

    private void b(X6.c<Z> cVar) {
        this.f63987d = false;
        this.f63986c = true;
        this.f63985b = cVar;
    }

    private void f() {
        this.f63985b = null;
        f63983e.a(this);
    }

    @Override // X6.c
    public synchronized void a() {
        this.f63984a.c();
        this.f63987d = true;
        if (!this.f63986c) {
            this.f63985b.a();
            f();
        }
    }

    synchronized void g() {
        this.f63984a.c();
        if (!this.f63986c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f63986c = false;
        if (this.f63987d) {
            a();
        }
    }

    static <Z> r<Z> d(X6.c<Z> cVar) {
        r<Z> rVar = (r) p7.k.d(f63983e.b());
        rVar.b(cVar);
        return rVar;
    }

    @Override // X6.c
    public Class<Z> c() {
        return this.f63985b.c();
    }

    @Override // q7.C16480a.f
    public q7.c e() {
        return this.f63984a;
    }

    @Override // X6.c
    public Z get() {
        return this.f63985b.get();
    }

    @Override // X6.c
    public int getSize() {
        return this.f63985b.getSize();
    }

    r() {
    }
}
