package x;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;

/* loaded from: classes.dex */
class l extends p {

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        final OutputConfiguration f166619a;

        /* renamed from: b, reason: collision with root package name */
        String f166620b;

        /* renamed from: c, reason: collision with root package name */
        boolean f166621c;

        /* renamed from: d, reason: collision with root package name */
        long f166622d = 1;

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f166619a, aVar.f166619a) && this.f166621c == aVar.f166621c && this.f166622d == aVar.f166622d && Objects.equals(this.f166620b, aVar.f166620b);
        }

        public int hashCode() {
            int iHashCode = this.f166619a.hashCode() ^ 31;
            int i10 = (this.f166621c ? 1 : 0) ^ ((iHashCode << 5) - iHashCode);
            int i11 = (i10 << 5) - i10;
            String str = this.f166620b;
            int iHashCode2 = (str == null ? 0 : str.hashCode()) ^ i11;
            return Long.hashCode(this.f166622d) ^ ((iHashCode2 << 5) - iHashCode2);
        }

        a(OutputConfiguration outputConfiguration) {
            this.f166619a = outputConfiguration;
        }
    }

    l(int i10, Surface surface) {
        this(new a(new OutputConfiguration(i10, surface)));
    }

    l(Object obj) {
        super(obj);
    }

    static l j(OutputConfiguration outputConfiguration) {
        return new l(new a(outputConfiguration));
    }

    @Override // x.p, x.k.a
    public void c(long j10) {
        ((a) this.f166628a).f166622d = j10;
    }

    @Override // x.p, x.k.a
    public void d(String str) {
        ((a) this.f166628a).f166620b = str;
    }

    @Override // x.p, x.k.a
    public String e() {
        return ((a) this.f166628a).f166620b;
    }

    @Override // x.p, x.k.a
    public void f() {
        ((a) this.f166628a).f166621c = true;
    }

    @Override // x.p, x.k.a
    public Object h() {
        o2.i.a(this.f166628a instanceof a);
        return ((a) this.f166628a).f166619a;
    }

    @Override // x.p
    boolean i() {
        return ((a) this.f166628a).f166621c;
    }

    @Override // x.p, x.k.a
    public Surface getSurface() {
        return ((OutputConfiguration) h()).getSurface();
    }
}
