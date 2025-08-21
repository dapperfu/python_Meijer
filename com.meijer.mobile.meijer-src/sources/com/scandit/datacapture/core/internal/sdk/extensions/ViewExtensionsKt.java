package com.scandit.datacapture.core.internal.sdk.extensions;

import android.content.Context;
import android.os.Looper;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u000e\u001a\u00020\u000f*\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0001\u001a\n\u0010\u0011\u001a\u00020\u0012*\u00020\u0013\u001a\n\u0010\u0014\u001a\u00020\u0012*\u00020\u0003\u001a<\u0010\u0015\u001a\u00020\u0012\"\b\b\u0000\u0010\u0016*\u00020\u0003*\u0002H\u00162!\u0010\u0017\u001a\u001d\u0012\u0013\u0012\u0011H\u0016¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00120\u0018¢\u0006\u0002\u0010\u001c\"*\u0010\u0002\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0000\u001a\u00020\u00018Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0002\u0010\u0004\"\u0004\b\u0005\u0010\u0006\"*\u0010\u0007\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0000\u001a\u00020\u00018Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\u0004\"\u0004\b\b\u0010\u0006\"\u0016\u0010\t\u001a\u00020\u0001*\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\t\u0010\u0004\"\u0015\u0010\n\u001a\u00020\u000b*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u001d"}, d2 = {"value", "", "isGone", "Landroid/view/View;", "(Landroid/view/View;)Z", "setGone", "(Landroid/view/View;Z)V", "isInvisible", "setInvisible", "isVisible", "orientation", "", "getOrientation", "(Landroid/view/View;)I", "getCorrectedViewSize", "Landroid/util/Size;", "isPortrait", "removeAllRules", "", "Landroid/widget/RelativeLayout$LayoutParams;", "removeFromSuperview", "runOnMainThread", "T", "block", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "view", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "scandit-capture-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ViewExtensionsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Function1 block, View this_runOnMainThread) {
        Intrinsics.j(block, "$block");
        Intrinsics.j(this_runOnMainThread, "$this_runOnMainThread");
        block.invoke(this_runOnMainThread);
    }

    public static final Size getCorrectedViewSize(View view, boolean z10) {
        Intrinsics.j(view, "<this>");
        return z10 ? new Size(Math.min(view.getWidth(), view.getHeight()), Math.max(view.getWidth(), view.getHeight())) : new Size(Math.max(view.getWidth(), view.getHeight()), Math.min(view.getWidth(), view.getHeight()));
    }

    public static final int getOrientation(View view) {
        Intrinsics.j(view, "<this>");
        Context context = view.getContext();
        Intrinsics.i(context, "getContext(...)");
        return ContextExtensionsKt.getOrientation(context);
    }

    public static final boolean isGone(View view) {
        Intrinsics.j(view, "<this>");
        return view.getVisibility() == 8;
    }

    public static final boolean isInvisible(View view) {
        Intrinsics.j(view, "<this>");
        return view.getVisibility() == 4;
    }

    public static final boolean isVisible(View view) {
        Intrinsics.j(view, "<this>");
        return view.getVisibility() == 0;
    }

    public static final void removeAllRules(RelativeLayout.LayoutParams layoutParams) {
        Intrinsics.j(layoutParams, "<this>");
        int length = layoutParams.getRules().length;
        for (int i10 = 0; i10 < length; i10++) {
            layoutParams.removeRule(i10);
        }
    }

    public static final void removeFromSuperview(View view) {
        Intrinsics.j(view, "<this>");
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }

    public static final <T extends View> void runOnMainThread(final T t10, final Function1<? super T, Unit> block) {
        Intrinsics.j(t10, "<this>");
        Intrinsics.j(block, "block");
        if (Intrinsics.e(Looper.myLooper(), Looper.getMainLooper())) {
            block.invoke(t10);
        } else {
            t10.post(new Runnable() { // from class: com.scandit.datacapture.core.internal.sdk.extensions.e
                @Override // java.lang.Runnable
                public final void run() {
                    ViewExtensionsKt.a(block, t10);
                }
            });
        }
    }

    public static final void setGone(View view, boolean z10) {
        Intrinsics.j(view, "<this>");
        view.setVisibility(z10 ? 8 : 0);
    }

    public static final void setInvisible(View view, boolean z10) {
        Intrinsics.j(view, "<this>");
        view.setVisibility(z10 ? 4 : 0);
    }
}
