package Bc;

/* renamed from: Bc.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C2920b extends AbstractC2929k {

    /* renamed from: a, reason: collision with root package name */
    private final long f2681a;

    /* renamed from: b, reason: collision with root package name */
    private final tc.p f2682b;

    /* renamed from: c, reason: collision with root package name */
    private final tc.i f2683c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2929k) {
            AbstractC2929k abstractC2929k = (AbstractC2929k) obj;
            if (this.f2681a == abstractC2929k.c() && this.f2682b.equals(abstractC2929k.d()) && this.f2683c.equals(abstractC2929k.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // Bc.AbstractC2929k
    public tc.i b() {
        return this.f2683c;
    }

    @Override // Bc.AbstractC2929k
    public long c() {
        return this.f2681a;
    }

    @Override // Bc.AbstractC2929k
    public tc.p d() {
        return this.f2682b;
    }

    public int hashCode() {
        long j10 = this.f2681a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f2682b.hashCode()) * 1000003) ^ this.f2683c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f2681a + ", transportContext=" + this.f2682b + ", event=" + this.f2683c + "}";
    }

    C2920b(long j10, tc.p pVar, tc.i iVar) {
        this.f2681a = j10;
        if (pVar != null) {
            this.f2682b = pVar;
            if (iVar != null) {
                this.f2683c = iVar;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }
}
