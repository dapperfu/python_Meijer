package C;

import C.d0;

/* renamed from: C.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3021f extends d0.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f3826a;

    /* renamed from: b, reason: collision with root package name */
    private final d0 f3827b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d0.b) {
            d0.b bVar = (d0.b) obj;
            if (this.f3826a == bVar.a() && this.f3827b.equals(bVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // C.d0.b
    public int a() {
        return this.f3826a;
    }

    @Override // C.d0.b
    public d0 b() {
        return this.f3827b;
    }

    public int hashCode() {
        return ((this.f3826a ^ 1000003) * 1000003) ^ this.f3827b.hashCode();
    }

    public String toString() {
        return "Event{eventCode=" + this.f3826a + ", surfaceOutput=" + this.f3827b + "}";
    }

    C3021f(int i10, d0 d0Var) {
        this.f3826a = i10;
        if (d0Var != null) {
            this.f3827b = d0Var;
            return;
        }
        throw new NullPointerException("Null surfaceOutput");
    }
}
