package Td;

import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
final class B implements I {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f34896a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f34897b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC5227e f34898c;

    @Override // Td.I
    public final void a(AbstractC5232j abstractC5232j) {
        synchronized (this.f34897b) {
            try {
                if (this.f34898c == null) {
                    return;
                }
                this.f34896a.execute(new A(this, abstractC5232j));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public B(Executor executor, InterfaceC5227e interfaceC5227e) {
        this.f34896a = executor;
        this.f34898c = interfaceC5227e;
    }
}
