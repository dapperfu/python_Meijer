package androidx.view;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import t2.C17057b;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroid/view/View;", "Landroidx/activity/J;", "onBackPressedDispatcherOwner", "", "b", "(Landroid/view/View;Landroidx/activity/J;)V", "a", "(Landroid/view/View;)Landroidx/activity/J;", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@JvmName
/* renamed from: androidx.activity.N, reason: from Kotlin metadata and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5612N {
    @JvmName
    public static final J a(View view) {
        Intrinsics.j(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(K.f45693b);
            J j10 = tag instanceof J ? (J) tag : null;
            if (j10 != null) {
                return j10;
            }
            Object objA = C17057b.a(view);
            view = objA instanceof View ? (View) objA : null;
        }
        return null;
    }

    @JvmName
    public static final void b(View view, J onBackPressedDispatcherOwner) {
        Intrinsics.j(view, "<this>");
        Intrinsics.j(onBackPressedDispatcherOwner, "onBackPressedDispatcherOwner");
        view.setTag(K.f45693b, onBackPressedDispatcherOwner);
    }
}
