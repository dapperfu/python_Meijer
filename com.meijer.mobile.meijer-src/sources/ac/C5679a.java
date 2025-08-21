package ac;

/* renamed from: ac.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5679a<T> implements Tb.a<T> {

    /* renamed from: a, reason: collision with root package name */
    protected boolean f45361a;

    /* renamed from: b, reason: collision with root package name */
    protected Exception f45362b;

    /* renamed from: c, reason: collision with root package name */
    protected T f45363c;

    @Override // Tb.a
    public final synchronized void a(T t10) {
        this.f45363c = t10;
        this.f45361a = true;
        notifyAll();
    }

    public final synchronized T b() throws Exception {
        while (!this.f45361a) {
            try {
                wait();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Exception exc = this.f45362b;
        if (exc != null) {
            throw exc;
        }
        return this.f45363c;
    }

    @Override // Tb.a
    public final synchronized void a(int i10, String str) {
        this.f45362b = new Exception("Failed - status code: " + i10 + "   error message: " + str);
        this.f45361a = true;
        notifyAll();
    }
}
