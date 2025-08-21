package Ds;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import g.AbstractC14276c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\t\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\t\u0010\n\u001a5\u0010\r\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lg/c;", "Landroid/content/Intent;", "intent", "Landroidx/fragment/app/Fragment;", "fragment", "", "Landroid/view/View;", "transitionViews", "", "b", "(Lg/c;Landroid/content/Intent;Landroidx/fragment/app/Fragment;Ljava/util/List;)V", "Landroid/app/Activity;", "activity", "a", "(Lg/c;Landroid/content/Intent;Landroid/app/Activity;Ljava/util/List;)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b {
    public static final void a(AbstractC14276c<Intent> abstractC14276c, Intent intent, Activity activity, List<? extends View> transitionViews) {
        Intrinsics.j(abstractC14276c, "<this>");
        Intrinsics.j(intent, "intent");
        Intrinsics.j(activity, "activity");
        Intrinsics.j(transitionViews, "transitionViews");
        androidx.core.app.d dVarA = a.a(activity, transitionViews);
        Intent intentPutExtra = intent.putExtra("com.meijer.intent.extra.SHARED_ELEMENT_TRANSITION", true);
        Intrinsics.i(intentPutExtra, "putExtra(...)");
        abstractC14276c.b(intentPutExtra, dVarA);
    }

    public static final void b(AbstractC14276c<Intent> abstractC14276c, Intent intent, Fragment fragment, List<? extends View> transitionViews) {
        Intrinsics.j(abstractC14276c, "<this>");
        Intrinsics.j(intent, "intent");
        Intrinsics.j(fragment, "fragment");
        Intrinsics.j(transitionViews, "transitionViews");
        if (!fragment.isAdded()) {
            abstractC14276c.a(intent);
            return;
        }
        FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
        Intrinsics.i(fragmentActivityRequireActivity, "requireActivity(...)");
        androidx.core.app.d dVarA = a.a(fragmentActivityRequireActivity, transitionViews);
        Intent intentPutExtra = intent.putExtra("com.meijer.intent.extra.SHARED_ELEMENT_TRANSITION", true);
        Intrinsics.i(intentPutExtra, "putExtra(...)");
        abstractC14276c.b(intentPutExtra, dVarA);
    }
}
