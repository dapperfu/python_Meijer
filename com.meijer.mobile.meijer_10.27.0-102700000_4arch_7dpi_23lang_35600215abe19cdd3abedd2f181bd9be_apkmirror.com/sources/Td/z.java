package Td;

import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
final class z implements I {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f34958a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f34959b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC5226d f34960c;

    public z(Executor executor, InterfaceC5226d interfaceC5226d) {
        this.f34958a = executor;
        this.f34960c = interfaceC5226d;
    }

    @Override // Td.I
    public final void a(AbstractC5232j abstractC5232j) {
        if (abstractC5232j.p()) {
            synchronized (this.f34959b) {
                try {
                    if (this.f34960c == null) {
                        return;
                    }
                    this.f34958a.execute(new y(this));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
