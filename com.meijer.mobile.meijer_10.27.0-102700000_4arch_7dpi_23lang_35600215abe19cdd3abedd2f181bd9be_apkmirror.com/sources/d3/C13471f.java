package d3;

import android.os.Looper;

/* renamed from: d3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13471f<T> {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC13479n f127110a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC13479n f127111b;

    /* renamed from: c, reason: collision with root package name */
    private final a<T> f127112c;

    /* renamed from: d, reason: collision with root package name */
    private T f127113d;

    /* renamed from: e, reason: collision with root package name */
    private T f127114e;

    /* renamed from: f, reason: collision with root package name */
    private int f127115f;

    /* renamed from: d3.f$a */
    public interface a<T> {
        void a(T t10, T t11);
    }

    public static /* synthetic */ void a(final C13471f c13471f, Be.g gVar) {
        final T t10 = (T) gVar.apply(c13471f.f127114e);
        c13471f.f127114e = t10;
        c13471f.f127111b.post(new Runnable() { // from class: d3.c
            @Override // java.lang.Runnable
            public final void run() {
                C13471f.c(this.f127104a, t10);
            }
        });
    }

    public static /* synthetic */ void b(C13471f c13471f, Object obj) {
        if (c13471f.f127115f == 0) {
            c13471f.h(obj);
        }
    }

    public static /* synthetic */ void c(C13471f c13471f, Object obj) {
        int i10 = c13471f.f127115f - 1;
        c13471f.f127115f = i10;
        if (i10 == 0) {
            c13471f.h(obj);
        }
    }

    private void h(T t10) {
        T t11 = this.f127113d;
        this.f127113d = t10;
        if (t11.equals(t10)) {
            return;
        }
        this.f127112c.a(t11, t10);
    }

    public void e(Runnable runnable) {
        this.f127110a.post(runnable);
    }

    public void f(final T t10) {
        this.f127114e = t10;
        this.f127111b.post(new Runnable() { // from class: d3.d
            @Override // java.lang.Runnable
            public final void run() {
                C13471f.b(this.f127106a, t10);
            }
        });
    }

    public C13471f(T t10, Looper looper, Looper looper2, InterfaceC13473h interfaceC13473h, a<T> aVar) {
        this.f127110a = interfaceC13473h.e(looper, null);
        this.f127111b = interfaceC13473h.e(looper2, null);
        this.f127113d = t10;
        this.f127114e = t10;
        this.f127112c = aVar;
    }

    public T d() {
        boolean z10;
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == this.f127111b.f()) {
            return this.f127113d;
        }
        if (looperMyLooper == this.f127110a.f()) {
            z10 = true;
        } else {
            z10 = false;
        }
        C13466a.g(z10);
        return this.f127114e;
    }

    public void g(Be.g<T, T> gVar, final Be.g<T, T> gVar2) {
        boolean z10;
        if (Looper.myLooper() == this.f127111b.f()) {
            z10 = true;
        } else {
            z10 = false;
        }
        C13466a.g(z10);
        this.f127115f++;
        this.f127110a.post(new Runnable() { // from class: d3.e
            @Override // java.lang.Runnable
            public final void run() {
                C13471f.a(this.f127108a, gVar2);
            }
        });
        h(gVar.apply(this.f127113d));
    }
}
