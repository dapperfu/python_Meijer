package J8;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final e f15642a;

    /* renamed from: b, reason: collision with root package name */
    private final e f15643b;

    /* renamed from: c, reason: collision with root package name */
    private final int f15644c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f15644c == aVar.f15644c && this.f15642a.equals(aVar.f15642a) && this.f15643b.equals(aVar.f15643b)) {
                return true;
            }
        }
        return false;
    }

    public e a() {
        return this.f15642a;
    }

    public e b() {
        return this.f15643b;
    }

    public int c() {
        return this.f15644c;
    }

    public int hashCode() {
        return (((this.f15642a.hashCode() * 31) + this.f15643b.hashCode()) * 31) + this.f15644c;
    }

    public String toString() {
        return "RageTap{firstTap=" + this.f15642a + ", lastTap=" + this.f15643b + ", numOfTaps=" + this.f15644c + '}';
    }

    public a(e eVar, e eVar2, int i10) {
        this.f15642a = eVar;
        this.f15643b = eVar2;
        this.f15644c = i10;
    }
}
