package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.AbstractC5836a;
import androidx.compose.runtime.AbstractC5869k;
import androidx.compose.runtime.C5877o;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.InterfaceC5867j;
import androidx.compose.ui.node.LayoutNode;
import java.util.Collections;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a)\u0010\f\u001a\u00020\u000b*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "container", "Landroidx/compose/runtime/a;", "a", "(Landroidx/compose/ui/node/LayoutNode;)Landroidx/compose/runtime/a;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroidx/compose/runtime/k;", "parent", "Lkotlin/Function0;", "", "content", "Landroidx/compose/runtime/j;", "c", "(Landroidx/compose/ui/platform/AbstractComposeView;Landroidx/compose/runtime/k;Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/j;", "Landroidx/compose/ui/platform/AndroidComposeView;", "owner", "b", "(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/runtime/k;Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/j;", "Landroid/view/ViewGroup$LayoutParams;", "Landroid/view/ViewGroup$LayoutParams;", "DefaultLayoutParams", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f2 {

    /* renamed from: a, reason: collision with root package name */
    private static final ViewGroup.LayoutParams f52303a = new ViewGroup.LayoutParams(-2, -2);

    public static final AbstractC5836a<LayoutNode> a(LayoutNode layoutNode) {
        return new androidx.compose.ui.node.E0(layoutNode);
    }

    public static final InterfaceC5867j c(AbstractComposeView abstractComposeView, AbstractC5869k abstractC5869k, Function2<? super Composer, ? super Integer, Unit> function2) {
        E0.f52009a.b();
        AndroidComposeView androidComposeView = null;
        if (abstractComposeView.getChildCount() > 0) {
            View childAt = abstractComposeView.getChildAt(0);
            if (childAt instanceof AndroidComposeView) {
                androidComposeView = (AndroidComposeView) childAt;
            }
        } else {
            abstractComposeView.removeAllViews();
        }
        if (androidComposeView == null) {
            androidComposeView = new AndroidComposeView(abstractComposeView.getContext(), abstractC5869k.getEffectCoroutineContext());
            abstractComposeView.addView(androidComposeView.getView(), f52303a);
        }
        return b(androidComposeView, abstractC5869k, function2);
    }

    private static final InterfaceC5867j b(AndroidComposeView androidComposeView, AbstractC5869k abstractC5869k, Function2<? super Composer, ? super Integer, Unit> function2) {
        c2 c2Var;
        if (L0.b() && androidComposeView.getTag(P0.k.f25225K) == null) {
            androidComposeView.setTag(P0.k.f25225K, Collections.newSetFromMap(new WeakHashMap()));
        }
        Object tag = androidComposeView.getView().getTag(P0.k.f25226L);
        if (tag instanceof c2) {
            c2Var = (c2) tag;
        } else {
            c2Var = null;
        }
        if (c2Var == null) {
            c2Var = new c2(androidComposeView, C5877o.a(new androidx.compose.ui.node.E0(androidComposeView.getRoot()), abstractC5869k));
            androidComposeView.getView().setTag(P0.k.f25226L, c2Var);
        }
        c2Var.d(function2);
        if (!Intrinsics.e(androidComposeView.getCoroutineContext(), abstractC5869k.getEffectCoroutineContext())) {
            androidComposeView.setCoroutineContext(abstractC5869k.getEffectCoroutineContext());
        }
        return c2Var;
    }
}
