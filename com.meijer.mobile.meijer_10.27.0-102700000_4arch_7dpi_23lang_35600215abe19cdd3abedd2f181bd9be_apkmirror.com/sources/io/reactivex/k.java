package io.reactivex;

/* loaded from: classes9.dex */
public final class k<T> {

    /* renamed from: b, reason: collision with root package name */
    static final k<Object> f138236b = new k<>(null);

    /* renamed from: a, reason: collision with root package name */
    final Object f138237a;

    public static <T> k<T> a() {
        return (k<T>) f138236b;
    }

    public static <T> k<T> b(Throwable th2) {
        Ru.b.e(th2, "error is null");
        return new k<>(ev.m.m(th2));
    }

    public static <T> k<T> c(T t10) {
        Ru.b.e(t10, "value is null");
        return new k<>(t10);
    }

    public Throwable d() {
        Object obj = this.f138237a;
        if (ev.m.u(obj)) {
            return ev.m.o(obj);
        }
        return null;
    }

    public T e() {
        Object obj = this.f138237a;
        if (obj == null || ev.m.u(obj)) {
            return null;
        }
        return (T) this.f138237a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof k) {
            return Ru.b.c(this.f138237a, ((k) obj).f138237a);
        }
        return false;
    }

    public boolean f() {
        return this.f138237a == null;
    }

    public boolean g() {
        return ev.m.u(this.f138237a);
    }

    public boolean h() {
        Object obj = this.f138237a;
        return (obj == null || ev.m.u(obj)) ? false : true;
    }

    public int hashCode() {
        Object obj = this.f138237a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public String toString() {
        Object obj = this.f138237a;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (ev.m.u(obj)) {
            return "OnErrorNotification[" + ev.m.o(obj) + "]";
        }
        return "OnNextNotification[" + this.f138237a + "]";
    }

    private k(Object obj) {
        this.f138237a = obj;
    }
}
