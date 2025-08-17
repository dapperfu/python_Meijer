package kotlin;

import B0.RippleAlpha;
import V0.C5346q0;
import V0.C5349s0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Lx0/X0;", "", "<init>", "()V", "LV0/q0;", "contentColor", "", "lightTheme", "b", "(JZ)J", "LB0/b;", "a", "(JZ)LB0/b;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x0.X0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17914X0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C17914X0 f167532a = new C17914X0();

    public final RippleAlpha a(long contentColor, boolean lightTheme) {
        return lightTheme ? ((double) C5349s0.i(contentColor)) > 0.5d ? C17916Y0.f167544d : C17916Y0.f167545e : C17916Y0.f167546f;
    }

    private C17914X0() {
    }

    public final long b(long contentColor, boolean lightTheme) {
        float fI = C5349s0.i(contentColor);
        if (!lightTheme && fI < 0.5d) {
            return C5346q0.INSTANCE.k();
        }
        return contentColor;
    }
}
