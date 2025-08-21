package Vd;

import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
final class H<TResult, TContinuationResult> implements InterfaceC5513g<TContinuationResult>, InterfaceC5512f, InterfaceC5510d, I {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f39844a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5515i f39845b;

    /* renamed from: c, reason: collision with root package name */
    private final N f39846c;

    @Override // Vd.I
    public final void a(AbstractC5516j abstractC5516j) {
        this.f39844a.execute(new G(this, abstractC5516j));
    }

    @Override // Vd.InterfaceC5510d
    public final void onCanceled() {
        this.f39846c.w();
    }

    @Override // Vd.InterfaceC5512f
    public final void onFailure(Exception exc) {
        this.f39846c.u(exc);
    }

    @Override // Vd.InterfaceC5513g
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f39846c.v(tcontinuationresult);
    }

    public H(Executor executor, InterfaceC5515i interfaceC5515i, N n10) {
        this.f39844a = executor;
        this.f39845b = interfaceC5515i;
        this.f39846c = n10;
    }
}
