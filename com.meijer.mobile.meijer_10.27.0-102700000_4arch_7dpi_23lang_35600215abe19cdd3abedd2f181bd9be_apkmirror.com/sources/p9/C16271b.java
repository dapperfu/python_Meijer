package p9;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroid/app/Activity;", "Landroidx/fragment/app/FragmentManager;", "a", "(Landroid/app/Activity;)Landroidx/fragment/app/FragmentManager;", "core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: p9.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16271b {
    public static final FragmentManager a(Activity activity) {
        Intrinsics.j(activity, "<this>");
        if (activity instanceof FragmentActivity) {
            return ((FragmentActivity) activity).getSupportFragmentManager();
        }
        return null;
    }
}
