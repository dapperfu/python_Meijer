package Vd;

import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
final class D implements I {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f39834a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f39835b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC5512f f39836c;

    public D(Executor executor, InterfaceC5512f interfaceC5512f) {
        this.f39834a = executor;
        this.f39836c = interfaceC5512f;
    }

    @Override // Vd.I
    public final void a(AbstractC5516j abstractC5516j) {
        if (!abstractC5516j.r() && !abstractC5516j.p()) {
            synchronized (this.f39835b) {
                try {
                    if (this.f39836c == null) {
                        return;
                    }
                    this.f39834a.execute(new C(this, abstractC5516j));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
