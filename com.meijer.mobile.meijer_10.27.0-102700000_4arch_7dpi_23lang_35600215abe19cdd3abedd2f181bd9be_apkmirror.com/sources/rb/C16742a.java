package rb;

import nt.InterfaceC15945c;

/* renamed from: rb.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16742a<T> implements InterfaceC15945c<T> {

    /* renamed from: a, reason: collision with root package name */
    boolean f157885a;

    /* renamed from: b, reason: collision with root package name */
    Exception f157886b;

    /* renamed from: c, reason: collision with root package name */
    T f157887c;

    @Override // nt.InterfaceC15945c
    public final synchronized void a(T t10) {
        this.f157887c = t10;
        this.f157885a = true;
        notifyAll();
    }

    public final synchronized T b() throws Exception {
        while (!this.f157885a) {
            try {
                wait();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Exception exc = this.f157886b;
        if (exc != null) {
            throw exc;
        }
        return this.f157887c;
    }

    @Override // nt.InterfaceC15945c
    public final synchronized void a(int i10, String str) {
        this.f157886b = new Exception("Failed - status code: " + i10 + "   error message: " + str);
        this.f157885a = true;
        notifyAll();
    }
}
