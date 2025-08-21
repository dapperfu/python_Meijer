package io.reactivex;

/* loaded from: classes10.dex */
public final class k<T> {

    /* renamed from: b, reason: collision with root package name */
    static final k<Object> f138878b = new k<>(null);

    /* renamed from: a, reason: collision with root package name */
    final Object f138879a;

    public static <T> k<T> a() {
        return (k<T>) f138878b;
    }

    public static <T> k<T> b(Throwable th2) {
        Nu.b.e(th2, "error is null");
        return new k<>(av.m.m(th2));
    }

    public static <T> k<T> c(T t10) {
        Nu.b.e(t10, "value is null");
        return new k<>(t10);
    }

    public Throwable d() {
        Object obj = this.f138879a;
        if (av.m.u(obj)) {
            return av.m.o(obj);
        }
        return null;
    }

    public T e() {
        Object obj = this.f138879a;
        if (obj == null || av.m.u(obj)) {
            return null;
        }
        return (T) this.f138879a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof k) {
            return Nu.b.c(this.f138879a, ((k) obj).f138879a);
        }
        return false;
    }

    public boolean f() {
        return this.f138879a == null;
    }

    public boolean g() {
        return av.m.u(this.f138879a);
    }

    public boolean h() {
        Object obj = this.f138879a;
        return (obj == null || av.m.u(obj)) ? false : true;
    }

    public int hashCode() {
        Object obj = this.f138879a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public String toString() {
        Object obj = this.f138879a;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (av.m.u(obj)) {
            return "OnErrorNotification[" + av.m.o(obj) + "]";
        }
        return "OnNextNotification[" + this.f138879a + "]";
    }

    private k(Object obj) {
        this.f138879a = obj;
    }
}
