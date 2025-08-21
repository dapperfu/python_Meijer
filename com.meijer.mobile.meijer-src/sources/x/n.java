package x;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;

/* loaded from: classes.dex */
class n extends m {

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        final OutputConfiguration f167714a;

        /* renamed from: b, reason: collision with root package name */
        long f167715b = 1;

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f167714a, aVar.f167714a) && this.f167715b == aVar.f167715b;
        }

        public int hashCode() {
            int iHashCode = this.f167714a.hashCode() ^ 31;
            return Long.hashCode(this.f167715b) ^ ((iHashCode << 5) - iHashCode);
        }

        a(OutputConfiguration outputConfiguration) {
            this.f167714a = outputConfiguration;
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
        ((a) this.f167716a).f167715b = j10;
    }

    @Override // x.m, x.l, x.p, x.k.a
    public Object h() {
        o2.i.a(this.f167716a instanceof a);
        return ((a) this.f167716a).f167714a;
    }

    @Override // x.m, x.l, x.p, x.k.a
    public void d(String str) {
        ((OutputConfiguration) h()).setPhysicalCameraId(str);
    }
}
