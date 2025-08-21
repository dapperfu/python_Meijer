package o2;

/* loaded from: classes.dex */
public class d<F, S> {

    /* renamed from: a, reason: collision with root package name */
    public final F f153583a;

    /* renamed from: b, reason: collision with root package name */
    public final S f153584b;

    public static <A, B> d<A, B> a(A a10, B b10) {
        return new d<>(a10, b10);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return c.a(dVar.f153583a, this.f153583a) && c.a(dVar.f153584b, this.f153584b);
    }

    public int hashCode() {
        F f10 = this.f153583a;
        int iHashCode = f10 == null ? 0 : f10.hashCode();
        S s10 = this.f153584b;
        return iHashCode ^ (s10 != null ? s10.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f153583a + " " + this.f153584b + "}";
    }

    public d(F f10, S s10) {
        this.f153583a = f10;
        this.f153584b = s10;
    }
}
