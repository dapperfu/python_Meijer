package Be;

/* loaded from: classes6.dex */
final class s<T> extends m<T> {

    /* renamed from: a, reason: collision with root package name */
    private final T f2213a;

    @Override // Be.m
    public boolean c() {
        return true;
    }

    @Override // Be.m
    public T b() {
        return this.f2213a;
    }

    @Override // Be.m
    public T e(T t10) {
        p.r(t10, "use Optional.orNull() instead of Optional.or(null)");
        return this.f2213a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof s) {
            return this.f2213a.equals(((s) obj).f2213a);
        }
        return false;
    }

    public int hashCode() {
        return this.f2213a.hashCode() + 1502476572;
    }

    public String toString() {
        return "Optional.of(" + this.f2213a + ")";
    }

    s(T t10) {
        this.f2213a = t10;
    }
}
