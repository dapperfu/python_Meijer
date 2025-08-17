package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.InterfaceC5825v;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bR.\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\b¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/layout/U;", "Landroidx/compose/ui/Modifier$c;", "Landroidx/compose/ui/node/v;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "", "callback", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "coordinates", "O", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "o", "Lkotlin/jvm/functions/Function1;", "getCallback", "()Lkotlin/jvm/functions/Function1;", "K2", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class U extends Modifier.c implements InterfaceC5825v {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private Function1<? super LayoutCoordinates, Unit> callback;

    public final void K2(Function1<? super LayoutCoordinates, Unit> function1) {
        this.callback = function1;
    }

    @Override // androidx.compose.ui.node.InterfaceC5825v
    public void O(LayoutCoordinates coordinates) {
        this.callback.invoke(coordinates);
    }

    public U(Function1<? super LayoutCoordinates, Unit> function1) {
        this.callback = function1;
    }
}
