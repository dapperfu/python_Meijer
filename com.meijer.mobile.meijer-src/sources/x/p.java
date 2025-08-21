package x;

import android.util.Size;
import android.view.Surface;
import java.util.List;
import java.util.Objects;
import x.k;

/* loaded from: classes.dex */
class p implements k.a {

    /* renamed from: a, reason: collision with root package name */
    final Object f167716a;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        final List<Surface> f167717a;

        /* renamed from: b, reason: collision with root package name */
        final Size f167718b;

        /* renamed from: c, reason: collision with root package name */
        final int f167719c;

        /* renamed from: d, reason: collision with root package name */
        final int f167720d;

        /* renamed from: e, reason: collision with root package name */
        String f167721e;

        /* renamed from: f, reason: collision with root package name */
        boolean f167722f;

        /* renamed from: g, reason: collision with root package name */
        long f167723g;

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f167718b.equals(aVar.f167718b) || this.f167719c != aVar.f167719c || this.f167720d != aVar.f167720d || this.f167722f != aVar.f167722f || this.f167723g != aVar.f167723g || !Objects.equals(this.f167721e, aVar.f167721e)) {
                return false;
            }
            int iMin = Math.min(this.f167717a.size(), aVar.f167717a.size());
            for (int i10 = 0; i10 < iMin; i10++) {
                if (this.f167717a.get(i10) != aVar.f167717a.get(i10)) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int iHashCode = this.f167717a.hashCode() ^ 31;
            int i10 = this.f167720d ^ ((iHashCode << 5) - iHashCode);
            int iHashCode2 = this.f167718b.hashCode() ^ ((i10 << 5) - i10);
            int i11 = this.f167719c ^ ((iHashCode2 << 5) - iHashCode2);
            int i12 = (this.f167722f ? 1 : 0) ^ ((i11 << 5) - i11);
            int i13 = (i12 << 5) - i12;
            String str = this.f167721e;
            int iHashCode3 = (str == null ? 0 : str.hashCode()) ^ i13;
            return Long.hashCode(this.f167723g) ^ ((iHashCode3 << 5) - iHashCode3);
        }
    }

    @Override // x.k.a
    public void a(long j10) {
    }

    @Override // x.k.a
    public void g(int i10) {
    }

    @Override // x.k.a
    public Object h() {
        return null;
    }

    @Override // x.k.a
    public void b(Surface surface) {
        o2.i.h(surface, "Surface must not be null");
        if (getSurface() == surface) {
            throw new IllegalStateException("Surface is already added!");
        }
        if (!i()) {
            throw new IllegalStateException("Cannot have 2 surfaces for a non-sharing configuration");
        }
        throw new IllegalArgumentException("Exceeds maximum number of surfaces");
    }

    @Override // x.k.a
    public void c(long j10) {
        ((a) this.f167716a).f167723g = j10;
    }

    @Override // x.k.a
    public void d(String str) {
        ((a) this.f167716a).f167721e = str;
    }

    @Override // x.k.a
    public String e() {
        return ((a) this.f167716a).f167721e;
    }

    public boolean equals(Object obj) {
        if (obj instanceof p) {
            return Objects.equals(this.f167716a, ((p) obj).f167716a);
        }
        return false;
    }

    @Override // x.k.a
    public void f() {
        ((a) this.f167716a).f167722f = true;
    }

    @Override // x.k.a
    public Surface getSurface() {
        List<Surface> list = ((a) this.f167716a).f167717a;
        if (list.size() == 0) {
            return null;
        }
        return list.get(0);
    }

    public int hashCode() {
        return this.f167716a.hashCode();
    }

    boolean i() {
        return ((a) this.f167716a).f167722f;
    }

    p(Object obj) {
        this.f167716a = obj;
    }
}
