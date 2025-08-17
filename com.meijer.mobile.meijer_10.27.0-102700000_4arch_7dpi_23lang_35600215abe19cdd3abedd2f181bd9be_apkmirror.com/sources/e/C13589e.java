package e;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.AbstractC5727k;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.ComposeView;
import androidx.view.C6019i0;
import androidx.view.C6021j0;
import androidx.view.ComponentActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import x4.m;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\b\u001a\u00020\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/activity/ComponentActivity;", "Landroidx/compose/runtime/k;", "parent", "Lkotlin/Function0;", "", "content", "a", "(Landroidx/activity/ComponentActivity;Landroidx/compose/runtime/k;Lkotlin/jvm/functions/Function2;)V", "c", "(Landroidx/activity/ComponentActivity;)V", "Landroid/view/ViewGroup$LayoutParams;", "Landroid/view/ViewGroup$LayoutParams;", "DefaultActivityContentLayoutParams", "activity-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: e.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13589e {

    /* renamed from: a, reason: collision with root package name */
    private static final ViewGroup.LayoutParams f127660a = new ViewGroup.LayoutParams(-2, -2);

    public static /* synthetic */ void b(ComponentActivity componentActivity, AbstractC5727k abstractC5727k, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            abstractC5727k = null;
        }
        a(componentActivity, abstractC5727k, function2);
    }

    public static final void a(ComponentActivity componentActivity, AbstractC5727k abstractC5727k, Function2<? super Composer, ? super Integer, Unit> function2) {
        ComposeView composeView;
        View childAt = ((ViewGroup) componentActivity.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        if (childAt instanceof ComposeView) {
            composeView = (ComposeView) childAt;
        } else {
            composeView = null;
        }
        if (composeView != null) {
            composeView.setParentCompositionContext(abstractC5727k);
            composeView.setContent(function2);
            return;
        }
        ComposeView composeView2 = new ComposeView(componentActivity, null, 0, 6, null);
        composeView2.setParentCompositionContext(abstractC5727k);
        composeView2.setContent(function2);
        c(componentActivity);
        componentActivity.setContentView(composeView2, f127660a);
    }

    private static final void c(ComponentActivity componentActivity) {
        View decorView = componentActivity.getWindow().getDecorView();
        if (C6019i0.a(decorView) == null) {
            C6019i0.b(decorView, componentActivity);
        }
        if (C6021j0.a(decorView) == null) {
            C6021j0.b(decorView, componentActivity);
        }
        if (m.a(decorView) == null) {
            m.b(decorView, componentActivity);
        }
    }
}
