package C;

import C.AbstractC2973p;

/* renamed from: C.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2960c extends AbstractC2973p.a {

    /* renamed from: a, reason: collision with root package name */
    private final int f3356a;

    /* renamed from: b, reason: collision with root package name */
    private final Throwable f3357b;

    public boolean equals(Object obj) {
        Throwable th2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2973p.a) {
            AbstractC2973p.a aVar = (AbstractC2973p.a) obj;
            if (this.f3356a == aVar.d() && ((th2 = this.f3357b) != null ? th2.equals(aVar.c()) : aVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // C.AbstractC2973p.a
    public Throwable c() {
        return this.f3357b;
    }

    @Override // C.AbstractC2973p.a
    public int d() {
        return this.f3356a;
    }

    public int hashCode() {
        int i10 = (this.f3356a ^ 1000003) * 1000003;
        Throwable th2 = this.f3357b;
        return i10 ^ (th2 == null ? 0 : th2.hashCode());
    }

    public String toString() {
        return "StateError{code=" + this.f3356a + ", cause=" + this.f3357b + "}";
    }

    C2960c(int i10, Throwable th2) {
        this.f3356a = i10;
        this.f3357b = th2;
    }
}
