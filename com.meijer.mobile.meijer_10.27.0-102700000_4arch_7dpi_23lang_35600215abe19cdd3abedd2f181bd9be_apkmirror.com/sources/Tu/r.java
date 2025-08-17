package Tu;

/* loaded from: classes9.dex */
public abstract class r<T, U, V> extends t implements io.reactivex.s<T>, ev.n<U, V> {

    /* renamed from: b, reason: collision with root package name */
    protected final io.reactivex.s<? super V> f35487b;

    /* renamed from: c, reason: collision with root package name */
    protected final Su.e<U> f35488c;

    /* renamed from: d, reason: collision with root package name */
    protected volatile boolean f35489d;

    /* renamed from: e, reason: collision with root package name */
    protected volatile boolean f35490e;

    /* renamed from: f, reason: collision with root package name */
    protected Throwable f35491f;

    @Override // ev.n
    public void F(io.reactivex.s<? super V> sVar, U u10) {
    }

    @Override // ev.n
    public final Throwable E() {
        return this.f35491f;
    }

    @Override // ev.n
    public final int G(int i10) {
        return this.f35492a.addAndGet(i10);
    }

    @Override // ev.n
    public final boolean H() {
        return this.f35490e;
    }

    @Override // ev.n
    public final boolean I() {
        return this.f35489d;
    }

    public final boolean a() {
        return this.f35492a.getAndIncrement() == 0;
    }

    public final boolean b() {
        return this.f35492a.get() == 0 && this.f35492a.compareAndSet(0, 1);
    }

    protected final void c(U u10, boolean z10, Nu.b bVar) {
        io.reactivex.s<? super V> sVar = this.f35487b;
        Su.e<U> eVar = this.f35488c;
        if (this.f35492a.get() == 0 && this.f35492a.compareAndSet(0, 1)) {
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
        ev.q.c(eVar, sVar, z10, bVar, this);
    }

    protected final void d(U u10, boolean z10, Nu.b bVar) {
        io.reactivex.s<? super V> sVar = this.f35487b;
        Su.e<U> eVar = this.f35488c;
        if (this.f35492a.get() != 0 || !this.f35492a.compareAndSet(0, 1)) {
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
        ev.q.c(eVar, sVar, z10, bVar, this);
    }

    public r(io.reactivex.s<? super V> sVar, Su.e<U> eVar) {
        this.f35487b = sVar;
        this.f35488c = eVar;
    }
}
