package n6;

/* loaded from: classes4.dex */
public class i<T> {

    /* renamed from: a, reason: collision with root package name */
    T f151054a;

    /* renamed from: b, reason: collision with root package name */
    T f151055b;

    private static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public void b(T t10, T t11) {
        this.f151054a = t10;
        this.f151055b = t11;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof o2.d)) {
            return false;
        }
        o2.d dVar = (o2.d) obj;
        return a(dVar.f153138a, this.f151054a) && a(dVar.f153139b, this.f151055b);
    }

    public int hashCode() {
        T t10 = this.f151054a;
        int iHashCode = t10 == null ? 0 : t10.hashCode();
        T t11 = this.f151055b;
        return iHashCode ^ (t11 != null ? t11.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f151054a + " " + this.f151055b + "}";
    }
}
