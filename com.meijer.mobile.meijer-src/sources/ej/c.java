package ej;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\t\u001a\u00020\u0005*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\n\"\u0015\u0010\u000f\u001a\u00020\f*\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u0015\u0010\u000f\u001a\u00020\f*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroid/view/ViewGroup;", "", "layoutId", "", "attachToRoot", "Landroid/view/View;", "d", "(Landroid/view/ViewGroup;IZ)Landroid/view/View;", "index", "c", "(Landroid/view/ViewGroup;II)Landroid/view/View;", "Landroid/content/Context;", "Landroid/view/LayoutInflater;", "a", "(Landroid/content/Context;)Landroid/view/LayoutInflater;", "layoutInflater", "b", "(Landroid/view/View;)Landroid/view/LayoutInflater;", "base-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class c {
    public static final LayoutInflater a(Context context) {
        Intrinsics.j(context, "<this>");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Intrinsics.i(layoutInflaterFrom, "from(...)");
        return layoutInflaterFrom;
    }

    public static final LayoutInflater b(View view) {
        Intrinsics.j(view, "<this>");
        Context context = view.getContext();
        Intrinsics.i(context, "getContext(...)");
        return a(context);
    }

    public static final View c(ViewGroup viewGroup, int i10, int i11) {
        Intrinsics.j(viewGroup, "<this>");
        View viewD = d(viewGroup, i10, false);
        viewGroup.addView(viewD, i11);
        return viewD;
    }

    public static final View d(ViewGroup viewGroup, int i10, boolean z10) {
        Intrinsics.j(viewGroup, "<this>");
        View viewInflate = b(viewGroup).inflate(i10, viewGroup, z10);
        Intrinsics.i(viewInflate, "inflate(...)");
        return viewInflate;
    }
}
