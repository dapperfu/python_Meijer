package Vd;

import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
final class B implements I {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f39829a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f39830b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC5511e f39831c;

    @Override // Vd.I
    public final void a(AbstractC5516j abstractC5516j) {
        synchronized (this.f39830b) {
            try {
                if (this.f39831c == null) {
                    return;
                }
                this.f39829a.execute(new A(this, abstractC5516j));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public B(Executor executor, InterfaceC5511e interfaceC5511e) {
        this.f39829a = executor;
        this.f39831c = interfaceC5511e;
    }
}
