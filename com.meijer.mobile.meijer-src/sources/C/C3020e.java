package C;

import C.d0;
import F.InterfaceC3290z;
import android.graphics.Rect;
import android.util.Size;

/* renamed from: C.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3020e extends d0.a {

    /* renamed from: a, reason: collision with root package name */
    private final Size f3821a;

    /* renamed from: b, reason: collision with root package name */
    private final Rect f3822b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3290z f3823c;

    /* renamed from: d, reason: collision with root package name */
    private final int f3824d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f3825e;

    public boolean equals(Object obj) {
        InterfaceC3290z interfaceC3290z;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d0.a) {
            d0.a aVar = (d0.a) obj;
            if (this.f3821a.equals(aVar.c()) && this.f3822b.equals(aVar.b()) && ((interfaceC3290z = this.f3823c) != null ? interfaceC3290z.equals(aVar.a()) : aVar.a() == null) && this.f3824d == aVar.e() && this.f3825e == aVar.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // C.d0.a
    public InterfaceC3290z a() {
        return this.f3823c;
    }

    @Override // C.d0.a
    public Rect b() {
        return this.f3822b;
    }

    @Override // C.d0.a
    public Size c() {
        return this.f3821a;
    }

    @Override // C.d0.a
    public boolean d() {
        return this.f3825e;
    }

    @Override // C.d0.a
    public int e() {
        return this.f3824d;
    }

    public int hashCode() {
        int iHashCode = (((this.f3821a.hashCode() ^ 1000003) * 1000003) ^ this.f3822b.hashCode()) * 1000003;
        InterfaceC3290z interfaceC3290z = this.f3823c;
        return ((((iHashCode ^ (interfaceC3290z == null ? 0 : interfaceC3290z.hashCode())) * 1000003) ^ this.f3824d) * 1000003) ^ (this.f3825e ? 1231 : 1237);
    }

    public String toString() {
        return "CameraInputInfo{inputSize=" + this.f3821a + ", inputCropRect=" + this.f3822b + ", cameraInternal=" + this.f3823c + ", rotationDegrees=" + this.f3824d + ", mirroring=" + this.f3825e + "}";
    }

    C3020e(Size size, Rect rect, InterfaceC3290z interfaceC3290z, int i10, boolean z10) {
        if (size != null) {
            this.f3821a = size;
            if (rect != null) {
                this.f3822b = rect;
                this.f3823c = interfaceC3290z;
                this.f3824d = i10;
                this.f3825e = z10;
                return;
            }
            throw new NullPointerException("Null inputCropRect");
        }
        throw new NullPointerException("Null inputSize");
    }
}
