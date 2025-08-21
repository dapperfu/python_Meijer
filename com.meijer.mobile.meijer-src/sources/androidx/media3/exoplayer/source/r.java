package androidx.media3.exoplayer.source;

import U3.r;
import android.os.Handler;
import i3.E1;
import java.io.IOException;

/* loaded from: classes.dex */
public interface r {

    public interface a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f57156a = t.f57167b;

        default a a(r.a aVar) {
            return this;
        }

        default a b(int i10) {
            return this;
        }

        a c(k3.k kVar);

        int[] d();

        r e(a3.v vVar);

        a f(androidx.media3.exoplayer.upstream.b bVar);

        @Deprecated
        default a g(boolean z10) {
            return this;
        }

        default a h(t3.e eVar) {
            return this;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Object f57157a;

        /* renamed from: b, reason: collision with root package name */
        public final int f57158b;

        /* renamed from: c, reason: collision with root package name */
        public final int f57159c;

        /* renamed from: d, reason: collision with root package name */
        public final long f57160d;

        /* renamed from: e, reason: collision with root package name */
        public final int f57161e;

        public b(Object obj) {
            this(obj, -1L);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f57157a.equals(bVar.f57157a) && this.f57158b == bVar.f57158b && this.f57159c == bVar.f57159c && this.f57160d == bVar.f57160d && this.f57161e == bVar.f57161e;
        }

        public b(Object obj, long j10) {
            this(obj, -1, -1, j10, -1);
        }

        public b a(Object obj) {
            return this.f57157a.equals(obj) ? this : new b(obj, this.f57158b, this.f57159c, this.f57160d, this.f57161e);
        }

        public boolean b() {
            return this.f57158b != -1;
        }

        public int hashCode() {
            return ((((((((527 + this.f57157a.hashCode()) * 31) + this.f57158b) * 31) + this.f57159c) * 31) + ((int) this.f57160d)) * 31) + this.f57161e;
        }

        public b(Object obj, long j10, int i10) {
            this(obj, -1, -1, j10, i10);
        }

        public b(Object obj, int i10, int i11, long j10) {
            this(obj, i10, i11, j10, -1);
        }

        private b(Object obj, int i10, int i11, long j10, int i12) {
            this.f57157a = obj;
            this.f57158b = i10;
            this.f57159c = i11;
            this.f57160d = j10;
            this.f57161e = i12;
        }
    }

    public interface c {
        void a(r rVar, a3.F f10);
    }

    void a(Handler handler, s sVar);

    void b(s sVar);

    default void c(a3.v vVar) {
    }

    void d(c cVar, f3.o oVar, E1 e12);

    a3.v e();

    void f(Handler handler, androidx.media3.exoplayer.drm.h hVar);

    void g(androidx.media3.exoplayer.drm.h hVar);

    void h(q qVar);

    void i(c cVar);

    q j(b bVar, t3.b bVar2, long j10);

    void k(c cVar);

    void l(c cVar);

    void m() throws IOException;

    default boolean n() {
        return true;
    }

    default a3.F o() {
        return null;
    }
}
