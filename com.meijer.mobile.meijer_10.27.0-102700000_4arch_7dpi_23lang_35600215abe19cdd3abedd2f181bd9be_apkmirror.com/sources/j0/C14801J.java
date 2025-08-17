package j0;

import P0.e;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.layout.WithAlignmentLineElement;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.C5775b;
import androidx.compose.ui.layout.C5790q;
import k0.C15086a;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u0004*\u00020\u0004H\u0017¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lj0/J;", "Lj0/I;", "<init>", "()V", "Landroidx/compose/ui/Modifier;", "", "weight", "", "fill", "a", "(Landroidx/compose/ui/Modifier;FZ)Landroidx/compose/ui/Modifier;", "LP0/e$c;", "alignment", "d", "(Landroidx/compose/ui/Modifier;LP0/e$c;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/q;", "alignmentLine", "e", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/q;)Landroidx/compose/ui/Modifier;", "c", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: j0.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14801J implements InterfaceC14800I {

    /* renamed from: a, reason: collision with root package name */
    public static final C14801J f139030a = new C14801J();

    @Override // j0.InterfaceC14800I
    public Modifier a(Modifier modifier, float f10, boolean z10) {
        if (!(((double) f10) > 0.0d)) {
            C15086a.a("invalid weight; must be greater than zero");
        }
        return modifier.then(new LayoutWeightElement(RangesKt.j(f10, Float.MAX_VALUE), z10));
    }

    @Override // j0.InterfaceC14800I
    public Modifier d(Modifier modifier, e.c cVar) {
        return modifier.then(new VerticalAlignElement(cVar));
    }

    public Modifier e(Modifier modifier, C5790q c5790q) {
        return modifier.then(new WithAlignmentLineElement(c5790q));
    }

    private C14801J() {
    }

    @Override // j0.InterfaceC14800I
    public Modifier c(Modifier modifier) {
        return e(modifier, C5775b.a());
    }
}
