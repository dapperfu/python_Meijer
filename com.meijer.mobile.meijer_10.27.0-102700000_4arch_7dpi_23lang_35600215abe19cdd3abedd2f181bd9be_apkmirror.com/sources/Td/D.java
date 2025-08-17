package Td;

import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
final class D implements I {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f34901a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f34902b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC5228f f34903c;

    public D(Executor executor, InterfaceC5228f interfaceC5228f) {
        this.f34901a = executor;
        this.f34903c = interfaceC5228f;
    }

    @Override // Td.I
    public final void a(AbstractC5232j abstractC5232j) {
        if (!abstractC5232j.r() && !abstractC5232j.p()) {
            synchronized (this.f34902b) {
                try {
                    if (this.f34903c == null) {
                        return;
                    }
                    this.f34901a.execute(new C(this, abstractC5232j));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
