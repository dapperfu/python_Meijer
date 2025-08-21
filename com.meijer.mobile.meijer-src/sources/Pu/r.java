package Pu;

/* loaded from: classes10.dex */
public abstract class r<T, U, V> extends t implements io.reactivex.s<T>, av.n<U, V> {

    /* renamed from: b, reason: collision with root package name */
    protected final io.reactivex.s<? super V> f27259b;

    /* renamed from: c, reason: collision with root package name */
    protected final Ou.e<U> f27260c;

    /* renamed from: d, reason: collision with root package name */
    protected volatile boolean f27261d;

    /* renamed from: e, reason: collision with root package name */
    protected volatile boolean f27262e;

    /* renamed from: f, reason: collision with root package name */
    protected Throwable f27263f;

    @Override // av.n
    public void F(io.reactivex.s<? super V> sVar, U u10) {
    }

    @Override // av.n
    public final Throwable E() {
        return this.f27263f;
    }

    @Override // av.n
    public final int G(int i10) {
        return this.f27264a.addAndGet(i10);
    }

    @Override // av.n
    public final boolean H() {
        return this.f27262e;
    }

    @Override // av.n
    public final boolean I() {
        return this.f27261d;
    }

    public final boolean a() {
        return this.f27264a.getAndIncrement() == 0;
    }

    public final boolean b() {
        return this.f27264a.get() == 0 && this.f27264a.compareAndSet(0, 1);
    }

    protected final void c(U u10, boolean z10, Ju.b bVar) {
        io.reactivex.s<? super V> sVar = this.f27259b;
        Ou.e<U> eVar = this.f27260c;
        if (this.f27264a.get() == 0 && this.f27264a.compareAndSet(0, 1)) {
            F(sVar, u10);
            if (G(-1) == 0) {
                return;
            }
        } else {
            eVar.offer(u10);
            if (!a()) {
                return;
            }
        }
        av.q.c(eVar, sVar, z10, bVar, this);
    }

    protected final void d(U u10, boolean z10, Ju.b bVar) {
        io.reactivex.s<? super V> sVar = this.f27259b;
        Ou.e<U> eVar = this.f27260c;
        if (this.f27264a.get() != 0 || !this.f27264a.compareAndSet(0, 1)) {
            eVar.offer(u10);
            if (!a()) {
                return;
            }
        } else if (eVar.isEmpty()) {
            F(sVar, u10);
            if (G(-1) == 0) {
                return;
            }
        } else {
            eVar.offer(u10);
        }
        av.q.c(eVar, sVar, z10, bVar, this);
    }

    public r(io.reactivex.s<? super V> sVar, Ou.e<U> eVar) {
        this.f27259b = sVar;
        this.f27260c = eVar;
    }
}
