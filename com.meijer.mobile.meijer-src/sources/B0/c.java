package B0;

import U0.k;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a&\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"LH1/d;", "", "bounded", "LU0/k;", "size", "", "a", "(LH1/d;ZJ)F", "LH1/h;", "F", "BoundedRippleExtraRadius", "material-ripple_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final float f2154a = H1.h.p(10);

    public static final float a(H1.d dVar, boolean z10, long j10) {
        float fK = U0.f.k(U0.g.a(k.i(j10), k.g(j10))) / 2.0f;
        if (z10) {
            return fK + dVar.I1(f2154a);
        }
        return fK;
    }
}
