package w6;

/* renamed from: w6.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17796s<A, B, C> {

    /* renamed from: a, reason: collision with root package name */
    public final A f165945a;

    /* renamed from: b, reason: collision with root package name */
    public final B f165946b;

    /* renamed from: c, reason: collision with root package name */
    public final C f165947c;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17796s)) {
            return false;
        }
        C17796s c17796s = (C17796s) obj;
        return c17796s.f165945a.equals(this.f165945a) && c17796s.f165946b.equals(this.f165946b) && c17796s.f165947c.equals(this.f165947c);
    }

    public final int hashCode() {
        A a10 = this.f165945a;
        int iHashCode = a10 == null ? 0 : a10.hashCode();
        B b10 = this.f165946b;
        int iHashCode2 = iHashCode ^ (b10 == null ? 0 : b10.hashCode());
        C c10 = this.f165947c;
        return iHashCode2 ^ (c10 != null ? c10.hashCode() : 0);
    }

    public C17796s(A a10, B b10, C c10) {
        this.f165945a = a10;
        this.f165946b = b10;
        this.f165947c = c10;
    }
}
