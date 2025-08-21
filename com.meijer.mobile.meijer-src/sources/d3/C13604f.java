package d3;

import android.os.Looper;

/* renamed from: d3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13604f<T> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC13612n f127912a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC13612n f127913b;

    /* renamed from: c, reason: collision with root package name */
    private final a<T> f127914c;

    /* renamed from: d, reason: collision with root package name */
    private T f127915d;

    /* renamed from: e, reason: collision with root package name */
    private T f127916e;

    /* renamed from: f, reason: collision with root package name */
    private int f127917f;

    /* renamed from: d3.f$a */
    public interface a<T> {
        void a(T t10, T t11);
    }

    public static /* synthetic */ void a(final C13604f c13604f, De.g gVar) {
        final T t10 = (T) gVar.apply(c13604f.f127916e);
        c13604f.f127916e = t10;
        c13604f.f127913b.post(new Runnable() { // from class: d3.c
            @Override // java.lang.Runnable
            public final void run() {
                C13604f.c(this.f127906a, t10);
            }
        });
    }

    public static /* synthetic */ void b(C13604f c13604f, Object obj) {
        if (c13604f.f127917f == 0) {
            c13604f.h(obj);
        }
    }

    public static /* synthetic */ void c(C13604f c13604f, Object obj) {
        int i10 = c13604f.f127917f - 1;
        c13604f.f127917f = i10;
        if (i10 == 0) {
            c13604f.h(obj);
        }
    }

    private void h(T t10) {
        T t11 = this.f127915d;
        this.f127915d = t10;
        if (t11.equals(t10)) {
            return;
        }
        this.f127914c.a(t11, t10);
    }

    public void e(Runnable runnable) {
        this.f127912a.post(runnable);
    }

    public void f(final T t10) {
        this.f127916e = t10;
        this.f127913b.post(new Runnable() { // from class: d3.d
            @Override // java.lang.Runnable
            public final void run() {
                C13604f.b(this.f127908a, t10);
            }
        });
    }

    public C13604f(T t10, Looper looper, Looper looper2, InterfaceC13606h interfaceC13606h, a<T> aVar) {
        this.f127912a = interfaceC13606h.e(looper, null);
        this.f127913b = interfaceC13606h.e(looper2, null);
        this.f127915d = t10;
        this.f127916e = t10;
        this.f127914c = aVar;
    }

    public T d() {
        boolean z10;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == this.f127913b.f()) {
            return this.f127915d;
        }
        if (looperMyLooper == this.f127912a.f()) {
            z10 = true;
        } else {
            z10 = false;
        }
        C13599a.g(z10);
        return this.f127916e;
    }

    public void g(De.g<T, T> gVar, final De.g<T, T> gVar2) {
        boolean z10;
        if (Looper.myLooper() == this.f127913b.f()) {
            z10 = true;
        } else {
            z10 = false;
        }
        C13599a.g(z10);
        this.f127917f++;
        this.f127912a.post(new Runnable() { // from class: d3.e
            @Override // java.lang.Runnable
            public final void run() {
                C13604f.a(this.f127910a, gVar2);
            }
        });
        h(gVar.apply(this.f127915d));
    }
}
