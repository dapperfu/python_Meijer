package Td;

import java.util.concurrent.ExecutionException;

/* loaded from: classes6.dex */
final class s<T> implements r<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Object f34938a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final int f34939b;

    /* renamed from: c, reason: collision with root package name */
    private final N f34940c;

    /* renamed from: d, reason: collision with root package name */
    private int f34941d;

    /* renamed from: e, reason: collision with root package name */
    private int f34942e;

    /* renamed from: f, reason: collision with root package name */
    private int f34943f;

    /* renamed from: g, reason: collision with root package name */
    private Exception f34944g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f34945h;

    private final void a() {
        if (this.f34941d + this.f34942e + this.f34943f == this.f34939b) {
            if (this.f34944g == null) {
                if (this.f34945h) {
                    this.f34940c.w();
                    return;
                } else {
                    this.f34940c.v(null);
                    return;
                }
            }
            this.f34940c.u(new ExecutionException(this.f34942e + " out of " + this.f34939b + " underlying tasks failed", this.f34944g));
        }
    }

    @Override // Td.InterfaceC5226d
    public final void onCanceled() {
        synchronized (this.f34938a) {
            this.f34943f++;
            this.f34945h = true;
            a();
        }
    }

    @Override // Td.InterfaceC5228f
    public final void onFailure(Exception exc) {
        synchronized (this.f34938a) {
            this.f34942e++;
            this.f34944g = exc;
            a();
        }
    }

    @Override // Td.InterfaceC5229g
    public final void onSuccess(T t10) {
        synchronized (this.f34938a) {
            this.f34941d++;
            a();
        }
    }

    public s(int i10, N n10) {
        this.f34939b = i10;
        this.f34940c = n10;
    }
}
