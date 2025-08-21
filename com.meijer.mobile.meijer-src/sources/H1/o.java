package H1;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\n\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\t\u001a\u0016\u0010\u000b\u001a\u00020\u0003*\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"", "x", "y", "LH1/n;", "a", "(II)J", "LU0/f;", "offset", "c", "(JJ)J", "b", "d", "(J)J", "ui-unit_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class o {
    public static final long a(int i10, int i11) {
        return n.f((i11 & 4294967295L) | (i10 << 32));
    }

    public static final long b(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) - n.k(j11);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) - n.l(j11);
        return U0.f.e((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
    }

    public static final long c(long j10, long j11) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32)) + n.k(j11);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L)) + n.l(j11);
        return U0.f.e((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
    }

    public static final long d(long j10) {
        return n.f((Math.round(Float.intBitsToFloat((int) (j10 & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j10 >> 32))) << 32));
    }
}
