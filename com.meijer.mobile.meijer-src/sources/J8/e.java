package J8;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final f f15660a;

    /* renamed from: b, reason: collision with root package name */
    private final f f15661b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f15660a.equals(eVar.f15660a) && this.f15661b.equals(eVar.f15661b)) {
                return true;
            }
        }
        return false;
    }

    public f a() {
        return this.f15660a;
    }

    public f b() {
        return this.f15661b;
    }

    public int hashCode() {
        return (this.f15660a.hashCode() * 31) + this.f15661b.hashCode();
    }

    public String toString() {
        return "TapData{tapDown=" + this.f15660a + ", tapUp=" + this.f15661b + '}';
    }

    public e(f fVar, f fVar2) {
        this.f15660a = fVar;
        this.f15661b = fVar2;
    }
}
