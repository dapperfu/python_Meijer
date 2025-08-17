package x;

import android.util.Size;
import android.view.Surface;
import java.util.List;
import java.util.Objects;
import x.k;

/* loaded from: classes.dex */
class p implements k.a {

    /* renamed from: a, reason: collision with root package name */
    final Object f166628a;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        final List<Surface> f166629a;

        /* renamed from: b, reason: collision with root package name */
        final Size f166630b;

        /* renamed from: c, reason: collision with root package name */
        final int f166631c;

        /* renamed from: d, reason: collision with root package name */
        final int f166632d;

        /* renamed from: e, reason: collision with root package name */
        String f166633e;

        /* renamed from: f, reason: collision with root package name */
        boolean f166634f;

        /* renamed from: g, reason: collision with root package name */
        long f166635g;

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f166630b.equals(aVar.f166630b) || this.f166631c != aVar.f166631c || this.f166632d != aVar.f166632d || this.f166634f != aVar.f166634f || this.f166635g != aVar.f166635g || !Objects.equals(this.f166633e, aVar.f166633e)) {
                return false;
            }
            int iMin = Math.min(this.f166629a.size(), aVar.f166629a.size());
            for (int i10 = 0; i10 < iMin; i10++) {
                if (this.f166629a.get(i10) != aVar.f166629a.get(i10)) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int iHashCode = this.f166629a.hashCode() ^ 31;
            int i10 = this.f166632d ^ ((iHashCode << 5) - iHashCode);
            int iHashCode2 = this.f166630b.hashCode() ^ ((i10 << 5) - i10);
            int i11 = this.f166631c ^ ((iHashCode2 << 5) - iHashCode2);
            int i12 = (this.f166634f ? 1 : 0) ^ ((i11 << 5) - i11);
            int i13 = (i12 << 5) - i12;
            String str = this.f166633e;
            int iHashCode3 = (str == null ? 0 : str.hashCode()) ^ i13;
            return Long.hashCode(this.f166635g) ^ ((iHashCode3 << 5) - iHashCode3);
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
        ((a) this.f166628a).f166635g = j10;
    }

    @Override // x.k.a
    public void d(String str) {
        ((a) this.f166628a).f166633e = str;
    }

    @Override // x.k.a
    public String e() {
        return ((a) this.f166628a).f166633e;
    }

    public boolean equals(Object obj) {
        if (obj instanceof p) {
            return Objects.equals(this.f166628a, ((p) obj).f166628a);
        }
        return false;
    }

    @Override // x.k.a
    public void f() {
        ((a) this.f166628a).f166634f = true;
    }

    @Override // x.k.a
    public Surface getSurface() {
        List<Surface> list = ((a) this.f166628a).f166629a;
        if (list.size() == 0) {
            return null;
        }
        return list.get(0);
    }

    public int hashCode() {
        return this.f166628a.hashCode();
    }

    boolean i() {
        return ((a) this.f166628a).f166634f;
    }

    p(Object obj) {
        this.f166628a = obj;
    }
}
