package C;

import C.AbstractC3031p;

/* renamed from: C.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3018c extends AbstractC3031p.a {

    /* renamed from: a, reason: collision with root package name */
    private final int f3814a;

    /* renamed from: b, reason: collision with root package name */
    private final Throwable f3815b;

    public boolean equals(Object obj) {
        Throwable th2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3031p.a) {
            AbstractC3031p.a aVar = (AbstractC3031p.a) obj;
            if (this.f3814a == aVar.d() && ((th2 = this.f3815b) != null ? th2.equals(aVar.c()) : aVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // C.AbstractC3031p.a
    public Throwable c() {
        return this.f3815b;
    }

    @Override // C.AbstractC3031p.a
    public int d() {
        return this.f3814a;
    }

    public int hashCode() {
        int i10 = (this.f3814a ^ 1000003) * 1000003;
        Throwable th2 = this.f3815b;
        return i10 ^ (th2 == null ? 0 : th2.hashCode());
    }

    public String toString() {
        return "StateError{code=" + this.f3814a + ", cause=" + this.f3815b + "}";
    }

    C3018c(int i10, Throwable th2) {
        this.f3814a = i10;
        this.f3815b = th2;
    }
}
