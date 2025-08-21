package Sg;

/* loaded from: classes8.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final int f34579a;

    /* renamed from: b, reason: collision with root package name */
    private final int f34580b;

    public final int a() {
        return this.f34580b;
    }

    public final int b() {
        return this.f34579a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f34579a == bVar.f34579a && this.f34580b == bVar.f34580b;
    }

    public final int hashCode() {
        return this.f34579a ^ this.f34580b;
    }

    public final String toString() {
        return this.f34579a + "(" + this.f34580b + ')';
    }

    public b(int i10, int i11) {
        this.f34579a = i10;
        this.f34580b = i11;
    }
}
