package x;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;

/* loaded from: classes.dex */
class n extends m {

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        final OutputConfiguration f166626a;

        /* renamed from: b, reason: collision with root package name */
        long f166627b = 1;

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f166626a, aVar.f166626a) && this.f166627b == aVar.f166627b;
        }

        public int hashCode() {
            int iHashCode = this.f166626a.hashCode() ^ 31;
            return Long.hashCode(this.f166627b) ^ ((iHashCode << 5) - iHashCode);
        }

        a(OutputConfiguration outputConfiguration) {
            this.f166626a = outputConfiguration;
        }
    }

    n(int i10, Surface surface) {
        this(new a(new OutputConfiguration(i10, surface)));
    }

    @Override // x.m, x.l, x.p, x.k.a
    public String e() {
        return null;
    }

    n(Object obj) {
        super(obj);
    }

    static n l(OutputConfiguration outputConfiguration) {
        return new n(new a(outputConfiguration));
    }

    @Override // x.m, x.l, x.p, x.k.a
    public void c(long j10) {
        ((a) this.f166628a).f166627b = j10;
    }

    @Override // x.m, x.l, x.p, x.k.a
    public Object h() {
        o2.i.a(this.f166628a instanceof a);
        return ((a) this.f166628a).f166626a;
    }

    @Override // x.m, x.l, x.p, x.k.a
    public void d(String str) {
        ((OutputConfiguration) h()).setPhysicalCameraId(str);
    }
}
