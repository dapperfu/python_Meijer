package hd;

/* loaded from: classes4.dex */
final class e0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Rd.l f134638a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g0 f134639b;

    e0(g0 g0Var, Rd.l lVar) {
        this.f134639b = g0Var;
        this.f134638a = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g0.b2(this.f134639b, this.f134638a);
    }
}
