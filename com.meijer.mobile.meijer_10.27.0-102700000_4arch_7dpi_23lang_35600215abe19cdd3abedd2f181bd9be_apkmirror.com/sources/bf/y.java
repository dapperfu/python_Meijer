package bf;

import If.a;

/* loaded from: classes7.dex */
class y<T> implements If.b<T>, If.a<T> {

    /* renamed from: c, reason: collision with root package name */
    private static final a.InterfaceC0219a<Object> f60210c = new a.InterfaceC0219a() { // from class: bf.v
        @Override // If.a.InterfaceC0219a
        public final void a(If.b bVar) {
            y.d(bVar);
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private static final If.b<Object> f60211d = new If.b() { // from class: bf.w
        @Override // If.b
        public final Object get() {
            return y.b();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private a.InterfaceC0219a<T> f60212a;

    /* renamed from: b, reason: collision with root package name */
    private volatile If.b<T> f60213b;

    public static /* synthetic */ Object b() {
        return null;
    }

    public static /* synthetic */ void d(If.b bVar) {
    }

    static <T> y<T> e() {
        return new y<>(f60210c, f60211d);
    }

    static <T> y<T> f(If.b<T> bVar) {
        return new y<>(null, bVar);
    }

    @Override // If.a
    public void a(final a.InterfaceC0219a<T> interfaceC0219a) {
        If.b<T> bVar;
        If.b<T> bVar2;
        If.b<T> bVar3 = this.f60213b;
        If.b<Object> bVar4 = f60211d;
        if (bVar3 != bVar4) {
            interfaceC0219a.a(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f60213b;
            if (bVar != bVar4) {
                bVar2 = bVar;
            } else {
                final a.InterfaceC0219a<T> interfaceC0219a2 = this.f60212a;
                this.f60212a = new a.InterfaceC0219a() { // from class: bf.x
                    @Override // If.a.InterfaceC0219a
                    public final void a(If.b bVar5) {
                        y.c(interfaceC0219a2, interfaceC0219a, bVar5);
                    }
                };
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            interfaceC0219a.a(bVar);
        }
    }

    void g(If.b<T> bVar) {
        a.InterfaceC0219a<T> interfaceC0219a;
        if (this.f60213b != f60211d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            interfaceC0219a = this.f60212a;
            this.f60212a = null;
            this.f60213b = bVar;
        }
        interfaceC0219a.a(bVar);
    }

    @Override // If.b
    public T get() {
        return this.f60213b.get();
    }

    private y(a.InterfaceC0219a<T> interfaceC0219a, If.b<T> bVar) {
        this.f60212a = interfaceC0219a;
        this.f60213b = bVar;
    }

    public static /* synthetic */ void c(a.InterfaceC0219a interfaceC0219a, a.InterfaceC0219a interfaceC0219a2, If.b bVar) {
        interfaceC0219a.a(bVar);
        interfaceC0219a2.a(bVar);
    }
}
