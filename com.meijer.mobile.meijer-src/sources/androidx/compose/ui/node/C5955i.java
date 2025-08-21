package androidx.compose.ui.node;

import androidx.compose.runtime.AbstractC5879p;
import j1.C14920a;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "Landroidx/compose/ui/node/h;", "Landroidx/compose/runtime/p;", "local", "a", "(Landroidx/compose/ui/node/h;Landroidx/compose/runtime/p;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.node.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5955i {
    public static final <T> T a(InterfaceC5954h interfaceC5954h, AbstractC5879p<T> abstractC5879p) {
        if (!interfaceC5954h.getNode().getIsAttached()) {
            C14920a.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        return (T) C5957k.o(interfaceC5954h).getCompositionLocalMap().a(abstractC5879p);
    }
}
