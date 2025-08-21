package androidx.compose.ui.node;

import j1.C14920a;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a8\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\b2\b\b\u0002\u0010\u0002\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\b2\b\b\u0002\u0010\u0004\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"", "start", "top", "end", "bottom", "Landroidx/compose/ui/node/y0;", "b", "(IIII)J", "LH1/h;", "Landroidx/compose/ui/node/s;", "a", "(FFFF)Landroidx/compose/ui/node/s;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class z0 {
    public static final long b(int i10, int i11, int i12, int i13) {
        if (!(i10 >= 0 && i10 < 32768)) {
            C14920a.a("Start must be in the range of 0 .. 32767");
        }
        if (!(i11 >= 0 && i11 < 32768)) {
            C14920a.a("Top must be in the range of 0 .. 32767");
        }
        if (!(i12 >= 0 && i12 < 32768)) {
            C14920a.a("End must be in the range of 0 .. 32767");
        }
        if (!(i13 >= 0 && i13 < 32768)) {
            C14920a.a("Bottom must be in the range of 0 .. 32767");
        }
        return y0.d(y0.INSTANCE.c(i10, i11, i12, i13, true));
    }

    public static final DpTouchBoundsExpansion a(float f10, float f11, float f12, float f13) {
        return new DpTouchBoundsExpansion(f10, f11, f12, f13, true, null);
    }

    public static /* synthetic */ long c(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = 0;
        }
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = 0;
        }
        return b(i10, i11, i12, i13);
    }
}
