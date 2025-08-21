package x;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import java.util.Objects;

/* loaded from: classes.dex */
class l extends p {

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        final OutputConfiguration f167707a;

        /* renamed from: b, reason: collision with root package name */
        String f167708b;

        /* renamed from: c, reason: collision with root package name */
        boolean f167709c;

        /* renamed from: d, reason: collision with root package name */
        long f167710d = 1;

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Objects.equals(this.f167707a, aVar.f167707a) && this.f167709c == aVar.f167709c && this.f167710d == aVar.f167710d && Objects.equals(this.f167708b, aVar.f167708b);
        }

        public int hashCode() {
            int iHashCode = this.f167707a.hashCode() ^ 31;
            int i10 = (this.f167709c ? 1 : 0) ^ ((iHashCode << 5) - iHashCode);
            int i11 = (i10 << 5) - i10;
            String str = this.f167708b;
            int iHashCode2 = (str == null ? 0 : str.hashCode()) ^ i11;
            return Long.hashCode(this.f167710d) ^ ((iHashCode2 << 5) - iHashCode2);
        }

        a(OutputConfiguration outputConfiguration) {
            this.f167707a = outputConfiguration;
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
        ((a) this.f167716a).f167710d = j10;
    }

    @Override // x.p, x.k.a
    public void d(String str) {
        ((a) this.f167716a).f167708b = str;
    }

    @Override // x.p, x.k.a
    public String e() {
        return ((a) this.f167716a).f167708b;
    }

    @Override // x.p, x.k.a
    public void f() {
        ((a) this.f167716a).f167709c = true;
    }

    @Override // x.p, x.k.a
    public Object h() {
        o2.i.a(this.f167716a instanceof a);
        return ((a) this.f167716a).f167707a;
    }

    @Override // x.p
    boolean i() {
        return ((a) this.f167716a).f167709c;
    }

    @Override // x.p, x.k.a
    public Surface getSurface() {
        return ((OutputConfiguration) h()).getSurface();
    }
}
