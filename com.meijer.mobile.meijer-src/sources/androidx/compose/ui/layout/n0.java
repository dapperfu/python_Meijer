package androidx.compose.ui.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001f\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0006\u001a\u00020\u0000*\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0007"}, d2 = {"LU0/k;", "Landroidx/compose/ui/layout/m0;", "scaleFactor", "a", "(JJ)J", "size", "b", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class n0 {
    public static final long a(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) * Float.intBitsToFloat((int) (j11 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) * Float.intBitsToFloat((int) (j11 & 4294967295L));
        return U0.k.d((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
    }

    public static final long b(long j10, long j11) {
        return a(j11, j10);
    }
}
