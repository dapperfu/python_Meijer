package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.InterfaceC5965t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B \u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0005*\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bR3\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\t¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/draw/c;", "Landroidx/compose/ui/Modifier$c;", "Landroidx/compose/ui/node/t;", "Lkotlin/Function1;", "LX0/c;", "", "Lkotlin/ExtensionFunctionType;", "onDraw", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "I", "(LX0/c;)V", "o", "Lkotlin/jvm/functions/Function1;", "getOnDraw", "()Lkotlin/jvm/functions/Function1;", "K2", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class c extends Modifier.c implements InterfaceC5965t {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private Function1<? super X0.c, Unit> onDraw;

    @Override // androidx.compose.ui.node.InterfaceC5965t
    public void I(X0.c cVar) {
        this.onDraw.invoke(cVar);
    }

    public final void K2(Function1<? super X0.c, Unit> function1) {
        this.onDraw = function1;
    }

    public c(Function1<? super X0.c, Unit> function1) {
        this.onDraw = function1;
    }
}
