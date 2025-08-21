package Vd;

import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
final class v implements I {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f39882a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC5509c f39883b;

    /* renamed from: c, reason: collision with root package name */
    private final N f39884c;

    @Override // Vd.I
    public final void a(AbstractC5516j abstractC5516j) {
        this.f39882a.execute(new u(this, abstractC5516j));
    }

    public v(Executor executor, InterfaceC5509c interfaceC5509c, N n10) {
        this.f39882a = executor;
        this.f39883b = interfaceC5509c;
        this.f39884c = n10;
    }
}
