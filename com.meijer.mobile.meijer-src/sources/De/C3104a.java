package De;

/* renamed from: De.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3104a<T> extends m<T> {

    /* renamed from: a, reason: collision with root package name */
    static final C3104a<Object> f6128a = new C3104a<>();

    @Override // De.m
    public boolean c() {
        return false;
    }

    static <T> m<T> f() {
        return f6128a;
    }

    @Override // De.m
    public T b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // De.m
    public T e(T t10) {
        return (T) p.r(t10, "use Optional.orNull() instead of Optional.or(null)");
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public String toString() {
        return "Optional.absent()";
    }

    private C3104a() {
    }

    public int hashCode() {
        return 2040732332;
    }
}
