package androidx.compose.ui.focus;

import androidx.compose.ui.node.InterfaceC5814j;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0001\u000bø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/focus/G;", "Landroidx/compose/ui/node/j;", "Landroidx/compose/ui/focus/f;", "focusDirection", "", "W", "(I)Z", "Landroidx/compose/ui/focus/E;", "d0", "()Landroidx/compose/ui/focus/E;", "focusState", "Landroidx/compose/ui/focus/FocusTargetNode;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface G extends InterfaceC5814j {
    boolean W(int focusDirection);

    E d0();

    static /* synthetic */ boolean u0(G g10, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestFocus-3ESFkO8");
        }
        if ((i11 & 1) != 0) {
            i10 = C5763f.INSTANCE.b();
        }
        return g10.W(i10);
    }
}
