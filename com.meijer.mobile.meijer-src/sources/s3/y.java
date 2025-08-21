package s3;

import a3.F;
import a3.G;
import androidx.media3.exoplayer.source.r;

/* loaded from: classes.dex */
public interface y extends InterfaceC16996B {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final G f159934a;

        /* renamed from: b, reason: collision with root package name */
        public final int[] f159935b;

        /* renamed from: c, reason: collision with root package name */
        public final int f159936c;

        public a(G g10, int... iArr) {
            this(g10, iArr, 0);
        }

        public a(G g10, int[] iArr, int i10) {
            if (iArr.length == 0) {
                d3.r.e("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f159934a = g10;
            this.f159935b = iArr;
            this.f159936c = i10;
        }
    }

    public interface b {
        y[] a(a[] aVarArr, t3.d dVar, r.b bVar, F f10);
    }

    int b();

    void d(float f10);

    void disable();

    default void e() {
    }

    void enable();

    default void h(boolean z10) {
    }

    int i();

    a3.t j();

    default void k() {
    }
}
