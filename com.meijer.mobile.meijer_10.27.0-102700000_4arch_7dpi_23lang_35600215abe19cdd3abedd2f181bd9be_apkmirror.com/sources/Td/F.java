package Td;

import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
final class F implements I {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f34906a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f34907b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC5229g f34908c;

    public F(Executor executor, InterfaceC5229g interfaceC5229g) {
        this.f34906a = executor;
        this.f34908c = interfaceC5229g;
    }

    @Override // Td.I
    public final void a(AbstractC5232j abstractC5232j) {
        if (abstractC5232j.r()) {
            synchronized (this.f34907b) {
                try {
                    if (this.f34908c == null) {
                        return;
                    }
                    this.f34906a.execute(new E(this, abstractC5232j));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
