package Td;

import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
final class v implements I {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f34949a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5225c f34950b;

    /* renamed from: c, reason: collision with root package name */
    private final N f34951c;

    @Override // Td.I
    public final void a(AbstractC5232j abstractC5232j) {
        this.f34949a.execute(new u(this, abstractC5232j));
    }

    public v(Executor executor, InterfaceC5225c interfaceC5225c, N n10) {
        this.f34949a = executor;
        this.f34950b = interfaceC5225c;
        this.f34951c = n10;
    }
}
