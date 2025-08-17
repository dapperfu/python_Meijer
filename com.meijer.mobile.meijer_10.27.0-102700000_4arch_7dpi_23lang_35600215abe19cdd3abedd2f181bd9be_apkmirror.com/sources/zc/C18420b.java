package zc;

/* renamed from: zc.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C18420b extends AbstractC18429k {

    /* renamed from: a, reason: collision with root package name */
    private final long f171767a;

    /* renamed from: b, reason: collision with root package name */
    private final rc.p f171768b;

    /* renamed from: c, reason: collision with root package name */
    private final rc.i f171769c;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC18429k) {
            AbstractC18429k abstractC18429k = (AbstractC18429k) obj;
            if (this.f171767a == abstractC18429k.c() && this.f171768b.equals(abstractC18429k.d()) && this.f171769c.equals(abstractC18429k.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // zc.AbstractC18429k
    public rc.i b() {
        return this.f171769c;
    }

    @Override // zc.AbstractC18429k
    public long c() {
        return this.f171767a;
    }

    @Override // zc.AbstractC18429k
    public rc.p d() {
        return this.f171768b;
    }

    public int hashCode() {
        long j10 = this.f171767a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f171768b.hashCode()) * 1000003) ^ this.f171769c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f171767a + ", transportContext=" + this.f171768b + ", event=" + this.f171769c + "}";
    }

    C18420b(long j10, rc.p pVar, rc.i iVar) {
        this.f171767a = j10;
        if (pVar != null) {
            this.f171768b = pVar;
            if (iVar != null) {
                this.f171769c = iVar;
                return;
            }
            throw new NullPointerException("Null event");
        }
        throw new NullPointerException("Null transportContext");
    }
}
