package androidx.compose.foundation.relocation;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import p0.InterfaceC16183a;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0019\u0010\u0005\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lp0/a;", "a", "()Lp0/a;", "Landroidx/compose/ui/Modifier;", "bringIntoViewRequester", "b", "(Landroidx/compose/ui/Modifier;Lp0/a;)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "androidx/compose/foundation/relocation/BringIntoViewRequesterKt")
/* loaded from: classes.dex */
final /* synthetic */ class c {
    public static final InterfaceC16183a a() {
        return new a();
    }

    public static final Modifier b(Modifier modifier, InterfaceC16183a interfaceC16183a) {
        return modifier.then(new BringIntoViewRequesterElement(interfaceC16183a));
    }
}
