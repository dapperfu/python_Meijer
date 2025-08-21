package df;

import Kf.a;

/* loaded from: classes8.dex */
class y<T> implements Kf.b<T>, Kf.a<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final a.InterfaceC0279a<Object> f128445c = new a.InterfaceC0279a() { // from class: df.v
        @Override // Kf.a.InterfaceC0279a
        public final void a(Kf.b bVar) {
            y.d(bVar);
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private static final Kf.b<Object> f128446d = new Kf.b() { // from class: df.w
        @Override // Kf.b
        public final Object get() {
            return y.b();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private a.InterfaceC0279a<T> f128447a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Kf.b<T> f128448b;

    public static /* synthetic */ Object b() {
        return null;
    }

    public static /* synthetic */ void d(Kf.b bVar) {
    }

    static <T> y<T> e() {
        return new y<>(f128445c, f128446d);
    }

    static <T> y<T> f(Kf.b<T> bVar) {
        return new y<>(null, bVar);
    }

    @Override // Kf.a
    public void a(final a.InterfaceC0279a<T> interfaceC0279a) {
        Kf.b<T> bVar;
        Kf.b<T> bVar2;
        Kf.b<T> bVar3 = this.f128448b;
        Kf.b<Object> bVar4 = f128446d;
        if (bVar3 != bVar4) {
            interfaceC0279a.a(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f128448b;
            if (bVar != bVar4) {
                bVar2 = bVar;
            } else {
                final a.InterfaceC0279a<T> interfaceC0279a2 = this.f128447a;
                this.f128447a = new a.InterfaceC0279a() { // from class: df.x
                    @Override // Kf.a.InterfaceC0279a
                    public final void a(Kf.b bVar5) {
                        y.c(interfaceC0279a2, interfaceC0279a, bVar5);
                    }
                };
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            interfaceC0279a.a(bVar);
        }
    }

    void g(Kf.b<T> bVar) {
        a.InterfaceC0279a<T> interfaceC0279a;
        if (this.f128448b != f128446d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            interfaceC0279a = this.f128447a;
            this.f128447a = null;
            this.f128448b = bVar;
        }
        interfaceC0279a.a(bVar);
    }

    @Override // Kf.b
    public T get() {
        return this.f128448b.get();
    }

    private y(a.InterfaceC0279a<T> interfaceC0279a, Kf.b<T> bVar) {
        this.f128447a = interfaceC0279a;
        this.f128448b = bVar;
    }

    public static /* synthetic */ void c(a.InterfaceC0279a interfaceC0279a, a.InterfaceC0279a interfaceC0279a2, Kf.b bVar) {
        interfaceC0279a.a(bVar);
        interfaceC0279a2.a(bVar);
    }
}
