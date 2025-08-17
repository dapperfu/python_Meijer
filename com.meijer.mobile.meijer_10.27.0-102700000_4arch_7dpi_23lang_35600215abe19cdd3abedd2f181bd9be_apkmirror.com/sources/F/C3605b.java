package F;

/* renamed from: F.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3605b extends Q {

    /* renamed from: a, reason: collision with root package name */
    private final Object f9935a;

    @Override // F.Q
    public Object b() {
        return this.f9935a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Q) {
            return this.f9935a.equals(((Q) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f9935a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Identifier{value=" + this.f9935a + "}";
    }

    C3605b(Object obj) {
        if (obj != null) {
            this.f9935a = obj;
            return;
        }
        throw new NullPointerException("Null value");
    }
}
