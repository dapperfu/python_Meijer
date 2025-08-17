package Be;

/* renamed from: Be.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C2955a<T> extends m<T> {

    /* renamed from: a, reason: collision with root package name */
    static final C2955a<Object> f2183a = new C2955a<>();

    @Override // Be.m
    public boolean c() {
        return false;
    }

    static <T> m<T> f() {
        return f2183a;
    }

    @Override // Be.m
    public T b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // Be.m
    public T e(T t10) {
        return (T) p.r(t10, "use Optional.orNull() instead of Optional.or(null)");
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public String toString() {
        return "Optional.absent()";
    }

    private C2955a() {
    }

    public int hashCode() {
        return 2040732332;
    }
}
