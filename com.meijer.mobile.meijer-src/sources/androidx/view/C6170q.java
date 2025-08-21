package androidx.view;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mv.C15800f0;
import mv.X0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/l;", "Landroidx/lifecycle/m;", "a", "(Landroidx/lifecycle/l;)Landroidx/lifecycle/m;", "coroutineScope", "lifecycle-common"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* renamed from: androidx.lifecycle.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6170q {
    public static final AbstractC6166m a(AbstractC6165l abstractC6165l) {
        C6167n c6167n;
        Intrinsics.j(abstractC6165l, "<this>");
        do {
            C6167n c6167n2 = (C6167n) abstractC6165l.c().b();
            if (c6167n2 != null) {
                return c6167n2;
            }
            c6167n = new C6167n(abstractC6165l, X0.b(null, 1, null).n0(C15800f0.c().U0()));
        } while (!abstractC6165l.c().a(null, c6167n));
        c6167n.b();
        return c6167n;
    }
}
