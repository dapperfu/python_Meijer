package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aX\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002:\b\u0002\u0010\t\u001a4\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Landroidx/compose/ui/focus/M;", "focusability", "Lkotlin/Function2;", "Landroidx/compose/ui/focus/E;", "Lkotlin/ParameterName;", "name", "previous", "current", "", "onFocusChange", "Landroidx/compose/ui/focus/G;", "a", "(ILkotlin/jvm/functions/Function2;)Landroidx/compose/ui/focus/G;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class H {
    public static final G a(int i10, Function2<? super E, ? super E, Unit> function2) {
        return new FocusTargetNode(i10, function2, null, 4, null);
    }

    public static /* synthetic */ G b(int i10, Function2 function2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = M.INSTANCE.a();
        }
        if ((i11 & 2) != 0) {
            function2 = null;
        }
        return a(i10, function2);
    }
}
