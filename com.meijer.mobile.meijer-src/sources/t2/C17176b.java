package t2;

import android.view.View;
import android.view.ViewParent;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/view/View;", "Landroid/view/ViewParent;", "parent", "", "b", "(Landroid/view/View;Landroid/view/ViewParent;)V", "a", "(Landroid/view/View;)Landroid/view/ViewParent;", "core-viewtree_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@JvmName
/* renamed from: t2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17176b {
    public static final ViewParent a(View view) {
        Intrinsics.j(view, "<this>");
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(C17175a.f162170a);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final void b(View view, ViewParent viewParent) {
        Intrinsics.j(view, "<this>");
        view.setTag(C17175a.f162170a, viewParent);
    }
}
