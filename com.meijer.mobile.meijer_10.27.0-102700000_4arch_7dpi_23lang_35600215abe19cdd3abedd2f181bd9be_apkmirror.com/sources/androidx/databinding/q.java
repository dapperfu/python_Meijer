package androidx.databinding;

import androidx.view.InterfaceC6030s;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class q<T> extends WeakReference<p> {

    /* renamed from: a, reason: collision with root package name */
    private final m<T> f54137a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f54138b;

    /* renamed from: c, reason: collision with root package name */
    private T f54139c;

    public T b() {
        return this.f54139c;
    }

    public void c(InterfaceC6030s interfaceC6030s) {
        this.f54137a.a(interfaceC6030s);
    }

    public boolean e() {
        boolean z10;
        T t10 = this.f54139c;
        if (t10 != null) {
            this.f54137a.b(t10);
            z10 = true;
        } else {
            z10 = false;
        }
        this.f54139c = null;
        return z10;
    }

    public q(p pVar, int i10, m<T> mVar, ReferenceQueue<p> referenceQueue) {
        super(pVar, referenceQueue);
        this.f54138b = i10;
        this.f54137a = mVar;
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
        this.f54139c = t10;
        if (t10 != null) {
            this.f54137a.c(t10);
        }
    }
}
