package H1;

import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\"\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0004*\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\n"}, d2 = {"LH1/n;", "offset", "LH1/r;", "size", "LH1/p;", "a", "(JJ)LH1/p;", "Landroidx/compose/ui/geometry/Rect;", "b", "(Landroidx/compose/ui/geometry/Rect;)LH1/p;", "ui-unit_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class q {
    public static final p a(long j10, long j11) {
        return new p(n.k(j10), n.l(j10), n.k(j10) + ((int) (j11 >> 32)), n.l(j10) + ((int) (j11 & 4294967295L)));
    }

    public static final p b(Rect rect) {
        return new p(Math.round(rect.getLeft()), Math.round(rect.getTop()), Math.round(rect.l()), Math.round(rect.i()));
    }
}
