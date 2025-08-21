package De;

/* loaded from: classes6.dex */
final class s<T> extends m<T> {

    /* renamed from: a, reason: collision with root package name */
    private final T f6158a;

    @Override // De.m
    public boolean c() {
        return true;
    }

    @Override // De.m
    public T b() {
        return this.f6158a;
    }

    @Override // De.m
    public T e(T t10) {
        p.r(t10, "use Optional.orNull() instead of Optional.or(null)");
        return this.f6158a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof s) {
            return this.f6158a.equals(((s) obj).f6158a);
        }
        return false;
    }

    public int hashCode() {
        return this.f6158a.hashCode() + 1502476572;
    }

    public String toString() {
        return "Optional.of(" + this.f6158a + ")";
    }

    s(T t10) {
        this.f6158a = t10;
    }
}
