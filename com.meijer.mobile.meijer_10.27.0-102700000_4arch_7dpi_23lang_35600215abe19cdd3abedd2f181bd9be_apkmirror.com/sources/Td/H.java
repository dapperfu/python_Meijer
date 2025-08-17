package Td;

import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
final class H<TResult, TContinuationResult> implements InterfaceC5229g<TContinuationResult>, InterfaceC5228f, InterfaceC5226d, I {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f34911a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5231i f34912b;

    /* renamed from: c, reason: collision with root package name */
    private final N f34913c;

    @Override // Td.I
    public final void a(AbstractC5232j abstractC5232j) {
        this.f34911a.execute(new G(this, abstractC5232j));
    }

    @Override // Td.InterfaceC5226d
    public final void onCanceled() {
        this.f34913c.w();
    }

    @Override // Td.InterfaceC5228f
    public final void onFailure(Exception exc) {
        this.f34913c.u(exc);
    }

    @Override // Td.InterfaceC5229g
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f34913c.v(tcontinuationresult);
    }

    public H(Executor executor, InterfaceC5231i interfaceC5231i, N n10) {
        this.f34911a = executor;
        this.f34912b = interfaceC5231i;
        this.f34913c = n10;
    }
}
