package E;

import C.H;
import E.C3185z;

/* renamed from: E.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3164d extends C3185z.a {

    /* renamed from: a, reason: collision with root package name */
    private final O.B<byte[]> f6914a;

    /* renamed from: b, reason: collision with root package name */
    private final H.g f6915b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3185z.a) {
            C3185z.a aVar = (C3185z.a) obj;
            if (this.f6914a.equals(aVar.b()) && this.f6915b.equals(aVar.a())) {
                return true;
            }
        }
        return false;
    }

    @Override // E.C3185z.a
    H.g a() {
        return this.f6915b;
    }

    @Override // E.C3185z.a
    O.B<byte[]> b() {
        return this.f6914a;
    }

    public int hashCode() {
        return ((this.f6914a.hashCode() ^ 1000003) * 1000003) ^ this.f6915b.hashCode();
    }

    public String toString() {
        return "In{packet=" + this.f6914a + ", outputFileOptions=" + this.f6915b + "}";
    }

    C3164d(O.B<byte[]> b10, H.g gVar) {
        if (b10 != null) {
            this.f6914a = b10;
            throw new NullPointerException("Null outputFileOptions");
        }
        throw new NullPointerException("Null packet");
    }
}
