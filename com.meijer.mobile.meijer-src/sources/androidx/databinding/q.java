package androidx.databinding;

import androidx.view.InterfaceC6172s;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class q<T> extends WeakReference<p> {

    /* renamed from: a, reason: collision with root package name */
    private final m<T> f54361a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f54362b;

    /* renamed from: c, reason: collision with root package name */
    private T f54363c;

    public T b() {
        return this.f54363c;
    }

    public void c(InterfaceC6172s interfaceC6172s) {
        this.f54361a.a(interfaceC6172s);
    }

    public boolean e() {
        boolean z10;
        T t10 = this.f54363c;
        if (t10 != null) {
            this.f54361a.b(t10);
            z10 = true;
        } else {
            z10 = false;
        }
        this.f54363c = null;
        return z10;
    }

    public q(p pVar, int i10, m<T> mVar, ReferenceQueue<p> referenceQueue) {
        super(pVar, referenceQueue);
        this.f54362b = i10;
        this.f54361a = mVar;
    }

    protected p a() {
        p pVar = (p) get();
        if (pVar == null) {
            e();
        }
        return pVar;
    }

    public void d(T t10) {
        e();
        this.f54363c = t10;
        if (t10 != null) {
            this.f54361a.c(t10);
        }
    }
}
