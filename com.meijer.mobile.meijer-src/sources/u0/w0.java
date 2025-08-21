package u0;

import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001e\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0005"}, d2 = {"LU0/f;", "Landroidx/compose/ui/geometry/Rect;", "rect", "a", "(JLandroidx/compose/ui/geometry/Rect;)J", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class w0 {
    public static final long a(long j10, Rect rect) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        return U0.f.e((Float.floatToRawIntBits(Float.intBitsToFloat(i10) < rect.getLeft() ? rect.getLeft() : Float.intBitsToFloat(i10) > rect.l() ? rect.l() : Float.intBitsToFloat(i10)) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat(i11) < rect.getTop() ? rect.getTop() : Float.intBitsToFloat(i11) > rect.i() ? rect.i() : Float.intBitsToFloat(i11)) & 4294967295L));
    }
}
