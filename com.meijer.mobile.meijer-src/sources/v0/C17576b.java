package v0;

import F1.t;
import androidx.compose.foundation.text.O;
import com.google.android.gms.common.api.a;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\u001a2\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a2\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a*\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\nH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\"\u0018\u0010\u0012\u001a\u00020\u0002*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"LH1/b;", "constraints", "", "softWrap", "LF1/t;", "overflow", "", "maxIntrinsicWidth", "a", "(JZIF)J", "", "c", "(JZIF)I", "maxLinesIn", "b", "(ZII)I", "d", "(I)Z", "isEllipsis", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: v0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17576b {
    public static final int b(boolean z10, int i10, int i11) {
        if (z10 || !d(i10)) {
            return RangesKt.f(i11, 1);
        }
        return 1;
    }

    public static final long a(long j10, boolean z10, int i10, float f10) {
        return H1.b.INSTANCE.b(0, c(j10, z10, i10, f10), 0, H1.b.k(j10));
    }

    public static final int c(long j10, boolean z10, int i10, float f10) {
        int iL = ((z10 || d(i10)) && H1.b.h(j10)) ? H1.b.l(j10) : a.e.API_PRIORITY_OTHER;
        return H1.b.n(j10) == iL ? iL : RangesKt.o(O.a(f10), H1.b.n(j10), iL);
    }

    public static final boolean d(int i10) {
        t.Companion companion = t.INSTANCE;
        return t.g(i10, companion.b()) || t.g(i10, companion.d()) || t.g(i10, companion.c());
    }
}
