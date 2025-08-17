package j0;

import P0.e;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u0002*\u00020\u0002H'¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lj0/I;", "", "Landroidx/compose/ui/Modifier;", "", "weight", "", "fill", "a", "(Landroidx/compose/ui/Modifier;FZ)Landroidx/compose/ui/Modifier;", "LP0/e$c;", "alignment", "d", "(Landroidx/compose/ui/Modifier;LP0/e$c;)Landroidx/compose/ui/Modifier;", "c", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: j0.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC14800I {
    Modifier a(Modifier modifier, float f10, boolean z10);

    Modifier c(Modifier modifier);

    Modifier d(Modifier modifier, e.c cVar);

    static /* synthetic */ Modifier b(InterfaceC14800I interfaceC14800I, Modifier modifier, float f10, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: weight");
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return interfaceC14800I.a(modifier, f10, z10);
    }
}
