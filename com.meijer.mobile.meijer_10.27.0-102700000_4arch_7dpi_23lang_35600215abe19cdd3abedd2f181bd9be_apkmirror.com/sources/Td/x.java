package Td;

import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
final class x<TResult, TContinuationResult> implements InterfaceC5229g<TContinuationResult>, InterfaceC5228f, InterfaceC5226d, I {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f34954a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5225c f34955b;

    /* renamed from: c, reason: collision with root package name */
    private final N f34956c;

    @Override // Td.I
    public final void a(AbstractC5232j abstractC5232j) {
        this.f34954a.execute(new w(this, abstractC5232j));
    }

    @Override // Td.InterfaceC5226d
    public final void onCanceled() {
        this.f34956c.w();
    }

    @Override // Td.InterfaceC5228f
    public final void onFailure(Exception exc) {
        this.f34956c.u(exc);
    }

    @Override // Td.InterfaceC5229g
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f34956c.v(tcontinuationresult);
    }

    public x(Executor executor, InterfaceC5225c interfaceC5225c, N n10) {
        this.f34954a = executor;
        this.f34955b = interfaceC5225c;
        this.f34956c = n10;
    }
}
