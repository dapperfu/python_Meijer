package r1;

import Z.T;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lr1/j;", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "a", "(Lr1/j;)Landroidx/compose/ui/semantics/SemanticsConfiguration;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: r1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16703k {
    public static final SemanticsConfiguration a(InterfaceC16702j interfaceC16702j) {
        SemanticsConfiguration semanticsConfiguration = interfaceC16702j.getSemanticsConfiguration();
        if (semanticsConfiguration != null && semanticsConfiguration.getIsMergingSemanticsOfDescendants() && !semanticsConfiguration.getIsClearingSemantics()) {
            semanticsConfiguration = semanticsConfiguration.k();
            T t10 = new T(interfaceC16702j.m().size());
            t10.r(interfaceC16702j.m());
            while (t10.h()) {
                InterfaceC16702j interfaceC16702j2 = (InterfaceC16702j) t10.A(t10._size - 1);
                SemanticsConfiguration semanticsConfiguration2 = interfaceC16702j2.getSemanticsConfiguration();
                if (semanticsConfiguration2 != null && !semanticsConfiguration2.getIsMergingSemanticsOfDescendants()) {
                    semanticsConfiguration.t(semanticsConfiguration2);
                    if (!semanticsConfiguration2.getIsClearingSemantics()) {
                        t10.r(interfaceC16702j2.m());
                    }
                }
            }
        }
        return semanticsConfiguration;
    }
}
