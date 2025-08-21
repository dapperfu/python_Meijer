package E;

import E.N;

/* renamed from: E.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3166f extends N.b {

    /* renamed from: a, reason: collision with root package name */
    private final O f6923a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.camera.core.n f6924b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof N.b) {
            N.b bVar = (N.b) obj;
            if (this.f6923a.equals(bVar.b()) && this.f6924b.equals(bVar.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // E.N.b
    androidx.camera.core.n a() {
        return this.f6924b;
    }

    @Override // E.N.b
    O b() {
        return this.f6923a;
    }

    public int hashCode() {
        return ((this.f6923a.hashCode() ^ 1000003) * 1000003) ^ this.f6924b.hashCode();
    }

    public String toString() {
        return "InputPacket{processingRequest=" + this.f6923a + ", imageProxy=" + this.f6924b + "}";
    }

    C3166f(O o10, androidx.camera.core.n nVar) {
        if (o10 != null) {
            this.f6923a = o10;
            if (nVar != null) {
                this.f6924b = nVar;
                return;
            }
            throw new NullPointerException("Null imageProxy");
        }
        throw new NullPointerException("Null processingRequest");
    }
}
