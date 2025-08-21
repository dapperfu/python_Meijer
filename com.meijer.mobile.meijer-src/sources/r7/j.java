package r7;

/* loaded from: classes4.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private Class<?> f159424a;

    /* renamed from: b, reason: collision with root package name */
    private Class<?> f159425b;

    /* renamed from: c, reason: collision with root package name */
    private Class<?> f159426c;

    public j() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f159424a.equals(jVar.f159424a) && this.f159425b.equals(jVar.f159425b) && l.d(this.f159426c, jVar.f159426c);
    }

    public j(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        a(cls, cls2, cls3);
    }

    public void a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f159424a = cls;
        this.f159425b = cls2;
        this.f159426c = cls3;
    }

    public int hashCode() {
        int iHashCode = ((this.f159424a.hashCode() * 31) + this.f159425b.hashCode()) * 31;
        Class<?> cls = this.f159426c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f159424a + ", second=" + this.f159425b + '}';
    }
}
