package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "layoutId", "b", "(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/I;", "a", "(Landroidx/compose/ui/layout/I;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.layout.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5795w {
    public static final Modifier b(Modifier modifier, Object obj) {
        return modifier.then(new LayoutIdElement(obj));
    }

    public static final Object a(I i10) {
        InterfaceC5797y interfaceC5797y;
        Object objA = i10.a();
        if (objA instanceof InterfaceC5797y) {
            interfaceC5797y = (InterfaceC5797y) objA;
        } else {
            interfaceC5797y = null;
        }
        if (interfaceC5797y == null) {
            return null;
        }
        return interfaceC5797y.getLayoutId();
    }
}
