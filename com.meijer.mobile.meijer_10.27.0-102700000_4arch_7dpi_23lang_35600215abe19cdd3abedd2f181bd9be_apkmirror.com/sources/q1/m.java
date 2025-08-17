package q1;

import H1.p;
import H1.q;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.platform.B1;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import j1.C14832a;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import r1.C16706n;
import r1.ScrollAxisRange;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a5\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\n*\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\f\"E\u0010\u0016\u001a/\b\u0001\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\r*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0018\u0010\u001a\u001a\u00020\u0017*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lr1/n;", "fromNode", "", "depth", "Lkotlin/Function1;", "Lq1/l;", "", "onCandidate", "d", "(Lr1/n;ILkotlin/jvm/functions/Function1;)V", "", "b", "(Lr1/n;)Ljava/util/List;", "Lkotlin/Function2;", "LU0/f;", "Lkotlin/ParameterName;", "name", "offset", "Lkotlin/coroutines/Continuation;", "", "c", "(Lr1/n;)Lkotlin/jvm/functions/Function2;", "scrollCaptureScrollByAction", "", "a", "(Lr1/n;)Z", "canScrollVertically", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class m {
    private static final List<C16706n> b(C16706n c16706n) {
        return c16706n.l(false, false, false);
    }

    private static final void d(C16706n c16706n, int i10, Function1<? super ScrollCaptureCandidate, Unit> function1) {
        C16706n c16706n2;
        D0.c cVar = new D0.c(new C16706n[16], 0);
        List<C16706n> listB = b(c16706n);
        while (true) {
            cVar.g(cVar.getSize(), listB);
            while (cVar.getSize() != 0) {
                c16706n2 = (C16706n) cVar.u(cVar.getSize() - 1);
                if (!B1.f(c16706n2) && !c16706n2.getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getDisabled())) {
                    NodeCoordinator nodeCoordinatorE = c16706n2.e();
                    if (nodeCoordinatorE == null) {
                        C14832a.c("Expected semantics node to have a coordinator.");
                        throw new KotlinNothingValueException();
                    }
                    LayoutCoordinates layoutCoordinatesQ1 = nodeCoordinatorE.q1();
                    p pVarB = q.b(LayoutCoordinatesKt.b(layoutCoordinatesQ1));
                    if (pVarB.k()) {
                        continue;
                    } else {
                        if (!a(c16706n2)) {
                            break;
                        }
                        int i11 = i10 + 1;
                        function1.invoke(new ScrollCaptureCandidate(c16706n2, i11, pVarB, layoutCoordinatesQ1));
                        d(c16706n2, i11, function1);
                    }
                }
            }
            return;
            listB = b(c16706n2);
        }
    }

    static /* synthetic */ void e(C16706n c16706n, int i10, Function1 function1, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        d(c16706n, i10, function1);
    }

    private static final boolean a(C16706n c16706n) {
        Function2<U0.f, Continuation<? super U0.f>, Object> function2C = c(c16706n);
        ScrollAxisRange scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.getOrNull(c16706n.getUnmergedConfig(), SemanticsProperties.INSTANCE.E());
        if (function2C != null && scrollAxisRange != null && scrollAxisRange.a().invoke().floatValue() > 0.0f) {
            return true;
        }
        return false;
    }

    public static final Function2<U0.f, Continuation<? super U0.f>, Object> c(C16706n c16706n) {
        return (Function2) SemanticsConfigurationKt.getOrNull(c16706n.getUnmergedConfig(), SemanticsActions.INSTANCE.v());
    }
}
