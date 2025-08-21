package Vd;

import java.util.concurrent.ExecutionException;

/* loaded from: classes6.dex */
final class s<T> implements r<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Object f39871a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final int f39872b;

    /* renamed from: c, reason: collision with root package name */
    private final N f39873c;

    /* renamed from: d, reason: collision with root package name */
    private int f39874d;

    /* renamed from: e, reason: collision with root package name */
    private int f39875e;

    /* renamed from: f, reason: collision with root package name */
    private int f39876f;

    /* renamed from: g, reason: collision with root package name */
    private Exception f39877g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f39878h;

    private final void a() {
        if (this.f39874d + this.f39875e + this.f39876f == this.f39872b) {
            if (this.f39877g == null) {
                if (this.f39878h) {
                    this.f39873c.w();
                    return;
                } else {
                    this.f39873c.v(null);
                    return;
                }
            }
            this.f39873c.u(new ExecutionException(this.f39875e + " out of " + this.f39872b + " underlying tasks failed", this.f39877g));
        }
    }

    @Override // Vd.InterfaceC5510d
    public final void onCanceled() {
        synchronized (this.f39871a) {
            this.f39876f++;
            this.f39878h = true;
            a();
        }
    }

    @Override // Vd.InterfaceC5512f
    public final void onFailure(Exception exc) {
        synchronized (this.f39871a) {
            this.f39875e++;
            this.f39877g = exc;
            a();
        }
    }

    @Override // Vd.InterfaceC5513g
    public final void onSuccess(T t10) {
        synchronized (this.f39871a) {
            this.f39874d++;
            a();
        }
    }

    public s(int i10, N n10) {
        this.f39872b = i10;
        this.f39873c = n10;
    }
}
