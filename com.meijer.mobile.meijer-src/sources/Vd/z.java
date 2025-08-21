package Vd;

import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
final class z implements I {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f39891a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f39892b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC5510d f39893c;

    public z(Executor executor, InterfaceC5510d interfaceC5510d) {
        this.f39891a = executor;
        this.f39893c = interfaceC5510d;
    }

    @Override // Vd.I
    public final void a(AbstractC5516j abstractC5516j) {
        if (abstractC5516j.p()) {
            synchronized (this.f39892b) {
                try {
                    if (this.f39893c == null) {
                        return;
                    }
                    this.f39891a.execute(new y(this));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
