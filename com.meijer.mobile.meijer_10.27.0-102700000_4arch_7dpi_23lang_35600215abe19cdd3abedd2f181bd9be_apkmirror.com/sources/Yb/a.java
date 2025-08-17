package Yb;

/* loaded from: classes4.dex */
public final class a<T> implements Rb.a<T> {

    /* renamed from: a, reason: collision with root package name */
    protected boolean f40229a;

    /* renamed from: b, reason: collision with root package name */
    protected Exception f40230b;

    /* renamed from: c, reason: collision with root package name */
    protected T f40231c;

    @Override // Rb.a
    public final synchronized void a(T t10) {
        this.f40231c = t10;
        this.f40229a = true;
        notifyAll();
    }

    public final synchronized T b() throws Exception {
        while (!this.f40229a) {
            try {
                wait();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Exception exc = this.f40230b;
        if (exc != null) {
            throw exc;
        }
        return this.f40231c;
    }

    @Override // Rb.a
    public final synchronized void a(int i10, String str) {
        this.f40230b = new Exception("Failed - status code: " + i10 + "   error message: " + str);
        this.f40229a = true;
        notifyAll();
    }
}
