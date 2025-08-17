package Q;

import G.p;
import O.N;
import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class f {
    public static f h(int i10, int i11, Rect rect, Size size, int i12, boolean z10) {
        return i(i10, i11, rect, size, i12, z10, false);
    }

    public abstract Rect a();

    public abstract int b();

    public abstract int c();

    public abstract Size d();

    public abstract int e();

    abstract UUID f();

    public abstract boolean g();

    public abstract boolean k();

    public static f i(int i10, int i11, Rect rect, Size size, int i12, boolean z10, boolean z11) {
        return new b(UUID.randomUUID(), i10, i11, rect, size, i12, z10, z11);
    }

    public static f j(N n10) {
        return h(n10.t(), n10.p(), n10.n(), p.f(n10.n(), n10.q()), n10.q(), n10.w());
    }
}
