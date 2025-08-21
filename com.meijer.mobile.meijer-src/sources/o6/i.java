package o6;

/* loaded from: classes4.dex */
public class i<T> {

    /* renamed from: a, reason: collision with root package name */
    T f153656a;

    /* renamed from: b, reason: collision with root package name */
    T f153657b;

    private static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public void b(T t10, T t11) {
        this.f153656a = t10;
        this.f153657b = t11;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof o2.d)) {
            return false;
        }
        o2.d dVar = (o2.d) obj;
        return a(dVar.f153583a, this.f153656a) && a(dVar.f153584b, this.f153657b);
    }

    public int hashCode() {
        T t10 = this.f153656a;
        int iHashCode = t10 == null ? 0 : t10.hashCode();
        T t11 = this.f153657b;
        return iHashCode ^ (t11 != null ? t11.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f153656a + " " + this.f153657b + "}";
    }
}
