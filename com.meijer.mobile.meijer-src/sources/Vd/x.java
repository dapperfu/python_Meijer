package Vd;

import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
final class x<TResult, TContinuationResult> implements InterfaceC5513g<TContinuationResult>, InterfaceC5512f, InterfaceC5510d, I {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f39887a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5509c f39888b;

    /* renamed from: c, reason: collision with root package name */
    private final N f39889c;

    @Override // Vd.I
    public final void a(AbstractC5516j abstractC5516j) {
        this.f39887a.execute(new w(this, abstractC5516j));
    }

    @Override // Vd.InterfaceC5510d
    public final void onCanceled() {
        this.f39889c.w();
    }

    @Override // Vd.InterfaceC5512f
    public final void onFailure(Exception exc) {
        this.f39889c.u(exc);
    }

    @Override // Vd.InterfaceC5513g
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f39889c.v(tcontinuationresult);
    }

    public x(Executor executor, InterfaceC5509c interfaceC5509c, N n10) {
        this.f39887a = executor;
        this.f39888b = interfaceC5509c;
        this.f39889c = n10;
    }
}
