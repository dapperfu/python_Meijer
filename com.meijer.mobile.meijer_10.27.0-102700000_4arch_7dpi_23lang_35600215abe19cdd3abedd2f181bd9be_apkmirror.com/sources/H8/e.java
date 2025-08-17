package H8;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final f f12350a;

    /* renamed from: b, reason: collision with root package name */
    private final f f12351b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f12350a.equals(eVar.f12350a) && this.f12351b.equals(eVar.f12351b)) {
                return true;
            }
        }
        return false;
    }

    public f a() {
        return this.f12350a;
    }

    public f b() {
        return this.f12351b;
    }

    public int hashCode() {
        return (this.f12350a.hashCode() * 31) + this.f12351b.hashCode();
    }

    public String toString() {
        return "TapData{tapDown=" + this.f12350a + ", tapUp=" + this.f12351b + '}';
    }

    public e(f fVar, f fVar2) {
        this.f12350a = fVar;
        this.f12351b = fVar2;
    }
}
