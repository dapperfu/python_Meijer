package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\"\u0018\u0010\u0006\u001a\u00020\u0005*\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/node/u0;", "", "b", "(Landroidx/compose/ui/node/u0;)V", "Landroidx/compose/ui/Modifier$c;", "", "useMinimumTouchTarget", "Landroidx/compose/ui/geometry/Rect;", "c", "(Landroidx/compose/ui/Modifier$c;Z)Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "a", "(Landroidx/compose/ui/semantics/SemanticsConfiguration;)Z", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class v0 {
    public static final boolean a(SemanticsConfiguration semanticsConfiguration) {
        return SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsActions.INSTANCE.l()) != null;
    }

    public static final void b(u0 u0Var) {
        C5815k.o(u0Var).E0();
    }

    public static final Rect c(Modifier.c cVar, boolean z10) {
        if (!cVar.getNode().getIsAttached()) {
            return Rect.INSTANCE.a();
        }
        if (!z10) {
            return LayoutCoordinatesKt.a(C5815k.j(cVar, C5810f0.a(8)));
        }
        return C5815k.j(cVar, C5810f0.a(8)).E3();
    }
}
