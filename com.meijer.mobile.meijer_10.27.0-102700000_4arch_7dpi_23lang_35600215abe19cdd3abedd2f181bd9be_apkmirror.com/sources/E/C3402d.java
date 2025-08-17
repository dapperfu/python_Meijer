package E;

import C.H;
import E.C3423z;

/* renamed from: E.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3402d extends C3423z.a {

    /* renamed from: a, reason: collision with root package name */
    private final O.B<byte[]> f7507a;

    /* renamed from: b, reason: collision with root package name */
    private final H.g f7508b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3423z.a) {
            C3423z.a aVar = (C3423z.a) obj;
            if (this.f7507a.equals(aVar.b()) && this.f7508b.equals(aVar.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // E.C3423z.a
    H.g a() {
        return this.f7508b;
    }

    @Override // E.C3423z.a
    O.B<byte[]> b() {
        return this.f7507a;
    }

    public int hashCode() {
        return ((this.f7507a.hashCode() ^ 1000003) * 1000003) ^ this.f7508b.hashCode();
    }

    public String toString() {
        return "In{packet=" + this.f7507a + ", outputFileOptions=" + this.f7508b + "}";
    }

    C3402d(O.B<byte[]> b10, H.g gVar) {
        if (b10 != null) {
            this.f7507a = b10;
            throw new NullPointerException("Null outputFileOptions");
        }
        throw new NullPointerException("Null packet");
    }
}
