package Qg;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final int f30029a;

    /* renamed from: b, reason: collision with root package name */
    private final int f30030b;

    public final int a() {
        return this.f30030b;
    }

    public final int b() {
        return this.f30029a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f30029a == bVar.f30029a && this.f30030b == bVar.f30030b;
    }

    public final int hashCode() {
        return this.f30029a ^ this.f30030b;
    }

    public final String toString() {
        return this.f30029a + "(" + this.f30030b + ')';
    }

    public b(int i10, int i11) {
        this.f30029a = i10;
        this.f30030b = i11;
    }
}
