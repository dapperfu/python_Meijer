package Vd;

import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
final class F implements I {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f39839a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f39840b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC5513g f39841c;

    public F(Executor executor, InterfaceC5513g interfaceC5513g) {
        this.f39839a = executor;
        this.f39841c = interfaceC5513g;
    }

    @Override // Vd.I
    public final void a(AbstractC5516j abstractC5516j) {
        if (abstractC5516j.r()) {
            synchronized (this.f39840b) {
                try {
                    if (this.f39841c == null) {
                        return;
                    }
                    this.f39839a.execute(new E(this, abstractC5516j));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
