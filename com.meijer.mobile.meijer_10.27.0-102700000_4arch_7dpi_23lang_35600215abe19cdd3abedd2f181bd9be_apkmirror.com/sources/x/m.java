package x;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;

/* loaded from: classes.dex */
class m extends l {

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        final OutputConfiguration f166623a;

        /* renamed from: b, reason: collision with root package name */
        String f166624b;

        /* renamed from: c, reason: collision with root package name */
        long f166625c = 1;

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f166623a, aVar.f166623a) && this.f166625c == aVar.f166625c && Objects.equals(this.f166624b, aVar.f166624b);
        }

        public int hashCode() {
            int iHashCode = this.f166623a.hashCode() ^ 31;
            int i10 = (iHashCode << 5) - iHashCode;
            String str = this.f166624b;
            int iHashCode2 = (str == null ? 0 : str.hashCode()) ^ i10;
            return Long.hashCode(this.f166625c) ^ ((iHashCode2 << 5) - iHashCode2);
        }

        a(OutputConfiguration outputConfiguration) {
            this.f166623a = outputConfiguration;
        }
    }

    m(int i10, Surface surface) {
        this(new a(new OutputConfiguration(i10, surface)));
    }

    m(Object obj) {
        super(obj);
    }

    static m k(OutputConfiguration outputConfiguration) {
        return new m(new a(outputConfiguration));
    }

    @Override // x.l, x.p, x.k.a
    public void c(long j10) {
        ((a) this.f166628a).f166625c = j10;
    }

    @Override // x.l, x.p, x.k.a
    public void d(String str) {
        ((a) this.f166628a).f166624b = str;
    }

    @Override // x.l, x.p, x.k.a
    public String e() {
        return ((a) this.f166628a).f166624b;
    }

    @Override // x.l, x.p, x.k.a
    public Object h() {
        o2.i.a(this.f166628a instanceof a);
        return ((a) this.f166628a).f166623a;
    }

    @Override // x.l, x.p
    final boolean i() {
        throw new AssertionError("isSurfaceSharingEnabled() should not be called on API >= 26");
    }

    @Override // x.p, x.k.a
    public void b(Surface surface) {
        ((OutputConfiguration) h()).addSurface(surface);
    }

    @Override // x.l, x.p, x.k.a
    public void f() {
        ((OutputConfiguration) h()).enableSurfaceSharing();
    }
}
