package H8;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final e f12332a;

    /* renamed from: b, reason: collision with root package name */
    private final e f12333b;

    /* renamed from: c, reason: collision with root package name */
    private final int f12334c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f12334c == aVar.f12334c && this.f12332a.equals(aVar.f12332a) && this.f12333b.equals(aVar.f12333b)) {
                return true;
            }
        }
        return false;
    }

    public e a() {
        return this.f12332a;
    }

    public e b() {
        return this.f12333b;
    }

    public int c() {
        return this.f12334c;
    }

    public int hashCode() {
        return (((this.f12332a.hashCode() * 31) + this.f12333b.hashCode()) * 31) + this.f12334c;
    }

    public String toString() {
        return "RageTap{firstTap=" + this.f12332a + ", lastTap=" + this.f12333b + ", numOfTaps=" + this.f12334c + '}';
    }

    public a(e eVar, e eVar2, int i10) {
        this.f12332a = eVar;
        this.f12333b = eVar2;
        this.f12334c = i10;
    }
}
