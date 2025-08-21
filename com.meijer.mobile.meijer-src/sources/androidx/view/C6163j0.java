package androidx.view;

import V2.c;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import t2.C17176b;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/view/View;", "Landroidx/lifecycle/h0;", "viewModelStoreOwner", "", "b", "(Landroid/view/View;Landroidx/lifecycle/h0;)V", "a", "(Landroid/view/View;)Landroidx/lifecycle/h0;", "lifecycle-viewmodel_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName
/* renamed from: androidx.lifecycle.j0, reason: from Kotlin metadata and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6163j0 {
    @JvmName
    public static final h0 a(View view) {
        Intrinsics.j(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(c.f39631a);
            h0 h0Var = tag instanceof h0 ? (h0) tag : null;
            if (h0Var != null) {
                return h0Var;
            }
            Object objA = C17176b.a(view);
            view = objA instanceof View ? (View) objA : null;
        }
        return null;
    }

    @JvmName
    public static final void b(View view, h0 h0Var) {
        Intrinsics.j(view, "<this>");
        view.setTag(c.f39631a, h0Var);
    }
}
