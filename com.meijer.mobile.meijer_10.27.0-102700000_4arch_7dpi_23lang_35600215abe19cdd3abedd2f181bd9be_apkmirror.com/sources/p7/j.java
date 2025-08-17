package p7;

/* loaded from: classes4.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private Class<?> f155667a;

    /* renamed from: b, reason: collision with root package name */
    private Class<?> f155668b;

    /* renamed from: c, reason: collision with root package name */
    private Class<?> f155669c;

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
        return this.f155667a.equals(jVar.f155667a) && this.f155668b.equals(jVar.f155668b) && l.d(this.f155669c, jVar.f155669c);
    }

    public j(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        a(cls, cls2, cls3);
    }

    public void a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f155667a = cls;
        this.f155668b = cls2;
        this.f155669c = cls3;
    }

    public int hashCode() {
        int iHashCode = ((this.f155667a.hashCode() * 31) + this.f155668b.hashCode()) * 31;
        Class<?> cls = this.f155669c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f155667a + ", second=" + this.f155668b + '}';
    }
}
