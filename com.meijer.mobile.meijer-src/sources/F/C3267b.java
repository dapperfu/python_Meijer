package F;

/* renamed from: F.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3267b extends Q {

    /* renamed from: a, reason: collision with root package name */
    private final Object f8702a;

    @Override // F.Q
    public Object b() {
        return this.f8702a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Q) {
            return this.f8702a.equals(((Q) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f8702a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Identifier{value=" + this.f8702a + "}";
    }

    C3267b(Object obj) {
        if (obj != null) {
            this.f8702a = obj;
            return;
        }
        throw new NullPointerException("Null value");
    }
}
