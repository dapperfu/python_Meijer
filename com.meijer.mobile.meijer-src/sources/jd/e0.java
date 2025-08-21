package jd;

/* loaded from: classes4.dex */
final class e0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Td.l f140327a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g0 f140328b;

    e0(g0 g0Var, Td.l lVar) {
        this.f140328b = g0Var;
        this.f140327a = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g0.c2(this.f140328b, this.f140327a);
    }
}
