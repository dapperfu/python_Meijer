package kotlin;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import u1.TextLayoutResult;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lu1/v;", "textLayoutResult", "", "offset", "", "isStart", "areHandlesCrossed", "LU0/f;", "b", "(Lu1/v;IZZ)J", "", "a", "(Lu1/v;IZZ)F", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: w0.X, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17714X {
    public static final float a(TextLayoutResult textLayoutResult, int i10, boolean z10, boolean z11) {
        return textLayoutResult.j(i10, textLayoutResult.c(((!z10 || z11) && (z10 || !z11)) ? Math.max(i10 + (-1), 0) : i10) == textLayoutResult.y(i10));
    }

    public static final long b(TextLayoutResult textLayoutResult, int i10, boolean z10, boolean z11) {
        int iQ = textLayoutResult.q(i10);
        if (iQ >= textLayoutResult.n()) {
            return U0.f.INSTANCE.b();
        }
        float fN = RangesKt.n(a(textLayoutResult, i10, z10, z11), 0.0f, (int) (textLayoutResult.getSize() >> 32));
        float fN2 = RangesKt.n(textLayoutResult.m(iQ), 0.0f, (int) (textLayoutResult.getSize() & 4294967295L));
        return U0.f.e((Float.floatToRawIntBits(fN) << 32) | (Float.floatToRawIntBits(fN2) & 4294967295L));
    }
}
