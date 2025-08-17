package C;

import C.o0;
import android.view.Surface;

/* renamed from: C.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2964g extends o0.g {

    /* renamed from: a, reason: collision with root package name */
    private final int f3372a;

    /* renamed from: b, reason: collision with root package name */
    private final Surface f3373b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o0.g) {
            o0.g gVar = (o0.g) obj;
            if (this.f3372a == gVar.a() && this.f3373b.equals(gVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // C.o0.g
    public int a() {
        return this.f3372a;
    }

    @Override // C.o0.g
    public Surface b() {
        return this.f3373b;
    }

    public int hashCode() {
        return ((this.f3372a ^ 1000003) * 1000003) ^ this.f3373b.hashCode();
    }

    public String toString() {
        return "Result{resultCode=" + this.f3372a + ", surface=" + this.f3373b + "}";
    }

    C2964g(int i10, Surface surface) {
        this.f3372a = i10;
        if (surface != null) {
            this.f3373b = surface;
            return;
        }
        throw new NullPointerException("Null surface");
    }
}
