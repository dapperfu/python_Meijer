package androidx.compose.ui.platform;

import android.view.ViewGroup;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import o1.InterfaceC16066a;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0006¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/platform/j0;", "Landroidx/compose/ui/Modifier$c;", "Lo1/a;", "Landroid/view/ViewGroup;", "view", "<init>", "(Landroid/view/ViewGroup;)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "childCoordinates", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Rect;", "boundsProvider", "", "J0", "(Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "o", "Landroid/view/ViewGroup;", "getView", "()Landroid/view/ViewGroup;", "K2", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6005j0 extends Modifier.c implements InterfaceC16066a {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private ViewGroup view;

    public final void K2(ViewGroup viewGroup) {
        this.view = viewGroup;
    }

    public C6005j0(ViewGroup viewGroup) {
        this.view = viewGroup;
    }

    @Override // o1.InterfaceC16066a
    public Object J0(LayoutCoordinates layoutCoordinates, Function0<Rect> function0, Continuation<? super Unit> continuation) {
        Rect rectT;
        long jE = LayoutCoordinatesKt.e(layoutCoordinates);
        Rect rectInvoke = function0.invoke();
        if (rectInvoke != null) {
            rectT = rectInvoke.t(jE);
        } else {
            rectT = null;
        }
        if (rectT != null) {
            this.view.requestRectangleOnScreen(V0.w1.b(rectT), false);
        }
        return Unit.f143329a;
    }
}
