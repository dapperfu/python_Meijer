package Ds;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.transition.Transition;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000fH\u0001¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LDs/a;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/content/Intent;", "intent", "Landroid/view/View;", "transitionView", "", "b", "(Landroid/app/Activity;Landroid/content/Intent;Landroid/view/View;)V", "Landroidx/fragment/app/Fragment;", "fragment", "", "transitionViews", "d", "(Landroidx/fragment/app/Fragment;Landroid/content/Intent;Ljava/util/List;)V", "Landroidx/core/app/d;", "a", "(Landroid/app/Activity;Ljava/util/List;)Landroidx/core/app/d;", "c", "(Landroid/app/Activity;Landroid/content/Intent;Ljava/util/List;)V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f6640a = new a();

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"LDs/a$a;", "Landroid/transition/Transition$TransitionListener;", "<init>", "()V", "Landroid/transition/Transition;", "transition", "", "onTransitionStart", "(Landroid/transition/Transition;)V", "onTransitionCancel", "onTransitionPause", "onTransitionResume", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ds.a$a, reason: collision with other inner class name */
    public static class C0135a implements Transition.TransitionListener {
        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
            Intrinsics.j(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
            Intrinsics.j(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
            Intrinsics.j(transition, "transition");
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            Intrinsics.j(transition, "transition");
        }
    }

    @JvmStatic
    public static final androidx.core.app.d a(Activity activity, List<? extends View> transitionViews) {
        Intrinsics.j(activity, "activity");
        Intrinsics.j(transitionViews, "transitionViews");
        List<? extends View> list = transitionViews;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        for (View view : list) {
            arrayList.add(TuplesKt.a(view, view.getTransitionName()));
        }
        List listM1 = CollectionsKt.m1(arrayList);
        View viewFindViewById = activity.findViewById(R.id.statusBarBackground);
        View viewFindViewById2 = activity.findViewById(R.id.navigationBarBackground);
        if (viewFindViewById != null) {
            listM1.add(TuplesKt.a(viewFindViewById, "android:status:background"));
        }
        if (viewFindViewById2 != null) {
            listM1.add(TuplesKt.a(viewFindViewById2, "android:navigation:background"));
        }
        List<Pair> list2 = listM1;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(list2, 10));
        for (Pair pair : list2) {
            arrayList2.add(new o2.d(pair.c(), pair.d()));
        }
        o2.d[] dVarArr = (o2.d[]) arrayList2.toArray(new o2.d[0]);
        androidx.core.app.d dVarD = androidx.core.app.d.d(activity, (o2.d[]) Arrays.copyOf(dVarArr, dVarArr.length));
        Intrinsics.i(dVarD, "makeSceneTransitionAnimation(...)");
        return dVarD;
    }

    @JvmStatic
    public static final void b(Activity activity, Intent intent, View transitionView) {
        Intrinsics.j(activity, "activity");
        Intrinsics.j(intent, "intent");
        Intrinsics.j(transitionView, "transitionView");
        androidx.core.app.d dVarC = androidx.core.app.d.c(activity, transitionView, transitionView.getTransitionName());
        Intrinsics.i(dVarC, "makeSceneTransitionAnimation(...)");
        intent.putExtra("com.meijer.intent.extra.SHARED_ELEMENT_TRANSITION", true);
        activity.startActivity(intent, dVarC.e());
    }

    @JvmStatic
    public static final void d(Fragment fragment, Intent intent, List<? extends View> transitionViews) {
        Intrinsics.j(fragment, "fragment");
        Intrinsics.j(intent, "intent");
        Intrinsics.j(transitionViews, "transitionViews");
        if (!fragment.isAdded()) {
            fragment.startActivity(intent);
            return;
        }
        FragmentActivity fragmentActivityRequireActivity = fragment.requireActivity();
        Intrinsics.i(fragmentActivityRequireActivity, "requireActivity(...)");
        androidx.core.app.d dVarA = a(fragmentActivityRequireActivity, transitionViews);
        intent.putExtra("com.meijer.intent.extra.SHARED_ELEMENT_TRANSITION", true);
        fragment.startActivity(intent, dVarA.e());
    }

    public final void c(Activity activity, Intent intent, List<? extends View> transitionViews) {
        Intrinsics.j(activity, "activity");
        Intrinsics.j(intent, "intent");
        Intrinsics.j(transitionViews, "transitionViews");
        androidx.core.app.d dVarA = a(activity, transitionViews);
        intent.putExtra("com.meijer.intent.extra.SHARED_ELEMENT_TRANSITION", true);
        activity.startActivity(intent, dVarA.e());
    }

    private a() {
    }
}
