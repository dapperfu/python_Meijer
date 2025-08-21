package tb;

import nt.InterfaceC16021c;

/* renamed from: tb.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17216a<T> implements InterfaceC16021c<T> {

    /* renamed from: a, reason: collision with root package name */
    boolean f162375a;

    /* renamed from: b, reason: collision with root package name */
    Exception f162376b;

    /* renamed from: c, reason: collision with root package name */
    T f162377c;

    @Override // nt.InterfaceC16021c
    public final synchronized void a(T t10) {
        this.f162377c = t10;
        this.f162375a = true;
        notifyAll();
    }

    public final synchronized T b() throws Exception {
        while (!this.f162375a) {
            try {
                wait();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Exception exc = this.f162376b;
        if (exc != null) {
            throw exc;
        }
        return this.f162377c;
    }

    @Override // nt.InterfaceC16021c
    public final synchronized void a(int i10, String str) {
        this.f162376b = new Exception("Failed - status code: " + i10 + "   error message: " + str);
        this.f162375a = true;
        notifyAll();
    }
}
