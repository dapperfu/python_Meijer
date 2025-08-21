package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.z1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class z1 {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f123067a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f123068b;

    public final void a(View view, Function0 destructor) {
        Intrinsics.j(destructor, "destructor");
        if (view != null) {
            this.f123067a.removeView(view);
            destructor.invoke();
        }
    }

    public z1(ViewGroup container) {
        Intrinsics.j(container, "container");
        this.f123067a = container;
        this.f123068b = new Handler(Looper.getMainLooper());
    }

    public final void b(View view, Function0 creator) {
        Intrinsics.j(creator, "creator");
        if (view == null) {
            View view2 = (View) creator.invoke();
            if (view2 != null) {
                this.f123067a.addView(view2);
                return;
            }
            return;
        }
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        this.f123067a.addView(view);
    }

    public final void a(final Function1 action) {
        Intrinsics.j(action, "action");
        this.f123068b.post(new Runnable() { // from class: Pt.k
            @Override // java.lang.Runnable
            public final void run() {
                z1.a(action, this);
            }
        });
    }

    public static final void a(Function1 action, z1 this$0) {
        Intrinsics.j(action, "$action");
        Intrinsics.j(this$0, "this$0");
        action.invoke(this$0.f123067a);
    }
}
