package androidx.compose.ui.node;

import androidx.compose.ui.layout.AbstractC5774a;
import androidx.compose.ui.layout.C5790q;
import j1.C14832a;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/node/Q;", "Landroidx/compose/ui/layout/a;", "alignmentLine", "", "b", "(Landroidx/compose/ui/node/Q;Landroidx/compose/ui/layout/a;)I", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class F {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(Q q10, AbstractC5774a abstractC5774a) {
        boolean z10;
        int iK;
        Q qM1 = q10.m1();
        if (qM1 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C14832a.b("Child of " + q10 + " cannot be null when calculating alignment line");
        }
        if (q10.s1().r().containsKey(abstractC5774a)) {
            Integer num = q10.s1().r().get(abstractC5774a);
            if (num == null) {
                return Integer.MIN_VALUE;
            }
            return num.intValue();
        }
        int iL0 = qM1.l0(abstractC5774a);
        if (iL0 == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        qM1.X1(true);
        q10.V1(true);
        q10.R1();
        qM1.X1(false);
        q10.V1(false);
        if (abstractC5774a instanceof C5790q) {
            iK = H1.n.l(qM1.getPosition());
        } else {
            iK = H1.n.k(qM1.getPosition());
        }
        return iL0 + iK;
    }
}
