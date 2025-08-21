package p0;

import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0001\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lp0/a;", "", "Landroidx/compose/ui/geometry/Rect;", "rect", "", "b", "(Landroidx/compose/ui/geometry/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/foundation/relocation/a;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: p0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC16328a {
    Object b(Rect rect, Continuation<? super Unit> continuation);

    static /* synthetic */ Object a(InterfaceC16328a interfaceC16328a, Rect rect, Continuation continuation, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bringIntoView");
        }
        if ((i10 & 1) != 0) {
            rect = null;
        }
        return interfaceC16328a.b(rect, continuation);
    }
}
