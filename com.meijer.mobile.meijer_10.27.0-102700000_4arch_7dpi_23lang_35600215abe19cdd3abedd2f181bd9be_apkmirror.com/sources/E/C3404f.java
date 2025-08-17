package E;

import E.N;

/* renamed from: E.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3404f extends N.b {

    /* renamed from: a, reason: collision with root package name */
    private final O f7516a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.camera.core.n f7517b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof N.b) {
            N.b bVar = (N.b) obj;
            if (this.f7516a.equals(bVar.b()) && this.f7517b.equals(bVar.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // E.N.b
    androidx.camera.core.n a() {
        return this.f7517b;
    }

    @Override // E.N.b
    O b() {
        return this.f7516a;
    }

    public int hashCode() {
        return ((this.f7516a.hashCode() ^ 1000003) * 1000003) ^ this.f7517b.hashCode();
    }

    public String toString() {
        return "InputPacket{processingRequest=" + this.f7516a + ", imageProxy=" + this.f7517b + "}";
    }

    C3404f(O o10, androidx.camera.core.n nVar) {
        if (o10 != null) {
            this.f7516a = o10;
            if (nVar != null) {
                this.f7517b = nVar;
                return;
            }
            throw new NullPointerException("Null imageProxy");
        }
        throw new NullPointerException("Null processingRequest");
    }
}
