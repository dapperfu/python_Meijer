package androidx.compose.ui.node;

import android.view.View;
import j1.C14920a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/node/j;", "Landroid/view/View;", "a", "(Landroidx/compose/ui/node/j;)Landroid/view/View;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.node.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5958l {
    public static final View a(InterfaceC5956j interfaceC5956j) {
        if (!interfaceC5956j.getNode().getIsAttached()) {
            C14920a.b("Cannot get View because the Modifier node is not currently attached.");
        }
        Object objB = L.b(C5957k.o(interfaceC5956j));
        Intrinsics.h(objB, "null cannot be cast to non-null type android.view.View");
        return (View) objB;
    }
}
