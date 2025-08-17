package androidx.view;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qv.C16639f0;
import qv.X0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/l;", "Landroidx/lifecycle/m;", "a", "(Landroidx/lifecycle/l;)Landroidx/lifecycle/m;", "coroutineScope", "lifecycle-common"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* renamed from: androidx.lifecycle.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6028q {
    public static final AbstractC6024m a(AbstractC6023l abstractC6023l) {
        C6025n c6025n;
        Intrinsics.j(abstractC6023l, "<this>");
        do {
            C6025n c6025n2 = (C6025n) abstractC6023l.c().b();
            if (c6025n2 != null) {
                return c6025n2;
            }
            c6025n = new C6025n(abstractC6023l, X0.b(null, 1, null).m0(C16639f0.c().W0()));
        } while (!abstractC6023l.c().a(null, c6025n));
        c6025n.b();
        return c6025n;
    }
}
