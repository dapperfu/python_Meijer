package x6;

/* renamed from: x6.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18123s<A, B, C> {

    /* renamed from: a, reason: collision with root package name */
    public final A f170590a;

    /* renamed from: b, reason: collision with root package name */
    public final B f170591b;

    /* renamed from: c, reason: collision with root package name */
    public final C f170592c;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18123s)) {
            return false;
        }
        C18123s c18123s = (C18123s) obj;
        return c18123s.f170590a.equals(this.f170590a) && c18123s.f170591b.equals(this.f170591b) && c18123s.f170592c.equals(this.f170592c);
    }

    public final int hashCode() {
        A a10 = this.f170590a;
        int iHashCode = a10 == null ? 0 : a10.hashCode();
        B b10 = this.f170591b;
        int iHashCode2 = iHashCode ^ (b10 == null ? 0 : b10.hashCode());
        C c10 = this.f170592c;
        return iHashCode2 ^ (c10 != null ? c10.hashCode() : 0);
    }

    public C18123s(A a10, B b10, C c10) {
        this.f170590a = a10;
        this.f170591b = b10;
        this.f170592c = c10;
    }
}
