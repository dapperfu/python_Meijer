package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.Modifier;
import f1.C13829b;
import f1.InterfaceC13828a;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lf1/a;", "connection", "Lf1/b;", "dispatcher", "a", "(Landroidx/compose/ui/Modifier;Lf1/a;Lf1/b;)Landroidx/compose/ui/Modifier;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {
    public static final Modifier a(Modifier modifier, InterfaceC13828a interfaceC13828a, C13829b c13829b) {
        return modifier.then(new NestedScrollElement(interfaceC13828a, c13829b));
    }

    public static /* synthetic */ Modifier b(Modifier modifier, InterfaceC13828a interfaceC13828a, C13829b c13829b, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            c13829b = null;
        }
        return a(modifier, interfaceC13828a, c13829b);
    }
}
