package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\r\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/node/r;", "", "", "packedValue", "b", "(J)J", "other", "", "a", "(JJ)I", "", "c", "(J)F", "distance", "", "e", "(J)Z", "isInLayer", "d", "isInExpandedBounds", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
@SourceDebugExtension
/* loaded from: classes.dex */
public final class r {
    public static long b(long j10) {
        return j10;
    }

    public static final boolean d(long j10) {
        return (j10 & 2) != 0;
    }

    public static final boolean e(long j10) {
        return (j10 & 1) != 0;
    }

    public static final float c(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final int a(long j10, long j11) {
        boolean zE = e(j10);
        if (zE != e(j11)) {
            if (!zE) {
                return 1;
            }
            return -1;
        }
        int iSignum = (int) Math.signum(c(j10) - c(j11));
        if (Math.min(c(j10), c(j11)) >= 0.0f && d(j10) != d(j11)) {
            if (!d(j10)) {
                return 1;
            }
            return -1;
        }
        return iSignum;
    }
}
